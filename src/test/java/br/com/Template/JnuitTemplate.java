package br.com.Template;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class JnuitTemplate {

	private String INDEX_URL = "";
	private WebDriver browser;
    
   @BeforeEach
   public void beforeEach() {
	  System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
	  this.browser = new ChromeDriver();
   }
    
   @AfterEach
	public void afterEach() {
	   this.browser.close();
   }
   
  @Test
  public void Test01() throws Exception{
	this.browser.manage().window().maximize();
	this.browser.get(INDEX_URL);
    WebElement botaoPaginaPrincipal = this.browser.findElement(By.id());
    botaoPaginaPrincipal.click();
    Thread.sleep(3500);
    Assertions.assertEquals(INDEX_URL, this.browser.getCurrentUrl());
  }
  
  @Test
  public void Test02() throws Exception{
	this.browser.manage().window().maximize();
	this.browser.get(INDEX_URL);
    WebElement botaoPaginaPrincipal = this.browser.findElement(By.id());
    botaoPaginaPrincipal.click();
    Thread.sleep(3500);
    Assertions.assertEquals(, this.browser.getCurrentUrl());
  }
  
  @Test
  public void Test03() throws Exception{
	this.browser.manage().window().maximize();
	this.browser.get(INDEX_URL);
    WebElement botaoPaginaPrincipal = this.browser.findElement(By.id());
    botaoPaginaPrincipal.click();
    Thread.sleep(3500);
    Assertions.assertEquals(, this.browser.getCurrentUrl());
  }
  
  @Test
  public void Test04() throws Exception{
	this.browser.manage().window().maximize();
	this.browser.get(INDEX_URL);
    WebElement botaoPaginaPrincipal = this.browser.findElement(By.id());
    botaoPaginaPrincipal.click();
    Thread.sleep(3500);
    Assertions.assertEquals(, this.browser.getCurrentUrl());
  }
}