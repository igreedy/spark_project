package com.igreedy.sparkproject.conf;

import junit.framework.TestCase;

/**
 * Created by igreedy on 2018/7/24
 */
public class ConfigurationManagerTest extends TestCase {

    public void testGetProperty() {
        String testkey1 = ConfigurationManager.getProperty("testkey1");
        String testkey2 = ConfigurationManager.getProperty("testkey2");
        System.out.println(testkey1);
        System.out.println(testkey2);
    }

}