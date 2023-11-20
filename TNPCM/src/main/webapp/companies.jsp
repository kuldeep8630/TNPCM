<!DOCTYPE html>
<html>
<head>
<title>Companies Hiring Details Entry</title>
<style>
body {
	font-family: Arial, sans-serif;
	margin: 0;
	padding: 20px;
	background-color: #f0f0f0;
}

.container {
	max-width: 800px;
	margin: 0 auto;
	background-color: #fff;
	padding: 20px;
	border-radius: 5px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

h1 {
	text-align: center;
}

form {
	display: flex;
	flex-direction: column;
}

label {
	font-weight: bold;
}

input[type="text"], input[type="email"], input[type="number"], textarea
	{
	margin-bottom: 10px;
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 5px;
	font-size: 16px;
}

input[type="submit"] {
	background-color: #0078d4;
	color: #fff;
	padding: 10px 20px;
	border: none;
	border-radius: 5px;
	font-size: 18px;
	cursor: pointer;
}
</style>
</head>
<body>
	<div class="container">
		<h1>Companies Hiring Details Entry</h1>
		<form action="submit_hiring_details.php" method="post">
			<label for="companyName">Company Name:</label> <input type="text"
				id="companyName" name="companyName" required> <label
				for="jobTitle">Job Title:</label> <input type="text" id="jobTitle"
				name="jobTitle" required> <label for="jobDescription">Job
				Description:</label>
			<textarea id="jobDescription" name="jobDescription" rows="4" required></textarea>

			<label for="location">Location:</label> <input type="text"
				id="location" name="location" required> <label for="salary">Salary:</label>
			<input type="number" id="salary" name="salary" required> <label
				for="contactEmail">Contact Email:</label> <input type="email"
				id="contactEmail" name="contactEmail" required> <input
				type="submit" value="Submit">
		</form>
	</div>
</body>
</html>