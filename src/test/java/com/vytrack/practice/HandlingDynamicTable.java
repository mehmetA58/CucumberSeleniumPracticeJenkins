package com.vytrack.practice;

import com.vytrack.utilities.Driver;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

public class HandlingDynamicTable {


    public static void main(String[] args) {

        WebDriver driver = Driver.get();
        driver.get("http://demo.guru99.com/test/web-table-element.php");
        List <WebElement> colms = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        List <WebElement> rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td/a"));

        Iterator <WebElement> rowIter = rows.iterator();
        while (rowIter.hasNext()){
            if(rowIter.next().equals("Kwality")){
                rowIter.next().click();
                break;
            }
        }

        System.out.println("=================");
        for (WebElement eachcol:colms){
            System.out.println(eachcol.getText());
        }

             for (WebElement eachCompany:rows){
                 System.out.println(eachCompany.getText());
                 if (eachCompany.getText().equals("Kwality")){
                     eachCompany.click();
                     break;
                 }
             }


              int colCount=colms.size();
              int rowCount=rows.size();
              Assert.assertEquals(26,rowCount);
              Assert.assertEquals(5,colCount);
        System.out.println("================");
        System.out.println(colCount);
        System.out.println(rowCount);
            driver.close();

    }
}
