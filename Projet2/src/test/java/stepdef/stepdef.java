package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdef {
	WebDriver driver=null;
	@Given("navigateur Google Chrome ouvert")
	public void navigateur_Google_Chrome_ouvert() {
		System.out.println("Inside Step - browser is open");

		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/driver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); 	
		
		
		
		
	}

	@And("Acc�der � la page mercury")
	public void acc_der_la_page_mercury() {
		driver.navigate().to("http://demo.guru99.com/test/newtours/");
	
	}

	@When("je clique sur refistre")
	public void je_clique_sur_refistre() {
		
		driver.findElement(By.linkText("REGISTER")).sendKeys(Keys.ENTER);

	}

	@When("saisir les informations")
	public void saisir_les_informations() {
		//contact information
		driver.findElement(By.name("firstName")).sendKeys("fares");
		driver.findElement(By.name("lastName")).sendKeys("ayeche");
		driver.findElement(By.name("phone")).sendKeys("99101697");
		driver.findElement(By.name("userName")).sendKeys("fares.ayeche@talan.com");
		
		//Mailing information
		driver.findElement(By.name("address1")).sendKeys("14 rue achkhabed");
		driver.findElement(By.name("city")).sendKeys("ariana");
		driver.findElement(By.name("state")).sendKeys("ariana");
		driver.findElement(By.name("postalCode")).sendKeys("2037");
		driver.findElement(By.name("country")).sendKeys("TUNISIA");
		//USER INFORMATION 
		driver.findElement(By.name("email")).sendKeys("fares93");
		driver.findElement(By.name("password")).sendKeys("TUNISIA");
		driver.findElement(By.name("confirmPassword")).sendKeys("TUNISIA");

	}

	@Then("je clique sur valider")
	public void je_clique_sur_valider() {
		
		
		driver.findElement(By.name("submit")).sendKeys(Keys.ENTER);
	
	}
	
	@Then("compte crée")
	public void compte_crée() {
		
	   
	}
	

@Given("platforme mercury ouverte")
public void platforme_mercury_ouverte() {
	//driver.findElement(By.linkText("sign-in")).isDisplayed();
	driver.findElement(By.linkText("SIGN-OFF")).click();
	
}

@When("je clique sur sign-on")
public void je_clique_sur_sign_on() {
	//driver.findElement(By.linkText("sign-in")).click();
	driver.findElement(By.linkText("SIGN-ON")).click();
}

@When("saisir les données")
public void saisir_les_données() {
	driver.findElement(By.name("userName")).sendKeys("fares93");
	driver.findElement(By.name("password")).sendKeys("TUNISIA");
 
}

@When("je clique submit")
public void je_clique_submit() {
	driver.findElement(By.name("submit")).click();
}

@Then("redirection ver la page sign-on")
public void redirection_ver_la_page_sign_on() {
	driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3"));
}

}
