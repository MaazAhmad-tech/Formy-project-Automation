import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\maaza\\Downloads\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Maaz");

        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Ansari");

        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("Software Engineer");

        WebElement radioButton = driver.findElement(By.cssSelector("input[value = 'radio-button-3']"));
        radioButton.click();

        WebElement checkBox = driver.findElement(By.id("checkbox-1"));
        checkBox.click();

        WebElement dropDownMenu = driver.findElement(By.id("select-menu"));
        dropDownMenu.click();
        WebElement option = driver.findElement(By.cssSelector("option[value='1']"));
        option.click();

        WebElement datePicker = driver.findElement(By.id("datepicker"));
        datePicker.sendKeys("08/25/2021");
        datePicker.sendKeys(Keys.RETURN);

        WebElement submitButton = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary"));
        submitButton.click();

        driver.quit();
    }
}
