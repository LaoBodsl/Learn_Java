<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="scripts/jquery-1.9.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#testJson").click(function(){
			var url = this.href;
			var args = {};
			$.post(url, args, function(data){
				for(var i = 0; i < data.length; i++){
					var id = data[i].id;
					var lastName = data[i].lastName;
					
					alert(id + ": " + lastName);
				}
			});
			return false;
		});
	})
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="emps">List all employee </a><br>
	<a href="testJson" id="testJson">Test Json</a>
	
	<br><br>
	
	<form action="testFileUpload" method="POST" enctype="multipart/form-data">
		File:<input type="file" name="file" />
		Desc:<input type="text" name="desc" />
		<input type="submit" name="Submit" />
	</form>
</body>
</html>