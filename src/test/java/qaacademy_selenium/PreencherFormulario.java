
package qaacademy_selenium;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PreencherFormulario {
    @Test
    public void PreencherNome() throws InterruptedException{
      
        String nome = "//*[@id='basicBootstrapForm']/div[1]/div[1]/input";
        String preencherNome = "//*[@id='basicBootstrapForm']/div[1]/div[1]/input";
        String preencherSobrenome = "//*[@id='basicBootstrapForm]'/div[1]/div[2]/input";
        

        WebDriver drive = new ChromeDriver();
        drive.manage().window().maximize();
        drive.get("https://demo.automationtesting.in/Register.html"); 

        Thread.sleep(2000);
        drive.findElement(By.xpath(nome)).click();
        drive.findElement(By.xpath(preencherNome)).sendKeys("Adriana");
        drive.findElement(By.xpath(preencherSobrenome)).click();
        drive.findElement(By.xpath(preencherSobrenome)).sendKeys("Faga");
    }
}