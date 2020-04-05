package com.vytrack.practice;

import com.vytrack.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.List;

public class handilingDynamicTable {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = Driver.get();
        driver.get("http://demo.guru99.com/test/web-table-element.php");

        //*[@id="leftcontainer"]/table/tbody/tr[1]/td[1]/a
        //*[@id="leftcontainer"]/table/tbody/tr[2]/td[1]/a
        //*[@id="leftcontainer"]/table/tbody/tr[3]/td[1]/a
        //*[@id="leftcontainer"]/table/tbody/tr[26]/td[1]/a

        String beforeXpath="//*[@id=\"leftcontainer\"]/table/tbody/tr[";
        String afterXpath="]/td[1]/a";
        List <WebElement> totalRow = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
        List <WebElement> totalCol = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        int rowCount=totalRow.size();
        int colCount=totalCol.size();
        System.out.println(rowCount);
        System.out.println(colCount);
        for (int i=1; i<=rowCount;i++){
            String CompanyXpath=beforeXpath+i+afterXpath;
            WebElement companyName=driver.findElement(By.xpath(CompanyXpath));
            System.out.println(companyName.getText());
            if (companyName.getText().equals("UCO Bank")){
    System.out.println("Company name "+companyName.getText()+"is found "+i+"position");
            break;
            }
        }

        Assert.assertEquals(5, colCount);
        Assert.assertEquals(26, rowCount);
        Thread.sleep(3);
        driver.close();

    }
}



