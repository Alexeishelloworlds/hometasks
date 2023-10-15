<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Home</title>
        <%--Bootstrap ссылка--%>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    </head>
    <body>
        <h1>Books</h1>
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
            <input type="submit" formmethod="post" formaction="/home" value="add book">
        </form>
        <hr>

    <%--Bootstrap ссылка--%>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
    </body>
</html>
