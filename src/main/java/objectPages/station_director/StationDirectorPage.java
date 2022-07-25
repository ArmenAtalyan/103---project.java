package objectPages.station_director;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StationDirectorPage {

    @FindBy(xpath = "/html/body/div[1]/ul/li/a")
    private WebElement dropdown;
    @FindBy(xpath = "/html/body/div[1]/ul/li/ul/li[2]/ul/li[5]/a")
    private WebElement station_director_button;
    @FindBy(css = "#bs-example-navbar-collapse-1 > ul:nth-child(1) > li > a")
    private WebElement journal_button;

    public void goOnStationDir(){
        dropdown.click();
    }

    public void enterPage(){
        station_director_button.click();
    }

    public void journalButtonOn(){
        journal_button.click();
    }

}
