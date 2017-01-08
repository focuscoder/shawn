package cn.com.dubbo.data.service;

import java.util.List;
import java.util.Map;
import cn.com.dubbo.data.bean.User;



public interface IUserService {
	
	  final static String ServiceId = "datauserService";
	
	/**
	  * 增加数据
	  */
	public int insertObject(User user);       
	
	/**
     * 修改数据
     */
	public void updateObject(User user);

	 /**
     * 删除数据
     */
	public void deleteObject(User user); 
	
	/**
     * 查询数据
     */
	public User findOne(User user);
	
	/**
     * 查询所有数据
     */
	public List<User> findAll(Map<String,Object>  user);

		
	/**
     * 查询所有数据 ，重新组装为map
     */
	public List<Map> findAllMap(Map param);
	
	/**
    * 批量增加数据
    */
	public boolean batchInsert(List<User> userList);
	
	/**
    * 批量修改数据
    */
	public boolean batchUpdate(List<User> userList);
	
	/**
    * 批量删除数据
    */
	public boolean batchDelete(List<User> userList);
	
	
}
