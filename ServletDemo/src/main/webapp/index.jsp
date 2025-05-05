<%@page import="org.apache.catalina.core.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>This is servlet  project to learn all concept of the servlet </title>
<link rel="stylesheet" href="<%= application.getContextPath() %>/css/style.css">
 
</head>
<body>
 <div class="container">
    <%@ include file="menues.jsp" %>
    
    <h1>Welcome to the servlet index page</h1>
    <p>This is a servlet project</p>
    
    <form action="<%= application.getContextPath()  %>/third" method="post">
    <input type="text"  placeholder="Enter the text msg here" name="msg"/>
    <button type="submit">Submit</button>
    </form>
</div>

<script type="text/javascript" src="<%= application.getContextPath() %>/js/script.js"></script>

</body>
</html>