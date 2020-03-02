<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<form action="${pageContext.request.contextPath}/user/insert" modelAttribute="emp" method="post">
<body>  
   <table align="center">
   <tr>
   <th>Name:</th>
   <td><input type="text" name="name"></td>
   </tr>
   <tr>
   <th>Address:</th>
   <td><input type="text" name="address"></td>
   </tr>
   <tr>
   <th></th>
   <td><input type="submit" value="insert"></td>
   </tr>
   </table> 
</body> 
</form> 
</html>