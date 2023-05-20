package qaacademy_selenium;

import javax.xml.xpath.XPath;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeiraClasse {
 String cursosPresencias = "comp-k7g9c7sd1label";  
 String botaoContato = "//*[@id='comp-k7g9c7sd3label']";  
 String cursosOnline = "//*[@id='comp-k7g9c7sd2label']";
 String depoimento = "//*[@id='comp-k7g9c7sd4label']";

    @Test
    public void testeAberturaNavegador() throws InterruptedException{

        WebDriver drive = new ChromeDriver();
        drive.manage().window().maximize();
        drive.get("https://www.qaacademy.com.br/");

        drive.findElement(By.id(cursosPresencias)).click();
        drive.findElement(By.xpath(botaoContato)).click();
        drive.findElement(By.xpath(cursosOnline)).click();
    

    }
}