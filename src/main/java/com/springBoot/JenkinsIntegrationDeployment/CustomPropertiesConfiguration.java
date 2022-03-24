package com.springBoot.JenkinsIntegrationDeployment;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "custom")
public class CustomPropertiesConfiguration {
	
	@Configuration
	@ConfigurationProperties(prefix = "custom.property1")
	class Property1{
		private String val1;
		private String val2;
		private String val3;
		public String getVal1() {
			return val1;
		}
		public void setVal1(String val1) {
			this.val1 = val1;
		}
		public String getVal2() {
			return val2;
		}
		public void setVal2(String val2) {
			this.val2 = val2;
		}
		public String getVal3() {
			return val3;
		}
		public void setVal3(String val3) {
			this.val3 = val3;
		}
	}
	
	@Configuration
	@ConfigurationProperties(prefix = "custom.property2")
	class Property2{
		private int val1;
		private int val2;
		private int val3;
		public int getVal1() {
			return val1;
		}
		public void setVal1(int val1) {
			this.val1 = val1;
		}
		public int getVal2() {
			return val2;
		}
		public void setVal2(int val2) {
			this.val2 = val2;
		}
		public int getVal3() {
			return val3;
		}
		public void setVal3(int val3) {
			this.val3 = val3;
		}
	}
	
	@Configuration
	@ConfigurationProperties(prefix = "custom.property3")
	class Property3{
		private List<String> val1;
		private List<Integer> val2;
		public List<String> getVal1() {
			return val1;
		}
		public void setVal1(List<String> val1) {
			this.val1 = val1;
		}
		public List<Integer> getVal2() {
			return val2;
		}
		public void setVal2(List<Integer> val2) {
			this.val2 = val2;
		}
	}
	
	private Property1 property1;
	private Property2 property2;
	private Property3 property3;
	
	public Property1 getProperty1() {
		return property1;
	}
	public void setProperty1(Property1 property1) {
		this.property1 = property1;
	}
	public Property2 getProperty2() {
		return property2;
	}
	public void setProperty2(Property2 property2) {
		this.property2 = property2;
	}
	public Property3 getProperty3() {
		return property3;
	}
	public void setProperty3(Property3 property3) {
		this.property3 = property3;
	}
}
