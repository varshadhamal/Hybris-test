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
package de.hybris.platform.cmswebservices.dto;

import de.hybris.platform.cms2.model.contents.contentslot.ContentSlotModel;
import de.hybris.platform.cms2.model.pages.AbstractPageModel;

public  class ComponentTypeAndContentSlotValidationDto  implements java.io.Serializable 
{


	/** <i>Generated property</i> for <code>ComponentTypeAndContentSlotValidationDto.componentType</code> property defined at extension <code>cmswebservices</code>. */
		
	private String componentType;

	/** <i>Generated property</i> for <code>ComponentTypeAndContentSlotValidationDto.contentSlot</code> property defined at extension <code>cmswebservices</code>. */
		
	private ContentSlotModel contentSlot;

	/** <i>Generated property</i> for <code>ComponentTypeAndContentSlotValidationDto.page</code> property defined at extension <code>cmswebservices</code>. */
		
	private AbstractPageModel page;
	
	public ComponentTypeAndContentSlotValidationDto()
	{
		// default constructor
	}
	
	
	
	public void setComponentType(final String componentType)
	{
		this.componentType = componentType;
	}
	
	
	
	public String getComponentType() 
	{
		return componentType;
	}
	
	
	
	public void setContentSlot(final ContentSlotModel contentSlot)
	{
		this.contentSlot = contentSlot;
	}
	
	
	
	public ContentSlotModel getContentSlot() 
	{
		return contentSlot;
	}
	
	
	
	public void setPage(final AbstractPageModel page)
	{
		this.page = page;
	}
	
	
	
	public AbstractPageModel getPage() 
	{
		return page;
	}
	


}