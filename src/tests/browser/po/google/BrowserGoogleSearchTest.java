package tests.browser.po.google;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.BrowserFactory;

import browser.pages.google.GoogleHomePage;
import browser.pages.google.GoogleSearchPage;
import tools.Constants;
import unittesting.UnitTestClassBase;

public class BrowserGoogleSearchTest extends UnitTestClassBase {

	// Test Data
	private String searchTerm;

	// //Page Objects
	public GoogleHomePage googleHomePage;
	public GoogleSearchPage googleSearchPage;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		instance = new BrowserGoogleSearchTest();
		globalSetup(BrowserGoogleSearchTest.class);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		globalTearDown();
	}

	// Test setup related actions
	@Before
	public void setUp() throws Exception {
		//test data
		searchTerm = "evozon";

		//test config
		browser = BrowserFactory.launch(Constants.BROWSER_TYPE);
		googleHomePage = new GoogleHomePage(browser);
		googleSearchPage = new GoogleSearchPage(browser);
	}

	// Test scenario related actions
	@Test
	public void googleSearchTest() throws GeneralLeanFtException, CloneNotSupportedException {
		googleHomePage.navigateTo(Constants.GOOGLE_BASE_URL);
		googleHomePage.inputSearchTerm(searchTerm);
		googleHomePage.clickOnSearchButton();
		googleSearchPage.grabResultList();
		// Assert.assertTrue("Something is good",false);

	}

}
