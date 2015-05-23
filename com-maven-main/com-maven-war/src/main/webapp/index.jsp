<%@ taglib prefix="test" uri="http://java.maven.com/test"%>
<html>
<body>
	<h2>${test:hello('Khanh')}</h2>
	<test:helloTag var="helloTag" />
	<h2>${helloTag}</h2>
</body>
</html>
