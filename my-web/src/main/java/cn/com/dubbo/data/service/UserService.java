package cn.com.dubbo.data.service;
 
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import cn.com.dubbo.data.dao.IDataDao;
import cn.com.dubbo.data.bean.User;

 
  
/**
  * UserServiceImpl
  */
@Service(IUserService.ServiceId)
public class UserService implements IUserService  
  {  

	@Resource
	protected IDataDao datadao;  
	

	@Override
	public int insertObject(User user) {     
		return datadao.insertObject(user);
		
	}

	@Override
	public void updateObject(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteObject(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findOne(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll(Map<String,Object> map) {
		
		List<User> u = datadao.queryEntityListByDto("User.findSAllUser");
		return u;
	}

	/*public Page queryForPage(Condition condition) {
		String page = condition.getPage();
		String rows = condition.getRows();
		List<User> ulist = datadao.queryEntityListByDto("User.findSAllUser");
		Page pagelist = new Page(Integer.parseInt(page == null ? "1" : page),Integer.parseInt(page == null ? "10" : rows), ulist.size(), DBType.MYSQL);
		if(!ulist.isEmpty()){
			pagelist.setShowList(ulist.subList(pagelist.pageStartRow, pagelist.pageEndRow));
		}
		return pagelist;
	}
*/
	@Override
	public List<Map> findAllMap(Map param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean batchInsert(List<User> userList) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean batchUpdate(List<User> userList) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean batchDelete(List<User> userList) {
		// TODO Auto-generated method stub
		return false;
	}


}
  