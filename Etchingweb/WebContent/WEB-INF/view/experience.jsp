<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Experience</title>
</head>
<body>
<h1>Experience Data</h1>
<form:form action="/etchingitt" method="post" modelAttribute="experience">
	<table>
		<tr>
			<td>Experience ID</td>
			<td><form:input path="experienceid" /></td>
		</tr>
		<tr>
			<td>Title</td>
			<td><form:input path="title" /></td>
		</tr>
		<tr>
			<td>Company</td>
			<td><form:input path="company" /></td>
		</tr>
		<tr>
			<td>Location</td>
			<td><form:input path="location" /></td>
		</tr>
		<tr>
			<td>from month year </td>
			<td><form:input path="frommonthyear" /></td>
		</tr>
		<tr>
			<td>to month year</td>
			<td><form:input path="tomonthyear" /></td>
		</tr>
		<tr>
			<td>description</td>
			<td><form:input path="description" /></td>
		</tr>
		<tr>
			<td>upload</td>
			<td><form:input path="upload" /></td>
		</tr>
		<tr>
			<td>id</td>
			<td><form:input path="id" /></td>
		</tr>
		
		<tr>
			<td colspan="2">
			<input type="submit" value="experience">
				<input type="submit" name="action" value="Add" />
				<input type="submit" name="action" value="Edit" />
				<input type="submit" name="action" value="Delete" />
				<input type="submit" name="action" value="Search" />
			</td>
		</tr>
	</table>
</form:form>
<br>
<table border="1">
	<th>ID</th>
	<th>title</th>
	<th>company</th>
	<th>location</th>
	<th>from</th>
	<th>to</th>
	<th>description</th>
	<th>upload</th>
	<th>id</th>
	<c:forEach items="${experienceList}" var="experience">
		<tr>
			<td>${experience.experienceid}</td>
			<td>${experience.title}</td>
			<td>${experience.company}</td>
			<td>${experience.location}</td>
			<td>${experience.frommonthyear}</td>
			<td>${experience.tomonthyear}</td>
			<td>${experience.description}</td>
			<td>${experience.upload}</td>
			<td>${experience.id}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>