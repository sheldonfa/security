/**
 *
 */
package com.imooc.security.core.properties;

/**
 * @author zhailiang
 *
 */
public class BrowserProperties {

    private String loginPage = "/imooc-signIn.html";

    private LoginType loginType = LoginType.JSON;

    public LoginType getLoginType() {
        return loginType;
    }

    public BrowserProperties setLoginType(LoginType loginType) {
        this.loginType = loginType;
        return this;
    }

    public String getLoginPage() {
        return loginPage;
    }

    public void setLoginPage(String loginPage) {
        this.loginPage = loginPage;
    }

}
