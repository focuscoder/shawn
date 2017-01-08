package cn.com.dubbo;



import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import cn.com.dubbo.dubboservice.ServiceInterface;

public class StartClient {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext text = new ClassPathXmlApplicationContext("dubbo-consumer.xml");			
		text.start();
		//ServiceInterface service = (ServiceInterface)text.getBean("dubboTest");
	/* List<Map<String,Object>> obj = serviceObj.checkDubbo();
	 for (Map<String, Object> map : obj) {
		Iterator<Map.Entry<String,Object>>  entry = map.entrySet().iterator();
			if(entry.hasNext()){
				Map.Entry<String,Object> o = entry.next();
				System.out.println(o.getKey()+"--"+o.getValue());
			}
	 }*/
		//service.testDubbo("shawn");
		Test t = new Test();
		t.TestRpc("ok"+" ");
	}
}
