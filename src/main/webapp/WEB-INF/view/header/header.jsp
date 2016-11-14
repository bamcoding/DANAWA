<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="<c:url value="/js/jquery-3.1.1.min.js"/>"></script>
<title>다나와</title>
</head>
<style>
body {
	margin : 0px;
}
.dnw form{
	text-align: center;
	margin-top:30px;
}

.dnw textarea{
	margin:10px;
	height :300px;
	width: 300px;
}
.dnw textarea:FOCUS {
	border:2px solid #0275e2;
}
.dnw input[type=text]{
	margin:10px;
	width: 300px;
}
.dnw input[type=text]:FOCUS {
	border:2px solid #0275e2;
}
.dnw table{
	border-collapse:collapse;
	border:1px solid black;
	margin: auto;
	height:300px;
}

.dnw table td {
	text-align: left;
	padding: 20px 20px 20px 20px;
}

.dnw table tr:not(last-child){
	margin: auto;
	border-bottom: 1px solid black;
	
}
.dnw {
	text-align: center;
}
.subject{
	height :50px;
	border-right: 1px dashed gray;
}

.content{
	height : 250px;
	border-right: 1px dashed gray;
}
</style>