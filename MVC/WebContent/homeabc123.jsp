<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
    
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
hello <c:out value="${requestScope.ub.firstName } ${requestScope.ub.lastName }"></c:out>
<iframe	name = "content" width="20%" height="25%"></iframe>
<iframe	name = "dsa" width="20%" height="25%" src="toc123.jsp" ></iframe>
</body>
</html>