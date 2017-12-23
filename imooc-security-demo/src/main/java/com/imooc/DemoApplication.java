/**
 * 
 */
package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author zhailiang
 *
 */
@SpringBootApplication
@RestController
@EnableSwagger2
public class DemoApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "hello spring security";
	}

	@GetMapping("/me1")
	public Object me1(){
		return SecurityContextHolder.getContext().getAuthentication();
	}

	@GetMapping("/me2")
	public Object me2(Authentication authentication){
		return authentication;
	}

	@GetMapping("/me3")
	public Object me3(@AuthenticationPrincipal UserDetails user){
		return user;
	}

}
