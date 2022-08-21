
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>FILMS</title>
</head>
<body>
<h2> Films </h2>
<table>
    <tr>
    <tr> id </tr>
    <tr> title </tr>
    <tr> year </tr>
    <tr> genre </tr>
    <tr> watched </tr>
    <tr> action </tr>
    </tr>

    <c:forEach
            var = "film" items="${filmList}">
        <tr>
            <td> ${film.id}</td>
            <td> ${film.title}</td>
            <td> ${film.year}</td>
            <td> ${film.genre}</td>
            <td> ${film.watched}</td>
            <td>
                <a href="/edit/${film.id}">edit</a>
                <a href="/edit/${film.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
<h2> Add </h2>
<c:url value="/add" var="add"/>
<a href="${add}">Add new film</a>
</body>
</html>
