<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/views/common/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="pragma" content="no-cache">
<%@ include file="/views/common/import-all-js-css.jsp"%>
<script type="text/javascript">
	var filds = [
			{
				display : '序号',
				showIndex : "default",
				width : 2
			},
			{
				display : '课题名称',
				name : 'tname',
				width : 8
			
			},
			{
				display : '课题背景',
				name : 'tbackinfo',
				width : 8,
				render : function(row) {
					if(row.tbackinfo.length>30){
						return row.tbackinfo.substring(0,30)+"...";
					}
					return row.tbackinfo;
				}
			},
			{
				display : '主要内容',
				name : 'tdetailinfo',
				width : 8,
				render : function(row) {
					if(row.tdetailinfo.length>30){
						return row.tdetailinfo.substring(0,30)+"...";
					}
					return row.tdetailinfo;
				}
			},
			{
				display : '实现功能',
				name : 'tfunction',
				width : 8,
				render : function(row) {
					if(row.tfunction.length>30){
						return row.tfunction.substring(0,30)+"...";
					}
					return row.tfunction;
				}
			},
			{
				display : '教师姓名',
				name : 'tearealname',
				width : 8
			},
			{
				display : '教职编号',
				name : 'code',
				width : 8
			},
			{
				display : '学生姓名',
				name : 'sturealname',
				width : 8
			},
			{
				display : '操作',
				name : '',
				width : 5,
				unbindClick : true,
				render : function(row) {
					var html = "";
					html += '<a href="${ctx}/topic/topicInput.do?id={0}"><img src="${ctx}/static/images/modi.png" title="修改"></a>';
					if(row.stuloginname==""||row.stuloginname==null){
						html += ' | ';
						html += '<a href="javascript:void(0);" onclick="gridDelete(\'{0}\',\'${ctx}/college/deleteTopic.do\')"><img src="${ctx}/static/images/del.png" title="删除"></a>';
					}
					return Free.replace(html, row.id);
				}
			} ];
	var opt = {
		url : "${ctx}/topic/topic_list.do",
		filds : filds,
		pageSize : 10,
		trimBlank : true,
		clickTr : function(row) {
			findOne(row.id)
		},
		param : {}
	};
	var g;
	$(function() {
		g = $("#maingrid").grid(opt);
	});
	function findOne(id) {
		var index = layer.open({
			type : 2,
			title : '详细信息',
			shadeClose : true,
			shade : 0.8,
			// offset: ['20px', '20px'], //上边距50像素
			area : [ '1200px', '550px' ],
			content : '${ctx}/topic/topicDetail.do?id='+id
		});
		layer.full(index);
		//location.href="${ctx}/settledInfo/settle/detail.do?id="+id;
	}

</script>
</head>
<body>
	<div class="content">
		<div class="tit">课题信息</div>
		<div class="tit_down">
						<form id="gridQueryForm">
						
			<ul class="select">
					<li><label class="fl">课题名称：</label><input type="text"
						placeholder="模糊查询..." name="search_LIKE@tname"></li>
					<div class="clear"></div>
			</ul>
			</form>
					<div style="width:500px; margin:0 auto">
					<button class="btn1" onclick="gridSearch()">查询</button>
					<shiro:hasAnyRoles name="教师,超级管理员"><button class="btn1" onclick="window.location='${ctx}/views/topic/topicInput.jsp'">新增课题</button></shiro:hasAnyRoles>
					</div>
					<div class="clear"></div>
						
				<div class="clear"></div>

			<div id="maingrid"></div>
			<div id="Pagination"></div>
		</div>
	</div>


</body>

</html>
