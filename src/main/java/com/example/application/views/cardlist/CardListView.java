package com.example.application.views.cardlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.application.models.MovieResponse;
import com.example.application.models.Result;
import com.example.application.service.MovieService;
import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.grid.ItemClickEvent;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.AfterNavigationEvent;
import com.vaadin.flow.router.AfterNavigationObserver;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.example.application.views.MainLayout;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.component.notification.Notification;
import elemental.json.JsonObject;

@PageTitle("Card List")
@Route(value = "card-list", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class CardListView extends Div implements AfterNavigationObserver {

    private MovieService movieService;
    Grid<Result> grid = new Grid<>();

    private Notification notification = new Notification("Loading...", 1000, Notification.Position.TOP_CENTER);
    private List<Result> items;

    public CardListView(MovieService movieService) {
        this.movieService = movieService;
        addClassName("card-list-view");
        setSizeFull();
        grid.setHeight("100%");
        grid.addThemeVariants(GridVariant.LUMO_NO_BORDER, GridVariant.LUMO_NO_ROW_BORDERS);
        grid.addComponentColumn(item -> createCard(item));
        grid.addItemClickListener(new ComponentEventListener<ItemClickEvent<Result>>() {
            @Override
            public void onComponentEvent(ItemClickEvent<Result> resultItemClickEvent) {
                System.out.println(resultItemClickEvent.getItem());


            }
        });
        add(withClientsideScrollListener(grid));
    }

    @ClientCallable
    public void onGridScroll(JsonObject scrollEvent) {
        int scrollHeight = (int) scrollEvent.getNumber("sh");
        int clientHeight = (int) scrollEvent.getNumber("ch");
        int scrollTop = (int) scrollEvent.getNumber("st");

        double percentage = (double) scrollTop/(scrollHeight-clientHeight);
        if (percentage>0.8) {
            getMovies(); // I don't have pagination in this application :/
        }

    }

    private HorizontalLayout createCard(Result item) {
        HorizontalLayout card = new HorizontalLayout();
        card.addClassName("card");
        card.setSpacing(false);
        card.getThemeList().add("spacing-s");

        Image image = new Image();
        image.setSrc(getUrl(item));
        VerticalLayout description = new VerticalLayout();
        description.addClassName("description");
        description.setSpacing(false);
        description.setPadding(false);

        HorizontalLayout header = new HorizontalLayout();
        header.addClassName("header");
        header.setSpacing(false);
        header.getThemeList().add("spacing-s");

        Span title = new Span(getTitle(item));
        title.addClassName("name");
        Span start = new Span(getYear(item));
        start.addClassName("date");
        header.add(title, start);

        description.add(header);
        card.add(image, description);
        return card;
    }

    private String getYear(Result item) {
        if (null == item || null == item.getYear().toString()){
            return "";
        } else {
            return item.getYear().toString();
        }
    }

    private String getTitle(Result item) {
        if (null == item || null == item.getTitle()){
            return "";
        } else {
            return item.getTitle();
        }
    }

    private String getUrl(Result item) {
        if (null == item || null == item.getImage() || null == item.getImage().getUrl()){
            return "https://randomuser.me/api/portraits/men/24.jpg";
        } else {
            return item.getImage().getUrl();
        }
    }

    @Override
    public void afterNavigation(AfterNavigationEvent event) {

        // Set some data when this view is displayed.
        items = new ArrayList<>();
        getMovies();

    }

    private void getMovies(){
        notification.open();
        movieService.getMovies(result -> {
            getUI().get().access(() -> {

                for (Result r : result) {
                    items.add((r));
                }
//                System.out.println(items);
                grid.setItems(items);
            });
        }, "game of thrones");


        };

    private Grid<Result> withClientsideScrollListener(Grid<Result> grid) {
        grid.getElement().executeJs("this.$.scroller.addEventListener('scroll', (scrollEvent) => " +
                "{requestAnimationFrame(" +
                "() => $0.$server.onGridScroll({sh: this.$.table.scrollHeight, " +
                "ch: this.$.table.clientHeight, " +
                "st: this.$.table.scrollTop}))},true)",
                getElement());
        return grid;
    }
}
