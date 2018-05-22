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
package de.hybris.platform.ruleengineservices.rao;

import de.hybris.platform.ruleengineservices.rao.AbstractActionedRAO;
import de.hybris.platform.ruleengineservices.rao.OrderEntryConsumedRAO;
import java.util.Map;
import java.util.Set;

public  class AbstractRuleActionRAO  implements java.io.Serializable 
{


	/** <i>Generated property</i> for <code>AbstractRuleActionRAO.firedRuleCode</code> property defined at extension <code>ruleengineservices</code>. */
		
	private String firedRuleCode;

	/** <i>Generated property</i> for <code>AbstractRuleActionRAO.actionStrategyKey</code> property defined at extension <code>ruleengineservices</code>. */
		
	private String actionStrategyKey;

	/** <i>Generated property</i> for <code>AbstractRuleActionRAO.appliedToObject</code> property defined at extension <code>ruleengineservices</code>. */
		
	private AbstractActionedRAO appliedToObject;

	/** <i>Generated property</i> for <code>AbstractRuleActionRAO.consumedEntries</code> property defined at extension <code>ruleengineservices</code>. */
		
	private Set<OrderEntryConsumedRAO> consumedEntries;

	/** <i>Generated property</i> for <code>AbstractRuleActionRAO.metadata</code> property defined at extension <code>ruleengineservices</code>. */
		
	private Map<String,String> metadata;
	
	public AbstractRuleActionRAO()
	{
		// default constructor
	}
	
	
	
	public void setFiredRuleCode(final String firedRuleCode)
	{
		this.firedRuleCode = firedRuleCode;
	}
	
	
	
	public String getFiredRuleCode() 
	{
		return firedRuleCode;
	}
	
	
	
	public void setActionStrategyKey(final String actionStrategyKey)
	{
		this.actionStrategyKey = actionStrategyKey;
	}
	
	
	
	public String getActionStrategyKey() 
	{
		return actionStrategyKey;
	}
	
	
	
	public void setAppliedToObject(final AbstractActionedRAO appliedToObject)
	{
		this.appliedToObject = appliedToObject;
	}
	
	
	
	public AbstractActionedRAO getAppliedToObject() 
	{
		return appliedToObject;
	}
	
	
	
	public void setConsumedEntries(final Set<OrderEntryConsumedRAO> consumedEntries)
	{
		this.consumedEntries = consumedEntries;
	}
	
	
	
	public Set<OrderEntryConsumedRAO> getConsumedEntries() 
	{
		return consumedEntries;
	}
	
	
	
	public void setMetadata(final Map<String,String> metadata)
	{
		this.metadata = metadata;
	}
	
	
	
	public Map<String,String> getMetadata() 
	{
		return metadata;
	}
	


}