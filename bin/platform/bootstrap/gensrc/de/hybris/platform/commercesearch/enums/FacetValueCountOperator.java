/*
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
 *  
 */
package de.hybris.platform.commercesearch.enums;

import de.hybris.platform.core.HybrisEnumValue;

/**
 * Generated enum FacetValueCountOperator declared at extension commercesearch.
 */
@SuppressWarnings("PMD")
public enum FacetValueCountOperator implements HybrisEnumValue
{
	/**
	 * Generated enum value for FacetValueCountOperator.GREATER_THAN declared at extension commercesearch.
	 */
	GREATER_THAN("GREATER_THAN"),
	/**
	 * Generated enum value for FacetValueCountOperator.LESS_THAN declared at extension commercesearch.
	 */
	LESS_THAN("LESS_THAN");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "FacetValueCountOperator";
	
	/**<i>Generated simple class name constant.</i>*/
	public final static String SIMPLE_CLASSNAME = "FacetValueCountOperator";
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private FacetValueCountOperator(final String code)
	{
		this.code = code.intern();
	}
	
	
	/**
	 * Gets the code of this enum value.
	 *  
	 * @return code of value
	 */
	@Override
	public String getCode()
	{
		return this.code;
	}
	
	/**
	 * Gets the type this enum value belongs to.
	 *  
	 * @return code of type
	 */
	@Override
	public String getType()
	{
		return SIMPLE_CLASSNAME;
	}
	
}
