<%@ include file="header.jsp" %>

<div class="container">

	<div class="row">
			<div class="col-md-6">
				<c:if test="${successMsg!=null}">
					<div class="alert alert-success"><p><c:out value="${successMsg}"></c:out></p></div>
				</c:if>				
			</div>
		</div>

<table class="table table-hover">
<thead>
<tr class="table-primary">
<th scope="col">Employee ID</th>
<th scope="col">Name</th>
<th scope="col">Job Type</th>
</tr>
</thead>
<c:forEach items="${employeeList}" var="employee">
<tbody>
    <tr>
        <td> <c:out value="${employee.empId}"/></td>
        <td> <c:out value="${employee.empName}"/></td>
        <td> <c:out value="${employee.jobType}"/> </td>
        
    </tr>
</tbody>

</c:forEach>

</table>

</div>

<br/>
<hr/>
<br/>
