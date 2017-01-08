package cn.com.dubbo;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StartServer {

	
	public static void main(String[] args) throws IOException {
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-provider.xml");
		
			context.start(); 
			System.out.println("*****************dubbo服务已启动……*****************");
			System.in.read(); 
			//context.close();
	}
}
