<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Xtra Blog</title>
	
		<c:url value= "${pageContext.request.contextPath }/resources" var = "contentPath" scope="application"></c:url>
	<link rel="stylesheet" href="fontawesome/css/all.min.css"> <!-- https://fontawesome.com/ -->
	<link href="https://fonts.googleapis.com/css2?family=Source+Sans+Pro&display=swap" rel="stylesheet"> <!-- https://fonts.google.com/ -->
    <link href="${contentPath }/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contentPath }/css/templatemo-xtra-blog.css" rel="stylesheet">

<!--
    
TemplateMo 553 Xtra Blog

https://templatemo.com/tm-553-xtra-blog

-->
</head>
<body>
	
	leftbar
	
	<div class="container-fluid">
        <main class="tm-main">
        	header
        	
        	body
        	
        	footer
       </main>
        
     </div>
	 <script src="${contentPath }/js/jquery.min.js"></script>
    <script src="${contentPath }/js/templatemo-script.js"></script>
</body>

</html>