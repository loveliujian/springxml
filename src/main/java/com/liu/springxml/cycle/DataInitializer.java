package com.liu.springxml.cycle;

public class DataInitializer {
	
	public void initMethod() throws Exception {
		System.out.println("initMethod 被执行");
	}

	public void destroyMethod() throws Exception {
		System.out.println("destroyMethod 被执行");
	}
}
