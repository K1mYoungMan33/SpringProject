<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
<c:forEach var="item" items="${listMembers}">
    <tr>
        <td>${item.userNo}</td>
        <td>${item.userId}</td>
        <td>${item.userName}</td>
        <td>${item.userPassword}</td>
    </tr>
</c:forEach>
</table>


<script src="https://code.jquery.com/jquery-latest.min.js"></script>
<script>
    gv = [];
    $(document).ready(function(){
        $("table").on( "click", "tr", function(event){
            let firstCellValue = $(this).find("td:first").text();
            let shiftPressed = event.shiftKey;

            if ( !shiftPressed )
                window.location = "updateMember?userNo=" + firstCellValue;
            else
                window.location = "deleteMember?userNo=" + firstCellValue;
        })
    });
</script>

</body>
</html>
