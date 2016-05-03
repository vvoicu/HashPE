
/** ----------------------------------------------------------------------------------------------------
* 
*	This code was automatically generated by the LeanFT Application Model code generator.
*
*	Changes to this file may cause incorrect behavior and will be lost 
*	when the code is regenerated.
*
*   ----------------------------------------------------------------------------------------------------
*/
package browser.components.flight;

import javax.annotation.Generated;

import com.hp.lft.sdk.*;
import com.hp.lft.sdk.internal.*;
import com.hp.lft.sdk.web.*;

@Generated(value = { "This class is automatically generated by the LeanFT Application Model code generator - version \"12.52\"" })
public class FlightFinderAMI extends AppModelBase {		private TripTypeOneWay TripTypeOneWay;
	private TripTypeRoundTrip TripTypeRoundTrip;
	private PassCountListBox PassCountListBox;
	private FromPortListBox FromPortListBox;
	private FromMonthListBox FromMonthListBox;
	private FromDayListBox FromDayListBox;
	private ToPortListBox ToPortListBox;
	private ToMonthListBox ToMonthListBox;
	private ToDayListBox ToDayListBox;
	private ServClassRadioGroup ServClassRadioGroup;
	
	public FlightFinderAMI(TestObject contextTestObject) throws GeneralLeanFtException
	{
		setName("FlightFinderAMI");
				TripTypeOneWay = new TripTypeOneWay(contextTestObject, this);
		TripTypeRoundTrip = new TripTypeRoundTrip(contextTestObject, this);
		PassCountListBox = new PassCountListBox(contextTestObject, this);
		FromPortListBox = new FromPortListBox(contextTestObject, this);
		FromMonthListBox = new FromMonthListBox(contextTestObject, this);
		FromDayListBox = new FromDayListBox(contextTestObject, this);
		ToPortListBox = new ToPortListBox(contextTestObject, this);
		ToMonthListBox = new ToMonthListBox(contextTestObject, this);
		ToDayListBox = new ToDayListBox(contextTestObject, this);
		ServClassRadioGroup = new ServClassRadioGroup(contextTestObject, this);
		rebuildDescriptions();
	}	

			public TripTypeOneWay TripTypeOneWay() { return TripTypeOneWay; }
		public TripTypeRoundTrip TripTypeRoundTrip() { return TripTypeRoundTrip; }
		public PassCountListBox PassCountListBox() { return PassCountListBox; }
		public FromPortListBox FromPortListBox() { return FromPortListBox; }
		public FromMonthListBox FromMonthListBox() { return FromMonthListBox; }
		public FromDayListBox FromDayListBox() { return FromDayListBox; }
		public ToPortListBox ToPortListBox() { return ToPortListBox; }
		public ToMonthListBox ToMonthListBox() { return ToMonthListBox; }
		public ToDayListBox ToDayListBox() { return ToDayListBox; }
		public ServClassRadioGroup ServClassRadioGroup() { return ServClassRadioGroup; }

		public class TripTypeOneWay extends RadioGroupNodeBase
	{

		
								public TripTypeOneWay(TestObject parent, AppModelBase applicationModel) throws GeneralLeanFtException
		{
			super(parent, applicationModel);

			
			setDisplayName("oneway");
		}

		@Override
		protected com.hp.lft.sdk.web.RadioGroupDescription createDescription() throws GeneralLeanFtException{
			com.hp.lft.sdk.web.RadioGroupDescription description = null; 
			try{
				description = new com.hp.lft.sdk.web.RadioGroupDescription.Builder().type("radio").selectedItem("oneway").tagName("INPUT").name("tripType").build();
			}catch(Exception e){
				throw new GeneralLeanFtException(e.getMessage(), e);
			}
			return description;
		}

				
			}

	public class TripTypeRoundTrip extends RadioGroupNodeBase
	{

		
								public TripTypeRoundTrip(TestObject parent, AppModelBase applicationModel) throws GeneralLeanFtException
		{
			super(parent, applicationModel);

			
			setDisplayName("roundtrip");
		}

		@Override
		protected com.hp.lft.sdk.web.RadioGroupDescription createDescription() throws GeneralLeanFtException{
			com.hp.lft.sdk.web.RadioGroupDescription description = null; 
			try{
				description = new com.hp.lft.sdk.web.RadioGroupDescription.Builder().type("radio").selectedItem("roundtrip").tagName("INPUT").name("tripType").build();
			}catch(Exception e){
				throw new GeneralLeanFtException(e.getMessage(), e);
			}
			return description;
		}

				
			}

	public class PassCountListBox extends ListBoxNodeBase
	{

		
								public PassCountListBox(TestObject parent, AppModelBase applicationModel) throws GeneralLeanFtException
		{
			super(parent, applicationModel);

			
			setDisplayName("passCount");
		}

		@Override
		protected com.hp.lft.sdk.web.ListBoxDescription createDescription() throws GeneralLeanFtException{
			com.hp.lft.sdk.web.ListBoxDescription description = null; 
			try{
				description = new com.hp.lft.sdk.web.ListBoxDescription.Builder().tagName("SELECT").name("passCount").build();
			}catch(Exception e){
				throw new GeneralLeanFtException(e.getMessage(), e);
			}
			return description;
		}

				
			}

	public class FromPortListBox extends ListBoxNodeBase
	{

		
								public FromPortListBox(TestObject parent, AppModelBase applicationModel) throws GeneralLeanFtException
		{
			super(parent, applicationModel);

			
			setDisplayName("fromPort");
		}

		@Override
		protected com.hp.lft.sdk.web.ListBoxDescription createDescription() throws GeneralLeanFtException{
			com.hp.lft.sdk.web.ListBoxDescription description = null; 
			try{
				description = new com.hp.lft.sdk.web.ListBoxDescription.Builder().tagName("SELECT").name("fromPort").build();
			}catch(Exception e){
				throw new GeneralLeanFtException(e.getMessage(), e);
			}
			return description;
		}

				
			}

	public class FromMonthListBox extends ListBoxNodeBase
	{

		
								public FromMonthListBox(TestObject parent, AppModelBase applicationModel) throws GeneralLeanFtException
		{
			super(parent, applicationModel);

			
			setDisplayName("fromMonth");
		}

		@Override
		protected com.hp.lft.sdk.web.ListBoxDescription createDescription() throws GeneralLeanFtException{
			com.hp.lft.sdk.web.ListBoxDescription description = null; 
			try{
				description = new com.hp.lft.sdk.web.ListBoxDescription.Builder().tagName("SELECT").name("fromMonth").build();
			}catch(Exception e){
				throw new GeneralLeanFtException(e.getMessage(), e);
			}
			return description;
		}

				
			}

	public class FromDayListBox extends ListBoxNodeBase
	{

		
								public FromDayListBox(TestObject parent, AppModelBase applicationModel) throws GeneralLeanFtException
		{
			super(parent, applicationModel);

			
			setDisplayName("fromDay");
		}

		@Override
		protected com.hp.lft.sdk.web.ListBoxDescription createDescription() throws GeneralLeanFtException{
			com.hp.lft.sdk.web.ListBoxDescription description = null; 
			try{
				description = new com.hp.lft.sdk.web.ListBoxDescription.Builder().tagName("SELECT").name("fromDay").build();
			}catch(Exception e){
				throw new GeneralLeanFtException(e.getMessage(), e);
			}
			return description;
		}

				
			}

	public class ToPortListBox extends ListBoxNodeBase
	{

		
								public ToPortListBox(TestObject parent, AppModelBase applicationModel) throws GeneralLeanFtException
		{
			super(parent, applicationModel);

			
			setDisplayName("toPort");
		}

		@Override
		protected com.hp.lft.sdk.web.ListBoxDescription createDescription() throws GeneralLeanFtException{
			com.hp.lft.sdk.web.ListBoxDescription description = null; 
			try{
				description = new com.hp.lft.sdk.web.ListBoxDescription.Builder().tagName("SELECT").name("toPort").build();
			}catch(Exception e){
				throw new GeneralLeanFtException(e.getMessage(), e);
			}
			return description;
		}

				
			}

	public class ToMonthListBox extends ListBoxNodeBase
	{

		
								public ToMonthListBox(TestObject parent, AppModelBase applicationModel) throws GeneralLeanFtException
		{
			super(parent, applicationModel);

			
			setDisplayName("toMonth");
		}

		@Override
		protected com.hp.lft.sdk.web.ListBoxDescription createDescription() throws GeneralLeanFtException{
			com.hp.lft.sdk.web.ListBoxDescription description = null; 
			try{
				description = new com.hp.lft.sdk.web.ListBoxDescription.Builder().tagName("SELECT").name("toMonth").build();
			}catch(Exception e){
				throw new GeneralLeanFtException(e.getMessage(), e);
			}
			return description;
		}

				
			}

	public class ToDayListBox extends ListBoxNodeBase
	{

		
								public ToDayListBox(TestObject parent, AppModelBase applicationModel) throws GeneralLeanFtException
		{
			super(parent, applicationModel);

			
			setDisplayName("toDay");
		}

		@Override
		protected com.hp.lft.sdk.web.ListBoxDescription createDescription() throws GeneralLeanFtException{
			com.hp.lft.sdk.web.ListBoxDescription description = null; 
			try{
				description = new com.hp.lft.sdk.web.ListBoxDescription.Builder().tagName("SELECT").name("toDay").build();
			}catch(Exception e){
				throw new GeneralLeanFtException(e.getMessage(), e);
			}
			return description;
		}

				
			}

	public class ServClassRadioGroup extends RadioGroupNodeBase
	{

		
								public ServClassRadioGroup(TestObject parent, AppModelBase applicationModel) throws GeneralLeanFtException
		{
			super(parent, applicationModel);

			
			setDisplayName("servClass");
		}

		@Override
		protected com.hp.lft.sdk.web.RadioGroupDescription createDescription() throws GeneralLeanFtException{
			com.hp.lft.sdk.web.RadioGroupDescription description = null; 
			try{
				description = new com.hp.lft.sdk.web.RadioGroupDescription.Builder().tagName("INPUT").name("servClass").build();
			}catch(Exception e){
				throw new GeneralLeanFtException(e.getMessage(), e);
			}
			return description;
		}

				
			}


			
	public abstract class RadioGroupNodeBase extends AppModelNodeBase<com.hp.lft.sdk.web.RadioGroup, com.hp.lft.sdk.web.RadioGroupDescription> implements com.hp.lft.sdk.web.RadioGroup
	{		
		public RadioGroupNodeBase(TestObject parent, AppModelBase applicationModel) throws GeneralLeanFtException
		{
			super(parent, applicationModel);
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
		public java.lang.String getType() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getType();
		}

		@Override 
		public boolean isEnabled() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().isEnabled();
		}

		@Override 
		public java.lang.String getRole() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getRole();
		}

		@Override 
		public void longPress() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().longPress();
		}

		@Override 
		public void longPress(com.hp.lft.sdk.web.WebLongPressArgs arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().longPress(arg0);
		}

		@Override 
		public boolean hasSelectedItem() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().hasSelectedItem();
		}

		@Override 
		public java.lang.String getCSSSelector() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getCSSSelector();
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
		public java.lang.String getOuterHTML() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getOuterHTML();
		}

		@Override 
		public int getSelectedIndex() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getSelectedIndex();
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

		@Override 
		public java.lang.String getTagName() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getTagName();
		}

		@Override 
		public void click() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().click();
		}

		@Override 
		public void click(com.hp.lft.sdk.MouseButton arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().click(arg0);
		}

		@Override 
		public void click(com.hp.lft.sdk.ClickArgs arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().click(arg0);
		}

		@Override 
		public java.awt.Point getLocation() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getLocation();
		}

		@Override 
		public java.lang.String getId() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getId();
		}

		@Override 
		public java.lang.String getComputedStyle(java.lang.String arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getComputedStyle(arg0);
		}

		@Override 
		public java.util.List<java.lang.String> getItems() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getItems();
		}

		@Override 
		public java.lang.String getDisplayName()  
		{
			return getConcrete().getDisplayName();
		}

		@Override 
		public java.lang.String getSelectedItem() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getSelectedItem();
		}

		@Override 
		public java.awt.Point getAbsoluteLocation() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getAbsoluteLocation();
		}

		@Override 
		public java.lang.String getXPath() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getXPath();
		}

		@Override 
		public void select(java.lang.String arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().select(arg0);
		}

		@Override 
		public void select(int arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().select(arg0);
		}

		@Override 
		public java.lang.String getAttribute(java.lang.String arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getAttribute(arg0);
		}

		@Override 
		public boolean isVisible() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().isVisible();
		}

		@Override 
		public void hoverTap(com.hp.lft.sdk.Location arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().hoverTap(arg0);
		}

		@Override 
		public void hoverTap() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().hoverTap();
		}

		@Override 
		public java.util.Map<java.lang.String, java.lang.String> getAttributes() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getAttributes();
		}

		@Override 
		public void highlight() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().highlight();
		}

		@Override 
		public java.lang.String getInnerHTML() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getInnerHTML();
		}

		@Override 
		public java.lang.String getClassName() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getClassName();
		}

		@Override 
		public void setDisplayName(java.lang.String arg0)  
		{
			getConcrete().setDisplayName(arg0);
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
		public void dragAndDropOn(com.hp.lft.sdk.SupportDragAndDrop arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().dragAndDropOn(arg0);
		}

		@Override 
		public void dragAndDropOn(com.hp.lft.sdk.SupportDragAndDrop arg0, com.hp.lft.sdk.DragAndDropArgs arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().dragAndDropOn(arg0, arg1);
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
		public java.util.Map<java.lang.String, java.lang.String> getComputedStyles() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getComputedStyles();
		}

		@Override 
		public void doubleClick() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().doubleClick();
		}

		@Override 
		public void doubleClick(com.hp.lft.sdk.web.WebDoubleClickArgs arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().doubleClick(arg0);
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
		public java.lang.String getOuterText() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getOuterText();
		}

		@Override 
		public com.hp.lft.sdk.NativeObject getNativeObject() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getNativeObject();
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
		public boolean verifyImageMatch(java.awt.image.RenderedImage arg0, byte arg1, byte arg2) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageMatch(arg0, arg1, arg2);
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
		public <TChild extends TestObject> TChild[] findChildren(java.lang.Class<TChild> arg0, com.hp.lft.sdk.Description arg1) throws com.hp.lft.sdk.GeneralLeanFtException, java.lang.CloneNotSupportedException 
		{
			return getConcrete().findChildren(arg0, arg1);
		}

		@Override 
		public java.lang.String getName() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getName();
		}

		@Override 
		public void fireEvent(com.hp.lft.sdk.web.EventInfo arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().fireEvent(arg0);
		}

		@Override 
		public java.awt.Dimension getSize() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getSize();
		}

		@Override 
		public <TChild extends TestObject> int highlightMatches(java.lang.Class<TChild> arg0, com.hp.lft.sdk.Description arg1) throws com.hp.lft.sdk.GeneralLeanFtException, java.lang.CloneNotSupportedException 
		{
			return getConcrete().highlightMatches(arg0, arg1);
		}

		@Override 
		public void pan(com.hp.lft.sdk.web.WebPanArgs arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().pan(arg0);
		}

		@Override 
		public void pan(long arg0, long arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().pan(arg0, arg1);
		}

		@Override 
		public java.lang.String getInnerText() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getInnerText();
		}

		@Override 
		public java.awt.image.RenderedImage getSnapshot() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getSnapshot();
		}

		@Override 
		public <TChild extends TestObject> TChild describe(java.lang.Class<TChild> arg0, com.hp.lft.sdk.Description arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().describe(arg0, arg1);
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
		public java.lang.String getTitle() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getTitle();
		}
	}
	
	public abstract class ListBoxNodeBase extends AppModelNodeBase<com.hp.lft.sdk.web.ListBox, com.hp.lft.sdk.web.ListBoxDescription> implements com.hp.lft.sdk.web.ListBox
	{		
		public ListBoxNodeBase(TestObject parent, AppModelBase applicationModel) throws GeneralLeanFtException
		{
			super(parent, applicationModel);
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
		public java.lang.String getRole() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getRole();
		}

		@Override 
		public int getVisibleItemsCount() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getVisibleItemsCount();
		}

		@Override 
		public void longPress() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().longPress();
		}

		@Override 
		public void longPress(com.hp.lft.sdk.web.WebLongPressArgs arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().longPress(arg0);
		}

		@Override 
		public java.lang.String getCSSSelector() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getCSSSelector();
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

		@Override 
		public java.lang.String getTagName() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getTagName();
		}

		@Override 
		public void click() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().click();
		}

		@Override 
		public void click(com.hp.lft.sdk.MouseButton arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().click(arg0);
		}

		@Override 
		public void click(com.hp.lft.sdk.ClickArgs arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().click(arg0);
		}

		@Override 
		public java.awt.Point getLocation() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getLocation();
		}

		@Override 
		public boolean isEnabled() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().isEnabled();
		}

		@Override 
		public java.lang.String getType() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getType();
		}

		@Override 
		public java.lang.String getId() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getId();
		}

		@Override 
		public java.lang.String getComputedStyle(java.lang.String arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getComputedStyle(arg0);
		}

		@Override 
		public com.hp.lft.sdk.web.ListItem getItem(java.lang.String arg0)  
		{
			return getConcrete().getItem(arg0);
		}

		@Override 
		public java.lang.String getDefaultValue() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getDefaultValue();
		}

		@Override 
		public java.lang.String getDisplayName()  
		{
			return getConcrete().getDisplayName();
		}

		@Override 
		public void select(com.hp.lft.sdk.web.ListItem... arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().select(arg0);
		}

		@Override 
		public void select(int... arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().select(arg0);
		}

		@Override 
		public void select(java.lang.String... arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().select(arg0);
		}

		@Override 
		public java.awt.Point getAbsoluteLocation() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getAbsoluteLocation();
		}

		@Override 
		public java.lang.String getXPath() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getXPath();
		}

		@Override 
		public java.lang.String getAttribute(java.lang.String arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getAttribute(arg0);
		}

		@Override 
		public java.util.List<com.hp.lft.sdk.web.ListItem> getItems() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getItems();
		}

		@Override 
		public boolean isMultiple() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().isMultiple();
		}

		@Override 
		public boolean isVisible() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().isVisible();
		}

		@Override 
		public void hoverTap(com.hp.lft.sdk.Location arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().hoverTap(arg0);
		}

		@Override 
		public void hoverTap() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().hoverTap();
		}

		@Override 
		public java.util.Map<java.lang.String, java.lang.String> getAttributes() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getAttributes();
		}

		@Override 
		public void highlight() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().highlight();
		}

		@Override 
		public java.lang.String getInnerHTML() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getInnerHTML();
		}

		@Override 
		public java.lang.String getClassName() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getClassName();
		}

		@Override 
		public void setDisplayName(java.lang.String arg0)  
		{
			getConcrete().setDisplayName(arg0);
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
		public void dragAndDropOn(com.hp.lft.sdk.SupportDragAndDrop arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().dragAndDropOn(arg0);
		}

		@Override 
		public void dragAndDropOn(com.hp.lft.sdk.SupportDragAndDrop arg0, com.hp.lft.sdk.DragAndDropArgs arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().dragAndDropOn(arg0, arg1);
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
		public java.util.Map<java.lang.String, java.lang.String> getComputedStyles() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getComputedStyles();
		}

		@Override 
		public java.lang.String getValue() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getValue();
		}

		@Override 
		public void deselect(java.lang.String... arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().deselect(arg0);
		}

		@Override 
		public void deselect(com.hp.lft.sdk.web.ListItem... arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().deselect(arg0);
		}

		@Override 
		public void deselect(int... arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().deselect(arg0);
		}

		@Override 
		public void doubleClick() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().doubleClick();
		}

		@Override 
		public void doubleClick(com.hp.lft.sdk.web.WebDoubleClickArgs arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().doubleClick(arg0);
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
		public java.lang.String getOuterText() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getOuterText();
		}

		@Override 
		public com.hp.lft.sdk.NativeObject getNativeObject() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getNativeObject();
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
		public boolean verifyImageMatch(java.awt.image.RenderedImage arg0, byte arg1, byte arg2) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageMatch(arg0, arg1, arg2);
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
		public <TChild extends TestObject> TChild[] findChildren(java.lang.Class<TChild> arg0, com.hp.lft.sdk.Description arg1) throws com.hp.lft.sdk.GeneralLeanFtException, java.lang.CloneNotSupportedException 
		{
			return getConcrete().findChildren(arg0, arg1);
		}

		@Override 
		public java.lang.String getName() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getName();
		}

		@Override 
		public void fireEvent(com.hp.lft.sdk.web.EventInfo arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().fireEvent(arg0);
		}

		@Override 
		public java.awt.Dimension getSize() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getSize();
		}

		@Override 
		public <TChild extends TestObject> int highlightMatches(java.lang.Class<TChild> arg0, com.hp.lft.sdk.Description arg1) throws com.hp.lft.sdk.GeneralLeanFtException, java.lang.CloneNotSupportedException 
		{
			return getConcrete().highlightMatches(arg0, arg1);
		}

		@Override 
		public void pan(com.hp.lft.sdk.web.WebPanArgs arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().pan(arg0);
		}

		@Override 
		public void pan(long arg0, long arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().pan(arg0, arg1);
		}

		@Override 
		public java.lang.String getInnerText() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getInnerText();
		}

		@Override 
		public java.awt.image.RenderedImage getSnapshot() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getSnapshot();
		}

		@Override 
		public <TChild extends TestObject> TChild describe(java.lang.Class<TChild> arg0, com.hp.lft.sdk.Description arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().describe(arg0, arg1);
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
		public java.lang.String getTitle() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getTitle();
		}

		@Override 
		public java.util.List<com.hp.lft.sdk.web.ListItem> getSelectedItems() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getSelectedItems();
		}
	}
}