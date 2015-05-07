<%@include file="../../fragments/_taglibs.jsp" %>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta content="text/html; charset=ISO-8859-1" />
        <meta charset="ISO-8859-1" />
        <meta description="Generador de HTML" />
        <meta http-equiv="Cache-Control" content="must-revalidate" />
        <meta http-equiv="Cache-Control" content="no-cache" />
        <meta http-equiv="Pragma" content="no-cache" />
        <meta content="0" http-equiv="Expires" />
        <base href="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/" />
        <title><sitemesh:write property='title'/> </title>
    <sitemesh:write property='head'/>
</head>
<body>
    <h1>Hello World!</h1>
<sitemesh:write property='body'/>
</body>
</html>
