/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE or an SAP affiliate company.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package com.hybris.cartridge.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.hybris.cartridge.fulfilmentprocess.constants.CartridgeFulfilmentProcessConstants;

@SuppressWarnings("PMD")
public class CartridgeFulfilmentProcessManager extends GeneratedCartridgeFulfilmentProcessManager
{
	public static final CartridgeFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (CartridgeFulfilmentProcessManager) em.getExtension(CartridgeFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
