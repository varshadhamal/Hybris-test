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
package de.hybris.platform.ruleengineservices.rao;

import de.hybris.platform.ruleengineservices.rao.AbstractOrderRAO;
import java.math.BigDecimal;

public  class CartRAO extends AbstractOrderRAO 
{


	/** <i>Generated property</i> for <code>CartRAO.originalTotal</code> property defined at extension <code>ruleengineservices</code>. */
		
	private BigDecimal originalTotal;
	
	public CartRAO()
	{
		// default constructor
	}
	
	
	
	public void setOriginalTotal(final BigDecimal originalTotal)
	{
		this.originalTotal = originalTotal;
	}
	
	
	
	public BigDecimal getOriginalTotal() 
	{
		return originalTotal;
	}
	


}