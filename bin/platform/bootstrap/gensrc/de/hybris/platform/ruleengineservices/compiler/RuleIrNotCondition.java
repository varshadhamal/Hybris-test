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

import de.hybris.platform.ruleengineservices.compiler.RuleIrCondition;
import de.hybris.platform.ruleengineservices.compiler.RuleIrLocalVariablesContainer;
import java.util.List;

public  class RuleIrNotCondition extends RuleIrCondition 
{


	/** <i>Generated property</i> for <code>RuleIrNotCondition.variablesContainer</code> property defined at extension <code>ruleengineservices</code>. */
		
	private RuleIrLocalVariablesContainer variablesContainer;

	/** <i>Generated property</i> for <code>RuleIrNotCondition.children</code> property defined at extension <code>ruleengineservices</code>. */
		
	private List<RuleIrCondition> children;
	
	public RuleIrNotCondition()
	{
		// default constructor
	}
	
	
	
	public void setVariablesContainer(final RuleIrLocalVariablesContainer variablesContainer)
	{
		this.variablesContainer = variablesContainer;
	}
	
	
	
	public RuleIrLocalVariablesContainer getVariablesContainer() 
	{
		return variablesContainer;
	}
	
	
	
	public void setChildren(final List<RuleIrCondition> children)
	{
		this.children = children;
	}
	
	
	
	public List<RuleIrCondition> getChildren() 
	{
		return children;
	}
	


}