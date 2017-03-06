package com.hello;

public class PrototypeBean {

	public int getId(){
		return this.hashCode();
	}
}
