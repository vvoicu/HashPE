package browser.pages.google;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.WebElement;
import com.hp.lft.sdk.web.WebElementDescription;

import browser.pages.BrowserAbstractPage;

public class GoogleSearchPage extends BrowserAbstractPage {

	public GoogleSearchPage(Browser browser) {
		super(browser);
	}

//	private String resultListContainerSelector = "div.srg";
	private String resultListContainerSelector = ".srg > div";
//	private String resultListContainerSelector = "div#res";
	

	public void grabResultList(String searchTerm) throws GeneralLeanFtException, CloneNotSupportedException  {
        browser.highlightMatches(WebElement.class, new WebElementDescription.Builder().cssSelector(resultListContainerSelector).build());
        WebElement[] elementList = browser.findChildren(WebElement.class, new WebElementDescription.Builder().cssSelector(resultListContainerSelector).build());
        
        System.out.println("Link counter: " + elementList.length);
		theFor:
		for (WebElement itemNow : elementList) {
			if(itemNow.getInnerText().contains(searchTerm)){
				itemNow.click();
				break theFor;
			}
			System.out.println("itemNow: " + itemNow.getInnerText());
		}
	}

}
