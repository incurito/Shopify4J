/**
 * DO NOT MODIFY THIS CODE
 *
 * Place all of your changes in Webhook.java
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

public class MGWebhook extends ShopifyResource {

	@JsonProperty("address")
	private String _address;
	@JsonProperty("address")
	public String getAddress(){ return _address;}
	@JsonProperty("address")
	public void setAddress(String _address){this._address = _address;}

	@JsonProperty("format")
	private String _format;
	@JsonProperty("format")
	public String getFormat(){ return _format;}
	@JsonProperty("format")
	public void setFormat(String _format){this._format = _format;}

	@JsonProperty("topic")
	private String _topic;
	@JsonProperty("topic")
	public String getTopic(){ return _topic;}
	@JsonProperty("topic")
	public void setTopic(String _topic){this._topic = _topic;}

}