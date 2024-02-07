package definitions.practice;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static support.TestContext.getDriver;

public class practice {
    @Given("I visit Quote Page in the {string} Environment")
    public void iVisitQuotePageInTheEnvironment(String xpath) {
        getDriver().navigate().to("http://quote-stage.portnov.com/");
    }

    @When("I enter {string} for the Username field")
    public void iEnterForTheUsernameField(String xpath) {
        WebElement username = getDriver().findElement(By.xpath("//*[@name='username']"));
        username.sendKeys("username");
    }

    @And("I enter {string} for first name and {string} for the last name in the Name field")
    public void iEnterForFirstNameAndForTheLastNameInTheNameField(String test, String xpath) {
        WebElement name = getDriver().findElement(By.xpath("//*[@name = 'name']"));
        name.sendKeys("first last");
    }

    @And("I enter {string} for the Email field")
    public void iEnterForTheEmailField(String xpath) {
        WebElement email = getDriver().findElement(By.xpath("//*[@name = 'email']"));
        email.sendKeys("try@gmail.com");
    }

    @When("I enter {string} for the Password field")
    public void iEnterForThePasswordField(String xpath) {
        WebElement password = getDriver().findElement(By.xpath("//*[@name='password']"));
        password.sendKeys("password");
    }

    @And("I enter {string} for the Confirm Password field")
    public void iEnterForTheConfirmPasswordField(String xpath) {
        WebElement confirmpassword = getDriver().findElement(By.xpath("//*[@name='confirmPassword']"));
        confirmpassword.sendKeys("password");
    }

    @Then("I {string} the Privacy Policy Policy checkbox")
    public void iThePrivacyPolicyPolicyCheckbox(String xpath) {
        WebElement privacypolicy = getDriver().findElement(By.xpath("(//*[@type='checkbox'])[2]"));
        privacypolicy.click();
    }

    @When("I click on the {string} button at the bottom of the page")
    public void iClickOnTheButtonAtTheBottomOfThePage(String xpath) {
        WebElement submit = getDriver().findElement(By.xpath("//button[@id='formSubmit']"));
        submit.click();
    }
}

