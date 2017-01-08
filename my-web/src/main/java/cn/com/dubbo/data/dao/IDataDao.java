package cn.com.dubbo.data.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import cn.com.dubbo.data.bean.User;



/**
 * 数据访问接口(原生)<br>
 * 基于iBatis实现,支持自定义的数据操作
 * 
 * @author zoubin
 * @version V1.0
 * @since 2013-09-13
 * @see com.IDao.dao.client.Dao
 */

/**
 * 升级到MyBatis，并增加了批量增删改的方法
 * @author Johnny.lu
 * @version V1.1
 * @Modifyed 2014年10月13日 下午2:27:22
 * @see     [相关类/方法]
 */
public interface IDataDao {
	
	public static final String IDatadao = "datadao";
	
	/**
	 * 根据用户id查询菜单
	 */
	public List<Map> selectList(Map parameterObject);
	
	/**
	 * 用dto作为参数插入数据
	 */
	public int insertObject(User parameterObject);
	
	
	/**
	 * 创建对象 
	 * @param sqlName mapper文件sqlId
	 * @param po DO实体 
	 * @return 创建后的对象并赋予了主键 
	 * @
	 */
	public <T> T insert(T parameterObject);
		
	/**
	 * 按主键查询一条实体记录
	 * @param SQL语句ID号
	 * @param DO 
	 * @return 符合条件的记录 
	 */
	public <T> T queryOneObject(Map<String,Object> parameterObject);
	
	/**  
	 * 查询记录集合，返回Map类型
	 * @param SQL语句ID号
	 * @param parameterObject 查询条件对象(map javaBean)
	 */
	public List<Map> queryForMapList( Map parameterObject);
	
	/**
	 * 查询记录集合，返回实体类型
	 * @param SQL语句ID号
	 * @param DO
	 * @return 符合条件的记录
	 */
	public <T> List<T> queryForEntityList(Map<String,Object> parameterObject);
	
	/**
	 * 查询参数是Map（Dto），返回值是一个实体（DataObject）List
	 * @param statementName 查询Sql
	 * @param parameterObject 查询参数
	 * @param instance 返回List的实体类型
	 * @return
	 */
	//public <T> List<T> queryForEntityListByDto(String statementName,Map parameterObject,T instance);
	public <T> List<T> queryEntityListByDto(String statementName);
	
	/**
	 * 返回int值
	 * @param statementName
	 * @param Dto
	 * @return int
	 */
	public int queryCount(String statementName,Map parameterObject);
		
	/**
	 * 分页查询 
	 * @param SQL语句ID号
	 * @param currentPage 查询条件对象(map javaBean)
	 */
	//public Pages queryForPage(String statementName, Pages currentPage);
	
	
	/**
	 * 更新记录
	 * @param SQL语句ID号
	 * @param parameterObject
	 */
	public <T> T update(String statementName,T parameterObject);
			
	/**
	 * 删除记录
	 * @param SQL语句ID号
	 * @param parameterObject
	 */

	
	/**
	 * 调用存储过程<br>
	 * 存储过程成功返回标志缺省：appCode=1
	 * 
	 * @param prcName 存储过程ID号
	 * @param parameterObject 参数对象(入参、出参)
	 * @throws TKPrcException 存储过程调用异常
	 */  
	
	public List<Map> testPrc(String prcName, Map prcDto) throws Exception;
	
	/**
	 * 调用存储过程<br>
	 * 存储过程成功返回标志自定义：appCode=successFlag(自定义的传入变量)
	 * 
	 * @param prcName 存储过程ID号
	 * @param parameterObject 参数对象(入参、出参)
	 * @param prcName 存储过程调用成功返回的成功代码值
	 * @throws TKPrcException 存储过程调用异常
	 */
	public void callPrc(String prcName, Map prcDto, String successFlag) throws Exception;
	
	/**
	 * 获取Connection对象<br>
	 * 说明：虽然向Dao消费端暴露了获取Connection对象的方法但不建议直接获取Connection对象进行JDBC操作
	 * 
	 * @return 返回Connection对象
	 * @throws SQLException
	 */
	public Connection getConnection() throws SQLException;
		
	/** 
	* 批量新增 
	* @param sqlName mapper文件sqlId
	* @param BOList BO对象集合 
	* @return true:删除成功，false:失败
	* @ 
	*/ 

	
	/** 
	* 批量更新 
	* @param sqlName mapper文件sqlId
	* @param BOList BO对象集合 
	* @return  true:删除成功，false:失败
	* @ 
	*/ 

	
	/** 
	* 批量删除 
	* @param sqlName mapper文件sqlId
	* @param BOList BO对象集合 
	* @return  true:删除成功，false:失败
	* @ 
	*/ 

	
	/**
	 * 更新并返回更新件数
	 * @param statementName
	 * @param parameterObject
	 * @param needcountflg
	 * @return 更新件数
	 */

	
	/**
	 * 删除并返回更新件数
	 * @param statementName
	 * @param parameterObject
	 * @param needcountflg
	 * @return 删除件数
	 */
	
}
