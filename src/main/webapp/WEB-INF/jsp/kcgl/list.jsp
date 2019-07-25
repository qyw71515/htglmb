<%@ page contentType="text/html;charset=UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<title>后台管理</title>
<%@ include file="/common/meta.jsp"%>
<%@ include file="/common/easyuilibs.jsp"%>
<%@ include file="/common/artDialoglibs.jsp"%>
<script type="text/javascript" src="<%=basePath%>js/common.js"></script>
<script type="text/javascript">
	var datagrid;
	$(function() {
		nobackpace();
		var dg = $('#dg');
		
		$('#dg').datagrid({
			url : '<%=basePath%>kcgl/listData',
			pagination : true,
			pagePosition : 'bottom',
			pageSize : pageSize,
			pageList : pageList,
			fit : true,
			fitColumns : true,
			ctrlSelect:true,
			striped : true,
			rownumbers : true,
			sortName : 'id',
			sortOrder : 'desc',
			columns : [ [ {
				field : 'id',
				title : 'id',
				width : 80,
				checkbox:true
			},{
				field : 'kcmc',
				title : '课程名称',
				width : 100,
				sortable : true
			},{
				field : 'kcxs',
				title : '课程学时',
				width : 80,
				sortable : true
			},{
				field : 'kclx',
				title : '课程类型',
				width : 30,
				sortable : true
			},{
				field : 'xfen',
				title : '学分',
				width : 100,
				sortable : true
			},{
				field : 'kkxq',
				title : '开课学期',
				width : 100,
				sortable : true
			},{
				field : 'syxs',
				title : '实验学时',
				width : 100,
				sortable : true
			},{
				field : 'sfsyjx',
				title : '是否双语教学',
				width : 100,
				sortable : true
			},{
				field : 'sfsjlkc',
				title : '是否实践类课程',
				width : 100,
				sortable : true
			},{
				field : 'kkxy',
				title : '开课学院',
				width : 100,
				sortable : true
			}] ],
			toolbar : [{
				text:'查询',
				iconCls:'icon-search',
				handler:function(){
					showWindow2("search", '<%=basePath%>kcgl/query', 600,400, "icon-search", true, false,false)
				}
			},'-',{
				text:'新增',
				iconCls:'icon-add',
				handler:function(){
					showWindow2("add", '<%=basePath%>kcgl/add',600,400, "icon-search", true, false,false)
				}
			},'-',{
				text:'删除',
				iconCls:'icon-clear',
				handler:function(){
					
					var rows = dg.datagrid('getSelections');
					if (rows.length == 1) {
						var id = [];
						for ( var i = 0; i < rows.length; i++) {
							id.push(rows[i].id);
						}
						showConfirm('信息提示','确定要删除该记录吗？',function(){
							showWindow2("search", '<%=basePath%>kcgl/del?id='+id,600,400, "icon-clear", true, false,false)
						})
					}else{
						parent.$.messager.alert('信息提示','请选择一条记录进行操作！','info');
					}
				}
			},'-',{
				text:'修改',
				iconCls:'icon-edit',
				handler:function() {
					var rows = dg.datagrid('getSelections');
					if (rows.length == 1) {
						var id = [];
						for ( var i = 0; i < rows.length; i++) {
							id.push(rows[i].id);
						}
						showWindow2("修改", '<%=basePath%>kcgl/edit?id='+id,600,400, "icon-edit", true, false,false)
					} else {
						parent.$.messager.alert('信息提示','请选择一条记录进行操作！','info');
					}
				}
			}]

		});
	});
</script>
</head>
<body>

	<form id="form">
		<input type="hidden" name="id" id="id" /> 
		<input type="hidden" name="kclx" id="kclx" />
	</form>
	
	<table id="dg"></table>

</body>
</html>
