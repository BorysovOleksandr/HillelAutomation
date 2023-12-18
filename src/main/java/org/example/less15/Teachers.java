package org.example.less15;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Teachers {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //driver.manage().window().maximize();

        driver.get("https://ithillel.ua/");


        WebElement coursesButton = driver.findElement(By.cssSelector("button.site-nav-link[data-dropdown-trigger='coursesMenu']"));
        coursesButton.click();
        WebElement progButton = driver.findElement(By.cssSelector("button.cats-list_btn[data-category='programming']"));
        progButton.click();

        WebElement frontEndButton = driver.findElement(By.cssSelector("button.subcats-list_btn[data-value='front-end']"));
        frontEndButton.click();

       WebElement frontEnd = driver.findElement(By.xpath("//p[contains(text(),'Front-end Basic')]"));
        frontEnd.click();

        WebElement coachesSection = driver.findElement(By.cssSelector(".-coaches"));
        System.out.println(coachesSection.getLocation().toString());
        ((JavascriptExecutor)driver).executeScript("scrollTo" + coachesSection.getLocation().toString());

        WebElement button = driver.findElement(By.id("coachesShowAllButton"));
        button.click();
        List<WebElement> coachCardNames = driver.findElements(By.className("coach-card_name"));
        List<String> listNames = coachCardNames.stream().map(WebElement::getText).toList();
        System.out.println(listNames);


        Thread.sleep(3000);

        driver.quit();
    }
}
