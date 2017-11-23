<%--
  Created by IntelliJ IDEA.
  User: helloz
  Date: 2017/11/22
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${now}
<hr>
${city.id}:${city.name}
<hr/>
<table style="width: 100%">
    <tr>
        <td>id</td>
        <td>名称</td>
        <td>人口</td>
    </tr>

<c:forEach items="${cities}" varStatus="stat" var="city">
    <tr>
        <td>${city.id}</td>
        <td>${city.name}</td>
        <td>${city.population}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>
