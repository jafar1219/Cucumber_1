package cucumb_2new;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class StepDefine {
	public static WebDriver driver;
	@Given("The user is in add tariff page")
	public void the_user_is_in_add_tariff_page() {
		System.setProperty("webdriver.chrome.driver", "E:\\new cucum\\cucumb_2\\driver\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("http://demo.guru99.com/telecom/index.html");
	}

	@When("User fills in the details")
	public void user_fills_in_the_details(DataTable dataTable) {
		List<Map<String, String>> tariff = dataTable.asMaps(String.class, String.class);
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
		 driver.findElement(By.id("rental1")).sendKeys(tariff.get(2).get("rental1"));
		 driver.findElement(By.id("local_minutes")).sendKeys(tariff.get(1).get("local_minutes"));
		 driver.findElement(By.id("inter_minutes")).sendKeys(tariff.get(2).get("inter_minutes"));
		 driver.findElement(By.id("sms_pack")).sendKeys(tariff.get(0).get("sms_pack"));
		 driver.findElement(By.id("minutes_charges")).sendKeys(tariff.get(0).get("minutes_charges"));
		 driver.findElement(By.id("inter_charges")).sendKeys(tariff.get(1).get("inter_charges"));
		driver.findElement(By.id("sms_charges")).sendKeys(tariff.get(2).get("sms_charges"));
	    
	}

	@When("Click submit")
	public void click_submit() {
		driver.findElement(By.name("submit")).click(); 
	}

	@Then("See the generated customer id")
	public void see_the_generated_customer_id() {
		Assert.assertTrue(driver.findElement(By.tagName("h2")).isDisplayed()); 
	}

}
