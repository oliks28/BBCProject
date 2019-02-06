package com.bbc.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindAll;

import com.bbc.utils.BaseClass;



public class MenuPage extends BaseClass {
	@FindAll(@FindBy(how = How.XPATH, using ="//div[@id='orb-nav-links']//a"))
	public static List<WebElement> listofmenus; 
	
	public MenuPage() {
		PageFactory.initElements(driver, this);
	}
	
	public static void validateLinks(){
		 int actual=listofmenus.size();
		System.out.println(actual);
		int expected=33;
		Assert.assertEquals(expected, actual);
		 
	}

}
