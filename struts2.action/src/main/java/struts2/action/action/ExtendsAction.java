package struts2.action.action;

import com.opensymphony.xwork2.ActionSupport;

public class ExtendsAction {
	public String execute(){
		System.out.println("进入ExtendsAction");
		return "my-index";
	}
}
