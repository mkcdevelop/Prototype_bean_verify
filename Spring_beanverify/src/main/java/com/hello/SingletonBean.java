package com.hello;

import org.springframework.beans.factory.annotation.Autowired;

public class SingletonBean {
	
	@Autowired
	private PrototypeBean pbean;
	
	public void print(){
		System.out.println("hash code of invoked pBean is :"+pbean.getId());
	}

}
