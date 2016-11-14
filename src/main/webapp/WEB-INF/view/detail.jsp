<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/view/header/header.jsp"></jsp:include>
<script type="text/javascript">
$().ready(function(){
	$("#delBtn").click(function(){
		if(confirm("정말 삭제하시겠습니까?")){
			location.href="<c:url value='/delete/${danawa.id}'/>";
		}
	})
})

</script>
<body class="dnw">
<br/>
<br/>
<table>
<tr>
<th class="subject">제목</th><td>${danawa.subject }</td>
</tr>
<tr>
<th class="content">내용</th><td>${danawa.content }</td>
</tr>
<tr>
<th  class="subject">등록시간</th><td>${danawa.createdDate }</td>
</tr>
</table>
<br/><br/>
<input type="button" value="수정" onclick="location.href='<c:url value="/edit/${danawa.id}"/>'"/>
<input type="button" id="delBtn" value="삭제"/>
<input type="button" value="리스트보기" onclick="location.href='<c:url value="/list"/>'"/>
</body>
</html>