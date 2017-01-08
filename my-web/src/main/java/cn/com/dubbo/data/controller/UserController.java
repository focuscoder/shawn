package cn.com.dubbo.data.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import java.util.HashMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.ResponseBody;
import cn.com.dubbo.data.bean.User;
import cn.com.dubbo.data.service.IUserService;



/**
  * UserController
  */
@Controller("userController")
@RequestMapping(value="/user")
public class UserController {
		
	@Resource(name=IUserService.ServiceId)
	private IUserService userservice;
		
	/**
	 * 打开主查询页面
	 * @return 页面地址
	 */
	@RequestMapping("music.do")
	public String showMusic() {
		return "other/music"; 
	} 
	
	
	
	/**
	 * 打开主查询页面
	 * @return 页面地址
	 */
	@RequestMapping("userindex.do")
	public String showUserIndexPage() {
		return "user/user"; 
	}  
	
	/**
	 * 查询信息列表
	 * @return 分页列表数据
	 */
	@RequestMapping("/list")
	@ResponseBody
	public void getUserList(HttpServletRequest request ,HttpServletResponse response){
		//Page ulist = userservice.queryForPage(condition);
		//String result = bean2Json(ulist);
		//output(response,result);
	}

	/**
	 * 打开新增或修改页面
	 * @return
	 */
	@RequestMapping("edit")
	public String showUserEditPage(String rowId,Model model) {
		
		if(rowId!=null && !rowId.equals(""))
		{
			model.addAttribute("rowId",rowId );
		}
		
		return "user/userEdit"; 
	}
	
	/**
	 * 获取一条记录详细信息，用来填充修改界面
	 * @return
	 */
	@RequestMapping("/getOne")
	@ResponseBody
	public Map getUserById(@RequestParam("rowId")String rowId)
	{
		Map param = new HashMap();
		param.put("rowId", rowId);return null;
		//return userAction.findOne(param);
	}
	
	/**
	 * 保存新增或修改的记录，将其持久化到数据库中
	 * @return
	 */
	@RequestMapping("/adduser.do")
	//@ResponseBody
	private void saveUserInfo(HttpServletRequest request,User user,HttpServletResponse response)
	{
		Map<String,String> map=new HashMap<String,String>(); 
		
		/*Map param = getParamasMap(request);
		if(param.get("rowId") ==null ||"".equals(param.get("rowId")))
		{
			//userAction.insertObject(param);
			map.put("smg", "新增成功！");
		}
		else
		{
			//userAction.updateObject(param);
			map.put("msg", "更新成功！");
		}*/
		int result = userservice.insertObject(user);
		if(result > 0){
			map.put("result", "true");
		}else{
			map.put("result", "false");
		}
		//String out = bean2Json(map);
		//output(response, out);
	}
	
	/**
	*删除一条或多条记录
	*/
	@RequestMapping(value="/del")
	@ResponseBody
	public Map<String, String> deleteUser(@RequestParam("rowId") String rowId) {
		Map<String, String> map = new HashMap<String, String>();
		Map param = new HashMap();
		param.put("rowId", rowId);
		//Iuserservice.deleteObject(param);
		
		map.put("", "true");
		map.put("", "操作成功！");
		
		return map;
	}
}

