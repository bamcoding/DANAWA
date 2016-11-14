<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/view/header/header.jsp"></jsp:include>
<body class="dnw">
<script type="text/javascript">
</script>
<form	method="post" action="<c:url value="/doWrite"/>">
			
	<input type="text" name="subject" id="subject" placeholder="제목을 입력하세요."/>
	<br/>
	<textarea name="content" id="content" placeholder="내용을 입력하세요."></textarea>
	<br/>
	<input type="text" name="price" id="price" value="0"/>
	<br/>
	<input type="hidden" name="displayFileName"  value=" "/>
	<input type="hidden" name="realFileName"  value=" "/>
	<input type="submit" value="등록" />

</form>

</body>
</html>

