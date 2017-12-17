package com.imooc.security.core.properties;

public class BrowserProperties {

    private String loginPage = "/imooc-signIn.html";

    public String getLoginPage() {
        return loginPage;
    }

    public BrowserProperties setLoginPage(String loginPage) {
        this.loginPage = loginPage;
        return this;
    }
}
