<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
    <div class="menucontainer">
        <ul>
            <li>
                <a href="<%= application.getContextPath() %>/index.jsp">Home</a>
            </li>
            <li>
                <a href="<%= application.getContextPath() %>/about.jsp">About</a>
            </li>
            <li>
                <a href="<%= application.getContextPath() %>/service.jsp">Service</a>
            </li>
        </ul>
    </div>
</body>
</html>
