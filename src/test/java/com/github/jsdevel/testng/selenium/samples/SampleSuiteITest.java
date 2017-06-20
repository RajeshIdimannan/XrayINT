package com.github.jsdevel.testng.selenium.samples;
import java.io.*;

import com.github.jsdevel.testng.selenium.AbstractSuite;
import com.github.jsdevel.testng.selenium.annotations.driverconfig.UserAgent;
import com.github.jsdevel.testng.selenium.annotations.screensizes.LargeDesktop;
import com.github.jsdevel.testng.selenium.annotations.screensizes.Phone;
import com.github.jsdevel.testng.selenium.config.Config;
import com.github.jsdevel.testng.selenium.exceptions.PageInitializationException;
import com.github.jsdevel.testng.selenium.exceptions.PageInstantiationException;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

import org.testng.annotations.*;

public class SampleSuiteITest {
  @BeforeSuite
  public void adddInfo() throws IOException {
    String s_intiialStr = "{\n" +
            "    \"info\" : {\n" +
            "        \"summary\" : \"Execution of automated tests for release v1.4\",\n" +
            "        \"description\" : \"This execution is automatically created when importing execution results from an external source\",\n" +
            "        \"startDate\" : \"2014-08-30T11:47:35+01:00\",\n" +
            "        \"finishDate\" : \"2014-08-30T11:53:00+01:00\"\n" +
            "        \n" +
            "    },\n" +
            "    \"tests\" : [\n";




      try (FileWriter fw = new FileWriter("EX1.json");
           BufferedWriter bw = new BufferedWriter(fw);
          PrintWriter out = new PrintWriter(bw);)
      {
          out.println(s_intiialStr);
      } catch (IOException e) {

          e.printStackTrace();

      }

  }

  @AfterSuite
  public void closeSuite()
  {
      String s_finalStr = "]\n" +
              "}";


      try (FileWriter fw = new FileWriter("EX1.json",true);
           BufferedWriter bw = new BufferedWriter(fw);
           PrintWriter out = new PrintWriter(bw);)
      {
          out.println(s_finalStr);
      } catch (IOException e) {

          e.printStackTrace();

      }


  }

  @Test
  public void XRAYIN_7() {
     int c = 5 + 5;
     assertEquals(c,10);

  }

  @Test
  public void XRAYIN_8() {
   int m = 5 * 5;
   assertEquals(m,10);
  }



}