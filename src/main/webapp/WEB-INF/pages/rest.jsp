<% request.setCharacterEncoding("UTF-8");%>
<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>REST</title>
    <style language="css" type="text/css">
        <%@include file="/WEB-INF/css/main.css"%>
    </style>
</head>
<body>
<div id="header" style="text-align: center;">
    <table>
        <tr>
            <td>
                <x-field>
                    <input name="enterData" type="text" id="suggest" class="input"
                           placeholder="Введите адрес или координаты">
                    <%--<span class="close" onclick="this.previousElementSibling.value = ''">&times;</span>--%>
                    <button class="close" onclick="this.previousElementSibling.value = ''" type="button"
                            id="buttonClose">DEL
                    </button>
                </x-field>
            </td>
            <td rowspan="2">
                <button type="button" id="button" onclick="myFunction()">Проверить</button>
            </td>
        </tr>
        <tr>
            <td>
                <copy-field>
                    <input name="notice" id="notice" type="text" size="50" class="input" readonly="readonly"
                           value="${notice}" placeholder="Вывод данных">
                    <%--                    <span class="close" onclick="copyFunction()">copy</span>--%>
                    <button class="close" onclick="copyFunction()" type="button" id="buttonCopy">COPY</button>
                </copy-field>
            </td>
        </tr>
    </table>

    <input name="artificialCache" id="artificialCache" type="hidden" value="${artificialCache}">
</div>

<script language="JavaScript" type="text/javascript">
    <%@include file="/WEB-INF/scripts/forRest.js"%>
</script>

<script charset="utf-8" src="https://yandex.st/jquery/2.2.3/jquery.min.js" type="text/javascript"></script>

</body>
</html>
