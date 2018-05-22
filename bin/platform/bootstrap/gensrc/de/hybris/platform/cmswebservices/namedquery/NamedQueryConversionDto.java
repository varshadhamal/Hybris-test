/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at May 4, 2018 2:52:05 AM
 * ----------------------------------------------------------------
 *
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package de.hybris.platform.cmswebservices.namedquery;

import de.hybris.platform.cmswebservices.namedquery.NamedQuery;

public class NamedQueryConversionDto {

	/** <i>Generated property</i> for <code>NamedQueryConversionDto.query</code> property defined at extension <code>cmswebservices</code>. */
	private String query;
	/** <i>Generated property</i> for <code>NamedQueryConversionDto.namedQuery</code> property defined at extension <code>cmswebservices</code>. */
	private NamedQuery namedQuery;


		public void setQuery(final String query)
	{
		this.query = query;
	}

	public NamedQueryConversionDto withQuery(final String query)
	{
		this.query = query;
		return this;
	}

			
	public String getQuery() 
	{
		return query;
	}

	
		public void setNamedQuery(final NamedQuery namedQuery)
	{
		this.namedQuery = namedQuery;
	}

	public NamedQueryConversionDto withNamedQuery(final NamedQuery namedQuery)
	{
		this.namedQuery = namedQuery;
		return this;
	}

			
	public NamedQuery getNamedQuery() 
	{
		return namedQuery;
	}

	}