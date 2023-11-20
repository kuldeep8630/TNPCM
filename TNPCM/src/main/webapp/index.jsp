<%@page import="java.sql.Connection"%>
<%-- <%@page import="com.DB.DConnect"%> --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


    <style>
        .mp {
            display: flex;
            flex-direction: column;
            align-items: center;
            background-color: #008B8B;
            margin: 0px;
            padding: 20px;
            animation: backgroundAnimation 55s linear infinite;
        }
        /* @keyframes backgroundAnimation {
  0% {
    background-color: aqua;
  }\
  25% {
    background-color: blue;
  }
  50% {
    background-color: green;
  }
  75% {
    background-color: pink;
  }
  100% {
    background-color: orange;
  }
} */

        .container {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
            max-width: 1000px;

        }

        .box {
            width: 250px; 
            height: 100px; 
            background-color: #F0FFFF;
            text-align: center;
            text-decoration: blink;
            text-decoration-color: black;
            text-align: bottom;
            border: black;
            border-color:black;
            border-width:10px;
            padding: 20px;
            margin: 10px;
            transform-style: preserve-3d;
            transition: transform 0.5s;
        }

        p {
            margin: 0;
        }

        .box:hover {
            transform: rotateY(15deg) scale(1.15);
            box-shadow: 15px 15px 20px rgba(0, 0, 0, 0.2);
            background-color: #F5F5F5;
        }
	header {
	background-color: #333;
	color: #fff;
	text-align: center;
	padding: 8px;
}
        /* header {
        	width:cover;
            text-align: center;
            background-color: navajowhite;
            color: black;
            padding: 8px;
           } */

        footer {
			background-color: #333;
	color: #fff;
	text-align: center;
	padding: 6px;
	margin-bottom:0px;
            text-align: center;
            margin-top: 80px;
            
            

        }
    </style>
</head>
<body>
    <header>
        <h1>Training and Placement Cell Management</h1>
    </header>
    <h3> </h3>
    <div class="mp">
  
    
    <div class="container">
        <div class="box">
            <p><a href="companies.jsp"><h2>Companies Info</h2></a></p>
        </div>
        <div class="box">
            <p><a href="#"><h2>Training Institutes</h2></a></p>
        </div>
        <div class="box">
            <p><a href="#"><h2>Course Entry</h2></a></p>
        </div>
        <div class="box">
            <p><a href="student.jsp"><h2>Student Entry</h2></a></p>
        </div>
        <div class="box">
            <p><a href="#"><h2>Interns Scheduling</h2></a></p>
        </div>
        <div class="box">
            <p><a href="report.jsp"><h2>Generate Reports</h2></a></p>
        </div>
        <div class="box">
            <p><a href="about.jsp"><h2>About</h2></a></p>
        </div>
   
        </div>
        </div>
    <footer>
        <p>&copy; 2023 My Web Page</p>
    </footer>

</body>
</html>