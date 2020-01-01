package com.vytrack.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {

    @Before
    public void setup(){
        System.out.println("#####################");
        System.out.println("Test setup!");
    }
    @After
    public void teardown(){
        System.out.println("Cleanup!");
        System.out.println("Test Completed!");
        System.out.println("#####################");
    }
}
