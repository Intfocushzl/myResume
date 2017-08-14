package com.example.demo;

import java.util.Date;

import javax.servlet.annotation.WebServlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.utils.Me;


@SpringBootApplication

public class Application  {
	
	public static void main(String[] args) {
		SpringApplication.run(Application .class, args);
		System.out.println("_____跑起来了______");
	}
	
	
}