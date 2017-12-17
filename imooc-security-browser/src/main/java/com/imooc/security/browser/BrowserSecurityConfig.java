/**
 * 
 */
package com.imooc.security.browser;

import com.imooc.security.browser.authentication.MyAuthenticationFailureHandler;
import com.imooc.security.browser.authentication.MyAuthenticationSuccessHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.imooc.security.core.properties.SecurityProperties;

/**
 * @author zhailiang
 *
 */
@Configuration
public class BrowserSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private SecurityProperties securityProperties;
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Autowired
	private MyAuthenticationSuccessHandler myAuthenticationSuccessHandler;

	@Autowired
	private MyAuthenticationFailureHandler myAuthenticationFailureHandler;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.formLogin()
			.loginPage("/authentication/require")
			.loginProcessingUrl("/authentication/form")
			.successHandler(myAuthenticationSuccessHandler)
			.failureHandler(myAuthenticationFailureHandler)
			.and()
			.authorizeRequests()
			.antMatchers("/authentication/require",
					securityProperties.getBrowser().getLoginPage()).permitAll()
			.anyRequest()
			.authenticated()
			.and()
			.csrf().disable();
		
	}

}
