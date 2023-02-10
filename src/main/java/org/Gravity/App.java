package org.Gravity;

public class App
{
    public static void main( String[] args ) {
        IdAndPassword idAndPasswords = new IdAndPassword();
        new LoginPage(idAndPasswords.getLoginInfo());
    }
}
