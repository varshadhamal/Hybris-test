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

import java.util.Collection;

public  class SiteListData  implements java.io.Serializable 
{


	/** <i>Generated property</i> for <code>SiteListData.sites</code> property defined at extension <code>cmswebservices</code>. */
		
	private Collection<SiteData> sites;
	
	public SiteListData()
	{
		// default constructor
	}
	
	
	
	public void setSites(final Collection<SiteData> sites)
	{
		this.sites = sites;
	}
	
	
	
	public Collection<SiteData> getSites() 
	{
		return sites;
	}
	


}