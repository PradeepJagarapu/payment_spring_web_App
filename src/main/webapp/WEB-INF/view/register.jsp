<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Registration</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f2f2f2;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .form-container {
            background: #fff;
            padding: 30px;
            border-radius: 15px;
            box-shadow: 0 4px 10px rgba(0,0,0,0.1);
            width: 400px;
        }
        h1 {
            text-align: center;
            color: #333;
        }
        input[type="text"],
        input[type="password"],
        input[type="email"],
        input[type="tel"] {
            width: 100%;
            padding: 12px;
            margin: 8px 0;
            border: 1px solid #ccc;
            border-radius: 8px;
            box-sizing: border-box;
        }
        button {
            width: 100%;
            padding: 12px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 8px;
            cursor: pointer;
            font-weight: bold;
        }
        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

    <div class="form-container">
        <h1>Register</h1>
        <form action="${pageContext.request.contextPath}/register" method="post" >
            <input type="text" name="userName" placeholder="Username" required>
            <input type="text" name="firstName" placeholder="First Name" value="firstName" required>
            <input type="text" name="lastName" placeholder="Last Name" value="lastName" required>
            <input type="password" name="password" placeholder="Password" value="password" required>
            <input type="password" name="confirmPassword" placeholder="Confirm Password" value="password" required>
            <input type="text" name="address" placeholder="Address" value="MVP" required>
            <input type="tel" name="phoneNumber" placeholder="Phone Number" pattern="[0-9]{10}" value="6562165486" required>
            <input type="email" name="email" placeholder="Email" value="firstName@gmail.com" required>
            <button type="submit">Register</button>
        </form>
    </div>

</body>
</html>
