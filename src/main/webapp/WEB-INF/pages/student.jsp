<%@ include file="/WEB-INF/pages/includes.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Students Manipulations</h1>

	<p>Student data</p>
	<form:form action="student.do" method="POST" commandName="student">
		<table>
			<tr>
				<td>Student ID</td>
				<td><form:input path="studentId"></form:input></td>
			</tr>
			<tr>
				<td>First Name</td>
				<td><form:input path="firstname"></form:input></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><form:input path="firstname"></form:input></td>
			</tr>
			<tr>
				<td>Year</td>
				<td><form:input path="year"></form:input></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" name="action" value="Add" />
					<input type="submit" name="action" value="Edit" /> <input
					type="submit" name="action" value="Delete" /> <input type="submit"
					name="action" value="Search" /></td>
			<tr>
		</table>
	</form:form>
	<br>
	<p>Student List</p>
	<table>
		<tr>
			<th>Student ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Year Level</th>
		</tr>
		<c:forEach items="${studentList}" var="student">
			<tr>
				<td>${student.studentId}</td>
				<td>${student.firstname}</td>
				<td>${student.lastname}</td>
				<td>${student.year}</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>