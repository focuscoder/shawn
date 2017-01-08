package cn.com.dubbo.data.bean;

import java.sql.Timestamp;
import java.lang.String;



/**
  * UserBO 
  */
public class User {
	
	private static final long serialVersionUID = 1L;
	
	/*public UserBO(){
		init();
	}*/
	
	/*protected void init(){
		
		this.addList(Arrays.asList("user_id","user_name","user_sex","duty","partment","create_time","work_status","user_pname","user_pwd"));
	}*/
	
		
		
	private String userId;
		public void setUserId(String userId){
		//getData().put("user_id",userId);
		this.userId = userId;
	}
	
	public String getUserId(){
		return this.userId;
	}	
		
		
	private String userName;
		public void setUserName(String userName){
		//getData().put("user_name",userName);
		this.userName = userName;
	}
	
	public String getUserName(){
		return this.userName;
	}	
		
		
	private String userSex;
		public void setUserSex(String userSex){
		
		this.userSex = userSex;
	}
	
	public String getUserSex(){
		return  this.userSex;
	}	
		
		
	private String duty;
		public void setDuty(String duty){
		
		this.duty = duty;
	}
	
	public String getDuty(){
		return this.duty;
	}	
		
		
	private String partment;
		public void setPartment(String partment){
		//getData().put("partment",partment);
		this.partment = partment;
	}
	
	public String getPartment(){
		return this.partment;
	}	
		
		
	private Timestamp createTime;
		public void setCreateTime(Timestamp createTime){
		//getData().put("create_time",createTime);
		this.createTime = createTime;
	}
	
	public Timestamp getCreateTime(){
		return this.createTime;
	}	
		
		
	private String workStatus;
		public void setWorkStatus(String workStatus){
		//getData().put("work_status",workStatus);
		this.workStatus = workStatus;
	}
	
	public String getWorkStatus(){
		return this.workStatus;
	}	
		
		
	private String userPname;
		public void setUserPname(String userPname){
		//getData().put("user_pname",userPname);
		this.userPname = userPname;
	}
	
	public String getUserPname(){
		return this.userPname;
	}	
		
		
	private String userPwd;
		public void setUserPwd(String userPwd){
		//getData().put("user_pwd",userPwd);
		this.userPwd = userPwd;
	}
	
	public String getUserPwd(){
		return this.userPwd;
	}	
	 }

