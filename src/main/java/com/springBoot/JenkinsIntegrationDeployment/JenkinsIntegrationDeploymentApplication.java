package com.springBoot.JenkinsIntegrationDeployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;


@SpringBootApplication
public class JenkinsIntegrationDeploymentApplication implements CommandLineRunner {
	
	@Autowired
    private DataSourceConfiguration dataSourceConfiguration;
	
	public static void main(String[] args) {
		SpringApplication.run(JenkinsIntegrationDeploymentApplication.class, args);
	}
	
	@Override
	public void run(String...args){
        System.out.println("Application.properties has these values for spring.datasource: " + dataSourceConfiguration);
    }
}
