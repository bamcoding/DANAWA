<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="/WEB-INF/view/header/header.jsp"></jsp:include>
<body id="DNW">
<script type="text/javascript">
</script>
<style>
#header{
	border-bottom : 1px solid gray;
	background:#f5f5f5;
	height: 40px;
	line-height: 40px; 
	text-align: center;
}

#header img{
	margin-left: 20px;
	vertical-align: middle;
}
#header input[type=text]{
	border : 2px solid #0275e2;
	height: 23px;
	width:250px;
	border-radius: 25px;
}

#header input[type=button]{
	color : white;
	background : #0275e2;
	border : 0px;	
	height: 30px;
	border-radius: 25px;
}
#menu {
	text-align:center;
	margin: 10px 0px 10px 0px;
	color : gray;
	font-size: 13px;
}
#menu input[type=text]{
	width:100px;
}
#menu input[type=button]{
	border:0px;
	background: gray;
	color: white;
}
#menu a{
	margin : 20px;
	color : gray;
	text-decoration: none;
}

#menu a:ACTIVE{
	font-weight: bold;
	color : black;
}

#menu a:hover{
	border-bottom : 1px solid gray;
}

#DNW table{
	border-collapse: collapse;
	width:900px;
	margin: auto;
	text-align: left;
}

#DNW table td:FIRST-CHILD{
	border-collapse: collapse;
	width:200px;
}
#DNW table td:LAST-CHILD{
	border-collapse: collapse;
	width:200px;
}

#DNW tr{
	border-top: 1px solid gray;
}

#DNW td a{
	font-weight: bold;
	font-size: 20px;
	text-decoration: none;
	color:black;
}
#DNW td a:HOVER{
	border-bottom:1px solid gray;
}

#DNW td #date{ 
	font-size: 12px;
}

#DNW td #price{ 
	font-size: 25px;
	color:#0275e2;
}

#content {
	text-align: center;
}

.mar20{
	margin: 20px;
}
#DNW {
	margin: auto;
}
</style>
<form id="searchForm">
<div id="header">
<img src="<c:url value="/img/d1.PNG"/>"/>
<input type="text" name="keyword" id="keyword" value="${searchVO.keyword }"/>
<input type="button" value="검색" onclick="movePage(0)"/>
</div>
<div id="menu">
<input type="hidden" name="align" id="align" value="${searchVO.align }"/>
<a href="javascript:movePage(0,'desc');">높은가격순</a>|
<a href="javascript:movePage(0,'asc');">낮은가격순</a>|
<a href="javascript:movePage(0,'new');">최신순</a>|
<input class="mar20" type="button" value="상품등록" onclick="location.href='<c:url value="/write"/>'"/>
|<span class="mar20">
<input type="text" name="startPrice" value="${searchVO.startPrice }"/>
~ 
<input type="text" name="endPrice" value="${searchVO.endPrice }"/>
<input type="button" id="priceSearchBtn" value="가격검색" onclick="movePage(0)"/>
</span>
</div>
<table>
<c:forEach var="danawaList" items="${danawaList.danawaList}">
	<tr>
		<td>
			<img src="<c:url value="/img/d2.PNG"/>"/>
		</td>
		<td>
			<a href="<c:url value="/detail/${danawaList.id}"/>">${danawaList.subject }</a>
		<br/><br/>
			<span id="date">등록월 : ${danawaList.createdDate}</span>
		</td>
		<td>
		<fmt:formatNumber type="currency" value="${danawaList.price}" var="price"/>
			<span id="price">${price}원</span>
		</td>
	</tr>
</c:forEach>
</table>
<div style="text-align: center;"> ${page }</div>
<hr/>
</form>

</body>
</html>

