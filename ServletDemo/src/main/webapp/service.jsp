<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>This is service page</title>
<link rel="stylesheet" href="<%= application.getContextPath() %>/css/style.css">
</head>
<body>
 <div class="container">
 
    <%@ include file="menues.jsp" %>
    
     <h1>WelCome to the servlet services page </h1>
     
     <p>This is servlet project </p>
     
     
  </div> 
  <script type="text/javascript" src="<%= application.getContextPath() %>/js/script.js"></script>
  
</body>
</html>