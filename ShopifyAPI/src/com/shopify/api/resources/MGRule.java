/**
 * DO NOT MODIFY THIS CODE
 *
 * Place all of your changes in Rule.java
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

public class MGRule extends ShopifyResource {

	@JsonProperty("column")
	private String _column;
	@JsonProperty("column")
	public String getColumn(){ return _column;}
	@JsonProperty("column")
	public void setColumn(String _column){this._column = _column;}

	@JsonProperty("relation")
	private String _relation;
	@JsonProperty("relation")
	public String getRelation(){ return _relation;}
	@JsonProperty("relation")
	public void setRelation(String _relation){this._relation = _relation;}

	@JsonProperty("condition")
	private String _condition;
	@JsonProperty("condition")
	public String getCondition(){ return _condition;}
	@JsonProperty("condition")
	public void setCondition(String _condition){this._condition = _condition;}

}