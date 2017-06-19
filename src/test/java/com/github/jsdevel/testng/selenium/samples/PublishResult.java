package com.github.jsdevel.testng.selenium.samples;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import java.io.*;

/**
 * Created by IEUser on 6/19/2017.
 */


public class PublishResult extends TestListenerAdapter {
    public int i=0;
    @Override
    public void onTestFailure(ITestResult tr) {
        int j = i++;
        statusUpdate(tr.getName().replace("_","-"),"FAIL", j);
        System.out.println(i+"entered 1");
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        //log(tr.getName() + "--Test method skipped\n");
        System.out.println(i+"entered 2");
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        int j =  i++;
        statusUpdate(tr.getName().replace("_","-"),"PASS", j);

        System.out.println(i+"entered 3");
    }

    public void statusUpdate(String TestKey, String tStatus, int cFlag){

        String testValue = " {\n" +
                "            \"testKey\" : \"" + TestKey +"\",\n" +
                "  \"comment\" : \"Test was OK but the performance is very poor\",\n" +
                "            \"status\" : \""+tStatus+"\"\n" +
                "        }";

        try (FileWriter fw = new FileWriter("EX1.json",true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw);)
        {
            System.out.println("val" +cFlag);
            if (cFlag>0) {
                out.println("," + testValue);
            }
            else
            {
                out.println(testValue);
            }
        } catch (IOException e) {

            e.printStackTrace();

        }
    }

}
