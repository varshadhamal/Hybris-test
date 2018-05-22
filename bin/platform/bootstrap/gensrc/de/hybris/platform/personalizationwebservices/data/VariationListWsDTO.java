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

import de.hybris.platform.personalizationfacades.data.VariationData;
import java.util.List;

public  class VariationListWsDTO  implements java.io.Serializable 
{


	/** <i>Generated property</i> for <code>VariationListWsDTO.variations</code> property defined at extension <code>personalizationwebservices</code>. */
		
	private List<VariationData> variations;
	
	public VariationListWsDTO()
	{
		// default constructor
	}
	
	
	
	public void setVariations(final List<VariationData> variations)
	{
		this.variations = variations;
	}
	
	
	
	public List<VariationData> getVariations() 
	{
		return variations;
	}
	


}