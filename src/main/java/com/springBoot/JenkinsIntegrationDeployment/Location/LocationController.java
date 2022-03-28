package com.springBoot.JenkinsIntegrationDeployment.Location;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {
	
   @Autowired
   private LocationService locationService;
   /*
   @RequestMapping(method=RequestMethod.POST, value="/locations")
   public void addLocation(@RequestBody Location location) {
   	locationService.addLocation(location);
   }
   
   @RequestMapping(value = "/location/{id}", method = RequestMethod.DELETE)
   public void deleteLocation(@PathVariable String id) {
       locationService.deleteLocation(id);
   }
	
   @RequestMapping(value = "/locations")
   public List<Location> getAllLocations() 
   {
	return locationService.getAllLocations();
   }		
   
   @RequestMapping(value = "/locations/{id}")
   public Location getLocation(@PathVariable String id) {
   	return locationService.getLocation(id);
   }
   */

   @GetMapping("/locations/{id}")  
   private Location getLocationById(@PathVariable("id") String id)   
   {  
   return locationService.getLocationById(id);  
   }
   
   @PostMapping("/locations")
   private Location insertLocation(@RequestBody Location location)   
   {  
   return locationService.insertLocation(location);
   }
   
   //Generic Mapping
   @GetMapping("getAllLocations/{id}/{name}")  
   private List<Location> allLocations()   
   {  
   return locationService.allLocations();  
   }  
   @GetMapping("/getLocation/{id}/{name}")  
   private Optional<Location> getDatabaseRow(@PathVariable("id") String id, @PathVariable("name") String name)   
   {   
	   return Optional.ofNullable(locationService.getLocationById(id));  
   }
   
   @PostMapping("/insertLocation/{id}/{name}")  
	public Location insertDatabaseRow(@PathVariable("id") String id, @PathVariable("name") String name) {
	   return locationService.insert(name);
	}
   
   @PostMapping("/updateLocation/{id}/{name}")  
	public Location updateDatabaseRow(@PathVariable("id") String id, @PathVariable("name") String name) {
	   return locationService.update(id, name);
	}
   
   @PostMapping("/deleteLocation/{id}/{name}")  
	public Location deleteDatabaseRow(@PathVariable("id") String id, @PathVariable("name") String name) {
	   Location location = locationService.getLocationById(id); 
	   	locationService.delete(id, name);
	   	return location;
	}
   
   
   
   
   
   
   
   
  
   /*@GetMapping("/locationsUpdate/{id}")  
	public Location updateDatabaseJenkinsInput(@PathVariable("id") String id) {
	   return locationService.update(id);
	}*/
   
   /*@GetMapping("/locationsUpdate")  
	public Location updateDatabaseJenkinsInput() {
	   return locationService.update();
	}*/
   
   
}
