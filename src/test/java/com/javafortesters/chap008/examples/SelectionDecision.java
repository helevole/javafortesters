package com.javafortesters.chap008.examples;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by csabi on 2/8/17.
 */
public class SelectionDecision {

    @Test
    public void moreTernary(){
        String url = "www.dsl.sk";

        url = url.startsWith("http://") ? url : addHttp(url);
        Assert.assertTrue(url.startsWith("http://"));
    }

    public String addHttp(String url){
        return "http://" + url;
    }

}
