<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/21
  Time: 9:12
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>本地认证</title>
</head>
<body>
<div id="localAuth" class="float-div" style="display: none;">
    <table>
        <tr>
            <td valign="top">本次申请/审批时限截止：</td>
            <td><input type="text" size="28" value="" name="time_end"
                       id="time_end_id" /></td>
        </tr>
        <%--<tr>
            <td valign="top">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
            <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
        </tr>--%>
        <tr>
            <td valign="top">审批状态：</td>
            <td><input type="text" size="28" value="" name="approval_status"
                       id="approval_status" /></td>
        </tr>
        <tr>
            <td valign="top">申请人账号：</td>
            <td><input type="text" size="28" value="" name="appli_account"
                       id="appli_account" /></td>
        </tr>
        <tr>
            <td valign="top">申请人密码：</td>
            <td><input type="text" size="28" value="" name="appli_pwd"
                       id="appli_pwd" /></td>
        </tr>
        <tr>
            <td> </td>
            <td>
                <input type="submit" name="submit" value="认证" />
                <input type="button" name="close" value="关闭" />
            </td>
        </tr>
    </table>
</div>
</body>
</html>
