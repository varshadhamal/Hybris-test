/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at May 4, 2018 2:52:05 AM
 * ----------------------------------------------------------------
 *
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of SAP 
 * Hybris ("Confidential Information"). You shall not disclose such 
 * Confidential Information and shall use it only in accordance with the 
 * terms of the license agreement you entered into with SAP Hybris.
 */
package de.hybris.platform.cmswebservices.data;

import java.util.Map;

public  class SimpleBannerComponentData extends AbstractCMSComponentData 
{


	/** <i>Generated property</i> for <code>SimpleBannerComponentData.media</code> property defined at extension <code>cmswebservices</code>. */
		
	private Map<String, String> media;

	/** <i>Generated property</i> for <code>SimpleBannerComponentData.urlLink</code> property defined at extension <code>cmswebservices</code>. */
		
	private String urlLink;

	/** <i>Generated property</i> for <code>SimpleBannerComponentData.external</code> property defined at extension <code>cmswebservices</code>. */
		
	private Boolean external;
	
	public SimpleBannerComponentData()
	{
		// default constructor
	}
	
	
	
	public void setMedia(final Map<String, String> media)
	{
		this.media = media;
	}
	
	
	
	public Map<String, String> getMedia() 
	{
		return media;
	}
	
	
	
	public void setUrlLink(final String urlLink)
	{
		this.urlLink = urlLink;
	}
	
	
	
	public String getUrlLink() 
	{
		return urlLink;
	}
	
	
	
	public void setExternal(final Boolean external)
	{
		this.external = external;
	}
	
	
	
	public Boolean getExternal() 
	{
		return external;
	}
	


}