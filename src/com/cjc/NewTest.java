package com.cjc;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;
//assignment 5-
public class NewTest {
   public WebDriver driver;
  @Test(priority=1)
  public void click_on_myaccount() throws InterruptedException {
	  System.out.println("click on my account link");
	  driver.findElement(By.linkText("MY ACCOUNT")).click();
	  Thread.sleep(2000);
  }
  
  @Test(priority=2)
  public void click_on_createaccount() throws InterruptedException {
	  System.out.println("click on create account link");
	  driver.findElement(By.xpath("//span[text()='Create an Account']")).click();
	  Thread.sleep(2000);
  }
  @Test(priority=3)
  public void create_account() throws InterruptedException {
	  System.out.println("fill the new user details");
	  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Priya");
	  driver.findElement(By.xpath("//input[@name='middlename']")).sendKeys("Yashwant");
	  driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Meshram");
	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("meshrampriya11@gmail.com");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("priya@123");
	  driver.findElement(By.xpath("//input[@name='confirmation']")).sendKeys("priya@123");
	  Thread.sleep(2000);
  }
  @Test(priority=4)
  public void click_on_register() throws InterruptedException {
	  System.out.println("click on register button");
	  driver.findElement(By.xpath("//span[text()='Register']")).click();
	  Thread.sleep(2000);
  }
  @Test(priority=5)
  public void verify_resistration_done() throws InterruptedException {
	  String actual=driver.findElement(By.xpath("//span[text()='Thank you for registering with Main Website Store.']")).getText();
	  String expected="Thank you for registering with Main Website Store.";
	  Assert.assertEquals(actual, expected);
	  System.out.println(actual);
	  System.out.println(expected);
	  Thread.sleep(2000);
  }
  @Test(priority=6)
  public void click_on_Tv() {
	  System.out.println("click on TV");
	  driver.findElement(By.linkText("TV")).click();
  }
  @Test(priority=7)
  public void addtowish_TV() throws InterruptedException {
	  System.out.println("add LG on wishlist");
	  driver.findElement(By.xpath("//div[@class='actions']//ul/li/a")).click();
	  Thread.sleep(2000);
  }
  
  @Test(priority=8)
  public void click_sharewishlist() throws InterruptedException {
	  System.out.println("click on share wish list");
	  driver.findElement(By.xpath("//div[@class='buttons-set buttons-set2']/button/span/span")).click();
	  Thread.sleep(2000);
  }
  
  @Test(priority=9)
  public void senddata_on_wishlistpage() throws InterruptedException {
	  driver.findElement(By.xpath("//textarea[@name='emails']")).sendKeys("meshrampriya3@gmail.com");
	  driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("Your future is bright");
	  driver.findElement(By.xpath("//span[text()='Share Wishlist']")).click();
	  Thread.sleep(2000);
  }
  
  @Test(priority=10)
  public void validate_wishlist_succesfully() {
	 String actual=driver.findElement(By.xpath("//span[text()='Your Wishlist has been shared.']")).getText();
	 String expected="Your Wishlist has been shared.";
	 Assert.assertEquals(actual, expected);
	 System.out.println(actual);
	 System.out.println(expected);
  }
  
  
  
  @BeforeClass
  public void maximize_page() {
	  System.out.println("please maximize the webpage");
	  driver.manage().window().maximize();
  }

  @BeforeTest
  public void enter_application_url() {
	  System.out.println("Enter application url");
	  driver.get("http://live.guru99.com/");
  }

  @BeforeSuite
  public void open_browser() {
	  System.out.println("open the browser");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARESHAN\\Desktop\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  
  }

}
