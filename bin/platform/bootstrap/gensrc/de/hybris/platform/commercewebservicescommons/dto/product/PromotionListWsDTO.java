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
package de.hybris.platform.commercewebservicescommons.dto.product;

import de.hybris.platform.commercewebservicescommons.dto.product.PromotionWsDTO;
import java.util.List;

public  class PromotionListWsDTO  implements java.io.Serializable 
{


	/** <i>Generated property</i> for <code>PromotionListWsDTO.promotions</code> property defined at extension <code>commercewebservicescommons</code>. */
		
	private List<PromotionWsDTO> promotions;
	
	public PromotionListWsDTO()
	{
		// default constructor
	}
	
	
	
	public void setPromotions(final List<PromotionWsDTO> promotions)
	{
		this.promotions = promotions;
	}
	
	
	
	public List<PromotionWsDTO> getPromotions() 
	{
		return promotions;
	}
	


}