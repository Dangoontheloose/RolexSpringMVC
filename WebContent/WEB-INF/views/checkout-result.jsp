<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 5/14/2021
  Time: 1:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript">
    var count = 2;
    var redirect = "${pageContext.request.contextPath}/checkout";

    function countDown(){
        var timer = document.getElementById("timer");
        if(count > 0){
            count--;
            setTimeout("countDown()", 1000);
        }else{
            window.location.href = redirect;
        }
    }
</script>

<br>
<h1>Error when checking out: <strong>${error}</strong> Redirecting..</h1>
<span id="timer">
<script type="text/javascript">countDown();</script>
</span>
