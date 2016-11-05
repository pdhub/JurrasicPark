<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Dinosaur Page</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
<h1>
	Lets rent some dinosaurs
</h1>

<h2>Add some new Dinos here</h2>
<c:url var="addAction" value="/dinosaur/add" ></c:url>

<br>
<h3>Nearby dinosaurs</h3>
<c:if test="${!empty listdinos}">
	<table class="tg">
	<tr>
		<th width="80">Dinosaur ID</th>
		<th width="120">Dinosaur Name</th>
		<th width="120">Dinosaur Type</th>
		<th width="120">Dinosaur Place</th>
		<th width="120">Dinosaur Location</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listdinos}" var="dinosaur">
		<tr>
			<td>${dinosaur.dinosaurId}</td>
			<td>${dinosaur.dinosaurName}</td>
			<td>${dinosaur.dinousaurType}</td>
			<td>${dinosaur.dinosaurPlace}</td>
			<td>${dinosaur.dinosaurLocation}</td>
			<td><a href="<c:url value='/edit/${person.id}' />" >Edit</a></td>
			<td><a href="<c:url value='/remove/${person.id}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>
