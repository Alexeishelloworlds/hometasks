<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags"%>
<html>
    <head>
        <title>Home</title>
        <%--Bootstrap ссылка--%>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    </head>
    <body>
        <h1><sp:message code="label.header"/></h1>
        <hr>
        <a href="/home?lang=en">ENG</a>
        <a href="/home?lang=ru">RUS</a>
        <hr>
        <%--Форма для добавления книги--%>
        <h2><sp:message code="label.title"/></h2>
        <form>
            <label for="addingAuthor"><sp:message code="label.searchfield1"/></label>
            <br>
            <input type="text" id="addingAuthor" name="author"> ${authorError}
            <br>
            <label for="addingTitle"><sp:message code="label.searchfield2"/></label>
            <br>
            <input type="text" id="addingTitle" name="title"> ${titleError}
            <br>
            <input type="submit" formmethod="post" formaction="/home/add" value="<sp:message code="label.addbutton"/>">
        </form>
        <hr>
        <table class="table table-hover">
            <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col"><sp:message code="label.tableheader1"/></th>
                <th scope="col"><sp:message code="label.tableheader2"/></th>
                <th scope="col"></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="book" items="${books}" varStatus="var">
                <tr>
                        <%--Вывод номера строки в первом столбце строки--%>
                    <th scope="row">${var.index + 1}</th>
                        <%--Вывод информации во втором столбце строки--%>
                    <td>${book.author}</td>
                        <%--Вывод информации в третьем столбце строки--%>
                    <td>${book.title}</td>
                        <%--Вывод кнопки удаления--%>
                    <td>
                        <form>
                            <button type='submit' class='btn btn-warning' formmethod='post' formaction='/home/delete' name='delete' value=${var.index}><sp:message code="label.deletebutton"/></button>
                        </form>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

    <%--Bootstrap ссылка--%>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
    </body>
</html>
