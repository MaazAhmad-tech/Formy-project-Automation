import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\maaza\\Downloads\\chromedriver.exe");

        WebDriver driver1 = new ChromeDriver();

        driver1.get("https://formy-project.herokuapp.com/radiobutton");

        try {
            WebElement radioButton1 = driver1.findElement(By.id("radio-button-1"));
            radioButton1.click();

            Thread.sleep(1000);
            WebElement radioButton2 = driver1.findElement(By.cssSelector("input[value = 'option2']"));
            radioButton2.click();

            Thread.sleep(1000);
            //trying to access this radio button using it's XPath
            WebElement radioButton3 = driver1.findElement(By.xpath("/html/body/div/div[3]/input"));
            radioButton3.click();
        } finally {
            driver1.quit();
        }

        WebDriver driver2 = new ChromeDriver();
        driver2.get("https://formy-project.herokuapp.com/checkbox");
        try{
            WebElement checkBox1 = driver2.findElement(By.id("checkbox-1"));
            checkBox1.click();

            Thread.sleep(1000);
            WebElement checkBox2 = driver2.findElement(By.id("checkbox-2"));
            checkBox2.click();

            Thread.sleep(1000);
            WebElement checkBox3 = driver2.findElement(By.id("checkbox-3"));
            checkBox3.click();


        }
        finally {
            driver2.quit();
        }
    }
}
