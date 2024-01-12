<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <h1>Zomato Ordering Food</h1>
          <form:form method="PUT" action="updateFood" modelAttribute="orderingfood" >
				<table>
					<tr>
						<th><label>id</label></th>
						<th><form:input type="text" path="id" /></th>
					</tr>
					<tr>
						<th><label>Food Name</label></th>
						<td><form:input type="text" path="foodName" />
						<form:errors path="foodName" /></td>
					</tr>
					<tr>
						<th><label>Address</label></th>
						<th><form:input type="text" path="address" /></th>
					</tr>
					<tr>
						<th colspan=2><input type="submit" value="book" /></th>
					</tr>
				</table>
			</form:form>

</body>
</html>