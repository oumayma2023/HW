package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class HW1 {
        public static void main(String[] args) throws InterruptedException {
            WebDriver driver=new ChromeDriver();
            // Navigate
            driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
            //maximize
            driver.manage().window().maximize();
            //find element and send text
            driver.findElement(By.id("customer.firstName")).sendKeys("Ouma");
            driver.findElement(By.id("customer.lastName")).sendKeys("Boudhina");
            driver.findElement(By.name("customer.address.street")).sendKeys("Queen Victoria ct");
            driver.findElement(By.name("customer.address.city")).sendKeys("Virginia");
            driver.findElement(By.id("customer.address.state")).sendKeys("Richmon");
            driver.findElement(By.id("customer.address.zipCode")).sendKeys("45321");
            driver.findElement(By.name("customer.phoneNumber")).sendKeys("234567");
            driver.findElement(By.name("customer.ssn")).sendKeys("1234-4567");
            Thread.sleep(2000);
            driver.findElement(By.id("customer.username")).sendKeys("OumaBoudhina");
            driver.findElement(By.id("customer.password")).sendKeys("Hichem2022%");
            driver.findElement(By.name("repeatedPassword")).sendKeys("Hichem2022%");
            Thread.sleep(6000);
            driver.quit();





        }
    }

