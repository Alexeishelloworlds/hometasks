<%@ page import="java.util.List" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="by.teachmeskills.c23onl.alexeishchurko.task20.Book" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

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
                <%
                    List<Book> books = (List<Book>) request.getAttribute("books");
                    if (books != null) {
                        for (int i = 0; i < books.size(); i++) {
                            out.println("<tr>");

                            // Вывод номера строки в первом столбце строки
                            out.println("<th scope='row'>" + (i + 1) + "</th>");

                            // Вывод информации во втором столбце строки
                            out.println("<td>");
                            out.println(books.get(i).getAuthor());
                            out.println("</td>");

                            // Вывод информации в третьем столбце строки
                            out.println("<td>");
                            out.println(books.get(i).getTitle());
                            out.println("</td>");

                            // Вывод кнопки удаления
                            out.println("<td>");

                            out.println("<form>");
                            out.println( "<button type='submit' class='btn btn-warning' formmethod='post' formaction='/delete' name='delete' value="+ i + ">delete</button>");
                            out.println("</form>");

                            out.println("</td>");

                            out.println("</tr>");
                        }
                    }
                %>
            </tbody>
        </table>
    <%--Bootstrap ссылка--%>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
    crossorigin="anonymous"></script>
    </body>
</html>