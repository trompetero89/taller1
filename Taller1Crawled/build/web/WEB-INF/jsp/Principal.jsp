<%-- 
    Document   : Principal
    Created on : 27-ago-2017, 16:35:54
    Author     : PABLO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


	<h2>Listado de Facultades y departamentos</h2>
	<c:if test="${not empty lists}">
            <select name="Facultad">
	        <c:forEach var="listValue" items="${lists}">
		    <option>${listValue}</option>
	        </c:forEach>
	    </select>
	</c:if>
        <p class="Boton_Contultar"><input type="submit" value="Consultar"></p> 
        <link></link>


