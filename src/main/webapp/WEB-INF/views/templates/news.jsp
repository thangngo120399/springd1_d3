<%@ include file="/common/taglib.jsp"%>
<%@ taglib uri  = "http://tiles.apache.org/tags-tiles" prefix = "tiles"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Xtra Blog</title>

<c:url value="/resources"
	var="contentPath" scope="application"></c:url>
<c:set value="<%=request.getContextPath() %>"
	var="contextPath" scope="application"></c:set>	
<link rel="stylesheet" href="${contentPath }/fontawesome/css/all.min.css">
<!-- https://fontawesome.com/ -->
<link
	href="https://fonts.googleapis.com/css2?family=Source+Sans+Pro&display=swap"
	rel="stylesheet">
<!-- https://fonts.google.com/ -->
<link href="${contentPath }/css/bootstrap.min.css" rel="stylesheet">
<link href="${contentPath }/css/templatemo-xtra-blog.css"
	rel="stylesheet">


</head>
<body>

	<tiles:insertAttribute name="leftbar"></tiles:insertAttribute>

	<div class="container-fluid">
		<main class="tm-main">
			<tiles:insertAttribute name="search"></tiles:insertAttribute>
			<tiles:insertAttribute name="body"></tiles:insertAttribute>
			<tiles:insertAttribute name="footer"></tiles:insertAttribute>
		</main>

	</div>
	<script src="${contentPath }/js/jquery.min.js"></script>
	<script src="${contentPath }/js/templatemo-script.js"></script>
</body>

</html>