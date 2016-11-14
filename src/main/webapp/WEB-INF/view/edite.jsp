<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/view/header/header.jsp"></jsp:include>
<body class="dnw">
<form method="post" action="<c:url value="/doEdit"/>">
	<input type="hidden" name="id" value="${danawa.id }">
	<input type="text" name="subject" id="subject" value="${danawa.subject }"/><br/>
	<textarea name="content" id="content">${danawa.content }</textarea><br/>
<input type="submit" id="addBtn" value="등록" />
</form>
</body>
</html>

