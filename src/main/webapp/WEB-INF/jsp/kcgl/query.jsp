<%@ page contentType="text/html;charset=UTF-8"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<title>后台管理</title>
<%@ include file="/common/meta.jsp"%>
<%@ include file="/common/easyuilibs.jsp"%>

<script type="text/javascript" src="<%=basePath%>js/common.js"></script>
<script language="javascript" type="text/javascript" src="<%=basePath %>js/calendar/WdatePicker.js"></script>
<base href="<%=basePath%>">
<script type="text/javascript">
	$(function() {
		nobackpace();
		var id = window.parent.$("#id").val();
		var kclx = window.parent.$("#kclx").val();
		$("#id").val(id);
		$("#kclx").val(kclx);
	});

	function query() {
		var id = $("#id").val();
		var kclx = $("#kclx").val();
		window.parent.$("#id").val(id);
		window.parent.$("#kclx").val(kclx);
		closeWindow2();
	}
	
	function reset(){
		$("#id").val('');
		$("#kclx").val('');
		window.parent.$("#id").val('');
		window.parent.$("#kclx").val('');
	
	}
</script>
</head>
<body>
	<form id="form" method="post">
		<table width="99.5%" border="0" cellpadding="1" cellspacing="1"
			class="table">
			
			<tr class="line">
				<td align='right' width="20%" class="title1">id</td>
				<td align='left'><input type="text" name="id" id="id"
					class="easyui-textbox" style="width: 80%;" /></td>
					<td align='right' width="20%" class="title1">课程类型</td>
				<td align='left'><input type="text" name="kclx" id="kclx"
					class="easyui-textbox" style="width: 80%;" /></td>
			</tr>
		
		</table>
		<div align="center">
			<a href="javascript:void(0)" id="submit" iconcls="fa fa-search"
				class="easyui-linkbutton" onclick="query();">查询</a>
			<a href="javascript:void(0)" id="submit" iconcls="fa fa-refresh"
				class="easyui-linkbutton" onclick="reset();">重置</a>
			<a href="javascript:void(0)" id="submit" iconcls="fa fa-times-circle"
			class="easyui-linkbutton" onclick="closeWindow2();">关闭</a>
		</div>
	</form>
</body>
</html>