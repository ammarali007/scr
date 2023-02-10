package org.Gravity;

import java.util.HashMap;

public class IdAndPassword {
    HashMap<String,String> loginInfo = new HashMap<String,String>();

    IdAndPassword(){
        loginInfo.put("Bro","Pizza");
        loginInfo.put("ali","111");
        loginInfo.put("usman","111");
        loginInfo.put("ammar","661");
        loginInfo.put("umer","999");
    }
    protected HashMap<String,String > getLoginInfo(){
        return loginInfo;
    }
}
