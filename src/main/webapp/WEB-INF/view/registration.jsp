<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<jsp:include page="header.jsp"/>
<html>
    <body>
        <div class="col-md-12">
            <form:form method="POST" 
                action="/registration" modelAttribute="person">
             <table class="table" style="width:50%;">
                <tr>
                    <td><form:label path="firstName">First Name</form:label></td>
                    <td><form:input path="firstName" class="form-control"/></td>
                </tr>
                <tr>
                    <td><form:label path="lastName">Last Name</form:label></td>
                    <td><form:input path="lastName" class="form-control"/></td>
                </tr>
                <tr>
                    <td><form:label path="bloodGroup">Blood Group</form:label></td>
                    <td><form:input path="bloodGroup" class="form-control"/></td>
                </tr>
                <tr>
                    <td><form:label path="phone">Contact Number</form:label></td>
                    <td><form:input path="phone" class="form-control"/></td>
                </tr>
                <tr>
                    <td><form:label path="address">address</form:label></td>
                    <td><form:input path="address" class="form-control"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Save" class="btn btn-primary"/></td>
                </tr>
            </table>
        </form:form>
        </div>
    </body>
</html>
<jsp:include page="footer.jsp"/>