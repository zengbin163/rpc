package com.cheguo.rpc.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cheguo.rpc.client.RpcProxy;
import com.cheguo.rpc.service.CheguoService;

public class RpcBootstrapClient {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-client.xml");
		RpcProxy rpcProxy = (RpcProxy) context.getBean("rpcProxy");
		CheguoService cheguoService = rpcProxy.create(CheguoService.class);
		String result = cheguoService.hello("World");
		System.out.println(result);
	}
}
