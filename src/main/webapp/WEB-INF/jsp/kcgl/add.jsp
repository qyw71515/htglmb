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
	
	function save(){
		$('#form').form('submit',{    
		    url:'<%=basePath%>kcgl/save',    
		    onSubmit: function(){    
				
				
		    	showProcess(false,"新增课程","正在新增课程，请稍候...");
		    },    
		    success:function(data){ 
		    	showProcess(false,"新增课程","正在新增课程，请稍候...");
		    	var data = eval('(' + data + ')');
		    	if(data.retCode=="1"){
		    		msgShow('提示',data.retMsg,'info');
		    		closeWindow();
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
	<table width="99.5%" border="0" cellpadding="1" cellspacing="1" class="table">
		<tr class="line">
			<td align='center'  colspan="4">
				<span class="tableTitle">课&nbsp;&nbsp;程&nbsp;&nbsp;新&nbsp;&nbsp;增</span></td>
		</tr>
		
		<tr class="line">
			<td align='right' width="15%" class="title1">kcmc</td>
			<td align='left' colspan="3"><input type="text" name="kcmc" data-options="required:true" id="kcmc" style="width:70%;"/></td>
		</tr>
		<tr class="line">
			<td align='right' width="15%" class="title1">kcxs</td>
			<td align='left' colspan="3"><input type="text" name="kcxs" data-options="required:true" id="kcxs" style="width:70%;"/></td>
		</tr>
		<tr class="line">
			<td align='right' width="15%" class="title1">kclx</td>
			<td align='left' colspan="3"><input type="text" name="kclx" data-options="required:true" id="kclx" style="width:70%;"/></td>
		</tr>
		<tr class="line">
			<td align='right' width="15%" class="title1">xfen</td>
			<td align='left' colspan="3"><input type="text" name="xfen" data-options="required:true" id="xfen" style="width:70%;"/></td>
		</tr>
		<tr class="line">
			<td align='right' width="15%" class="title1">kkxq</td>
			<td align='left' colspan="3"><input type="text" name="kkxq" data-options="required:true" id="kkxq" style="width:70%;"/></td>
		</tr>
		<tr class="line">
			<td align='right' width="15%" class="title1">syxs</td>
			<td align='left' colspan="3"><input type="text" name="syxs" data-options="required:true" id="syxs" style="width:70%;"/></td>
		</tr>
		<tr class="line">
			<td align='right' width="15%" class="title1">sfsyjx</td>
			<td align='left' colspan="3"><input type="text" name="sfsyjx" data-options="required:true" id="sfsyjx" style="width:70%;"/></td>
		</tr>
		<tr class="line">
			<td align='right' width="15%" class="title1">sfsjlkc</td>
			<td align='left' colspan="3"><input type="text" name="sfsjlkc" data-options="required:true" id="sfsjlkc" style="width:70%;"/></td>
		</tr>
		<tr class="line">
			<td align='right' width="15%" class="title1">kkxy</td>
			<td align='left' colspan="3"><input type="text" name="kkxy" data-options="required:true" id="kkxy" style="width:70%;"/></td>
		</tr>

		
	</table>
	<div align="center">
		<a href="javascript:void(0)" id="submit" iconcls="fa fa-floppy-o" class="easyui-linkbutton" onclick="save();">保存</a>
		<a href="javascript:void(0)" id="submit" iconcls="fa fa-times-circle" class="easyui-linkbutton" onclick="closeWindow();">关闭</a>
	</div>
</form>
</body>
</html>