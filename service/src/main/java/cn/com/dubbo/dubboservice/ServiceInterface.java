package cn.com.dubbo.dubboservice;

import java.util.List;
import java.util.Map;

public interface ServiceInterface {

	//测试dubbo服务接口
	public void testDubbo(String status);
	
	//测试查询
	public List<Map<String,Object>> queryList();
	
	//测试Dubbo
	public List<Map<String,Object>> checkDubbo();
}
