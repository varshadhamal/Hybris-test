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
package de.hybris.platform.ruleengineservices.compiler;

public  class RuleIrVariable  implements java.io.Serializable 
{


	/** <i>Generated property</i> for <code>RuleIrVariable.name</code> property defined at extension <code>ruleengineservices</code>. */
		
	private String name;

	/** <i>Generated property</i> for <code>RuleIrVariable.type</code> property defined at extension <code>ruleengineservices</code>. */
		
	private Class<?> type;

	/** <i>Generated property</i> for <code>RuleIrVariable.path</code> property defined at extension <code>ruleengineservices</code>. */
		
	private String[] path;
	
	public RuleIrVariable()
	{
		// default constructor
	}
	
	
	
	public void setName(final String name)
	{
		this.name = name;
	}
	
	
	
	public String getName() 
	{
		return name;
	}
	
	
	
	public void setType(final Class<?> type)
	{
		this.type = type;
	}
	
	
	
	public Class<?> getType() 
	{
		return type;
	}
	
	
	
	public void setPath(final String[] path)
	{
		this.path = path;
	}
	
	
	
	public String[] getPath() 
	{
		return path;
	}
	


}