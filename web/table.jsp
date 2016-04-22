<%--
  Created by IntelliJ IDEA.
  User: kivavs
  Date: 22/04/2016
  Time: 12:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table class="search-results-table child-classes-table"
       id="search-results-table">
    <c:forEach items="${firstname}" var="firstname">
        <tr>
            <td>${firstname}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
