<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String username = request.getSession().getAttribute("username").toString(), sessionID = request.getSession().getId();
	%>
	UserName:
	<%=username%><br /> Current session:
	<%=sessionID%><br /> memberArea!!
	<form action="<%=request.getContextPath()%>/MemberAreaController"
		method="get">
		<input type="hidden" name="action" value="logout" /> <input
			type="submit" value="logout" />
	</form>
	<a
		href="<%=request.getContextPath()%>/MemberAreaController?action=memberOnly">Member
		Only</a>
</body>
</html>