package com.javafortesters.chap005testwithourownclasses.domainobject.example;

import org.junit.Assert;
import org.junit.Test;
import static com.javafortesters.domainobject.TestAppEnv.*;


/**
 * Created by HeleVole on 28-Jan-17.
 */
public class TestAppEnvironmentTest {
    @Test
    public void canGetUrlStatically(){
        Assert.assertEquals("get the hardcoded URL", "http://192.123.0.3:67", getUrl());
    }

    @Test
    public void canGetDomainAndPortStatically(){
        Assert.assertEquals("just the domain", "192.123.0.3", DOMAIN);
        Assert.assertEquals("just the port", "67", PORT);
    }
}
