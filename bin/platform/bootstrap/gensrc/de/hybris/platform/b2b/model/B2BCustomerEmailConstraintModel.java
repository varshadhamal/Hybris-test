/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 4, 2018 2:52:03 AM                      ---
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
 *  
 */
package de.hybris.platform.b2b.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.validation.enums.RegexpFlag;
import de.hybris.platform.validation.model.constraints.jsr303.PatternConstraintModel;
import java.util.Set;

/**
 * Generated model class for type B2BCustomerEmailConstraint first defined at extension b2bcommerce.
 * <p>
 * Ensures B2BCustomer's email address is valid.
 */
@SuppressWarnings("all")
public class B2BCustomerEmailConstraintModel extends PatternConstraintModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "B2BCustomerEmailConstraint";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public B2BCustomerEmailConstraintModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public B2BCustomerEmailConstraintModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _annotation initial attribute declared by type <code>B2BCustomerEmailConstraint</code> at extension <code>b2bcommerce</code>
	 * @param _flags initial attribute declared by type <code>PatternConstraint</code> at extension <code>validation</code>
	 * @param _id initial attribute declared by type <code>AbstractConstraint</code> at extension <code>validation</code>
	 * @param _regexp initial attribute declared by type <code>PatternConstraint</code> at extension <code>validation</code>
	 */
	@Deprecated
	public B2BCustomerEmailConstraintModel(final Class _annotation, final Set<RegexpFlag> _flags, final String _id, final String _regexp)
	{
		super();
		setAnnotation(_annotation);
		setFlags(_flags);
		setId(_id);
		setRegexp(_regexp);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _annotation initial attribute declared by type <code>B2BCustomerEmailConstraint</code> at extension <code>b2bcommerce</code>
	 * @param _flags initial attribute declared by type <code>PatternConstraint</code> at extension <code>validation</code>
	 * @param _id initial attribute declared by type <code>AbstractConstraint</code> at extension <code>validation</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _regexp initial attribute declared by type <code>PatternConstraint</code> at extension <code>validation</code>
	 */
	@Deprecated
	public B2BCustomerEmailConstraintModel(final Class _annotation, final Set<RegexpFlag> _flags, final String _id, final ItemModel _owner, final String _regexp)
	{
		super();
		setAnnotation(_annotation);
		setFlags(_flags);
		setId(_id);
		setOwner(_owner);
		setRegexp(_regexp);
	}
	
	
}
