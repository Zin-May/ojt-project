<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page pageEncoding="UTF-8"%>

<%@include file="common/header.jsp"%>

<h3>Upload Poster</h3>
<br />

<form:form method="post" action="/movie/save_poster"
	enctype="multipart/form-data">

	<input type="file" name="poster_path" />
	<br />
	<br/>

	<button type="submit" class="btn btn-primary">Next</button>

</form:form>

<%@include file="common/footer.jsp"%>

