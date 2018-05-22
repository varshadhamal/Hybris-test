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
package de.hybris.platform.commercesearch.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.commercesearch.model.AbstractSolrSearchProfileModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexedTypeModel;

/**
 * Generated model class for type CategorySolrSearchProfile first defined at extension commercesearch.
 */
@SuppressWarnings("all")
public class CategorySolrSearchProfileModel extends AbstractSolrSearchProfileModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CategorySolrSearchProfile";
	
	/** <i>Generated constant</i> - Attribute key of <code>CategorySolrSearchProfile.categoryCode</code> attribute defined at extension <code>commercesearch</code>. */
	public static final String CATEGORYCODE = "categoryCode";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CategorySolrSearchProfileModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CategorySolrSearchProfileModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _categoryCode initial attribute declared by type <code>CategorySolrSearchProfile</code> at extension <code>commercesearch</code>
	 * @param _code initial attribute declared by type <code>AbstractSolrSearchProfile</code> at extension <code>commercesearch</code>
	 * @param _indexedType initial attribute declared by type <code>AbstractSolrSearchProfile</code> at extension <code>commercesearch</code>
	 */
	@Deprecated
	public CategorySolrSearchProfileModel(final String _categoryCode, final String _code, final SolrIndexedTypeModel _indexedType)
	{
		super();
		setCategoryCode(_categoryCode);
		setCode(_code);
		setIndexedType(_indexedType);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _categoryCode initial attribute declared by type <code>CategorySolrSearchProfile</code> at extension <code>commercesearch</code>
	 * @param _code initial attribute declared by type <code>AbstractSolrSearchProfile</code> at extension <code>commercesearch</code>
	 * @param _indexedType initial attribute declared by type <code>AbstractSolrSearchProfile</code> at extension <code>commercesearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public CategorySolrSearchProfileModel(final String _categoryCode, final String _code, final SolrIndexedTypeModel _indexedType, final ItemModel _owner)
	{
		super();
		setCategoryCode(_categoryCode);
		setCode(_code);
		setIndexedType(_indexedType);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategorySolrSearchProfile.categoryCode</code> attribute defined at extension <code>commercesearch</code>. 
	 * @return the categoryCode
	 */
	@Accessor(qualifier = "categoryCode", type = Accessor.Type.GETTER)
	public String getCategoryCode()
	{
		return getPersistenceContext().getPropertyValue(CATEGORYCODE);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CategorySolrSearchProfile.categoryCode</code> attribute defined at extension <code>commercesearch</code>. 
	 *  
	 * @param value the categoryCode
	 */
	@Accessor(qualifier = "categoryCode", type = Accessor.Type.SETTER)
	public void setCategoryCode(final String value)
	{
		getPersistenceContext().setPropertyValue(CATEGORYCODE, value);
	}
	
}
