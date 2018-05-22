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
package de.hybris.platform.commercefacades.order.data;

import de.hybris.platform.acceleratorservices.enums.ImportStatus;
import de.hybris.platform.b2bacceleratorfacades.order.data.B2BCommentData;
import de.hybris.platform.b2bacceleratorfacades.order.data.B2BPaymentTypeData;
import de.hybris.platform.b2bcommercefacades.company.data.B2BCostCenterData;
import de.hybris.platform.commercefacades.order.data.AbstractOrderData;
import de.hybris.platform.commercefacades.product.data.PromotionResultData;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.commercefacades.user.data.PrincipalData;
import java.util.Date;
import java.util.List;

public  class CartData extends AbstractOrderData 
{


	/** <i>Generated property</i> for <code>CartData.totalUnitCount</code> property defined at extension <code>commercefacades</code>. */
		
	private Integer totalUnitCount;

	/** <i>Generated property</i> for <code>CartData.potentialOrderPromotions</code> property defined at extension <code>commercefacades</code>. */
		
	private List<PromotionResultData> potentialOrderPromotions;

	/** <i>Generated property</i> for <code>CartData.potentialProductPromotions</code> property defined at extension <code>commercefacades</code>. */
		
	private List<PromotionResultData> potentialProductPromotions;

	/** <i>Generated property</i> for <code>CartData.name</code> property defined at extension <code>commercefacades</code>. */
		
	private String name;

	/** <i>Generated property</i> for <code>CartData.description</code> property defined at extension <code>commercefacades</code>. */
		
	private String description;

	/** <i>Generated property</i> for <code>CartData.expirationTime</code> property defined at extension <code>commercefacades</code>. */
		
	private Date expirationTime;

	/** <i>Generated property</i> for <code>CartData.saveTime</code> property defined at extension <code>commercefacades</code>. */
		
	private Date saveTime;

	/** <i>Generated property</i> for <code>CartData.savedBy</code> property defined at extension <code>commercefacades</code>. */
		
	private PrincipalData savedBy;

	/** <i>Generated property</i> for <code>CartData.importStatus</code> property defined at extension <code>acceleratorfacades</code>. */
		
	private ImportStatus importStatus;

	/** <i>Generated property</i> for <code>CartData.costCenter</code> property defined at extension <code>b2bacceleratorfacades</code>. */
		
	private B2BCostCenterData costCenter;

	/** <i>Generated property</i> for <code>CartData.paymentType</code> property defined at extension <code>b2bacceleratorfacades</code>. */
		
	private B2BPaymentTypeData paymentType;

	/** <i>Generated property</i> for <code>CartData.purchaseOrderNumber</code> property defined at extension <code>b2bacceleratorfacades</code>. */
		
	private String purchaseOrderNumber;

	/** <i>Generated property</i> for <code>CartData.b2BComment</code> property defined at extension <code>b2bacceleratorfacades</code>. */
		
	private B2BCommentData b2BComment;

	/** <i>Generated property</i> for <code>CartData.b2bCustomerData</code> property defined at extension <code>b2bacceleratorfacades</code>. */
		
	private CustomerData b2bCustomerData;

	/** <i>Generated property</i> for <code>CartData.quoteAllowed</code> property defined at extension <code>b2bacceleratorfacades</code>. */
		
	private Boolean quoteAllowed;
	
	public CartData()
	{
		// default constructor
	}
	
	@Override 
	
	public void setTotalUnitCount(final Integer totalUnitCount)
	{
		this.totalUnitCount = totalUnitCount;
	}
	
	@Override 
	
	public Integer getTotalUnitCount() 
	{
		return totalUnitCount;
	}
	
	
	
	public void setPotentialOrderPromotions(final List<PromotionResultData> potentialOrderPromotions)
	{
		this.potentialOrderPromotions = potentialOrderPromotions;
	}
	
	
	
	public List<PromotionResultData> getPotentialOrderPromotions() 
	{
		return potentialOrderPromotions;
	}
	
	
	
	public void setPotentialProductPromotions(final List<PromotionResultData> potentialProductPromotions)
	{
		this.potentialProductPromotions = potentialProductPromotions;
	}
	
	
	
	public List<PromotionResultData> getPotentialProductPromotions() 
	{
		return potentialProductPromotions;
	}
	
	
	
	public void setName(final String name)
	{
		this.name = name;
	}
	
	
	
	public String getName() 
	{
		return name;
	}
	
	
	
	public void setDescription(final String description)
	{
		this.description = description;
	}
	
	
	
	public String getDescription() 
	{
		return description;
	}
	
	
	
	public void setExpirationTime(final Date expirationTime)
	{
		this.expirationTime = expirationTime;
	}
	
	
	
	public Date getExpirationTime() 
	{
		return expirationTime;
	}
	
	
	
	public void setSaveTime(final Date saveTime)
	{
		this.saveTime = saveTime;
	}
	
	
	
	public Date getSaveTime() 
	{
		return saveTime;
	}
	
	
	
	public void setSavedBy(final PrincipalData savedBy)
	{
		this.savedBy = savedBy;
	}
	
	
	
	public PrincipalData getSavedBy() 
	{
		return savedBy;
	}
	
	
	
	public void setImportStatus(final ImportStatus importStatus)
	{
		this.importStatus = importStatus;
	}
	
	
	
	public ImportStatus getImportStatus() 
	{
		return importStatus;
	}
	
	
	
	public void setCostCenter(final B2BCostCenterData costCenter)
	{
		this.costCenter = costCenter;
	}
	
	
	
	public B2BCostCenterData getCostCenter() 
	{
		return costCenter;
	}
	
	
	
	public void setPaymentType(final B2BPaymentTypeData paymentType)
	{
		this.paymentType = paymentType;
	}
	
	
	
	public B2BPaymentTypeData getPaymentType() 
	{
		return paymentType;
	}
	
	
	
	public void setPurchaseOrderNumber(final String purchaseOrderNumber)
	{
		this.purchaseOrderNumber = purchaseOrderNumber;
	}
	
	
	
	public String getPurchaseOrderNumber() 
	{
		return purchaseOrderNumber;
	}
	
	
	
	public void setB2BComment(final B2BCommentData b2BComment)
	{
		this.b2BComment = b2BComment;
	}
	
	
	
	public B2BCommentData getB2BComment() 
	{
		return b2BComment;
	}
	
	
	
	public void setB2bCustomerData(final CustomerData b2bCustomerData)
	{
		this.b2bCustomerData = b2bCustomerData;
	}
	
	
	
	public CustomerData getB2bCustomerData() 
	{
		return b2bCustomerData;
	}
	
	
	
	public void setQuoteAllowed(final Boolean quoteAllowed)
	{
		this.quoteAllowed = quoteAllowed;
	}
	
	
	
	public Boolean getQuoteAllowed() 
	{
		return quoteAllowed;
	}
	


}