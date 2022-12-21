package com.ObjectRepo.HybridFramework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage 
{
	@FindBy(xpath="//*[contains(text(),'Home')]")
	private WebElement Home;
	
	@FindBy(xpath="//a[contains(text(),'Contact')]")
	private WebElement Contact;
	
	@FindBy(xpath="//a[contains(text(),'About us')]")
	private WebElement AboutUs;
	
	@FindBy(id="cartur")
	private WebElement Cart;
	
	@FindBy(id="login2")
	private WebElement Login;
	
	@FindBy(id="signin2")
	private WebElement SignUp;
	
	@FindBy(xpath="//*[text()='Phones']")
	private WebElement Phones;
	
	@FindBy(xpath="//*[text()='Laptops']")
	private WebElement Laptops;
	
	@FindBy(xpath="//*[text()='Monitors']")
	private WebElement Monitors;
	
	@FindBy(xpath="//*[@alt='First slide']")
	private WebElement FirstImage;
	
	@FindBy(xpath="//*[@alt='Second slide']")
	private WebElement SecondImage;
	
	@FindBy(xpath="//*[@alt='Third slide']")
	private WebElement ThirdImage;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement ImageNext;
	
	@FindBy(xpath="//span[text()='Previous']")
	private WebElement ImagePrevious;
	
	@FindBy(id="prev2")
	private WebElement Previous;
	
	@FindBy(id="next2")
	private WebElement Next;
	
	@FindBy(xpath="//a[text()='Samsung galaxy s6']")
	private WebElement Samsung_galaxy_s6;
	
	@FindBy(xpath="//a[text()='Nokia lumia 1520']")
	private WebElement Nokia_lumia_1520;

	@FindBy(xpath="//a[text()='Nexus 6']")
	private WebElement Nexus_6;
	
	@FindBy(xpath="//a[text()='Iphone 6 32gb']")
	private WebElement Iphone_6_32gb;
	
	@FindBy(id="loginusername")
	private WebElement username;
	
	@FindBy(id="loginpassword")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement loginButton;
	
	@FindBy(id="nameofuser")
	private WebElement nameOfUser;
	
	@FindBy(id="logout2")
	private WebElement logout;
	
	@FindBy(xpath="//a[text()='Add to cart']")
	private WebElement addToCart;
	
	@FindBy(xpath="//td[text()='Nexus 6']")
	private WebElement nexusCart;
	
	@FindBy(xpath="//a[text()='Delete']")
	private WebElement deleteFromCart;

	//Getter Methods
	
	public WebElement getDeleteFromCart() {
		return deleteFromCart;
	}

	public WebElement getNexusCart() {
		return nexusCart;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getNameOfUser() {
		return nameOfUser;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getSamsung_galaxy_s6() {
		return Samsung_galaxy_s6;
	}

	public WebElement getNokia_lumia_1520() {
		return Nokia_lumia_1520;
	}

	public WebElement getNexus_6() {
		return Nexus_6;
	}

	public WebElement getIphone_6_32gb() {
		return Iphone_6_32gb;
	}

	public WebElement getHome() {
		return Home;
	}

	public WebElement getContact() {
		return Contact;
	}

	public WebElement getAboutUs() {
		return AboutUs;
	}

	public WebElement getCart() {
		return Cart;
	}

	public WebElement getLogin() {
		return Login;
	}

	public WebElement getSignUp() {
		return SignUp;
	}

	public WebElement getPhones() {
		return Phones;
	}

	public WebElement getLaptops() {
		return Laptops;
	}

	public WebElement getMonitors() {
		return Monitors;
	}

	public WebElement getFirstImage() {
		return FirstImage;
	}

	public WebElement getSecondImage() {
		return SecondImage;
	}

	public WebElement getThirdImage() {
		return ThirdImage;
	}

	public WebElement getImageNext() {
		return ImageNext;
	}

	public WebElement getImagePrevious() {
		return ImagePrevious;
	}

	public WebElement getPrevious() {
		return Previous;
	}

	public WebElement getNext() {
		return Next;
	}
}
