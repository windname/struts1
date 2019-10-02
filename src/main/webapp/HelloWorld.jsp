<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>




<html>
<head>
</head>
<body>
<h1><bean:write name="helloWorldForm" property="message" />
</h1>



<html:form action="/helloWorld" method="post"  enctype="multipart/form-data">
			Name: <html:text property="message" /> <br>
			<input type="file" name="upload" />
			<html:submit property="submit" value="Send"/>


		</html:form>


</body>
</html>