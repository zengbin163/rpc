package com.cheguo.rpc.service;

import com.cheguo.rpc.annotation.RpcService;

@RpcService(CheguoService.class) // 指定远程接口
public class CheguoServiceImpl implements CheguoService {

	public String hello(String name) {
		return "Hello! " + name;
	}

}
