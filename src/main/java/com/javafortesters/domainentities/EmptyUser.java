package com.javafortesters.domainentities;

import com.javafortesters.domainobject.TestAppEnv;

/**
 * Created by csabi on 3/28/17.
 */
public class EmptyUser extends User {

    public String getUrl(){
        String url =TestAppEnv.getUrl();
        return url;
    }

}
