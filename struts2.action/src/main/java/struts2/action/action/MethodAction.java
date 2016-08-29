package struts2.action.action;

public class MethodAction {
	
	private String dynmMethod;
	
	public String execute() throws Exception {
		System.out.println("执行默认的excute方法");
		return "success";
	}
	
	public String dymMethod1(){
		dynmMethod = "动态方法--1";
		System.out.println("执行动态方法--1");
		return "success";
	}
	public String dymMethod2(){
		dynmMethod = "动态方法--2";
		System.out.println("执行动态方法--2");
		return "success";
	}
	/** Getter && Setter **/
	public String getDynmMethod() {
		return dynmMethod;
	}

	public void setDynmMethod(String dynmMethod) {
		this.dynmMethod = dynmMethod;
	}
	
	
}
