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
package de.hybris.platform.personalizationservices.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.personalizationservices.model.CxSegmentTriggerModel;
import de.hybris.platform.personalizationservices.model.CxUserToSegmentModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type CxSegment first defined at extension personalizationservices.
 */
@SuppressWarnings("all")
public class CxSegmentModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CxSegment";
	
	/**<i>Generated relation code constant for relation <code>CxSegmentToTrigger</code> defining source attribute <code>triggers</code> in extension <code>personalizationservices</code>.</i>*/
	public final static String _CXSEGMENTTOTRIGGER = "CxSegmentToTrigger";
	
	/** <i>Generated constant</i> - Attribute key of <code>CxSegment.code</code> attribute defined at extension <code>personalizationservices</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>CxSegment.triggers</code> attribute defined at extension <code>personalizationservices</code>. */
	public static final String TRIGGERS = "triggers";
	
	/** <i>Generated constant</i> - Attribute key of <code>CxSegment.userToSegments</code> attribute defined at extension <code>personalizationservices</code>. */
	public static final String USERTOSEGMENTS = "userToSegments";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CxSegmentModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CxSegmentModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>CxSegment</code> at extension <code>personalizationservices</code>
	 */
	@Deprecated
	public CxSegmentModel(final String _code)
	{
		super();
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>CxSegment</code> at extension <code>personalizationservices</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public CxSegmentModel(final String _code, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CxSegment.code</code> attribute defined at extension <code>personalizationservices</code>. 
	 * @return the code - Unique code of the segment
	 */
	@Accessor(qualifier = "code", type = Accessor.Type.GETTER)
	public String getCode()
	{
		return getPersistenceContext().getPropertyValue(CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CxSegment.triggers</code> attribute defined at extension <code>personalizationservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the triggers
	 */
	@Accessor(qualifier = "triggers", type = Accessor.Type.GETTER)
	public Collection<CxSegmentTriggerModel> getTriggers()
	{
		return getPersistenceContext().getPropertyValue(TRIGGERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CxSegment.userToSegments</code> attribute defined at extension <code>personalizationservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the userToSegments
	 */
	@Accessor(qualifier = "userToSegments", type = Accessor.Type.GETTER)
	public Collection<CxUserToSegmentModel> getUserToSegments()
	{
		return getPersistenceContext().getPropertyValue(USERTOSEGMENTS);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>CxSegment.code</code> attribute defined at extension <code>personalizationservices</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the code - Unique code of the segment
	 */
	@Accessor(qualifier = "code", type = Accessor.Type.SETTER)
	public void setCode(final String value)
	{
		getPersistenceContext().setPropertyValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CxSegment.triggers</code> attribute defined at extension <code>personalizationservices</code>. 
	 *  
	 * @param value the triggers
	 */
	@Accessor(qualifier = "triggers", type = Accessor.Type.SETTER)
	public void setTriggers(final Collection<CxSegmentTriggerModel> value)
	{
		getPersistenceContext().setPropertyValue(TRIGGERS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CxSegment.userToSegments</code> attribute defined at extension <code>personalizationservices</code>. 
	 *  
	 * @param value the userToSegments
	 */
	@Accessor(qualifier = "userToSegments", type = Accessor.Type.SETTER)
	public void setUserToSegments(final Collection<CxUserToSegmentModel> value)
	{
		getPersistenceContext().setPropertyValue(USERTOSEGMENTS, value);
	}
	
}
