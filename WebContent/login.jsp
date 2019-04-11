<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>Veuillez vous authentifier</title>
        <link rel='stylesheet' type='text/css' href='style.css' />
    </head>
    <body>
        <img src="https://secure.ybonline.co.uk/resources/98ef9668-8b70-4893-b33a-bab28d6692b2/YB_GooglePay_RGB_Desktop+lockup_407x147px.png">

        <h1>Veuillez vous authentifier !</h1>
    
     
    
        <form method="post" action="controller">
            <label for='txtLogin'>Login</label>
            <input id='txtLogin' name='txtLogin' type='text' value='${login}' autofocus /> <br/>
            <label for='txtPassword'>Password</label>
            <input name='txtPassword' type='password' value='${password}' /> <br/>
            <br/>
            <input name='btnConnect' type='submit' class="bouton"/> <br/>
        </form>     
    </body>
</html>