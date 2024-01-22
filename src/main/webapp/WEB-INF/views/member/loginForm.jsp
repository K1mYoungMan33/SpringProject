<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2024-01-17
  Time: 오전 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/user/login">
    <label >번호</label> : <input type="text" name="userNo"><br>
    <label >아이디</label> : <input type="text" name="userId"><br>
    <label >이름</label> : <input type="text" name="userName"><br>
    <label >비번</label> : <input type="password" name="password"><br>
    <input type="submit" value="등록">
</form>

</body>
</html>
