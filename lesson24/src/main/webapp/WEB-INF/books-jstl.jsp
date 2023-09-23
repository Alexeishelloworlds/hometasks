<%@ page import="java.util.List" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="by.teachmeskills.c23onl.alexeishchurko.task21.Book" %>
<%@ page import="by.teachmeskills.c23onl.alexeishchurko.task21.Database" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <meta charset="UTF-8">
        <title>Home</title>
        <style>
        h1 {
            text-align: center;
        }
        </style>
        <%--Bootstrap ссылка--%>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
        crossorigin="anonymous">
    </head>
    <body>
        <h1>Books</h1>
        <%--Форма для поиска книги--%>
        <h2>Searching</h2>
        <form>
            <label for="searchingAuthor">Enter author:</label>
            <br>
            <input type="text" id="searchingAuthor" name="searchingAuthor">
            <input type="submit" formmethod="post" formaction="/search" value="search book">
        </form>
        <hr>
        <%--Форма для добавления книги--%>
        <h2>Adding</h2>
        <form>
            <label for="addingAuthor">Author:</label>
            <br>
            <input type="text" id="addingAuthor" name="addingAuthor">
            <br>
            <label for="addingTitle">Title:</label>
            <br>
            <input type="text" id="addingTitle" name="addingTitle">
            <br>
            <input type="submit" formmethod="post" formaction="/add" value="add book">
        </form>
        <hr>
        <table class="table table-hover">
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Author</th>
                    <th scope="col">Title</th>
                    <th scope="col"></th>
                </tr>
            </thead>
            <tbody>
            <c:forEach var="book" items="${books}" varStatus="var">
                <tr>
                    <%--Вывод номера строки в первом столбце строки--%>
                    <th scope='row'>${var.index + 1}</th>
                    <%--Вывод информации во втором столбце строки--%>
                    <td>${book.author}</td>
                    <%--Вывод информации в третьем столбце строки--%>
                    <td>${book.title}</td>
                    <%--Вывод кнопки удаления--%>
                    <td>
                        <form>
                            <button type='submit' class='btn btn-warning' formmethod='post' formaction='/delete' name='delete' value=${var.index}>delete</button>
                        </form>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <%--Bootstrap ссылка--%>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
        crossorigin="anonymous"></script>
    </body>
</html>
