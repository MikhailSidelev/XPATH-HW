package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        WebElement fullName=driver.findElement(By.xpath("//input[@id='userName']"));
        fullName.sendKeys("Mikhail Sidelev");

        WebElement userEmail=driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
        userEmail.sendKeys("mikhailsidelev@gmail.com");

        WebElement currentAddress=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        currentAddress.sendKeys("1719 63 St, Apt 4b, Brooklyn, NY 11224");

        WebElement permanentAddress=driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanentAddress.sendKeys("1719 63 St, Apt 4b, Brooklyn, NY 11224");

        driver.findElement(By.xpath("//button[@id='submit']")).click();

    }
}
