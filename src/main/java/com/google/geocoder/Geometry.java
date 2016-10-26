package com.google.geocoder;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Geometry{
	@JsonProperty("viewport")
	private Viewport viewport;
	@JsonProperty("location")
	private Location location;
	@JsonProperty("location_type")
	private String location_type;

	public void setViewport(Viewport viewport){
		this.viewport = viewport;
	}

	public Viewport getViewport(){
		return viewport;
	}

	public void setLocation(Location location){
		this.location = location;
	}

	public Location getLocation(){
		return location;
	}

	public void setLocation_type(String location_type){
		this.location_type = location_type;
	}

	public String getLocation_type(){
		return location_type;
	}

}