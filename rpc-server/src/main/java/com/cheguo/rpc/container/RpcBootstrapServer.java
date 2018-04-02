package com.cheguo.rpc.container;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RpcBootstrapServer {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("spring-server.xml");
	}
}
