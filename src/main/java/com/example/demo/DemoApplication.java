package com.example.demo;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoApplication implements ApplicationContextAware {

	private ApplicationContext applicationContext;
	@PostConstruct
	void startup(){
		System.out.println("Hello");
		DBconnectionImpl bean = applicationContext.getBean(DBconnectionImpl.class);
		bean.connect("connected to this URL");
		System.out.println(bean);

	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	this.applicationContext=applicationContext;
	}
}
