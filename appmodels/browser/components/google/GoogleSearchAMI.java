
/** ----------------------------------------------------------------------------------------------------
* 
*	This code was automatically generated by the LeanFT Application Model code generator.
*
*	Changes to this file may cause incorrect behavior and will be lost 
*	when the code is regenerated.
*
*   ----------------------------------------------------------------------------------------------------
*/
package browser.components.google;

import javax.annotation.Generated;

import com.hp.lft.sdk.*;
import com.hp.lft.sdk.internal.*;
import com.hp.lft.sdk.web.*;

@Generated(value = { "This class is automatically generated by the LeanFT Application Model code generator - version \"12.52\"" })
public class GoogleSearchAMI extends AppModelBase {		private GooglePage GooglePage;
	private GoogleSearchButton GoogleSearchButton;
	
	public GoogleSearchAMI(TestObject contextTestObject) throws GeneralLeanFtException
	{
		setName("GoogleSearchAMI");
				GooglePage = new GooglePage(contextTestObject, this);
		GoogleSearchButton = new GoogleSearchButton(contextTestObject, this);
		rebuildDescriptions();
	}	

			public GooglePage GooglePage() { return GooglePage; }
		public GoogleSearchButton GoogleSearchButton() { return GoogleSearchButton; }

		public class GooglePage extends PageNodeBase
	{

		
			private SearchEditField SearchEditField;
						public GooglePage(TestObject parent, AppModelBase applicationModel) throws GeneralLeanFtException
		{
			super(parent, applicationModel);

					SearchEditField = new SearchEditField(this, applicationModel);

			setDisplayName("Google");
		}

		@Override
		protected com.hp.lft.sdk.web.PageDescription createDescription() throws GeneralLeanFtException{
			com.hp.lft.sdk.web.PageDescription description = null; 
			try{
				description = new com.hp.lft.sdk.web.PageDescription();
			}catch(Exception e){
				throw new GeneralLeanFtException(e.getMessage(), e);
			}
			return description;
		}

				public SearchEditField SearchEditField() { return SearchEditField; }
		
			public class SearchEditField extends EditFieldNodeBase
	{

		
								public SearchEditField(TestObject parent, AppModelBase applicationModel) throws GeneralLeanFtException
		{
			super(parent, applicationModel);

			
			setDisplayName("Search");
		}

		@Override
		protected com.hp.lft.sdk.web.EditFieldDescription createDescription() throws GeneralLeanFtException{
			com.hp.lft.sdk.web.EditFieldDescription description = null; 
			try{
				description = new com.hp.lft.sdk.web.EditFieldDescription.Builder().type("text").tagName("INPUT").name("q").build();
			}catch(Exception e){
				throw new GeneralLeanFtException(e.getMessage(), e);
			}
			return description;
		}

				
			}

	}

	public class GoogleSearchButton extends ButtonNodeBase
	{

		
								public GoogleSearchButton(TestObject parent, AppModelBase applicationModel) throws GeneralLeanFtException
		{
			super(parent, applicationModel);

			
			setDisplayName("Google Search");
		}

		@Override
		protected com.hp.lft.sdk.web.ButtonDescription createDescription() throws GeneralLeanFtException{
			com.hp.lft.sdk.web.ButtonDescription description = null; 
			try{
				description = new com.hp.lft.sdk.web.ButtonDescription.Builder().cssSelector("button.lsb").build();
			}catch(Exception e){
				throw new GeneralLeanFtException(e.getMessage(), e);
			}
			return description;
		}

				
			}


			
	public abstract class PageNodeBase extends AppModelNodeBase<com.hp.lft.sdk.web.Page, com.hp.lft.sdk.web.PageDescription> implements com.hp.lft.sdk.web.Page
	{		
		public PageNodeBase(TestObject parent, AppModelBase applicationModel) throws GeneralLeanFtException
		{
			super(parent, applicationModel);
		}

		


		@Override 
		public java.awt.Point getAbsoluteLocation() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getAbsoluteLocation();
		}

		@Override 
		public void highlight() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().highlight();
		}

		@Override 
		public java.lang.String getURL() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getURL();
		}

		@Override 
		public com.hp.lft.sdk.NativeObject getNativeObject() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getNativeObject();
		}

		@Override 
		public <TChild extends TestObject> TChild[] findChildren(java.lang.Class<TChild> arg0, com.hp.lft.sdk.Description arg1) throws com.hp.lft.sdk.GeneralLeanFtException, java.lang.CloneNotSupportedException 
		{
			return getConcrete().findChildren(arg0, arg1);
		}

		@Override 
		public java.awt.Point verifyImageExists(java.awt.image.RenderedImage arg0, byte arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageExists(arg0, arg1);
		}

		@Override 
		public java.awt.Point verifyImageExists(java.awt.image.RenderedImage arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageExists(arg0);
		}

		@Override 
		public java.lang.String getVisibleText() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getVisibleText();
		}

		@Override 
		public java.lang.String getVisibleText(java.awt.Rectangle arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getVisibleText(arg0);
		}

		@Override 
		public <TChild extends WebElement> TChild describe(java.lang.Class<TChild> arg0, com.hp.lft.sdk.web.XPathDescription arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().describe(arg0, arg1);
		}

		@Override 
		public <TChild extends WebElement> TChild describe(java.lang.Class<TChild> arg0, com.hp.lft.sdk.web.CSSDescription arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().describe(arg0, arg1);
		}

		@Override 
		public java.lang.String getText() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getText();
		}

		@Override 
		public void sync() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().sync();
		}

		@Override 
		public java.awt.Rectangle[] getTextLocations(java.lang.String arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getTextLocations(arg0);
		}

		@Override 
		public java.awt.Rectangle[] getTextLocations(java.lang.String arg0, java.awt.Rectangle arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getTextLocations(arg0, arg1);
		}

		@Override 
		public java.lang.String getTitle() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getTitle();
		}

		@Override 
		public java.awt.image.RenderedImage getSnapshot() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getSnapshot();
		}

		@Override 
		public java.awt.Dimension getSize() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getSize();
		}

		@Override 
		public boolean verifyImageMatch(java.awt.image.RenderedImage arg0, byte arg1, byte arg2) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageMatch(arg0, arg1, arg2);
		}

		@Override 
		public boolean verifyImageMatch(java.awt.image.RenderedImage arg0, com.hp.lft.sdk.ImageMaskArea arg1, byte arg2, byte arg3) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageMatch(arg0, arg1, arg2, arg3);
		}

		@Override 
		public boolean verifyImageMatch(java.awt.image.RenderedImage arg0, com.hp.lft.sdk.ImageMaskArea arg1, byte arg2) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageMatch(arg0, arg1, arg2);
		}

		@Override 
		public boolean verifyImageMatch(java.awt.image.RenderedImage arg0, com.hp.lft.sdk.ImageMaskArea arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageMatch(arg0, arg1);
		}

		@Override 
		public boolean verifyImageMatch(java.awt.image.RenderedImage arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageMatch(arg0);
		}

		@Override 
		public boolean verifyImageMatch(java.awt.image.RenderedImage arg0, byte arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageMatch(arg0, arg1);
		}

		@Override 
		public java.lang.String runJavaScript(java.lang.String arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().runJavaScript(arg0);
		}

		@Override 
		public <TResult> TResult runJavaScript(java.lang.String arg0, java.lang.Class<TResult> arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().runJavaScript(arg0, arg1);
		}

		@Override 
		public <TChild extends TestObject> TChild describe(java.lang.Class<TChild> arg0, com.hp.lft.sdk.Description arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().describe(arg0, arg1);
		}

		@Override 
		public <TChild extends TestObject> int highlightMatches(java.lang.Class<TChild> arg0, com.hp.lft.sdk.Description arg1) throws com.hp.lft.sdk.GeneralLeanFtException, java.lang.CloneNotSupportedException 
		{
			return getConcrete().highlightMatches(arg0, arg1);
		}

		@Override 
		public boolean exists() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().exists();
		}

		@Override 
		public boolean exists(java.lang.Integer arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().exists(arg0);
		}

		@Override 
		public void setDisplayName(java.lang.String arg0)  
		{
			getConcrete().setDisplayName(arg0);
		}

		@Override 
		public java.lang.String getDisplayName()  
		{
			return getConcrete().getDisplayName();
		}
	}
	
	public abstract class EditFieldNodeBase extends AppModelNodeBase<com.hp.lft.sdk.web.EditField, com.hp.lft.sdk.web.EditFieldDescription> implements com.hp.lft.sdk.web.EditField
	{		
		public EditFieldNodeBase(TestObject parent, AppModelBase applicationModel) throws GeneralLeanFtException
		{
			super(parent, applicationModel);
		}

		


		@Override 
		public void highlight() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().highlight();
		}

		@Override 
		public int getMaxLength() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getMaxLength();
		}

		@Override 
		public com.hp.lft.sdk.NativeObject getNativeObject() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getNativeObject();
		}

		@Override 
		public void dragAndDropOn(com.hp.lft.sdk.SupportDragAndDrop arg0, com.hp.lft.sdk.DragAndDropArgs arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().dragAndDropOn(arg0, arg1);
		}

		@Override 
		public void dragAndDropOn(com.hp.lft.sdk.SupportDragAndDrop arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().dragAndDropOn(arg0);
		}

		@Override 
		public void click(com.hp.lft.sdk.ClickArgs arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().click(arg0);
		}

		@Override 
		public void click(com.hp.lft.sdk.MouseButton arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().click(arg0);
		}

		@Override 
		public void click() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().click();
		}

		@Override 
		public void setValue(java.lang.String arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().setValue(arg0);
		}

		@Override 
		public java.util.Map<java.lang.String, java.lang.String> getAttributes() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getAttributes();
		}

		@Override 
		public java.lang.String getType() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getType();
		}

		@Override 
		public java.lang.String getVisibleText() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getVisibleText();
		}

		@Override 
		public java.lang.String getVisibleText(java.awt.Rectangle arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getVisibleText(arg0);
		}

		@Override 
		public java.lang.String getDefaultValue() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getDefaultValue();
		}

		@Override 
		public java.lang.String getXPath() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getXPath();
		}

		@Override 
		public boolean isReadOnly() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().isReadOnly();
		}

		@Override 
		public java.lang.String getAttribute(java.lang.String arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getAttribute(arg0);
		}

		@Override 
		public java.awt.Rectangle[] getTextLocations(java.lang.String arg0, java.awt.Rectangle arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getTextLocations(arg0, arg1);
		}

		@Override 
		public java.awt.Rectangle[] getTextLocations(java.lang.String arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getTextLocations(arg0);
		}

		@Override 
		public void longPress(com.hp.lft.sdk.web.WebLongPressArgs arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().longPress(arg0);
		}

		@Override 
		public void longPress() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().longPress();
		}

		@Override 
		public void fireEvent(com.hp.lft.sdk.web.EventInfo arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().fireEvent(arg0);
		}

		@Override 
		public java.awt.Point getLocation() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getLocation();
		}

		@Override 
		public java.lang.String getTitle() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getTitle();
		}

		@Override 
		public java.lang.String getTagName() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getTagName();
		}

		@Override 
		public java.lang.String getId() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getId();
		}

		@Override 
		public <TChild extends TestObject> TChild describe(java.lang.Class<TChild> arg0, com.hp.lft.sdk.Description arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().describe(arg0, arg1);
		}

		@Override 
		public <TChild extends TestObject> int highlightMatches(java.lang.Class<TChild> arg0, com.hp.lft.sdk.Description arg1) throws com.hp.lft.sdk.GeneralLeanFtException, java.lang.CloneNotSupportedException 
		{
			return getConcrete().highlightMatches(arg0, arg1);
		}

		@Override 
		public java.util.Map<java.lang.String, java.lang.String> getComputedStyles() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getComputedStyles();
		}

		@Override 
		public void doubleClick(com.hp.lft.sdk.web.WebDoubleClickArgs arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().doubleClick(arg0);
		}

		@Override 
		public void doubleClick() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().doubleClick();
		}

		@Override 
		public java.lang.String getValue() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getValue();
		}

		@Override 
		public int getRowsCount() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getRowsCount();
		}

		@Override 
		public java.lang.String getCSSSelector() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getCSSSelector();
		}

		@Override 
		public java.lang.String getDisplayName()  
		{
			return getConcrete().getDisplayName();
		}

		@Override 
		public java.lang.String getInnerHTML() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getInnerHTML();
		}

		@Override 
		public java.lang.String getComputedStyle(java.lang.String arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getComputedStyle(arg0);
		}

		@Override 
		public java.lang.String getInnerText() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getInnerText();
		}

		@Override 
		public java.lang.String getRole() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getRole();
		}

		@Override 
		public boolean isRequired() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().isRequired();
		}

		@Override 
		public java.lang.String getOuterText() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getOuterText();
		}

		@Override 
		public java.awt.Point verifyImageExists(java.awt.image.RenderedImage arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageExists(arg0);
		}

		@Override 
		public java.awt.Point verifyImageExists(java.awt.image.RenderedImage arg0, byte arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageExists(arg0, arg1);
		}

		@Override 
		public <TChild extends TestObject> TChild[] findChildren(java.lang.Class<TChild> arg0, com.hp.lft.sdk.Description arg1) throws com.hp.lft.sdk.GeneralLeanFtException, java.lang.CloneNotSupportedException 
		{
			return getConcrete().findChildren(arg0, arg1);
		}

		@Override 
		public void hoverTap() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().hoverTap();
		}

		@Override 
		public void hoverTap(com.hp.lft.sdk.Location arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().hoverTap(arg0);
		}

		@Override 
		public void swipe(com.hp.lft.sdk.web.WebSwipeArgs arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().swipe(arg0);
		}

		@Override 
		public void swipe(com.hp.lft.sdk.SwipeDirection arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().swipe(arg0);
		}

		@Override 
		public int getMaxCharsInLine() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getMaxCharsInLine();
		}

		@Override 
		public java.lang.String getPattern() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getPattern();
		}

		@Override 
		public java.lang.String getName() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getName();
		}

		@Override 
		public java.awt.Dimension getSize() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getSize();
		}

		@Override 
		public <TChild extends WebElement> TChild describe(java.lang.Class<TChild> arg0, com.hp.lft.sdk.web.XPathDescription arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().describe(arg0, arg1);
		}

		@Override 
		public <TChild extends WebElement> TChild describe(java.lang.Class<TChild> arg0, com.hp.lft.sdk.web.CSSDescription arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().describe(arg0, arg1);
		}

		@Override 
		public java.lang.String getClassName() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getClassName();
		}

		@Override 
		public java.awt.image.RenderedImage getSnapshot() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getSnapshot();
		}

		@Override 
		public boolean verifyImageMatch(java.awt.image.RenderedImage arg0, byte arg1, byte arg2) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageMatch(arg0, arg1, arg2);
		}

		@Override 
		public boolean verifyImageMatch(java.awt.image.RenderedImage arg0, byte arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageMatch(arg0, arg1);
		}

		@Override 
		public boolean verifyImageMatch(java.awt.image.RenderedImage arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageMatch(arg0);
		}

		@Override 
		public boolean verifyImageMatch(java.awt.image.RenderedImage arg0, com.hp.lft.sdk.ImageMaskArea arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageMatch(arg0, arg1);
		}

		@Override 
		public boolean verifyImageMatch(java.awt.image.RenderedImage arg0, com.hp.lft.sdk.ImageMaskArea arg1, byte arg2) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageMatch(arg0, arg1, arg2);
		}

		@Override 
		public boolean verifyImageMatch(java.awt.image.RenderedImage arg0, com.hp.lft.sdk.ImageMaskArea arg1, byte arg2, byte arg3) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageMatch(arg0, arg1, arg2, arg3);
		}

		@Override 
		public java.awt.Point getAbsoluteLocation() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getAbsoluteLocation();
		}

		@Override 
		public void pan(long arg0, long arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().pan(arg0, arg1);
		}

		@Override 
		public void pan(com.hp.lft.sdk.web.WebPanArgs arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().pan(arg0);
		}

		@Override 
		public boolean exists() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().exists();
		}

		@Override 
		public boolean exists(java.lang.Integer arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().exists(arg0);
		}

		@Override 
		public void setDisplayName(java.lang.String arg0)  
		{
			getConcrete().setDisplayName(arg0);
		}

		@Override 
		public void setSecure(java.lang.String arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().setSecure(arg0);
		}

		@Override 
		public boolean isVisible() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().isVisible();
		}

		@Override 
		public java.lang.String getOuterHTML() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getOuterHTML();
		}

		@Override 
		public void pinch(com.hp.lft.sdk.web.WebPinchArgs arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().pinch(arg0);
		}

		@Override 
		public void pinch(double arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().pinch(arg0);
		}
	}
	
	public abstract class ButtonNodeBase extends AppModelNodeBase<com.hp.lft.sdk.web.Button, com.hp.lft.sdk.web.ButtonDescription> implements com.hp.lft.sdk.web.Button
	{		
		public ButtonNodeBase(TestObject parent, AppModelBase applicationModel) throws GeneralLeanFtException
		{
			super(parent, applicationModel);
		}

		


		@Override 
		public void highlight() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().highlight();
		}

		@Override 
		public com.hp.lft.sdk.NativeObject getNativeObject() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getNativeObject();
		}

		@Override 
		public void dragAndDropOn(com.hp.lft.sdk.SupportDragAndDrop arg0, com.hp.lft.sdk.DragAndDropArgs arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().dragAndDropOn(arg0, arg1);
		}

		@Override 
		public void dragAndDropOn(com.hp.lft.sdk.SupportDragAndDrop arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().dragAndDropOn(arg0);
		}

		@Override 
		public void click(com.hp.lft.sdk.ClickArgs arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().click(arg0);
		}

		@Override 
		public void click(com.hp.lft.sdk.MouseButton arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().click(arg0);
		}

		@Override 
		public void click() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().click();
		}

		@Override 
		public java.util.Map<java.lang.String, java.lang.String> getAttributes() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getAttributes();
		}

		@Override 
		public java.lang.String getVisibleText(java.awt.Rectangle arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getVisibleText(arg0);
		}

		@Override 
		public java.lang.String getVisibleText() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getVisibleText();
		}

		@Override 
		public java.lang.String getXPath() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getXPath();
		}

		@Override 
		public boolean isEnabled() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().isEnabled();
		}

		@Override 
		public java.lang.String getAttribute(java.lang.String arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getAttribute(arg0);
		}

		@Override 
		public java.awt.Rectangle[] getTextLocations(java.lang.String arg0, java.awt.Rectangle arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getTextLocations(arg0, arg1);
		}

		@Override 
		public java.awt.Rectangle[] getTextLocations(java.lang.String arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getTextLocations(arg0);
		}

		@Override 
		public void longPress(com.hp.lft.sdk.web.WebLongPressArgs arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().longPress(arg0);
		}

		@Override 
		public void longPress() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().longPress();
		}

		@Override 
		public void fireEvent(com.hp.lft.sdk.web.EventInfo arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().fireEvent(arg0);
		}

		@Override 
		public java.awt.Point getLocation() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getLocation();
		}

		@Override 
		public java.lang.String getTitle() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getTitle();
		}

		@Override 
		public <TChild extends TestObject> TChild describe(java.lang.Class<TChild> arg0, com.hp.lft.sdk.Description arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().describe(arg0, arg1);
		}

		@Override 
		public java.lang.String getId() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getId();
		}

		@Override 
		public java.lang.String getTagName() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getTagName();
		}

		@Override 
		public <TChild extends TestObject> int highlightMatches(java.lang.Class<TChild> arg0, com.hp.lft.sdk.Description arg1) throws com.hp.lft.sdk.GeneralLeanFtException, java.lang.CloneNotSupportedException 
		{
			return getConcrete().highlightMatches(arg0, arg1);
		}

		@Override 
		public java.util.Map<java.lang.String, java.lang.String> getComputedStyles() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getComputedStyles();
		}

		@Override 
		public void doubleClick(com.hp.lft.sdk.web.WebDoubleClickArgs arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().doubleClick(arg0);
		}

		@Override 
		public void doubleClick() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().doubleClick();
		}

		@Override 
		public java.lang.String getCSSSelector() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getCSSSelector();
		}

		@Override 
		public java.lang.String getDisplayName()  
		{
			return getConcrete().getDisplayName();
		}

		@Override 
		public java.lang.String getInnerHTML() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getInnerHTML();
		}

		@Override 
		public java.lang.String getComputedStyle(java.lang.String arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getComputedStyle(arg0);
		}

		@Override 
		public java.lang.String getInnerText() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getInnerText();
		}

		@Override 
		public java.lang.String getRole() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getRole();
		}

		@Override 
		public java.lang.String getButtonType() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getButtonType();
		}

		@Override 
		public java.lang.String getOuterText() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getOuterText();
		}

		@Override 
		public java.awt.Point verifyImageExists(java.awt.image.RenderedImage arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageExists(arg0);
		}

		@Override 
		public java.awt.Point verifyImageExists(java.awt.image.RenderedImage arg0, byte arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageExists(arg0, arg1);
		}

		@Override 
		public <TChild extends TestObject> TChild[] findChildren(java.lang.Class<TChild> arg0, com.hp.lft.sdk.Description arg1) throws com.hp.lft.sdk.GeneralLeanFtException, java.lang.CloneNotSupportedException 
		{
			return getConcrete().findChildren(arg0, arg1);
		}

		@Override 
		public void hoverTap() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().hoverTap();
		}

		@Override 
		public void hoverTap(com.hp.lft.sdk.Location arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().hoverTap(arg0);
		}

		@Override 
		public void swipe(com.hp.lft.sdk.SwipeDirection arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().swipe(arg0);
		}

		@Override 
		public void swipe(com.hp.lft.sdk.web.WebSwipeArgs arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().swipe(arg0);
		}

		@Override 
		public java.lang.String getText() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getText();
		}

		@Override 
		public java.lang.String getName() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getName();
		}

		@Override 
		public java.awt.Dimension getSize() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getSize();
		}

		@Override 
		public <TChild extends WebElement> TChild describe(java.lang.Class<TChild> arg0, com.hp.lft.sdk.web.CSSDescription arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().describe(arg0, arg1);
		}

		@Override 
		public <TChild extends WebElement> TChild describe(java.lang.Class<TChild> arg0, com.hp.lft.sdk.web.XPathDescription arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().describe(arg0, arg1);
		}

		@Override 
		public java.lang.String getClassName() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getClassName();
		}

		@Override 
		public java.awt.image.RenderedImage getSnapshot() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getSnapshot();
		}

		@Override 
		public boolean verifyImageMatch(java.awt.image.RenderedImage arg0, byte arg1, byte arg2) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageMatch(arg0, arg1, arg2);
		}

		@Override 
		public boolean verifyImageMatch(java.awt.image.RenderedImage arg0, byte arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageMatch(arg0, arg1);
		}

		@Override 
		public boolean verifyImageMatch(java.awt.image.RenderedImage arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageMatch(arg0);
		}

		@Override 
		public boolean verifyImageMatch(java.awt.image.RenderedImage arg0, com.hp.lft.sdk.ImageMaskArea arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageMatch(arg0, arg1);
		}

		@Override 
		public boolean verifyImageMatch(java.awt.image.RenderedImage arg0, com.hp.lft.sdk.ImageMaskArea arg1, byte arg2) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageMatch(arg0, arg1, arg2);
		}

		@Override 
		public boolean verifyImageMatch(java.awt.image.RenderedImage arg0, com.hp.lft.sdk.ImageMaskArea arg1, byte arg2, byte arg3) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageMatch(arg0, arg1, arg2, arg3);
		}

		@Override 
		public java.awt.Point getAbsoluteLocation() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getAbsoluteLocation();
		}

		@Override 
		public void pan(long arg0, long arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().pan(arg0, arg1);
		}

		@Override 
		public void pan(com.hp.lft.sdk.web.WebPanArgs arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().pan(arg0);
		}

		@Override 
		public boolean exists() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().exists();
		}

		@Override 
		public boolean exists(java.lang.Integer arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().exists(arg0);
		}

		@Override 
		public void setDisplayName(java.lang.String arg0)  
		{
			getConcrete().setDisplayName(arg0);
		}

		@Override 
		public boolean isVisible() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().isVisible();
		}

		@Override 
		public java.lang.String getOuterHTML() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getOuterHTML();
		}

		@Override 
		public void pinch(com.hp.lft.sdk.web.WebPinchArgs arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().pinch(arg0);
		}

		@Override 
		public void pinch(double arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().pinch(arg0);
		}
	}
}
