<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="navigation.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Adminisration</title>
</head>

<style>
body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    
}
.nav-container{
background-color: #00BFFF;
    width: 200px; 
    height: 86vh;
    overflow: hidden;
    display: flex;
    justify-content: space-between;
    align-items: left;
    padding: 0 10px;

}
.nav-container ul li{
float left
}
.nav-container ul {
    list-style-type: none; /* Noktaları kaldır */
    padding: 0;
    margin: 0;
    
}
.nav-container ul li a{
    display: block;
    color: white;
    text-align: center;
    padding: 14px 20px;
    text-decoration: none;
}
.nav-container ul li a:hover{
 background-color: #575757;
}
</style>
</head>

<body>

<h1>Administration</h1>

    <div class="nav-container">
    <ul>
      <li><a href="benutzeranlegen.jsp">Benutzer/Gruppe</a></li>
       <li><a href="mandatAnlegen.jsp">Mandat</a></li>
       <li><a href="benutzerAnlegen.jsp">Protokollieren</a></li>
    </ul>
</div>

</body>
</html>