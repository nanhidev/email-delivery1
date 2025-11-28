package com.backend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import com.default_project.utils.ElementUtils;
import org.junit.Assert;

public class MyHooksPage {

    private WebDriver driver;
    private ElementUtils elementUtils;
    private static Logger logger = LogManager.getLogger(MyHooksPage.class);

    public MyHooksPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "exampleElement1")
    private WebElement exampleElement1;

    @FindBy(id = "exampleElement2")
    private WebElement exampleElement2;

    @FindBy(id = "exampleDropdown")
    private WebElement exampleDropdown;

    // Method to interact with exampleElement1

    // Method to send keys to exampleElement2

    // Method to select option in dropdown

    // Method to verify the text on a web element

    // Method to check if exampleElement1 is displayed
}