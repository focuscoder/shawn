package cn.com.dubbo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.com.dubbo.dubboservice.ServiceInterface;

public class DubboImpl implements ServiceInterface{

	@Override
	public List<Map<String, Object>> checkDubbo() {
		Map<String,Object> map = new HashMap<String,Object>();
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		map.put("一号", "不好");
		map.put("二号", "还行");
		map.put("三号", "郁闷");
		map.put("四号", "激动");
		map.put("五号", "平静");
		list.add(map);
		return list;
	}

	@Override
	public List<Map<String, Object>> queryList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void testDubbo(String param) {
		
		System.out.println(param + "dubbo test is successful");
		
	}

}
