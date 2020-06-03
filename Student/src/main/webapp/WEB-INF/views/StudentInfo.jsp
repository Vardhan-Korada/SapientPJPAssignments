<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.sapient.student.Student" %>
<!DOCTYPE html>
<html>
<head>
	<title>Student Information</title>
	<link rel="stylesheet" type="text/css" href="/css/styling.css">
</head>

<body>
		<h3>Student Information</h3>
		<form method="get" action="/student">
			<label for="sid">Student Id: </label>
			<input type="text" name="sid" id="sid" autofocus>
		</form>
		<div>
			<p>Name:<c:if test="${not empty name}">${name}</c:if></p>
			<p>Id:<c:if test="${not empty id}">${id}</c:if></p>
			<p>DOB:<c:if test="${not empty dob}">${dob}</c:if></p>
			<p>Branch:<c:if test="${not empty branch}">${branch}</c:if></p>
		</div>
</body>
</html>