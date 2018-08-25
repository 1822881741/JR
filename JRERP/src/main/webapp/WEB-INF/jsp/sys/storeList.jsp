<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="/WEB-INF/tld/c.tld" prefix="c"%>
<%@ taglib uri="/WEB-INF/tld/fn.tld" prefix="fn"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE>
<html>
<head>
<base href="<%=basePath %>">
<link rel="stylesheet" href="resource/layui/css/layui.css" media="all">
<script src="resource/layui/layui.js"></script>
<title>Insert title here</title>
</head>
<body>
<table>
	<c:forEach var="store" items="${storeList }">
		<tr><td>${store.shopName }</td></tr>
	</c:forEach>
</table>

</body>
<script>
layui.use([ 'layer', 'form' ], function() {
	var layer = layui.layer, form = layui.form;
	 var $ = layui.jquery;
});
</script>
</html>