<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
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
		<form method="post">
			<table>
				<tr>
					<th>ENO</th>
					<td><input type="text" name="eno" /></td>
				</tr>
				<tr>
					<th>EName</th>
					<td><input type="text" name="ename" /></td>
				</tr>
				<tr>
					<th>EDesg</th>
					<td><input type="text" name="edesg" /></td>
				</tr>
				<tr>
					<th>Salary</th>
					<td><input type="text" name="salary" /></td>
				</tr>
				<tr>
					<th></th>
					<td><input type="submit" value="Register" /></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>