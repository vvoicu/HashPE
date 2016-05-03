package tests.browser.ami.google;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.BrowserFactory;

import browser.components.google.GoogleResultsListAMI;
import browser.components.google.GoogleSearchAMI;
import tools.Constants;
import unittesting.UnitTestClassBase;

public class GoogleSearchAMITest extends UnitTestClassBase {

	private GoogleSearchAMI googleSearchAMI;
	private String searchTerm;
	private GoogleResultsListAMI googleResultsListAMI;
	private String searchTermName;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		instance = new GoogleSearchAMITest();
		globalSetup(GoogleSearchAMITest.class);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		globalTearDown();
	}

	@Before
	public void setUp() throws Exception {
		// test config
		browser = BrowserFactory.launch(Constants.BROWSER_TYPE);
		googleSearchAMI = new GoogleSearchAMI(browser);
		googleResultsListAMI = new GoogleResultsListAMI(browser);
		searchTerm = "oban";
		searchTermName = "Oban & Lorn Tourism Alliance :: Home";
	}

	@Test
	public void test() throws GeneralLeanFtException {

		browser.navigate(Constants.GOOGLE_BASE_URL);
		googleSearchAMI.GooglePage().SearchEditField().setValue(searchTerm);
		googleSearchAMI.GoogleSearchButton().click();

		// googleResultsListAMI.ResultListContainer().
//		int listCount = new ListBoxDescription.Builder().cssSelector("div#res *").build().getItemsCount();

//		System.out.println("List Count: " + listCount);
		// browser.describe(ListBox.class, );

	}

}
