package cn.com.dubbo;

import javax.annotation.Resource;

import cn.com.dubbo.dubboservice.ServiceInterface;

public class Test {

	@Resource
	private ServiceInterface mydubbo;
	
	public void TestRpc(String str){
		mydubbo.testDubbo(str);
	}
}
