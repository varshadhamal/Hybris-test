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
package de.hybris.platform.commerceservices.search.pagedata;

/**
 * POJO representing a sort option.
 */
public  class SortData  implements java.io.Serializable 
{


	/** <i>Generated property</i> for <code>SortData.code</code> property defined at extension <code>commerceservices</code>. */
		
	private String code;

	/** <i>Generated property</i> for <code>SortData.name</code> property defined at extension <code>commerceservices</code>. */
		
	private String name;

	/** <i>Generated property</i> for <code>SortData.selected</code> property defined at extension <code>commerceservices</code>. */
		
	private boolean selected;
	
	public SortData()
	{
		// default constructor
	}
	
	
	
	public void setCode(final String code)
	{
		this.code = code;
	}
	
	
	
	public String getCode() 
	{
		return code;
	}
	
	
	
	public void setName(final String name)
	{
		this.name = name;
	}
	
	
	
	public String getName() 
	{
		return name;
	}
	
	
	
	public void setSelected(final boolean selected)
	{
		this.selected = selected;
	}
	
	
	
	public boolean isSelected() 
	{
		return selected;
	}
	


}