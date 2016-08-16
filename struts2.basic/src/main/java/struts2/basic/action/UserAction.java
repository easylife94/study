package struts2.basic.action;

public class UserAction {
	
	/**
	 * 所有请求的参数可以封装到Action中作为Action的属性
	 * 记得每个属性都要可以被访问的--如果设置为private则应该设置getter和setter方法
	 */
	
	 private String userName;
	 public String password;
	 
	 private String errorInfo;
	
	/**
	 * 用户登录请求
	 * @return
	 */
	public String login(){
		//如果用户名和密码为null前往登录页面
		if(userName == null && password == null){
			return "page";
		}
		
		if("admin".equals(userName)&&"passwd".equals(password)){
			return "success";
		}else{
			//错误则设置错误信息，并返回到登录页面
			errorInfo = "用户名或密码错误！";
			return "page";
		}
		
		
		
	}
	
	/**  getter && setter **/
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(String errorInfo) {
		this.errorInfo = errorInfo;
	}
	
	
	
}
