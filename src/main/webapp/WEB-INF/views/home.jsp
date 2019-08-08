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
				<th>Name</th><th>Invented</th><th>Year</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="inventor" items="${inventors}">
				<tr>
				 
					<td>${inventor.name}</td>
					<td>${inventor.invented}</td>
					<td>${inventor.year}</td>
					
					
				</tr>
				</c:forEach>
			</tbody>
		</table>
		
		 <p><a href= "/complete">Complete List</a> </p>

</body>
</html>