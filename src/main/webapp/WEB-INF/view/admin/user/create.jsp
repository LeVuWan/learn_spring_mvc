<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
<link href="../../../resources/css/createUser.css" rel="stylesheet">
<body>
	<div class="create-user">
		<h1 class="create-user__title">Create a user</h1>
		<form:form action="/admin/user/create" method="post" class="create-user__form" modelAttribute="newAUser">
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Email</label>
				<form:input type="email" class="form-control" path="email"/>
			</div>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Password</label>
				<form:input type="password" class="form-control" path="password"/>
			</div>
			<div class="mb-3">
				<label for="text" class="form-label">Phone number</label>
				<form:input type="number" class="form-control" path="phoneNumber"/>
			</div>
			<div class="mb-3"> 
				<label for="text" class="form-label">Full Name</label>
				<form:input type="text" class="form-control" path="fullName"/>
			</div>
			<div class="mb-3">
				<label for="text" class="form-label">Address</label>
				<form:input type="text" class="form-control" path="address"/>
			</div>
			<button type="submit" class="btn btn-primary">Create</button>
		</form:form>
	</div>
</body>
</html>