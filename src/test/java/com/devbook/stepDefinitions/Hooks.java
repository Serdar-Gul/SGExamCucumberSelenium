package com.devbook.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before // JAVA
    public void setUp() {
        System.out.println("\tThis is coming from Before method");
    }

    @After //JAVA
    public void tearDown() {
        System.out.println("\tThis is coming from After method");
    }
    @Before ("@db")
    public void setUpDB(){
        System.out.println("\tConnection DB");
    }
    @After ("@db")
    public void teatDownDB(){
        System.out.println("Disconnection DB");
    }
}
