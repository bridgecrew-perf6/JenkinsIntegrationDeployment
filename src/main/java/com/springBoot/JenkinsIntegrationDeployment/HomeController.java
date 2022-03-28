package com.springBoot.JenkinsIntegrationDeployment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping(value="/welcome")
	public static String Welcome() {
	    return "Welcome to Spring Boot \n" +
		"Spring Boot Started Welcome Screen";
	}
	
	@RequestMapping(value="/")
	public static String HomeScreen() {
	    return "Welcome to Spring Boot Home Screen \n"
	    		+ "The following are the Location Control Mappings \n"
	    		+ "@GetMapping(\"getAllLocations/{id}/{name} \n"
	    		+ "\"/getLocation/{id}/{name}\""
	    		+ "/insertLocation/{id}/{name}"
	    		+ "/updateLocation/{id}/{name}"
	    		+ "/deleteLocation/{id}/{name}"
	    		+ "getAllLocations"
	    		+ "/locations/{id}"
	    		+ "/locationsInsertObject"
	    		+ "/locationsUpdateObject";

	}
	
	
}
