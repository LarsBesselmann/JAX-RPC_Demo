<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JAX-RPC Demo</title>
<link title="Style" href="<%=request.getContextPath()%>/WEB-INF/css/result.css"
	type="text/css" rel="stylesheet">
</head>
<body>
	<div class='outputResult' style='word-wrap: break-word;'>
		
		<c:out value="${responseMessage}" default="" escapeXml="true" />
	</div>
	<br />
	<form action="<%=request.getContextPath()%>/DemoRPCServlet"
		target='_self' method='POST'>
			<td height="100%" width="20%" valign="top">
				<table cellpadding="10" cellspacing="10">
					<tr>
						<td>
							<div>Personal Info Web Service: </div>
						</td>
					</tr>
					<tr>
						<td>
							<div>
								First Name: <input type='text' name='firstName' />
							</div>
						</td>
					</tr>
					<tr>
						<td>					
							<div>
								Last Name: <input type='text' name='lastName' />
							</div>
						</td>
					</tr>
					<tr>
						<td>	
							<div>
								<input type='submit' name='submit' />
							</div>
						</td>
					</tr>
			</table>
	</form>
	<form action="<%=request.getContextPath()%>/DemoRPCServlet"
		target='_self' method='POST'>
			<td height="100%" width="20%" valign="top">
				<table cellpadding="10" cellspacing="10">
					<tr>
						<td>
							<div class='outputResult'>
								First Name:
								<c:out value="${firstName}" default="" />
							</div>
							</td>
					</tr>
					<tr>
						<td>
							<div class='outputResult'>
								Last Name:
								<c:out value="${lastName}" default="" />
							</div>
							</td>
					</tr>
					<tr>
						<td>
							<div class='outputResult'>
								Place Of Birth :
								<c:out value="${placeOfBirth}" default="" />
							</div>
							</td>
					</tr>
					<tr>
						<td>
							<div class='outputResult'>
								Age :
								<c:out value="${age}" default="" />
							</div>
						</td>
					</tr>
				</table>
		<br />
	</form>
</body>
</html>