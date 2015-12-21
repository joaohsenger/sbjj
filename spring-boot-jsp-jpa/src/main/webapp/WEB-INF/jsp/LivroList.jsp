<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
    <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
<title>Insert title here</title>
</head>
<body>

<div class="generic-container">
        <div class="panel panel-default">
              <!-- Default panel contents -->
            <div class="panel-heading"><span class="lead">List of Livros </span></div>
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>Nome</th>
                        <th>Autor</th>
                        <th>Classificação</th>
                        <th>Ano</th>
                        <th width="100"></th>
                        <th width="100"></th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach items="${livros}" var="livro">
                    <tr>
                        <td>${livro.nome}</td>
                        <td>${livro.escritor}</td>
                        <td>${livro.classificacao}</td>
                        <td>${livro.anoedicao}</td>
                        <td><a href="<c:url value='/edit-user-${livro.Id}' />" class="btn btn-success 
 
custom-width">edit</a></td>
                        <td><a href="<c:url value='/delete-user-${livro.Id}' />" class="btn btn-danger 
 
custom-width">delete</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
        <div class="well">
            <a href="<c:url value='/newuser' />">Add New Livro</a>
        </div>
    </div>


</body>
</html>