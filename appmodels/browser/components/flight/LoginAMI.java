
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
public class LoginAMI extends AppModelBase {		private UserNameEditField UserNameEditField;
	private PasswordEditField PasswordEditField;
	private SignInImage SignInImage;
	
	public LoginAMI(TestObject contextTestObject) throws GeneralLeanFtException
	{
		setName("LoginAMI");
				UserNameEditField = new UserNameEditField(contextTestObject, this);
		PasswordEditField = new PasswordEditField(contextTestObject, this);
		SignInImage = new SignInImage(contextTestObject, this);
		rebuildDescriptions();
	}	

			public UserNameEditField UserNameEditField() { return UserNameEditField; }
		public PasswordEditField PasswordEditField() { return PasswordEditField; }
		public SignInImage SignInImage() { return SignInImage; }

		public class UserNameEditField extends EditFieldNodeBase
	{

		
								public UserNameEditField(TestObject parent, AppModelBase applicationModel) throws GeneralLeanFtException
		{
			super(parent, applicationModel);

			
			setDisplayName("userName");
		}

		@Override
		protected com.hp.lft.sdk.web.EditFieldDescription createDescription() throws GeneralLeanFtException{
			com.hp.lft.sdk.web.EditFieldDescription description = null; 
			try{
				description = new com.hp.lft.sdk.web.EditFieldDescription.Builder().type("text").tagName("INPUT").name("userName").build();
			}catch(Exception e){
				throw new GeneralLeanFtException(e.getMessage(), e);
			}
			return description;
		}

				
			}

	public class PasswordEditField extends EditFieldNodeBase
	{

		
								public PasswordEditField(TestObject parent, AppModelBase applicationModel) throws GeneralLeanFtException
		{
			super(parent, applicationModel);

			
			setDisplayName("password");
		}

		@Override
		protected com.hp.lft.sdk.web.EditFieldDescription createDescription() throws GeneralLeanFtException{
			com.hp.lft.sdk.web.EditFieldDescription description = null; 
			try{
				description = new com.hp.lft.sdk.web.EditFieldDescription.Builder().type("password").tagName("INPUT").name("password").build();
			}catch(Exception e){
				throw new GeneralLeanFtException(e.getMessage(), e);
			}
			return description;
		}

				
			}

	public class SignInImage extends ImageNodeBase
	{

		
								public SignInImage(TestObject parent, AppModelBase applicationModel) throws GeneralLeanFtException
		{
			super(parent, applicationModel);

			
			setDisplayName("Sign-In");
		}

		@Override
		protected com.hp.lft.sdk.web.ImageDescription createDescription() throws GeneralLeanFtException{
			com.hp.lft.sdk.web.ImageDescription description = null; 
			try{
				description = new com.hp.lft.sdk.web.ImageDescription.Builder().alt("Sign-In").type(com.hp.lft.sdk.web.ImageType.BUTTON).tagName("INPUT").build();
			}catch(Exception e){
				throw new GeneralLeanFtException(e.getMessage(), e);
			}
			return description;
		}

				
			}


			
	public abstract class EditFieldNodeBase extends AppModelNodeBase<com.hp.lft.sdk.web.EditField, com.hp.lft.sdk.web.EditFieldDescription> implements com.hp.lft.sdk.web.EditField
	{		
		public EditFieldNodeBase(TestObject parent, AppModelBase applicationModel) throws GeneralLeanFtException
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
		public int getRowsCount() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getRowsCount();
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
		public java.lang.String getType() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getType();
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
		public void setValue(java.lang.String arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().setValue(arg0);
		}

		@Override 
		public java.lang.String getValue() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getValue();
		}

		@Override 
		public java.lang.String getOuterHTML() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getOuterHTML();
		}

		@Override 
		public void setSecure(java.lang.String arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().setSecure(arg0);
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
		public int getMaxCharsInLine() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getMaxCharsInLine();
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
		public java.lang.String getDisplayName()  
		{
			return getConcrete().getDisplayName();
		}

		@Override 
		public java.awt.Point getAbsoluteLocation() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getAbsoluteLocation();
		}

		@Override 
		public boolean isReadOnly() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().isReadOnly();
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
		public java.lang.String getDefaultValue() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getDefaultValue();
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
		public int getMaxLength() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getMaxLength();
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
		public java.lang.String getPattern() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getPattern();
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
		public boolean isRequired() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().isRequired();
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
	
	public abstract class ImageNodeBase extends AppModelNodeBase<com.hp.lft.sdk.web.Image, com.hp.lft.sdk.web.ImageDescription> implements com.hp.lft.sdk.web.Image
	{		
		public ImageNodeBase(TestObject parent, AppModelBase applicationModel) throws GeneralLeanFtException
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
		public java.lang.String getTarget() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getTarget();
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
		public java.lang.String getHref() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getHref();
		}

		@Override 
		public java.lang.String getSrc() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getSrc();
		}

		@Override 
		public java.lang.String getDisplayName()  
		{
			return getConcrete().getDisplayName();
		}

		@Override 
		public java.awt.Point getAbsoluteLocation() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getAbsoluteLocation();
		}

		@Override 
		public com.hp.lft.sdk.web.ImageType getType() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getType();
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

		@Override 
		public java.lang.String getAlt() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getAlt();
		}
	}
}
