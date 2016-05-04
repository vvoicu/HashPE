package tests.browser.po.flight;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.hp.lft.report.ReportException;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.BrowserFactory;

import browser.pages.flight.FlightHomePage;
import browser.pages.flight.finder.BookFlightPage;
import browser.pages.flight.finder.FlightConfirmationPage;
import browser.pages.flight.finder.FlightFinderPage;
import browser.pages.flight.finder.SelectFlightPage;
import tools.Constants;
import tools.Constants.SERVICE_CLASS_TYPE;
import tools.Constants.TRIP_TYPE;
import tools.models.flight.CustomerModel;
import tools.utils.StringUtils;
import unittesting.UnitTestClassBase;

public class BookAFlightTest extends UnitTestClassBase {

	// page mapping
	public FlightFinderPage flightFinderPage;
	public FlightHomePage flightHomePage;
	public SelectFlightPage selectFlightPage;
	public BookFlightPage bookFlightPage;
	public FlightConfirmationPage flightConfirmationPage;

	// test Data
	private TRIP_TYPE flightType;
	private String passengersNumber;
	private String departingFrom;
	private String departingMonth;
	private String departingDay;
	private String arrivingIn;
	private String arrivingMonth;
	private String arrivingDay;
	private SERVICE_CLASS_TYPE serviceClass;
	private String airline;
//	private String passenger1FirstName;
//	private String passenger2FirstName;
//	private String passenger1LastName;
//	private String passenger2LastName;
//	private String passenger1Meal;
//	private String passenger2Meal;
	private String cardNumber;
	private List<CustomerModel> customersList = new ArrayList<CustomerModel>();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		instance = new FlightFinderTest();
		globalSetup(FlightFinderTest.class);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		globalTearDown();
	}

	@Before
	public void setUp() throws Exception {

		// Test Data setup
		flightType = Constants.TRIP_TYPE.ONE_WAY;
		passengersNumber = "2";
		departingFrom = "New York";
		departingMonth = "May";
		departingDay = "18";
		arrivingIn = "Seattle";
		arrivingMonth = "July";
		arrivingDay = "30";
		serviceClass = SERVICE_CLASS_TYPE.BUSINESS;
		airline = "Unified Airlines";

		cardNumber = "1234123412341234";
		
		CustomerModel customerOne = new CustomerModel();
		customerOne.setFirstName("Ion");
		customerOne.setLastName("Pop");
		customerOne.setMeal("Kosher");
		
		CustomerModel customerTwo = new CustomerModel(true);
//		customerTwo.setFirstName("Vasile");
//		customerTwo.setLastName("Matei");
		customerTwo.setMeal("Diabetic");
		
		System.out.println("FN: " + customerTwo.getFirstName());
		System.out.println("LN: " + customerTwo.getLastName());
		System.out.println("Meal: " + customerTwo.getMeal());
		
		customersList.add(customerOne);
		customersList.add(customerTwo);
		

		// test config
		browser = BrowserFactory.launch(Constants.BROWSER_TYPE);
		flightFinderPage = new FlightFinderPage(browser);
		flightHomePage = new FlightHomePage(browser);
		selectFlightPage = new SelectFlightPage(browser);
		bookFlightPage = new BookFlightPage(browser);
		flightConfirmationPage = new FlightConfirmationPage(browser);

	}

	@Test
	public void bookAFlightTest() throws GeneralLeanFtException, ReportException {

		flightFinderPage.navigateTo(Constants.FLIGHT_BASE_URL);
		flightHomePage.inputUserName(Constants.FlyUsername);
		flightHomePage.inputPassword(Constants.FlyPassword);
		flightHomePage.clickSignInButton();
		flightFinderPage.selectFlightType(flightType);
		flightFinderPage.selectPassengersNumber(passengersNumber);
		flightFinderPage.selectDepartingFrom(departingFrom);
		flightFinderPage.selectDepartingMonth(departingMonth);
		flightFinderPage.selectDepartingDay(departingDay);
		flightFinderPage.selectArrivingIn(arrivingIn);
		flightFinderPage.selectArrivingMonth(arrivingMonth);
		flightFinderPage.selectArrivingDay(arrivingDay);
		flightFinderPage.selectServiceClass(serviceClass);
		flightFinderPage.selectAirline(airline);
		flightFinderPage.clickContinueInButton();
		selectFlightPage.clickContinueButton();
		bookFlightPage.fillCustomerList(customersList);
		bookFlightPage.typeCardNumber(cardNumber);
		bookFlightPage.clickSecurePurchase();

		bookFlightPage.verifyCondition("Passengers Number", StringUtils
				.splitPassengersNumber(flightConfirmationPage.grabPassengersNumber()).equals(passengersNumber));
	}
}
