<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="CheckboxServlet" method="get">
		<label><input type="checkbox" name="item" value="java"><span>java</span></label>
		<label><input type="checkbox" name="item" value="html"><span>html</span></label>
		<label><input type="checkbox" name="item" value="database"><span>database</span></label>
		<label><input type="checkbox" name="item" value="css"><span>css</span></label>
		<label><input type="checkbox" name="item" value="jsp"><span>jsp</span></label>
		<div><button>전송</button></div>
	</form>
</body>
</html>