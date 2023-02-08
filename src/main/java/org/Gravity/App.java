package org.Gravity;

import java.net.IDN;

public class App
{
    public static void main( String[] args ) {
        IdAndPassword idAndPasswords = new IdAndPassword();
        LoginPage loginpage = new LoginPage(idAndPasswords.getLoginInfo());
    }
}
