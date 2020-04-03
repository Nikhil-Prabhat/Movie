<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body style="background-color: lavender">
	<h1>
		<center>Movie Ticket Booking</center>
	</h1>
	<form:form action="calculateCost" method="post"
		modelAttribute="ticket">

		<table>
			<tr>
				<td>Movie Name</td>
				<td><form:input path="movieName" id="movieName" /></td>

			</tr>

			<tr>
				<td>Choose Circle:</td>
				<td><form:select path="circleType" id="circleType">
				<form:options items="${circleList}"/>
				</form:select></td>

			</tr>

			<tr>
				<td>Number of tickets</td>
				<td><form:input path="noOfTickets" id="noOfHours" /></td>

			</tr>

			<tr>
				<td><form:button type="submit" name="submit">CalculateCost</form:button></td>
			</tr>



		</table>



	</form:form>


</body>
</html>
