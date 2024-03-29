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
				display : '学院名称',
				name : 'college',
				width : 8
			},
			{
				display : '操作',
				name : '',
				width : 5,
				unbindClick : true,
				render : function(row) {
					var html = "";
					html += '<a href="${ctx}/college/collegeInput.do?id={0}"><img src="${ctx}/static/images/modi.png" title="修改"></a>';
					html += ' | ';
					html += '<a href="javascript:void(0);" onclick="gridDelete(\'{0}\',\'${ctx}/college/deleteCollege.do\')"><img src="${ctx}/static/images/del.png" title="删除"></a>';
					return Free.replace(html, row.id);
				}
			} ];
	var opt = {
		url : "${ctx}/college/college_list.do",
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
			area : [ '1000px', '550px' ],
			content : '${ctx}/college/collegeDetail.do?id='+id
		});
		layer.full(index);
		//location.href="${ctx}/settledInfo/settle/detail.do?id="+id;
	}

</script>
</head>
<body>
	<div class="content">
		<div class="tit">学院信息</div>
		<div class="tit_down">
		<form id="fromdr">
		<input type="file"  id="fileinput" name="file" style="display:none" onchange="fileUpload()"/>
		</form>
						<form id="gridQueryForm">
						
			<ul class="select">
					<li><label class="fl">学院名称：</label><input type="text"
						placeholder="模糊查询..." name="search_LIKE@college"></li>
					<div class="clear"></div>
			</ul>
			</form>
					<div style="width:500px; margin:0 auto">
					<button class="btn1" onclick="gridSearch()">查询</button>
					<button class="btn1" onclick="window.location='${ctx}/views/college/collegeInput.jsp'">创建学院</button>
					</div>
					<div class="clear"></div>
						
				<div class="clear"></div>

			<div id="maingrid"></div>
			<div id="Pagination"></div>
		</div>
	</div>


</body>

</html>
