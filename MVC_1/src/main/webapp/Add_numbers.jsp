<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Addition</title>
</head>
<body>
<form action="add" method="post">
<pre>
   number1<input type="text" name="n1"/>
   number2<input type="text" name="n2"/>
   <input type="submit" value="add"/> 
   
   <%
   if(request.getAttribute("n")!=null){
	   out.println(request.getAttribute("n"));
   }
   
   %>
</pre>
</form>
</body>
</html>