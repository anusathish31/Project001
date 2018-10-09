<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create User</title>
</head>
<body style="background-color:#ffffff;">
	<h1 align="center">Employee Creation Screen</h1>
	<br>
	<br>
	<form>
	<!-- <h1>Welcome ${username}</h1> -->
	<h1 style=color:red> ${errmsg} </h1>
		<table bgcolor="white" ><!-- style="width:100%" "#b3ffff"> -->
			<tr>
				<td valign=top >First Name:</td>
				<td><input type="text" name="firstName" required></td>
				<td valign=top>Last Name:</td>
				<td><input type="text" name="lastName"></td>
			</tr>
			<tr>
				<td valign=top>Gender:</td>
				<td><input type="radio" name="gender" value="male">Male
					<input type="radio" name="gender" value="female">female	
				</td>
			<!-- </tr>
			<tr> -->
				<td valign=top>Job Title:</td>
				<td><input type="text" name="jobTitle" required></td>
			</tr>
			<tr>
				<td valign=top>Address Line 1:</td>
				<td><input type="text" name="addLine1"></td>
			</tr>
			<tr>
				<td valign=top>Address Line 2:</td>
				<td><input type="text" name="addLine2"></td>
			</tr>
			<tr>
				<td valign=top>City:</td>
				<td><input type="text" name="city" value="Chennai"></td>
			<!-- </tr>
			<tr>-->
				<td valign=top>State:</td>
				<td><input type="text" name="state" value ="Tamil Nadu"></td>
			</tr>
			<tr>
				<td valign=top>Country:</td>
				<td><input type="text" name="country" value="India"></td>
			<!--  </tr>
			<tr>-->
				<td valign=top>ZipCode:</td>
				<td><input type="text" name="zipcode"></td>
			</tr>
			<tr>
				<td valign=top>Phone Number:</td>
				<td><input type="text" name="phoneNum" required pattern="[0-9]{10}" ></td>
			<!-- </tr>
			<tr> -->
				<td valign=top>Alternate Phone Number:</td>
				<td><input type="text" name="altPhoneNumame"></td>
			</tr>
			<tr>
				<td valign=top>Date of Birth:</td>
				<td><input type="date" name="bday"></td>
			<!-- </tr>
			<tr> -->
				<td valign=top>Blood group:</td>
				<!-- <td><input type="text" name="bloodGroup"></td> -->
				<td><select name="bloodGroup">
						<option>O+ve</option>
						<option>O-ve</option>
						<option>A+ve</option>
						<option>A-ve</option>
						<option>B+ve</option>
						<option>B-ve</option>
						<option>AB+ve</option>
						<option>AB-ve</option>
				</select></td>
			</tr>
			<tr>
				<td><label>Date</label>
				<td><input type="text" name="date" /><br>
			</tr>
			</table><br><br><br>
			<!-- <input type="submit" value="Submit" style="width: 300px; margin: 0 auto;" /> -->
			<div style="text-align:center">  
   		    <input type="submit" value="Submit" style='width:100px;margin:0 50%;position:relative;left:-50px;'/>  
			</div>
					
		
	</form>
</body>
</html>