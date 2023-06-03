
package qaacademy_selenium;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PreencherFormulario {
    @Test
    public void PreencherNome() throws InterruptedException{
      
        String nome = "//*[@id='basicBootstrapForm']/div[1]/div[1]/input";
        String preencherNome = "//*[@id='basicBootstrapForm']/div[1]/div[1]/input";
        String preencherSobrenome = "//*[@id='basicBootstrapForm']/div[1]/div[2]/input"; 
        String endereço = "//*[@id='basicBootstrapForm']/div[2]/div/textarea";
        String email = "//*[@id='eid']/input";
        String telefone = "//*[@id='basicBootstrapForm']/div[4]/div/input";
        String genero = "//*[@id='basicBootstrapForm']/div[5]/div/label[2]/input";
        String hobbies = "//*[@id='checkbox3']";
        String skills = "//*[@id='basicBootstrapForm']/div[8]/div";
        String opcaojava = "//*[@id='Skills']/option[39]";
        String SelectCountry = "//*[@id='basicBootstrapForm']/div[10]/div/span";
        String opcaoAutralia = "//*[@id='select2-country-results']/li[2]";
        String years = "//*[@id='yearbox']";
        String ano = "//*[@id='yearbox']/option[64]";

        WebDriver drive = new ChromeDriver();
        drive.manage().window().maximize();
        drive.get("https://demo.automationtesting.in/Register.html"); 

        Thread.sleep(6000);
        drive.findElement(By.xpath(nome)).click();
        drive.findElement(By.xpath(preencherNome)).sendKeys("Adriana");
        drive.findElement(By.xpath(preencherSobrenome)).click();
        drive.findElement(By.xpath(preencherSobrenome)).sendKeys("Faga");
        drive.findElement(By.xpath(endereço)).click();
        drive.findElement(By.xpath(endereço)).sendKeys("Avenida Paulista");
        drive.findElement(By.xpath(email)).click();
        drive.findElement(By.xpath(email)).sendKeys("adrianacristinafaga@gmail.com");
        drive.findElement(By.xpath(telefone)).click();
        drive.findElement(By.xpath(telefone)).sendKeys("940370395");
        drive.findElement(By.xpath(genero)).click();
        drive.findElement(By.xpath(hobbies)).click();
        JavascriptExecutor js = (JavascriptExecutor) drive;
        js.executeScript("window.scrollBy(0,400)", "");
        drive.findElement(By.xpath(skills)).click();
        drive.findElement(By.xpath(opcaojava)).click();
        drive.findElement(By.xpath(skills)).click();
        drive.findElement(By.xpath(SelectCountry)).click();
        drive.findElement(By.xpath(opcaoAutralia)).click(); 
        drive.findElement(By.xpath(years)).click();
        drive.findElement(By.xpath(ano)).click();

    }

}