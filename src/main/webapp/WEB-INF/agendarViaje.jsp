<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

            <html>

            <head>
                <title>Ingresa tu viaje</title>
            </head>

            <body>
                <div>
                    <c:if test="${msgError != null}">
                        <c:out value="${msgError}"></c:out>
                    </c:if>
                    <form:form action="/viajes/registro" method="post" modelAttribute="viaje">
                        <form:label path="aerolinea">Aerolinea:</form:label>
                        <form:input path="aerolinea" />
                        <br>
                        <form:label path="destino">Destino:</form:label>
                        <form:input path="destino" />
                        <br>
                        <form:label path="distancia">Distancia:</form:label>
                        <form:input type="text" path="distancia" />
                        <br>
                        <input type="submit" value="Agendar Viaje">
                    </form:form>
                </div>
            </body>

            </html>