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
package de.hybris.platform.personalizationwebservices.data;

import de.hybris.platform.personalizationfacades.data.ActionData;
import java.util.List;

public  class ActionListWsDTO  implements java.io.Serializable 
{


	/** <i>Generated property</i> for <code>ActionListWsDTO.actions</code> property defined at extension <code>personalizationwebservices</code>. */
		
	private List<ActionData> actions;
	
	public ActionListWsDTO()
	{
		// default constructor
	}
	
	
	
	public void setActions(final List<ActionData> actions)
	{
		this.actions = actions;
	}
	
	
	
	public List<ActionData> getActions() 
	{
		return actions;
	}
	


}