package com.example.application.views.cardlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.application.models.MovieResponse;
import com.example.application.models.Result;
import com.example.application.service.MovieService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
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

@PageTitle("Card List")
@Route(value = "card-list", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class CardListView extends Div implements AfterNavigationObserver {

    private MovieService movieService;
    Grid<Result> grid = new Grid<>();

    private Notification notification = new Notification("Loading...", 500, Notification.Position.TOP_CENTER);
    private List<Result> items;

    public CardListView(MovieService movieService) {
        this.movieService = movieService;
        addClassName("card-list-view");
        setSizeFull();
        grid.setHeight("100%");
        grid.addThemeVariants(GridVariant.LUMO_NO_BORDER, GridVariant.LUMO_NO_ROW_BORDERS);
        grid.addComponentColumn(item -> createCard(item));
        add(grid);
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


        }
}
