<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page pageEncoding="UTF-8"%>

<%@include file="common/admin_header.jsp"%>

<h3>Upload Trailer</h3>
<br />

<div class="row">

	<%@include file="common/admin_side.jsp"%>

	<div class="col-10">
	
		<form:form 
			method="post"
			action="/admin/movie/create/save_trailer"
			enctype="multipart/form-data"
		>
		
			<input type="file" name="trailer" />
			<br/>
			<br/>
		
			<button type="submit" class="btn btn-primary">Next</button>
		
		</form:form>

	</div>
	
</div>

<%@include file="common/footer.jsp"%>

