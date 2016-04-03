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
                    <form action="/news" method="post">
                        <input type="hidden" value="${news.imageLink}" name="imageLink"/>
                        <input type="hidden" value="${news.topic}" name="topic"/>
                        <input type="hidden" value="${news.body}" name="body"/>
                        <c:if test="${!news.archiveStatus.equals('Archived')}">
                            <input type="submit" value="Add to archive" name="AddToArchiveButton"/>
                        </c:if>
                        <div class="archiveStatus"><c:out value="${news.archiveStatus}"></c:out></div>
                    </form>
                </div>
            </c:forEach>
        </div>
    </div>
</body>
</html>