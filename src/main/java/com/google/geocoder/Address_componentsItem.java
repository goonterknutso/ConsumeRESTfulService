package com.google.geocoder;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Address_componentsItem{
	@JsonProperty("types")
	private List<String> types;
	@JsonProperty("short_name")
	private String short_name;
	@JsonProperty("long_name")
	private String long_name;

	public void setTypes(List<String> types){
		this.types = types;
	}

	public List<String> getTypes(){
		return types;
	}

	public void setShort_name(String short_name){
		this.short_name = short_name;
	}

	public String getShort_name(){
		return short_name;
	}

	public void setLong_name(String long_name){
		this.long_name = long_name;
	}

	public String getLong_name(){
		return long_name;
	}

}