<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<c:set var="num" value="100">
</c:set>

<c:out value="hello !@#$% 특수문자도 된데요." default="value가 null일때 사용"></c:out>
${name }
<h1>${num}</h1>

<c:if test = "${empty num2}">
    <h1>num2 true</h1>
</c:if>

<c:choose>
    <c:when test="${num != ''}">
        <h2>${num} is true</h2>
    </c:when>
    <c:otherwise>
        <h2>num is null</h2>
    </c:otherwise>
</c:choose>

<c:forEach var="i" begin="1" end="10" step="1">
    <p>${i}</p>
</c:forEach>

<c:forTokens var="abc" items="ccc/aaa/ccc/ddd" delims="/"></c:forTokens>
<h3>abc => ${abc}</h3>
</body>
</html>


