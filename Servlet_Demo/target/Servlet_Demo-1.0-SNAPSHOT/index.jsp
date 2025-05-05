<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
    <link rel="stylesheet" href="<%= application.getContextPath()%>/css/style.css">
</head>
<body>
<div class="container">
    <%@ include file="menu.jsp" %>

    <h1> Welcome to the servlet welcome page </h1>
    <p> This is code/project for how to create a servlet and there way</p>
    <form action="<%= application.getContextPath() %>/third" method="post">
        <label>
          Enter text = <input name="msg" placeholder="please enter here..." type="text"/>
        </label>

        <button type="submit" >submit third servlet </button>
    </form>
</div>

<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Home</a>
</body>
</html>