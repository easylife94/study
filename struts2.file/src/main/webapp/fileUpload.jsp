<%@ page contentType="text/html; charset=utf-8"  language="java"%>
<%@ page isELIgnored="false" %>
<% String path = request.getContextPath(); %>
<html>
	<body>
		<form action="<%=path %>/file/upload" enctype="multipart/form-data" method="post">
			源文件：<input name="file" type="file"/><br/>
			文件名：<input name="fileName" type="text"/>
			文件类型：<input name="fileType" type="text"/>
			<hr/>
			用户名：<input name="userName" type="text"/><br/>
			<input type="submit" value="上传"/>
		</form>
		<script type="text/javascript">
		var error = "${errorInfo}";
		if(error != ""){
			alert(error);
		}
		</script>
	</body>
</html>
