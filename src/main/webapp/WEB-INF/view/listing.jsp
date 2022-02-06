<jsp:include page="header.jsp"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<table class="table">
    <thead>
        <tr>
            <th>FirstName</th>
            <th>LastName</th>
            <th>Phone</th>
            <th>BloodGroup</th>
            <th>Address</th>
        </tr>
    </thead>
    <body>
        <c:if test="${personList.size() > 0 }">
            <c:forEach var="p" items="${personList}" varStatus="status">
                 <tr>
                       <td>${p.firstName}</td>
                       <td>${p.lastName}</td>
                       <td>${p.bloodGroup}</td>
                       <td>${p.phone}</td>
                       <td>${p.address}</td>
                 </tr>
            </c:forEach>
        </c:if>
    </body>
    </table>
</html>
<jsp:include page="footer.jsp"/>