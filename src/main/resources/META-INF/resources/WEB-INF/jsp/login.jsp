<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h1>Login Page</h1>
    <h2>${errorMessage}</h2>
    <form action="login" method="post">
        <label for="username">Username:</label><br/>
        <input type="text" id="username" name="username" required/><br/><br/>

        <label for="password">Password:</label><br/>
        <input type="password" id="password" name="password" required/><br/><br/>

        <button type="submit">Login</button>
    </form>
</body>
</html>