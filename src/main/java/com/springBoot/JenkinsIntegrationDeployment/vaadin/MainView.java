package com.springBoot.JenkinsIntegrationDeployment.vaadin;

import java.util.stream.Stream;

import com.springBoot.JenkinsIntegrationDeployment.Location.Location;
import com.springBoot.JenkinsIntegrationDeployment.Location.LocationRepository;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final LocationRepository repo;
	final Grid<Location> grid;

	public MainView(LocationRepository repo) {
		this.repo = repo;
		this.grid = new Grid<>(Location.class);
		add(grid);
		listCustomers();
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	private void listCustomers() {
		grid.setItems((Stream<Location>) repo.findAll());
	}

}