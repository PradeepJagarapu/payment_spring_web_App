<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Bank Account</title>
    <style>
        /* General styles */
        body {
            font-family: 'Segoe UI', Arial, sans-serif;
            background-color: #eef2f7;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .container {
            background-color: #ffffff;
            border: 2px solid #007bff;
            border-radius: 15px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            padding: 30px;
            width: 350px;
            text-align: center;
        }
        h2 {
            color: #007bff;
            margin-bottom: 25px;
            font-size: 24px;
        }
        .form-group {
            margin-bottom: 20px;
        }
        .form-group label {
            display: block;
            color: #333;
            margin-bottom: 8px;
            font-weight: bold;
        }
        .form-group input {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 8px;
            box-sizing: border-box;
            background-color: #f9f9f9;
        }
        .form-group input:focus {
            border-color: #007bff;
            outline: none;
            background-color: #e6f0ff;
        }
        .submit-button {
            background-color: #007bff;
            color: white;
            border: none;
            padding: 12px 20px;
            border-radius: 8px;
            cursor: pointer;
            font-size: 16px;
            font-weight: bold;
            transition: all 0.3s ease;
            width: 100%;
        }
        .submit-button:hover {
            background-color: #0056b3;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.2);
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Add Bank Account</h2>
        <form action="${pageContext.request.contextPath}/add-bank-account" method="post">
            <div class="form-group">
                <label for="bankName">BANK NAME:</label>
                <input type="text" id="bankName" name="bankName" required>
            </div>
            <div class="form-group">
                <label for="accountNumber">ACCOUNT NUMBER:</label>
                <input type="text" id="accountNumber" name="accountNumber" required>
            </div>
            <div class="form-group">
                <label for="ifscCode">IFSC CODE:</label>
                <input type="text" id="ifscCode" name="ifscCode" required>
            </div>
            <div class="form-group">
                <label for="branchLocation">BRANCH:</label>
                <input type="text" id="branchLocation" name="branchLocation" required>
            </div>
            <div class="form-group">
                <label for="currentBalance">CURRENT BALANCE:</label>
                <input type="number" id="currentBalance" name="balance" step="0.01" required>
            </div>
            <button type="submit" class="submit-button">Submit</button>
        </form>
    </div>
</body>
</html>