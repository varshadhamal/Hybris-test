/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at May 4, 2018 2:52:06 AM
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

import de.hybris.platform.ruleengineservices.compiler.RuleIrVariable;
import de.hybris.platform.ruleengineservices.compiler.RuleIrVariablesContainer;
import java.util.Map;

public  class RuleIrVariablesContainer  implements java.io.Serializable 
{


	/** <i>Generated property</i> for <code>RuleIrVariablesContainer.name</code> property defined at extension <code>ruleengineservices</code>. */
		
	private String name;

	/** <i>Generated property</i> for <code>RuleIrVariablesContainer.parent</code> property defined at extension <code>ruleengineservices</code>. */
		
	private RuleIrVariablesContainer parent;

	/** <i>Generated property</i> for <code>RuleIrVariablesContainer.children</code> property defined at extension <code>ruleengineservices</code>. */
		
	private Map<String,RuleIrVariablesContainer> children;

	/** <i>Generated property</i> for <code>RuleIrVariablesContainer.variables</code> property defined at extension <code>ruleengineservices</code>. */
		
	private Map<String,RuleIrVariable> variables;

	/** <i>Generated property</i> for <code>RuleIrVariablesContainer.path</code> property defined at extension <code>ruleengineservices</code>. */
		
	private String[] path;
	
	public RuleIrVariablesContainer()
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
	
	
	
	public void setParent(final RuleIrVariablesContainer parent)
	{
		this.parent = parent;
	}
	
	
	
	public RuleIrVariablesContainer getParent() 
	{
		return parent;
	}
	
	
	
	public void setChildren(final Map<String,RuleIrVariablesContainer> children)
	{
		this.children = children;
	}
	
	
	
	public Map<String,RuleIrVariablesContainer> getChildren() 
	{
		return children;
	}
	
	
	
	public void setVariables(final Map<String,RuleIrVariable> variables)
	{
		this.variables = variables;
	}
	
	
	
	public Map<String,RuleIrVariable> getVariables() 
	{
		return variables;
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