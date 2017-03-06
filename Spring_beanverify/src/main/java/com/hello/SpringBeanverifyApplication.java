package com.hello;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringBeanverifyApplication {
	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public PrototypeBean proto(){
		return new PrototypeBean();
	}
	
	@Bean
	public SingletonBean sBean(){
		return new SingletonBean();
	}

	public static void main(String[] args) throws InterruptedException {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringBeanverifyApplication.class);
		SingletonBean sb=context.getBean(SingletonBean.class);
		sb.print();
		sb=context.getBean(SingletonBean.class);
		sb.print();
		
	}
}
