<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"  type="text/css" href="css/style.css">
<title>Registration</title>
</head>
<body>
<center>
<form:form action="registerStudent.do" method="post" commandName="student">
<div id="tablewrap">
<table>
<tr><td align="center" colspan="3"><h1>Student Registration Form</h1></td></tr>
<tr>
<td><p>Student ID:</td>
<td><form:input path="sid" size="35"/></td>
<td><form:errors path="sid"/></td>
</tr>
<tr>
<td>Name:</td>
<td>
<form:input path="sname" size="35"/></td>
<td><font color=red size=3><form:errors path="sname"/></font></td>
</tr>
<tr>
<td>Email ID:</td>
<td><form:input path="email" size="35"/></td>
<td><font color=red size=3><form:errors path="email"/></font></td>
</tr>
<tr>
<td>Phone No:</td>
<td><form:input path="phone" size="35"/></td>
<td><font color=red size=3><form:errors path="phone"/></font></td>
</tr>

<tr>
<td>Suitable Timings:</td>
<td>
<form:checkbox path="timings" value="07.30AM -09.30 AM"/>07.30AM -09.30 AM<br>
<form:checkbox path="timings" value="10.30AM -02.30 PM"/>10.30AM -02.30 PM<br>
<form:checkbox path="timings" value="04.00PM -06.00 PM"/>04.00PM -06.00 PM<br>
<form:checkbox path="timings" value="04.00PM -06.00 PM"/>06.30PM -07.30 PM<br>
<form:checkbox path="timings" value="Weekends"/>Weekends (Corporate)<br>
</td>
<td><font color=red size=3><form:errors path="timings"/></font></td>
</tr>

<tr>
<td>Gender:</td>
<td>
<form:radiobutton path="gender" value="Male"/>Male<br>
<form:radiobutton path="gender" value="Female"/>Female<br>
</td>
<td><font color=red size=3><form:errors path="gender"/></font></td>
</tr>

<tr>
<td>Qualification:</td>
<td>
<form:select path="qualification">
<form:option value="---Select Options---"></form:option>
<form:option value="M.Sc"></form:option>
<form:option value="B.Sc"></form:option>
<form:option value="M.C.A."></form:option>
<form:option value="M.Tech"></form:option>
<form:option value="B.Tech"></form:option>
</form:select>
</td>
<td><font color=red size=3><form:errors path="qualification"/></font></td>
</tr>

<tr>
<td>Remarks</td>
<td>
<form:textarea path="remarks" rows="5" cols="35"/>
</td>
<td><font color=red size=3><form:errors path="remarks"/></font></td>
</tr>

<tr>
<td align="center" colspan="3">
<input type="submit" value="Submit Now"/>
</td>
</tr>

</table>
<br>
</div>
</form:form>
</center>
</body>

</html>