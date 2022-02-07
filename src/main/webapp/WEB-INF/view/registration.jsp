<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false" %>
<jsp:include page="header.jsp"/>
<html>
    <body>
        <div class="col-md-12">
            <form:form method="POST" 
                action="/registration" modelAttribute="person" accept-charset="utf-8">
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
                    <td><form:label path="address">Address</form:label></td>
                    <td><form:input path="address" class="form-control"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Save" class="btn btn-primary"/>
                    </td>
                </tr>
            </table>
        </form:form>
        </div>
    </body>
    <tfoot>
        <tr>
            <td colspan="5">
            <c:choose>
                <c:when test="${statusMessage=='Saved'}">
                    <div class="col-md-12"><h2><label class="label label-success">${statusMessage}</label></h2></div>
                </c:when>
                <c:otherwise>
                   <div class="col-md-12"><h2><label class="label label-error">${statusMessage}</label></h2></div>
                </c:otherwise>
            </c:choose>
            </td>
        <tr>
    </tfoot>
</html>
<jsp:include page="footer.jsp"/>