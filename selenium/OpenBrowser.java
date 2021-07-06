package day3.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("SeleniumTraining");
		driver.findElementById("createLeadForm_firstName").sendKeys("Mohammed");
		driver.findElementById("createLeadForm_lastName").sendKeys("Zaheeruddin");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Zaheer");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Boss");
		driver.findElementById("createLeadForm_birthDate").sendKeys("24/02/91");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mr");
		driver.findElementById("createLeadForm_departmentName").sendKeys("IT");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("500000000");
		driver.findElementById("createLeadForm_sicCode").sendKeys("001");
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("RRR");
		driver.findElementById("createLeadForm_description").sendKeys("IT Company");
		driver.findElementById("createLeadForm_importantNote").sendKeys("NA");
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dropsource = new Select(source);
		dropsource.selectByValue("LEAD_DIRECTMAIL");
		WebElement markcamp = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropmarkcamp = new Select(markcamp);
		dropmarkcamp.selectByValue("CATRQ_AUTOMOBILE");
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select dropindus = new Select(industry);
		dropindus.selectByValue("IND_RETAIL");
		WebElement currency = driver.findElementById("createLeadForm_currencyUomId");
		Select dropcurr = new Select(currency);
		dropcurr.selectByValue("CAD");
		WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dropowner = new Select(ownership);
		dropowner.selectByVisibleText("S-Corporation");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("001");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("2275012");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("023");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("012346");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Monisha");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("zaheer123@yahoo.com");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.abc.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("Multiple");
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("Rey");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("westminister street");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Newyork");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("51898");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("012");
		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dropcount = new Select(country);
		dropcount.selectByValue("USA");
		WebElement state = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select dropstate = new Select(state);
		dropstate.selectByValue("NY");
		driver.findElementByClassName("smallSubmit").click();
		driver.findElementByClassName("subMenuButton").click();
		driver.findElementById("createLeadForm_companyName").clear();
		driver.findElementById("createLeadForm_companyName").sendKeys("Zaheer company");
		driver.findElementByClassName("smallSubmit").click();
		System.out.println("Lead created successfully");
		//driver.close();
	}

}
