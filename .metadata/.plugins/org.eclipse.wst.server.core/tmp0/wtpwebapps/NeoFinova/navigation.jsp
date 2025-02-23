<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NeoFinova</title>
</head>
<style>
body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
}

/* Navbar stil ayarları */
.navbar {
    background-color: #00BFFF;
    overflow: hidden;
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding: 0 20px;
}


.navbar ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    display: flex;
}

/* Menü öğeleri */
.navbar ul li {
    float: left;
}

/* Link stilleri */
.navbar ul li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 20px;
    text-decoration: none;
}

.navbar ul li a:hover {
    background-color: #575757;
}


.abmelden {
    margin-left: auto;
}

.abmelden a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 20px;
    text-decoration: none;
    background-color: red;
    border-radius: 5px;
}

.abmelden a:hover {
    background-color: red;
}
</style>
</head>

<body>

<nav class="navbar">
        <ul>
            <li><a href="administration.jsp">Administration</a></li>
            <li><a href="#">Pfändung</a></li>
            <li><a href="#">Server</a></li>
            <li><a href="#">Druck</a></li>
            <li><a href="#">Testseite</a></li>
        </ul>
        <div class="abmelden">
        <a href="abmelden">Abmelden</a>
    </div>
    </nav>

</body>
</html>