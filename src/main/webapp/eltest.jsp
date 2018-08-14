<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: yx
  Date: 2018/8/14
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
${i}
<table>
<tr>
<c:forEach items="${list}" var="item" varStatus="idx">
    <td>${item}</td>
</c:forEach>
</tr>
</table>
</body>
</html>
