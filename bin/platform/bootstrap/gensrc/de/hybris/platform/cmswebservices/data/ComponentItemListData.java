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

import de.hybris.platform.cmswebservices.data.AbstractCMSComponentData;
import java.util.List;

public  class ComponentItemListData  implements java.io.Serializable 
{


	/** <i>Generated property</i> for <code>ComponentItemListData.componentItems</code> property defined at extension <code>cmswebservices</code>. */
		
	private List<AbstractCMSComponentData> componentItems;
	
	public ComponentItemListData()
	{
		// default constructor
	}
	
	
	
	public void setComponentItems(final List<AbstractCMSComponentData> componentItems)
	{
		this.componentItems = componentItems;
	}
	
	
	
	public List<AbstractCMSComponentData> getComponentItems() 
	{
		return componentItems;
	}
	


}