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

import de.hybris.platform.commercewebservicescommons.dto.product.VariantOptionWsDTO;
import java.util.List;

public  class BaseOptionWsDTO  implements java.io.Serializable 
{


	/** <i>Generated property</i> for <code>BaseOptionWsDTO.variantType</code> property defined at extension <code>commercewebservicescommons</code>. */
		
	private String variantType;

	/** <i>Generated property</i> for <code>BaseOptionWsDTO.options</code> property defined at extension <code>commercewebservicescommons</code>. */
		
	private List<VariantOptionWsDTO> options;

	/** <i>Generated property</i> for <code>BaseOptionWsDTO.selected</code> property defined at extension <code>commercewebservicescommons</code>. */
		
	private VariantOptionWsDTO selected;
	
	public BaseOptionWsDTO()
	{
		// default constructor
	}
	
	
	
	public void setVariantType(final String variantType)
	{
		this.variantType = variantType;
	}
	
	
	
	public String getVariantType() 
	{
		return variantType;
	}
	
	
	
	public void setOptions(final List<VariantOptionWsDTO> options)
	{
		this.options = options;
	}
	
	
	
	public List<VariantOptionWsDTO> getOptions() 
	{
		return options;
	}
	
	
	
	public void setSelected(final VariantOptionWsDTO selected)
	{
		this.selected = selected;
	}
	
	
	
	public VariantOptionWsDTO getSelected() 
	{
		return selected;
	}
	


}