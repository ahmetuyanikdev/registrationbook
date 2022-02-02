<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<jsp:include page="header.jsp"/>
<html>
    <body>

        <div class="col-md-12">
               <div class="col-md-2"><h3><a href="${pageContext.request.contextPath}/registration">New Registration</a></h3></div>
               <div class="col-md-2"><h3><a href="${pageContext.request.contextPath}/listing">List All</a></h3></div>
        </div>

    </body>
</html>
<jsp:include page="footer.jsp"/>