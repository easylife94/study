package struts2.action.action;

import com.opensymphony.xwork2.ActionSupport;

public class ControllerAction extends ActionSupport{
	@Override
	public String execute() throws Exception {
		System.out.println("进入ControllerAction控制器");
		return super.execute();
	}
}
