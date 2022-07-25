package objectPages.administrativ_controller;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminControllerPage {

    @FindBy(css = "body > div.menu_div_left.menu_div_left_act > ul > li > ul > li:nth-child(3) > ul > li:nth-child(5) > a")
    private WebElement adminControllerButton;
    @FindBy(css = "#bs-example-navbar-collapse-1 > ul:nth-child(1) > li > a")
    private WebElement reportDropdown;
    @FindBy(css = "#bs-example-navbar-collapse-1 > ul:nth-child(1) > li > ul > li > a")
    private WebElement dispatcherStatistics;


}
