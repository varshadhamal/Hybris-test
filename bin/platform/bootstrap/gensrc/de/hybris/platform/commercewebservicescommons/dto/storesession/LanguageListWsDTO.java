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
package de.hybris.platform.commercewebservicescommons.dto.storesession;

import de.hybris.platform.commercewebservicescommons.dto.storesession.LanguageWsDTO;
import java.util.List;

public  class LanguageListWsDTO  implements java.io.Serializable 
{


	/** <i>Generated property</i> for <code>LanguageListWsDTO.languages</code> property defined at extension <code>commercewebservicescommons</code>. */
		
	private List<LanguageWsDTO> languages;
	
	public LanguageListWsDTO()
	{
		// default constructor
	}
	
	
	
	public void setLanguages(final List<LanguageWsDTO> languages)
	{
		this.languages = languages;
	}
	
	
	
	public List<LanguageWsDTO> getLanguages() 
	{
		return languages;
	}
	


}