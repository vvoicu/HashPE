package tools.models.flight;

import tools.FieldGenerator;
import tools.FieldGenerator.Mode;

public class CustomerModel {

	private String firstName;
	private String lastName;
	private String meal;
	
	public CustomerModel(){
		this.firstName = "";
		this.lastName = "";
		this.meal = "";
	}
	
	public CustomerModel(boolean isValid){
		setFirstName(isValid);
		setLastName(isValid);
		setMeal(isValid);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setFirstName(boolean isValid) {
		if (isValid) {
			this.firstName = FieldGenerator.generateRandomString(9, Mode.ALPHA);
		} else
			this.firstName = FieldGenerator.generateRandomString(9, Mode.ALPHANUMERICSCHAR);
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setLastName(boolean isValid) {
		if (isValid) {
			this.lastName = FieldGenerator.generateRandomString(9, Mode.ALPHA);
		} else
			this.lastName = FieldGenerator.generateRandomString(9, Mode.ALPHANUMERICSCHAR);
	}

	public String getMeal() {
		return meal;
	}

	public void setMeal(String meal) {
		this.meal = meal;
	}
	
	public void setMeal(boolean isValid) {
		if (isValid) {
			this.meal = FieldGenerator.generateRandomString(9, Mode.ALPHA);
		} else
			this.meal = FieldGenerator.generateRandomString(9, Mode.ALPHA) + "@mailinator.com";
	}
}
