<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home Page</title>
</head>
<body>
	<center>
		<h1 style="color: red; text-align: center;">Employee Registration
			Form</h1>
		<form:form modelAttribute="emp">
			<table>
				<tr>
					<th>ENO</th>
					<td><form:input type="text" path="eno" /></td>
				</tr>
				<tr>
					<th>EName</th>
					<td><form:input type="text" path="ename" /></td>
				</tr>
				<tr>
					<th>EDesg</th>
					<td><form:input type="text" path="edesg" /></td>
				</tr>
				<tr>
					<th>Salary</th>
					<td><form:input type="text" path="salary" /></td>
				</tr>
				<tr>
					<th></th>
					<td><input type="submit" value="Register" /></td>
				</tr>
			</table>
		</form:form>
	</center>
</body>
</html>