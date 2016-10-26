package com.google.geocoder;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ResultsItem{
	@JsonProperty("formatted_address")
	private String formatted_address;
	@JsonProperty("types")
	private List<String> types;
	@JsonProperty("geometry")
	private Geometry geometry;
	@JsonProperty("address_components")
	private List<Address_componentsItem> address_components;
	@JsonProperty("place_id")
	private String place_id;

	public void setFormatted_address(String formatted_address){
		this.formatted_address = formatted_address;
	}

	public String getFormatted_address(){
		return formatted_address;
	}

	public void setTypes(List<String> types){
		this.types = types;
	}

	public List<String> getTypes(){
		return types;
	}

	public void setGeometry(Geometry geometry){
		this.geometry = geometry;
	}

	public Geometry getGeometry(){
		return geometry;
	}

	public void setAddress_components(List<Address_componentsItem> address_components){
		this.address_components = address_components;
	}

	public List<Address_componentsItem> getAddress_components(){
		return address_components;
	}

	public void setPlace_id(String place_id){
		this.place_id = place_id;
	}

	public String getPlace_id(){
		return place_id;
	}

}