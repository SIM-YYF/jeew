<%--
  Created by IntelliJ IDEA.
  User: yuanwenfei
  Date: 2015/5/14
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form name="formLogin" id="formLogin" action="loginController.do?login" method="post">
  <div>
    <ul class="uibutton-group">
      <li><a href="javascript:void(document.form.submit())" id="but_login">登陆</a></li>
      <li><a href = "javascript:" onclick ="add('c','c');">登陆2</a></li>
    </ul>
  </div>
  </form>

<script type="text/javascript">
  function add(key,value)
  {
//    document.getElementById("argform").submit();
    document.form.submit();
    //document.argform.submit();
    //document.getElementById("argsubmit").click();
  }
</script>

</body>
</html>
