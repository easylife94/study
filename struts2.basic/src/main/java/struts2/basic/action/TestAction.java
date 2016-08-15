package struts2.basic.action;

public class TestAction {
	
	public String helloWorld(){
		System.out.println("进入 TestAction类，并执行了helloWorld方法");
		return "success";
	}
}
