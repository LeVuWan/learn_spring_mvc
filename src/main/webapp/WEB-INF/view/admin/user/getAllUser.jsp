<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<link href="../../../resources/css/reset.css" rel="stylesheet">
<link href="../../../../resources/css/getAllUser.css" rel="stylesheet">
<body>
	<div class="table-users">
		<div class="table-users__header">
			<div class="table-users__title">Table users</div>
			<a class="table-users__create-user-button btn btn-primary" href='<spring:url value="/admin/user/create"/>'>Create
				a user</a>
		</div>
		<div class="table-users__table ">
			<table class="table table-users__table">
				<thead>
					<tr>
						<th>ID</th>
						<th>Email</th>
						<th>Fullname</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="user" items="${users}">
						<tr>
							<td>${user.id}</td>
							<td>${user.email}</td>
							<td>${user.fullName}</td>
							<td>
								<button class="btn btn-success btn-sm">View</button>
								<button class="btn btn-warning mx-2 btn-sm">Update</button>
								<button class="btn btn-danger btn-sm">Delete</button>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>