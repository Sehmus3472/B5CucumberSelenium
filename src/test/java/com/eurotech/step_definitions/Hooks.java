package com.eurotech.step_definitions;

import com.eurotech.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    // Hooks class TestNG de Befor ve After classlarin calistigi class vazifesi görür. Bu method her senaryodan önce calisir.
    @Before
    public void setup(){
        System.out.println("\tThis is coming from Before method");

    }


    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[]screenshot= ((TakesScreenshot)Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }
        Driver.closeDriver();
    }

    @Before("@Db") // Burdaki Before ve After methodlari özel senaryo icin olusturulan classlardir.
    public void setupDb(){
        System.out.println("\tConnecting Db");
    }

    @After("@Db")
    public void CloseDB(){
        System.out.println("\t Disconnecting Db");
    }

}
