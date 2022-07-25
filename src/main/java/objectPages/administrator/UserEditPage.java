package objectPages.administrator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.StartDriver;

public class UserEditPage {

    @FindBy(css= "#dataTables_users > tbody > tr:nth-child(4) > td.text-center > a")
    private WebElement editButton1;
    @FindBy(css = "#generate_password")
    private WebElement generatePass;
    @FindBy(css = "body > div.wrapper.wrapper_act > div.wrapper_div > div > div > div > div > div.panel-body > form > div:nth-child(16) > div > button")
    private WebElement confirm;
    @FindBy(css = "body > div.wrapper.wrapper_act > div.wrapper_div > div > div > div > div")
    private WebElement enterSuccessMessage;
    @FindBy(css = "body > div.wrapper.wrapper_act > div.wrapper_div > div > div > div > div > div.panel-body > div > strong")
    private WebElement enterSuccessMessage2;
    @FindBy(css= "#dataTables_users > tbody > tr:nth-child(49) > td.text-center > a")
    private WebElement editButton2;
    @FindBy(css = "#dataTables_users_paginate > ul > li:nth-child(6) > a")
    private WebElement page;
    @FindBy(css = "body > div.wrapper.wrapper_act > div.wrapper_div > div > div > div > div > div.panel-body > form > div:nth-child(8) > div > input")
    private WebElement name;
    @FindBy(css = "body > div.wrapper.wrapper_act > div.wrapper_div > div > div > div > div > div.panel-body > form > div:nth-child(11) > div > div")
    private WebElement roleLine;
    @FindBy(css = "body > div.wrapper.wrapper_act > div.wrapper_div > div > div > div > div > div.panel-body > form > div:nth-child(11) > div > div > div > ul > li:nth-child(1)")
    private WebElement role1;
    @FindBy(css = "body > div.wrapper.wrapper_act > div.wrapper_div > div > div > div > div > div.panel-body > form > div:nth-child(11) > div > div > div > ul > li:nth-child(2)")
    private WebElement role2;



    public UserEditPage(){
        PageFactory.initElements(StartDriver.getInstance().getDriver(), this);
    }

    public void editButtonOn1(){
        editButton1.click();
    }

    public void editButtonOn2(){
        editButton2.click();
    }

    public void generatePassOn(){
        generatePass.click();
    }

    public void confirmClick(){
        confirm.click();
    }

    public WebElement getGeneratePass() {
        return generatePass;
    }

    public WebElement getEnterSuccessMessage() {
        return enterSuccessMessage;
    }

    public WebElement getEnterSuccessMessage2() {
        return enterSuccessMessage2;
    }

    public void changePage(){
        page.click();
    }

    public void typeName(String userName){
        name.sendKeys(userName);
    }

    public void lineRole(){
        roleLine.click();
    }

    public void selectRole1(){
        role1.click();
    }

    public void selectRole2(){
        role2.click();
    }

}
