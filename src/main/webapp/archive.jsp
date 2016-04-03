<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="style.css" rel="stylesheet">
</head>
<body>
<jsp:include page="/navigation.jsp" />
<div class="news_container">
    <div class="news">
        <c:forEach items="${requestScope.newsList}" var="news">
            <img src="${news.imageLink}" class="news_image"/>
            <div class="news_text">
                <h1><c:out value="${news.topic}"></c:out></h1>
                <div><c:out value="${news.body}"></c:out></div>
            </div>
        </c:forEach>
    </div>
</div>
</body>
</html>
