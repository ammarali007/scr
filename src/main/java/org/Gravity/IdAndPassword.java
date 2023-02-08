package org.Gravity;

import java.util.HashMap;

public class IdAndPassword {
    HashMap<String,String> loginInfo = new HashMap<String,String>();

    IdAndPassword(){
        loginInfo.put("Bro","Pizza");
        loginInfo.put("arzoo","arzoo111");
        loginInfo.put("usman","usman111");
        loginInfo.put("ammar","ammar661");
        loginInfo.put("shuja","shuja999");
    }
    protected HashMap<String,String > getLoginInfo(){
        return loginInfo;
    }
}
