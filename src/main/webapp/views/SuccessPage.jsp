<%@ include file="header.jsp" %>

<!--  this is the webpage which can be shown when the data has been stored in the database -->
<div class="container">
<div class="row">
			<div class="col-md-6">
				<c:if test="${successMsg!=null}">
					<div class="alert alert-success"><p><c:out value="${successMsg}"></c:out></p></div>
				</c:if>				
			</div>
		</div>

<a href="getAllEmployee" type="button" class="btn btn-primary" >Show All Employee Details</a>

</div>