package com.example.application.views.cardlist;

import java.util.Arrays;
import java.util.List;

import com.example.application.models.D;
import com.example.application.models.Example;
import com.example.application.service.MovieService;
import com.example.application.repository.MovieRepository;
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
    Grid<Example> grid = new Grid<>();

    private Notification notification = new Notification("Loading...", 500, Notification.Position.TOP_CENTER);

    public CardListView(MovieRepository movieRepository) {
        this.movieService = movieService;
        addClassName("card-list-view");
        setSizeFull();
        grid.setHeight("100%");
        grid.addThemeVariants(GridVariant.LUMO_NO_BORDER, GridVariant.LUMO_NO_ROW_BORDERS);
        grid.addComponentColumn(item -> createCard(item));
        add(grid);
    }

    private HorizontalLayout createCard(Example item) {
        HorizontalLayout card = new HorizontalLayout();
        card.addClassName("card");
        card.setSpacing(false);
        card.getThemeList().add("spacing-s");

        Image image = new Image();
        image.setSrc(item.getD().get(0).getI().getImageUrl());
        VerticalLayout description = new VerticalLayout();
        description.addClassName("description");
        description.setSpacing(false);
        description.setPadding(false);

        HorizontalLayout header = new HorizontalLayout();
        header.addClassName("header");
        header.setSpacing(false);
        header.getThemeList().add("spacing-s");

        Span title = new Span(item.getD().get(0).getL());
        title.addClassName("name");
        Span start = new Span(item.getD().get(0).getY().toString());
        start.addClassName("date");
        header.add(title, start);

        description.add(header);
        card.add(image, description);
        return card;
    }

    @Override
    public void afterNavigation(AfterNavigationEvent event) {

        // Set some data when this view is displayed.
        List<D> items = Arrays.asList();
        getMovies();
//        grid.setItems(items);
    }

    private void getMovies(){
        notification.open();
        movieService.getMovies(result -> getUI().get().access(() ->{
            result.stream()
                    .forEach(System.out::println);

                }), "game of thrones");
    }


}
