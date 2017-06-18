package com.cucumber;


        import cucumber.api.java.After;
        import cucumber.api.java.Before;

/**
 * Created by rajeshidimannan on 11/06/17.
 */
public class Hooks {

    @Before
    public void setUp()
    {
       // new DriverManager().openBrowser();

    }


    @After
    public void tearDown()
    {
        //new DriverManager().closeBrowser();
    }
}