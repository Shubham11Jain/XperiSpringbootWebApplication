
<%@ include file="header.jsp" %>

<div class="container">
<div class="row justify-content-center">
                    <div class="col-md-8">
                        <div class="card">
                            <div class="card-header">Add New Employee Details</div>
                            <div class="card-body">

					<form:form action="addEmployeeDetails" method="post" modelAttribute="employee">

                                    <div class="form-group">
                                        <label for="name" class="cols-sm-2 control-label">Employee Id</label>
                                        <div class="cols-sm-10">
                                            <div class="input-group">
                                            	<form:input type="number" path="empId" class="form-control"/>
												<form:errors path="empId" class="error"/>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="name" class="cols-sm-2 control-label">Employee Name</label>
                                        <div class="cols-sm-10">
                                            <div class="input-group">
                                            	<form:input path="empName" class="form-control"/>
                                            </div>
                                        </div>
                                    </div>
                                    
                                    <div class="form-group">
                                        <label for="name" class="cols-sm-2 control-label">Job Type</label>
                                        <div class="cols-sm-10">
                                            <div class="input-group">
                                            	<form:input path="jobType" class="form-control"/>
                                            </div>
                                        </div>
                                    </div>
                                    <input type="submit" value="Add Employee" class="btn btn-primary"/>
                                    <input type="reset" value="Reset" class="btn btn-danger"/>
                                     
                                     <br/>
                                     <br/>
                                    <div class="row">
										<div class="col-md-8">
				
												<form:errors path="jobType" class="alert alert-danger"/>
												<br/><br/>
												
												<form:errors path="empName" class="alert alert-danger"/>
												<c:if test="${errMsg!=null}">
										<div class="alert alert-danger"><p><c:out value="${errMsg}"></c:out></p></div>
												</c:if>
				
									</div>
									</div>
                                </form:form>
                              
                            </div>

                        </div>
                    </div>
                </div>

</div>
<br/>
<div class = "container" align="center">
<a href="getAllEmployee" type="button" class="btn btn-primary" >Show All Employee Details</a>
</div>

