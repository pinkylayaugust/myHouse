<%--
    Licensed to the Apache Software Foundation (ASF) under one or more
    contributor license agreements.  See the NOTICE file distributed with
    this work for additional information regarding copyright ownership.
    The ASF licenses this file to You under the Apache License, Version 2.0
    (the "License"); you may not use this file except in compliance with
    the License.  You may obtain a copy of the License at
   
         http://www.apache.org/licenses/LICENSE-2.0
   
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
--%>
<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title><bean:message key="welcome.title"/></title>
<html:base/>
</head>
<body bgcolor="white">

<logic:notPresent name="org.apache.struts.action.MESSAGE" scope="application">
  <font color="red">
    ERROR:  Application resources not loaded -- check servlet container
    logs for error messages.
  </font>
</logic:notPresent>

<link rel="stylesheet" type="text/css" href="/myHouse/pages/style.css"/>
 <div id="wrapper">
 <div class="header"><marquee><img src='/myHouse/image/logo.jpeg' width=70px height=70px></marquee><h4><marquee>PMS Real Estate Service မွၾကိဳဆိုပါသည္</marquee></h4>
<marquee><h4> Phone No: 09-43098621,09-428013834,09257998588&nbsp;&nbsp;&nbsp;Email:pmsestate2009@gmail.com</h4></marquee>
</div>
<div class="menu">
<html:form action="/admi" method="post">
Email:<html:text property="email"/>
Password<html:password property="psw"/>
<html:submit property="Sign Up" value="Sign Up House Information"/>
</html:form>
</div>
<div class="footer"><br>
<left><a href="/myHouse/jsp/aboutus.jsp">About</a>&nbsp;|&nbsp;
    <a href="/myHouse/jsp/contactus.jsp">Contact Us</a>&nbsp;|&nbsp;</left>
    <br><br><h2><center>
သင္သိခ်င္ေသာ စာရင္းကို search button ကိုနွိပ္ျပီးရွာေဖြနိုင္ပါသည္။
<br><br><br>
<form action="/myHouse/jsp/search.jsp" name="form1" method="get">
<input type="submit" value="Search">
</form>
</center></h2>
<br><center><%@include file="Slideshow.html" %></center>
</div>
<div class="bottom"><h2><center>Thank you for visiting my website</center></h2></div>
</div>
</body>
</html:html>
