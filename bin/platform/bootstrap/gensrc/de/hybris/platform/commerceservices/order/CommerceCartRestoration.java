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
package de.hybris.platform.commerceservices.order;

import de.hybris.platform.commerceservices.order.CommerceCartModification;
import java.util.List;

/**
 * Represents the result of the restoration of a cart to a customer's session.
 */
public  class CommerceCartRestoration  implements java.io.Serializable 
{


	/** <i>Generated property</i> for <code>CommerceCartRestoration.modifications</code> property defined at extension <code>commerceservices</code>. */
		
	private List<CommerceCartModification> modifications;
	
	public CommerceCartRestoration()
	{
		// default constructor
	}
	
	
	
	public void setModifications(final List<CommerceCartModification> modifications)
	{
		this.modifications = modifications;
	}
	
	
	
	public List<CommerceCartModification> getModifications() 
	{
		return modifications;
	}
	


}