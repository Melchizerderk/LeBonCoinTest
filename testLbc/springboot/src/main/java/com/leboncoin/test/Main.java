package com.leboncoin.test;

import com.leboncoin.test.controllers.FizzBuzzController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ComponentScan
@SpringBootApplication
@Controller
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
		new FizzBuzzController();
	}

	@RequestMapping(value = "/")
	@ResponseBody
	public String hello() {
		return "Usage is /fizz-buzz/query?int1=&int2=&limit=&str1=&str2 \n" +
				"and /fizz-buzz/statistics";
	}

}
