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
결과 ${userNo} :

<form method="post" action="#">
    <label for="">이름</label> : <input type="text" name="name" value="${userName}"><br>
    <label for="">아이디</label> : <input type="text" name="id" value="${userId}"><br>
    <label for="">비번</label> : <input type="password" name="password" value="${password}"><br>
    <input type="submit" value="등록">
</form>

</body>
</html>
