<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home Page</title>
</head>
<body>
	<center>
		<%-- <h1>Name is ${name}</h1>
		<h1>Age is ${age}</h1>
		<h1>Team is ${team}</h1>
		
		<c:forEach var="country" items="${countryNames}">
			${country}<br />
		</c:forEach>
		<br/>
		<c:forEach var="subject" items="${subjectList}">
			${subject}<br />
		</c:forEach>
		<br/>
		<c:forEach var="mobile" items="${mobileSet}">
			${mobile}<br />
		</c:forEach>
		<br/>
		<c:forEach var="ids" items="${idsMap}">
			${ids}<br />
		</c:forEach> --%>
		<table border="1">
			<tr>
				<th>ENO</th>
				<th>EName</th>
				<th>EDesg</th>
				<th>ESal</th>
			</tr>
			<c:forEach var="emp" items="${empList}">
				<tr>
					<td>${emp.eno}</td>
					<td>${emp.ename}</td>
					<td>${emp.edesg}</td>
					<td>${emp.salary}</td>
				</tr>

			</c:forEach>
		</table>

	</center>

</body>
</html>