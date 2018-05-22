package de.hybris.platform.servicelayer.user.interceptors;

import static com.google.common.collect.ImmutableMap.of;
import static java.lang.String.format;

import de.hybris.platform.core.model.user.BruteForceLoginAttemptsModel;
import de.hybris.platform.core.model.user.UserGroupModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.ServicelayerTransactionalBaseTest;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.user.UserService;

import javax.annotation.Resource;

import org.junit.Before;

import com.google.common.collect.ImmutableSet;

public class BruteForceLoginTest extends ServicelayerTransactionalBaseTest
{
	protected static final String testUid = "test";
	@Resource(name = "userService")
	protected UserService userService;
	@Resource(name = "modelService")
	protected ModelService modelService;
	@Resource(name = "flexibleSearchService")
	protected FlexibleSearchService searchService;

	@Before
	public void setUp() throws Exception
	{
		UserModel user = modelService.create(UserModel.class);
		UserGroupModel group = modelService.create(UserGroupModel.class);
		group.setUid("testGroup");
		user.setUid(testUid);
		group.setMaxBruteForceLoginAttempts(2);
		user.setGroups(ImmutableSet.of(group));
		modelService.saveAll(user, group);
	}

	protected BruteForceLoginAttemptsModel findAttempts()
	{
		return searchService.searchUnique(new FlexibleSearchQuery(
				format("select {pk} from {%s} where {%s}= ?uid", BruteForceLoginAttemptsModel._TYPECODE,
						BruteForceLoginAttemptsModel.UID), of("uid", testUid)));
	}
}
