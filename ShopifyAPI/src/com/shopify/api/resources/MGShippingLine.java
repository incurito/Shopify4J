/**
 * DO NOT MODIFY THIS CODE
 *
 * Place all of your changes in ShippingLine.java
 *
 * It has been machine generated from fixtures and your changes will be
 * lost if anything new needs to be added to the API. 
 **/
// Last Generated: 2011-08-31T09:06:23-04:00
package com.shopify.api.resources;

import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * This code has been machine generated by processing the single entry
 * fixtures found from the Shopify API Documentation
 */

public class MGShippingLine extends ShopifyResource {

	@JsonProperty("price")
	private String _price;
	@JsonProperty("price")
	public String getPrice(){ return _price;}
	@JsonProperty("price")
	public void setPrice(String _price){this._price = _price;}

	@JsonProperty("title")
	private String _title;
	@JsonProperty("title")
	public String getTitle(){ return _title;}
	@JsonProperty("title")
	public void setTitle(String _title){this._title = _title;}

	@JsonProperty("code")
	private String _code;
	@JsonProperty("code")
	public String getCode(){ return _code;}
	@JsonProperty("code")
	public void setCode(String _code){this._code = _code;}

}