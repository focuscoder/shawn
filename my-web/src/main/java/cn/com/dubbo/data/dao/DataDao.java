package cn.com.dubbo.data.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import cn.com.dubbo.data.bean.User;




/**
 * userdao接口
 * 
 * 〈功能简述〉
 * @author sw
 * @version [版本号，默认V1.0.0]
 * @Credited 2015年10月3日 下午8:29:49
 * @see       [相关类/方法]
 * @since     [产品/模块版本]
 */

@Service(IDataDao.IDatadao)
public class DataDao implements IDataDao{

	@Override
	public List<Map> selectList(Map parameterObject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertObject(User parameterObject) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <T> T insert(T parameterObject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T queryOneObject(Map<String, Object> parameterObject) {
		//return execute.selectOne("User.findOneUser", parameterObject);
		return null;
	}

	@Override
	public List<Map> queryForMapList(Map parameterObject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> List<T> queryForEntityList(Map<String, Object> parameterObject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> List<T> queryEntityListByDto(String statementName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int queryCount(String statementName, Map parameterObject) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <T> T update(String statementName, T parameterObject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map> testPrc(String prcName, Map prcDto) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void callPrc(String prcName, Map prcDto, String successFlag)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Connection getConnection() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
