<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Result Page</title>
</head>
<body>
	<center>
		<h1 style="color: red; text-align: center;">Employee Information</h1>
		<table border="1">
			<tr>
				<th>ENO</th>
				<td>${employee.eno}</td>
			</tr>
			<tr>
				<th>EName</th>
				<td>${employee.ename}</td>
			</tr>
			<tr>
				<th>EDesg</th>
				<td>${employee.edesg}</td>
			</tr>
			<tr>
				<th>Salary</th>
				<td>${employee.salary}</td>
			</tr>
		</table>
	</center>
</body>
</html>