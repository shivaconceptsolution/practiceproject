<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="" method="post">
<input type="text" name="t1" placeholder="Enter first number" />
<br><br>
<input type="text" name="t2" placeholder="Enter second number" />
<br><br>
<input type="submit" name="btn" value="Addition" />

</form>

<%
  if(request.getParameter("btn")!=null)
  {
   int a,b,c;
   a = Integer.parseInt(request.getParameter("t1"));
   b = Integer.parseInt(request.getParameter("t2"));
   c=a+b;
   out.print(c);
  }

%>
</body>
</html>