<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询商品列表</title>
</head>
<body> 
<form action="${pageContext.request.contextPath }/item/query.action" method="post">
查询条件：
<table width="100%" border=1>
<tr>
<td>商品ID：<input type="text" name="item.id"/></td><td>商品名称：<input type="text" name="item.name"/></td>
<td><input type="submit" value="查询"/></td>
</tr>
</table>
</form>
商品列表：
  <form action="${pageContext.request.contextPath}/item/delete" method="post">  
 <%-- <form action="${pageContext.request.contextPath}/item/update" method="post">  --%>
<table width="100%" border=1>
<tr>
	<td><input type="checkbox"></td>
	<td>商品名称</td>
	<td>商品价格</td>
	<td>生产日期</td>
	<td>商品描述</td>
	<td>操作</td>
</tr>
<c:forEach items="${itemList }" var="item" varStatus="s">
<tr>
	<td><input type="checkbox" name="ids" value="${item.id}"></td>
	<td><input type="hidden" name="itemList[${s.index}].id" value="${item.id}">
	<input type="text" name="itemList[${s.index}].name" value="${item.name }"/></td>
	<td><input type="text" name="itemList[${s.index}].price" value="${item.price }"/></td>
	<td><fmt:formatDate value="${item.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	<td>${item.detail }</td>
	
	<%-- <td><a href="${pageContext.request.contextPath }/item/edit.action?id=${item.id}">修改</a></td> --%>
<td><a href="${pageContext.request.contextPath }/item/edit/${item.id}">修改</a></td>
</tr>
</c:forEach>

</table>
  
<input type="submit" value="删除">

<!-- <input type="submit" value="修改"> -->
</form>
</body>

</html>