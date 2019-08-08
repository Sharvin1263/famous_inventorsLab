<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table class="table">
			<thead>
				<tr>
				<th>First Name</th><th>Last Name</th><th> Innovation </th><th>Year</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="inventor" items="${innovation}">
				<tr>
				 
					<td>${inventor.firstName}</td>
					<td>${inventor.lastName}</td>
					<td>${inventor.innovation}</td>
					<td>${inventor.year}</td>
					
					
				</tr>
				</c:forEach>
			</tbody>
		</table>

 <p><a href= "/">Tiny List</a> </p>
</body>
</html>