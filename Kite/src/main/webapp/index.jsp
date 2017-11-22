<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<title>Insert title here</title>
<script type="text/javascript">
	
</script>
</head>
<body>
	<h1>Index</h1>
	<input type="button" onclick="<c:url value='viewUserList.do' />" value="CLICK"/>
	<c:url value='viewUserList.do' /><c:redirect url='viewUserList.do' />
</body>
</html>