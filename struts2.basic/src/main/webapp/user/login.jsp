<%@ page contentType="text/html; charset=utf-8"  language="java"%>
<%@ page isELIgnored="false" %>
<% String path = request.getContextPath(); %>
<html>
<body>
<form action="<%=path %>/user/login">
用户名：<input type="text" name="userName"/><br/>
密码：<input type="password" name="password"/><br/>
<input type="submit" value="登录"/>
</form>

<script type="text/javascript">
var error = '${errorInfo}';
if(error != ''){
	alert(error);
}
</script>
</body>
</html>
