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
    <title>맴버 수정</title>
</head>
<body>
<form method="post" action="/p21/member/updateMember">
    <label for="">번호${member.userNo}</label><br>
    <input type="hidden" name="userNo" value="${member.userNo}">
    <label for="">아이디</label> : <input type="text" name="userId" value="${member.userId}"><br>
    <label for="">이름</label> : <input type="text" name="userName" value="${member.userName}"><br>
    <label for="">비번</label> : <input type="password" name="userPassword" value="${member.userPassword}"><br>
    <input type="submit" value="수정">
</form>
</body>
</html>
