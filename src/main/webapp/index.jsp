<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product Discount</title>
</head>
<body>
<h1>Product Discount</h1>
<form action="/discount" method="post">
    <label>Information</label>
    <input type="text" name="information" placeholder="Enter product's information">
    <label>List Price</label>
    <input type="text" name="originPrice" placeholder=" Enter origin price">
    <label>Discount Percent</label>
    <input type="text" name="discount" placeholder="Enter discount">
    <input type="submit" value="Calculator">
</form>
</body>
</html>