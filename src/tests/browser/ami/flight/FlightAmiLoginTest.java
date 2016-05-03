package tests.browser.ami.flight;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.BrowserFactory;

import browser.components.flight.FlightFinderAMI;
import browser.components.flight.LoginAMI;
import tools.Constants;
import unittesting.UnitTestClassBase;

public class FlightAmiLoginTest extends UnitTestClassBase {

	private LoginAMI loginAMI;
	private FlightFinderAMI flightFinderAMI;
	
	//testData
	private String userName;
	private String userPass;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		instance = new FlightAmiLoginTest();
		globalSetup(FlightAmiLoginTest.class);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		globalTearDown();
	}

	@Before
	public void setUp() throws Exception {
		// test config
		browser = BrowserFactory.launch(Constants.BROWSER_TYPE);
		loginAMI = new LoginAMI(browser);
		flightFinderAMI = new FlightFinderAMI(browser);

		// test data
		userName = "tutorial";
		userPass = "tutorial";
	}

	@Test
	public void test() throws GeneralLeanFtException {
		browser.navigate(Constants.FLIGHT_BASE_URL);
		loginAMI.UserNameEditField().setValue(userName);
		loginAMI.PasswordEditField().setValue(userPass);
		loginAMI.SignInImage().click();
		
		flightFinderAMI.TripType().select("oneway");
		flightFinderAMI.TripType().select("roundtrip");
		flightFinderAMI.TripType().select("oneway");

		//		flightFinderAMI.TripTypeOneWay().click();
//		FlightFinderAMI.
	}

}
