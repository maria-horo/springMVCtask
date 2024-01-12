<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Zomato Ordering Food</h1>
	<form:form method="POST" action="orderingfood"
		modelAttribute="orderingfood" enctype="multipart/form-data">
		<table>
			<tr>
				<th><label>Food Name</label></th>
				<td><form:input type="text" path="foodName" /></td>
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