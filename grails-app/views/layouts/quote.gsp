<!--layout page for quote views -->
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>QOTD &raquo; <g:layoutTitle/></title>      %{--Merges the title of the target page with rightShift operator--}%
    <g:external dir="css" file="snazzy.css"/>   %{--Creates link to css file--}%
    <g:layoutHead/>       %{--Merges head element of target page--}%
    <r:layoutResources/>    %{--Merges in Javascript, css and other resources from target page--}%
</head>

<body>
    <div id="header">
        <g:img dir="images" file="logo.png" alt="logo"/>
    </div>
    <g:layoutBody/> %{--Merges body elements from target page--}%
</body>
</html>