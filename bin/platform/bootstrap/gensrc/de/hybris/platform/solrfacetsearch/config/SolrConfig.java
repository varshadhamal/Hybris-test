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
package de.hybris.platform.solrfacetsearch.config;

import de.hybris.platform.solrfacetsearch.config.ClusterConfig;
import de.hybris.platform.solrfacetsearch.config.SolrServerMode;

public  class SolrConfig  implements java.io.Serializable 
{


	/** <i>Generated property</i> for <code>SolrConfig.mode</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private SolrServerMode mode;

	/** <i>Generated property</i> for <code>SolrConfig.clusterConfig</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private ClusterConfig clusterConfig;
	
	public SolrConfig()
	{
		// default constructor
	}
	
	
	
	public void setMode(final SolrServerMode mode)
	{
		this.mode = mode;
	}
	
	
	
	public SolrServerMode getMode() 
	{
		return mode;
	}
	
	
	
	public void setClusterConfig(final ClusterConfig clusterConfig)
	{
		this.clusterConfig = clusterConfig;
	}
	
	
	
	public ClusterConfig getClusterConfig() 
	{
		return clusterConfig;
	}
	


}