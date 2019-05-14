<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="springmvc/testModelAttribute" method="post">
<input type="hidden"  name="id" value="1"/>
username:<input type="text" name="username" value="Tom" />
<br>
email:<input type="text" name="email" value="laobo@qq.com"/>	
<br>
age:<input type="text" name="age" value="12"/>
<br>
<input type="submit" value = "Submit" />
</form>

<form action="springmvc/testMethod" method="post">
	<input  type="submit" value="submit"/>
</form>
	
	<a href="helloworld">hello world</a>
	<a href="springmvc/testRequestParam?username=laobo&age=25">testRequestParam</a>
</body>
</html>