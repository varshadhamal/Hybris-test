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
package de.hybris.platform.acceleratorservices.payment.data;

import de.hybris.platform.acceleratorservices.payment.data.PaymentSubscriptionResult;
import de.hybris.platform.core.model.order.payment.CreditCardPaymentInfoModel;

public  class PaymentSubscriptionResultItem extends PaymentSubscriptionResult 
{


	/** <i>Generated property</i> for <code>PaymentSubscriptionResultItem.storedCard</code> property defined at extension <code>acceleratorservices</code>. */
		
	private CreditCardPaymentInfoModel storedCard;
	
	public PaymentSubscriptionResultItem()
	{
		// default constructor
	}
	
	
	
	public void setStoredCard(final CreditCardPaymentInfoModel storedCard)
	{
		this.storedCard = storedCard;
	}
	
	
	
	public CreditCardPaymentInfoModel getStoredCard() 
	{
		return storedCard;
	}
	


}