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
	$("#kcmc").textbox('setValue','${kcxx.kcmc}');
	$("#kcxs").textbox('setValue','${kcxx.kcxs}');
	$("#kclx").textbox('setValue','${kcxx.kclx}');
	$("#xfen").textbox('setValue','${kcxx.xfen}');
	$("#kkxq").textbox('setValue','${kcxx.kkxq}');
	$("#syxs").textbox('setValue','${kcxx.syxs}');
	$("#sfsyjx").textbox('setValue','${kcxx.sfsyjx}');
	$("#sfsjlkc").textbox('setValue','${kcxx.sfsjlkc}');
	$("#kkxy").textbox('setValue','${kcxx.kkxy}');

});
function save(){
	$('#form').form('submit',{    
	    url:'<%=basePath%>kcgl/editSave',    
	    onSubmit: function(){    
			showProcess(false,"修改课程","正在修改课程，请稍候...");
	    },    
	    success:function(data){ 
	    	showProcess(false,"修改课程","正在修改课程，请稍候...");
	    	var data = eval('(' + data + ')');
	    	if(data.retCode=="1"){
	    		msgShow('提示',data.retMsg,'info');
	    	}else if(data.msg=="2"){
	    		msgShow('提示',data.retMsg,'info');
	    	}else{
	    		msgShow('提示',data.retMsg,'error');
	    	}
	    	closeWindow2(); 
	    }    
	});  
}
</script>
</head>
<body>
	<form id="form" method="post">   
    <input type="hidden" id="id" name="id" value="${kcxx.id}" />

	<table width="99.5%" border="0" cellpadding="1" cellspacing="1" class="table">
		<tr class="line">
			<td align='center'  colspan="4">
				<span class="tableTitle">课&nbsp;&nbsp;程&nbsp;&nbsp;修&nbsp;&nbsp;改</span></td>
		</tr>
		
		<tr class="line">
			<td align='right' width="15%" class="title1">kcmc</td>
			<td align='left' colspan="3"><input type="text" name="kcmc" id="kcmc" class="easyui-textbox" data-options="required:true" style="width:70%;"/></td>
		</tr>
		<tr class="line">
			<td align='right' width="15%" class="title1">kcxs</td>
			<td align='left' colspan="3"><input type="text" name="kcxs" id="kcxs" class="easyui-textbox" data-options="required:true" style="width:70%;"/></td>
		</tr>
		<tr class="line">
			<td align='right' width="15%" class="title1">kclx</td>
			<td align='left' colspan="3"><input type="text" name="kclx" id="kclx" class="easyui-textbox" data-options="required:true" style="width:70%;"/></td>
		</tr>
		<tr class="line">
			<td align='right' width="15%" class="title1">xfen</td>
			<td align='left' colspan="3"><input type="text" name="xfen" id="xfen" class="easyui-textbox" data-options="required:true" style="width:70%;"/></td>
		</tr>
		<tr class="line">
			<td align='right' width="15%" class="title1">kkxq</td>
			<td align='left' colspan="3"><input type="text" name="kkxq" id="kkxq" class="easyui-textbox" data-options="required:true" style="width:70%;"/></td>
		</tr>
		<tr class="line">
			<td align='right' width="15%" class="title1">syxs</td>
			<td align='left' colspan="3"><input type="text" name="syxs" id="syxs" class="easyui-textbox" data-options="required:true" style="width:70%;"/></td>
		</tr>
		<tr class="line">
			<td align='right' width="15%" class="title1">sfsyjx</td>
			<td align='left' colspan="3"><input type="text" name="sfsyjx" id="sfsyjx" class="easyui-textbox" data-options="required:true" style="width:70%;"/></td>
		</tr>
		<tr class="line">
			<td align='right' width="15%" class="title1">sfsjlkc</td>
			<td align='left' colspan="3"><input type="text" name="sfsjlkc" id="sfsjlkc" class="easyui-textbox" data-options="required:true" style="width:70%;"/></td>
		</tr>
		<tr class="line">
			<td align='right' width="15%" class="title1">kkxy</td>
			<td align='left' colspan="3"><input type="text" name="kkxy" id="kkxy" class="easyui-textbox" data-options="required:true" style="width:70%;"/></td>
		</tr>
		
		
	</table>
	<div align="center">
		<a href="javascript:void(0)" id="submit" iconcls="fa fa-floppy-o" class="easyui-linkbutton" onclick="save();">保存</a>
		<a href="javascript:void(0)" id="submit" iconcls="fa fa-times-circle" class="easyui-linkbutton" onclick="closeWindow();">关闭</a>
	</div>
</form>
</body>
</html>