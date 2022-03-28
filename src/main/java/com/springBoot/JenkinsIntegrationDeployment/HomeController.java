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
	    return "Welcome to Spring Boot Home Screen <br>"
	    		+ "The following are the Location Control Mappings <br>"
	    		+ "getAllLocations/{id}/{name} <br>"
	    		+ "\"/getLocation/{id}/{name}\" <br>"
	    		+ "/insertLocation/{id}/{name}<br>"
	    		+ "/updateLocation/{id}/{name}<br>"
	    		+ "/deleteLocation/{id}/{name}<br>"
	    		+ "getAllLocations<br>"
	    		+ "/locations/{id}<br>"
	    		+ "/locationsInsertObject<br>"
	    		+ "/locationsUpdateObject<br>";

	}
	
	
}
