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

    private Integer rememberSeconds = 3600;

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

    public Integer getRememberSeconds() {
        return rememberSeconds;
    }

    public BrowserProperties setRememberSeconds(Integer rememberSeconds) {
        this.rememberSeconds = rememberSeconds;
        return this;
    }
}
