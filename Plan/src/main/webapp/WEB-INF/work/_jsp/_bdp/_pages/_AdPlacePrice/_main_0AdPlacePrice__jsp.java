/*
 * JSP generated by Resin-4.0.35 (built Tue, 12 Feb 2013 10:05:50 PST)
 */

package _jsp._bdp._pages._AdPlacePrice;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _main_0AdPlacePrice__jsp extends com.caucho.jsp.JavaPage
{
  private static final java.util.HashMap<String,java.lang.reflect.Method> _jsp_functionMap = new java.util.HashMap<String,java.lang.reflect.Method>();
  private boolean _caucho_isDead;
  private boolean _caucho_isNotModified;
  private com.caucho.jsp.PageManager _jsp_pageManager;
  
  public void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response)
    throws java.io.IOException, javax.servlet.ServletException
  {
    javax.servlet.http.HttpSession session = request.getSession(true);
    com.caucho.server.webapp.WebApp _jsp_application = _caucho_getApplication();
    com.caucho.jsp.PageContextImpl pageContext = _jsp_pageManager.allocatePageContext(this, _jsp_application, request, response, null, session, 8192, true, false);

    TagState _jsp_state = null;

    try {
      _jspService(request, response, pageContext, _jsp_application, session, _jsp_state);
    } catch (java.lang.Throwable _jsp_e) {
      pageContext.handlePageException(_jsp_e);
    } finally {
      _jsp_pageManager.freePageContext(pageContext);
    }
  }
  
  private void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response,
              com.caucho.jsp.PageContextImpl pageContext,
              javax.servlet.ServletContext application,
              javax.servlet.http.HttpSession session,
              TagState _jsp_state)
    throws Throwable
  {
    javax.servlet.jsp.JspWriter out = pageContext.getOut();
    final javax.el.ELContext _jsp_env = pageContext.getELContext();
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.Servlet page = this;
    javax.servlet.jsp.tagext.JspTag _jsp_parent_tag = null;
    com.caucho.jsp.PageContextImpl _jsp_parentContext = pageContext;
    response.setContentType("text/html; charset=UTF-8");

    out.write(_jsp_string0, 0, _jsp_string0.length);
    
  String contextPath = (String) request.getContextPath();
			request.setAttribute("isMenu", "true");

    out.write(_jsp_string1, 0, _jsp_string1.length);
    out.print((contextPath ));
    out.write(_jsp_string2, 0, _jsp_string2.length);
    out.print((contextPath));
    out.write(_jsp_string3, 0, _jsp_string3.length);
    out.print((contextPath));
    out.write(_jsp_string4, 0, _jsp_string4.length);
    out.print((contextPath));
    out.write(_jsp_string5, 0, _jsp_string5.length);
    out.print((contextPath));
    out.write(_jsp_string6, 0, _jsp_string6.length);
    out.print((contextPath));
    out.write(_jsp_string7, 0, _jsp_string7.length);
    out.print((contextPath));
    out.write(_jsp_string8, 0, _jsp_string8.length);
    out.print((contextPath));
    out.write(_jsp_string9, 0, _jsp_string9.length);
    out.print((contextPath));
    out.write(_jsp_string10, 0, _jsp_string10.length);
    out.print((contextPath));
    out.write(_jsp_string11, 0, _jsp_string11.length);
    out.print((contextPath));
    out.write(_jsp_string12, 0, _jsp_string12.length);
    out.print((contextPath));
    out.write(_jsp_string13, 0, _jsp_string13.length);
    out.print((contextPath));
    out.write(_jsp_string14, 0, _jsp_string14.length);
    out.print((contextPath));
    out.write(_jsp_string15, 0, _jsp_string15.length);
    out.print((contextPath));
    out.write(_jsp_string16, 0, _jsp_string16.length);
    out.print((contextPath));
    out.write(_jsp_string17, 0, _jsp_string17.length);
    out.print((contextPath));
    out.write(_jsp_string18, 0, _jsp_string18.length);
    out.print((contextPath));
    out.write(_jsp_string19, 0, _jsp_string19.length);
    out.print((contextPath));
    out.write(_jsp_string20, 0, _jsp_string20.length);
    out.print((contextPath));
    out.write(_jsp_string21, 0, _jsp_string21.length);
    out.print((contextPath));
    out.write(_jsp_string22, 0, _jsp_string22.length);
    out.print((contextPath));
    out.write(_jsp_string23, 0, _jsp_string23.length);
    out.print((contextPath));
    out.write(_jsp_string24, 0, _jsp_string24.length);
    out.print((contextPath));
    out.write(_jsp_string25, 0, _jsp_string25.length);
    out.print((contextPath));
    out.write(_jsp_string26, 0, _jsp_string26.length);
    out.print((contextPath));
    out.write(_jsp_string27, 0, _jsp_string27.length);
    out.print((contextPath));
    out.write(_jsp_string28, 0, _jsp_string28.length);
    out.print((contextPath));
    out.write(_jsp_string29, 0, _jsp_string29.length);
    out.print((contextPath));
    out.write(_jsp_string30, 0, _jsp_string30.length);
    out.print((contextPath));
    out.write(_jsp_string31, 0, _jsp_string31.length);
    out.print((contextPath));
    out.write(_jsp_string32, 0, _jsp_string32.length);
    out.print((contextPath));
    out.write(_jsp_string33, 0, _jsp_string33.length);
    out.write(_jsp_string34, 0, _jsp_string34.length);
    out.write(_jsp_string35, 0, _jsp_string35.length);
  }

  private com.caucho.make.DependencyContainer _caucho_depends
    = new com.caucho.make.DependencyContainer();

  public java.util.ArrayList<com.caucho.vfs.Dependency> _caucho_getDependList()
  {
    return _caucho_depends.getDependencies();
  }

  public void _caucho_addDepend(com.caucho.vfs.PersistentDependency depend)
  {
    super._caucho_addDepend(depend);
    _caucho_depends.add(depend);
  }

  protected void _caucho_setNeverModified(boolean isNotModified)
  {
    _caucho_isNotModified = true;
  }

  public boolean _caucho_isModified()
  {
    if (_caucho_isDead)
      return true;

    if (_caucho_isNotModified)
      return false;

    if (com.caucho.server.util.CauchoSystem.getVersionId() != -8128084403448394333L)
      return true;

    return _caucho_depends.isModified();
  }

  public long _caucho_lastModified()
  {
    return 0;
  }

  public void destroy()
  {
      _caucho_isDead = true;
      super.destroy();
    TagState tagState;
  }

  public void init(com.caucho.vfs.Path appDir)
    throws javax.servlet.ServletException
  {
    com.caucho.vfs.Path resinHome = com.caucho.server.util.CauchoSystem.getResinHome();
    com.caucho.vfs.MergePath mergePath = new com.caucho.vfs.MergePath();
    mergePath.addMergePath(appDir);
    mergePath.addMergePath(resinHome);
    com.caucho.loader.DynamicClassLoader loader;
    loader = (com.caucho.loader.DynamicClassLoader) getClass().getClassLoader();
    String resourcePath = loader.getResourcePathSpecificFirst();
    mergePath.addClassPath(resourcePath);
    com.caucho.vfs.Depend depend;
    depend = new com.caucho.vfs.Depend(appDir.lookup("bdp/pages/AdPlacePrice/main_AdPlacePrice.jsp"), -4921781530061532589L, false);
    _caucho_depends.add(depend);
    depend = new com.caucho.vfs.Depend(appDir.lookup("bdp/commons/statics.jsp"), 7130047953460554352L, false);
    _caucho_depends.add(depend);
  }

  final static class TagState {

    void release()
    {
    }
  }

  public java.util.HashMap<String,java.lang.reflect.Method> _caucho_getFunctionMap()
  {
    return _jsp_functionMap;
  }

  public void caucho_init(ServletConfig config)
  {
    try {
      com.caucho.server.webapp.WebApp webApp
        = (com.caucho.server.webapp.WebApp) config.getServletContext();
      init(config);
      if (com.caucho.jsp.JspManager.getCheckInterval() >= 0)
        _caucho_depends.setCheckInterval(com.caucho.jsp.JspManager.getCheckInterval());
      _jsp_pageManager = webApp.getJspApplicationContext().getPageManager();
      com.caucho.jsp.TaglibManager manager = webApp.getJspApplicationContext().getTaglibManager();
      manager.addTaglibFunctions(_jsp_functionMap, "shiro", "http://shiro.apache.org/tags");
      com.caucho.jsp.PageContextImpl pageContext = new com.caucho.jsp.InitPageContextImpl(webApp, this);
    } catch (Exception e) {
      throw com.caucho.config.ConfigException.create(e);
    }
  }

  private final static char []_jsp_string18;
  private final static char []_jsp_string7;
  private final static char []_jsp_string26;
  private final static char []_jsp_string13;
  private final static char []_jsp_string19;
  private final static char []_jsp_string32;
  private final static char []_jsp_string6;
  private final static char []_jsp_string5;
  private final static char []_jsp_string0;
  private final static char []_jsp_string30;
  private final static char []_jsp_string21;
  private final static char []_jsp_string4;
  private final static char []_jsp_string28;
  private final static char []_jsp_string15;
  private final static char []_jsp_string35;
  private final static char []_jsp_string27;
  private final static char []_jsp_string14;
  private final static char []_jsp_string29;
  private final static char []_jsp_string24;
  private final static char []_jsp_string11;
  private final static char []_jsp_string23;
  private final static char []_jsp_string17;
  private final static char []_jsp_string2;
  private final static char []_jsp_string9;
  private final static char []_jsp_string33;
  private final static char []_jsp_string34;
  private final static char []_jsp_string20;
  private final static char []_jsp_string3;
  private final static char []_jsp_string22;
  private final static char []_jsp_string12;
  private final static char []_jsp_string25;
  private final static char []_jsp_string1;
  private final static char []_jsp_string10;
  private final static char []_jsp_string16;
  private final static char []_jsp_string31;
  private final static char []_jsp_string8;
  static {
    _jsp_string18 = "/resources/bdp/js/jquery/jquery-validate/jquery.validate.min.js\"></script>\r\n<script src=\"".toCharArray();
    _jsp_string7 = "/resources/bdp/bootstrap/datetimepicker/css/bootstrap-datetimepicker.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n<!--  \u5f15\u5165bootstrap-3.0.3.min.css,\u89e3\u51b3\u4e86\u4e0b\u62c9\u9009\u62e9\u6837\u5f0f\u95ee\u9898\u3001\u8868\u683c\u5b57\u4f53\u5168\u90e8\u52a0\u7c97\u95ee\u9898-->\r\n<link href=\"".toCharArray();
    _jsp_string26 = "/resources/bdp/bootstrap/js/summernote.js\"></script>\r\n\r\n<script src=\"".toCharArray();
    _jsp_string13 = "/resources/bdp/highchart/exporting.js\"></script>\r\n<script src=\"".toCharArray();
    _jsp_string19 = "/resources/bdp/js/jquery/jquery-validate/messages_zh.js\"></script>\r\n<script src=\"".toCharArray();
    _jsp_string32 = "/resources/bdp/js/bdp/xmlTohtml.js\"></script>\r\n\r\n<style type=\"text/css\">\r\n.bootstrap-table td {\r\n	text-overflow: ellipsis;\r\n	white-space: nowrap;\r\n	overflow: hidden;\r\n	max-width: 200px;\r\n}\r\n\r\n#AdPlacePrice_view_form .col-sm-9 label {\r\n	font-weight: normal;\r\n}\r\n\r\n#AdPlacePrice_form .col-sm-9 label {\r\n	font-weight: normal;\r\n}\r\n</style>\r\n<script type=\"text/javascript\">\r\n$(function(){\r\n	checkWebSite();\r\n	GetChannel();\r\n	}); \r\nvar contextPath=\"".toCharArray();
    _jsp_string6 = "/resources/bdp/bootstrap/css/bootstrap-multiselect.css\" rel=\"stylesheet\">\r\n<link href=\"".toCharArray();
    _jsp_string5 = "/resources/bdp/bootstrap/css/metisMenu.min.css\" rel=\"stylesheet\">\r\n<link href=\"".toCharArray();
    _jsp_string0 = "\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n\r\n\r\n\r\n".toCharArray();
    _jsp_string30 = "/resources/bdp/bootstrap/export/FileSaver.min.js\"></script>\r\n<script src=\"".toCharArray();
    _jsp_string21 = "/resources/bdp/js/jquery/jquery.ztree.excheck-3.5.min.js\"></script>\r\n<script src=\"".toCharArray();
    _jsp_string4 = "/resources/bdp/css/orgStructTree/bootstrap/bootstrap-table.min.css\" rel=\"stylesheet\"  />\r\n<link href=\"".toCharArray();
    _jsp_string28 = "/resources/bdp/js/bdp/commons-operate.js\"></script>\r\n\r\n\r\n<!-- \u5f15\u5165\u5bfc\u51fa\u8868\u683c\u5230\u6587\u4ef6\u7684\u63d2\u4ef6 -->\r\n<script src=\"".toCharArray();
    _jsp_string15 = "/resources/bdp/js/bdp/orgStructTree/bootstrap/bootstrap-table-all.min.js\"></script>\r\n<script src=\"".toCharArray();
    _jsp_string35 = "t>\r\n               </div>\r\n             </div>\r\n             \r\n             \r\n             \r\n             <div class='form-group'>\r\n             <label class='col-sm-3 control-label'><span style='color:red'>*</span>\u5e73\u53f0\uff1a</label>\r\n               <div class='col-sm-9'>\r\n                 <input class='form-control' name='platform'>\r\n               </div>\r\n             </div>\r\n             <div class='form-group'>\r\n             <label class='col-sm-3 control-label'><span style='color:red'>*</span>\u521b\u610f\uff1a</label>\r\n               <div class='col-sm-9'>\r\n                 <input class='form-control' name='originality'>\r\n               </div>\r\n             </div>\r\n             <div class='form-group'>\r\n             <label class='col-sm-3 control-label'><span style='color:red'>*</span>\u5e74\u4efd\uff1a</label>\r\n               <div class='col-sm-9'>\r\n                 <input class='form-control' name='priceyear'>\r\n               </div>\r\n             </div>\r\n             <div class='form-group'>\r\n             <label class='col-sm-3 control-label'><span style='color:red'>*</span>\u4ef7\u683c\uff1a</label>\r\n               <div class='col-sm-9'>\r\n                 <input class='form-control' name='price'>\r\n               </div>\r\n             </div>\r\n																																									\r\n						</form>\r\n					</div>\r\n					<div class=\"modal-footer\">\r\n						<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\"\r\n							id=\"AdPlacePrice_close\">\u5173\u95ed</button>\r\n						<button type=\"button\" class=\"btn btn-primary\" id=\"AdPlacePrice_submit\">\u63d0\u4ea4</button>\r\n					</div>\r\n				</div>\r\n			</div>\r\n		</div>\r\n\r\n		<div class=\"modal fade\" id=\"AdPlacePrice_view_Modal\" tabindex=\"-1\"\r\n			role=\"dialog\" aria-labelledby=\"AdPlacePrice_view_ModalTitle\"\r\n			aria-hidden=\"true\">\r\n			<div class=\"modal-dialog\" style=\"width: 580x;\">\r\n				<div class=\"modal-content\">\r\n					<div class=\"modal-header\">\r\n						<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n							aria-hidden=\"true\">&times;</button>\r\n						<h4 class=\"modal-title\" id=\"AdPlacePrice_view_ModalTitle\">\u67e5\u770b\u7528\u6237\u8be6\u60c5</h4>\r\n					</div>\r\n					<div class=\"modal-body\">\r\n						<form id=\"AdPlacePrice_view_form\" class=\"form-horizontal\">\r\n							             <div class='form-group'> \r\n             <label class='col-sm-3 control-label'>id\uff1a</label> \r\n               <div class='col-sm-9'> \r\n                 <label name='id' style='padding-top: 6px;'></label> \r\n               </div> \r\n             </div> \r\n             <div class='form-group'> \r\n             <label class='col-sm-3 control-label'>\u96c6\u56e2\uff1a</label> \r\n               <div class='col-sm-9'> \r\n                 <label name='companygroup' style='padding-top: 6px;'></label> \r\n               </div> \r\n             </div> \r\n             <div class='form-group'> \r\n             <label class='col-sm-3 control-label'>\u7f51\u7ad9\uff1a</label> \r\n               <div class='col-sm-9'> \r\n                 <label name='websiteid' style='padding-top: 6px;'></label> \r\n               </div> \r\n             </div> \r\n             <div class='form-group'> \r\n             <label class='col-sm-3 control-label'>\u9891\u9053\uff1a</label> \r\n               <div class='col-sm-9'> \r\n                 <label name='channelid' style='padding-top: 6px;'></label> \r\n               </div> \r\n             </div> \r\n             <div class='form-group'> \r\n             <label class='col-sm-3 control-label'>\u5e73\u53f0\uff1a</label> \r\n               <div class='col-sm-9'> \r\n                 <label name='platform' style='padding-top: 6px;'></label> \r\n               </div> \r\n             </div> \r\n             <div class='form-group'> \r\n             <label class='col-sm-3 control-label'>\u5e7f\u544a\u4f4d\uff1a</label> \r\n               <div class='col-sm-9'> \r\n                 <label name='adplaceid' style='padding-top: 6px;'></label> \r\n               </div> \r\n             </div> \r\n             <div class='form-group'> \r\n             <label class='col-sm-3 control-label'>\u521b\u610f\uff1a</label> \r\n               <div class='col-sm-9'> \r\n                 <label name='originality' style='padding-top: 6px;'></label> \r\n               </div> \r\n             </div> \r\n             <div class='form-group'> \r\n             <label class='col-sm-3 control-label'>\u5e74\u4efd\uff1a</label> \r\n               <div class='col-sm-9'> \r\n                 <label name='priceyear' style='padding-top: 6px;'></label> \r\n               </div> \r\n             </div> \r\n             <div class='form-group'> \r\n             <label class='col-sm-3 control-label'>\u4ef7\u683c\uff1a</label> \r\n               <div class='col-sm-9'> \r\n                 <label name='price' style='padding-top: 6px;'></label> \r\n               </div> \r\n             </div> \r\n												\r\n						</form>\r\n					</div>\r\n					<div class=\"modal-footer\">\r\n						<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">\u5173\u95ed</button>\r\n					</div>\r\n				</div>\r\n			</div>\r\n		</div>\r\n	</div>\r\n</body>\r\n</html>\r\n".toCharArray();
    _jsp_string27 = "/resources/bdp/js/bdp/util.js\"></script>\r\n<script src=\"".toCharArray();
    _jsp_string14 = "/resources/bdp/bootstrap/js/bootstrap.min.js\"></script>\r\n<script src=\"".toCharArray();
    _jsp_string29 = "/resources/bdp/bootstrap/export/tableExport.min.js\"></script>\r\n<script src=\"".toCharArray();
    _jsp_string24 = "/resources/bdp/bootstrap/datetimepicker/js/bootstrap-datetimepicker.js\"></script>\r\n<script src=\"".toCharArray();
    _jsp_string11 = "/resources/bdp/js/jquery/jquery.min.js\"></script>\r\n<!--highChart  -->\r\n<script src=\"".toCharArray();
    _jsp_string23 = "/resources/bdp/bootstrap/js/bootstrap-multiselect.js\"></script>\r\n<!--\u65f6\u95f4\u63a7\u4ef6  -->\r\n<script src=\"".toCharArray();
    _jsp_string17 = "/resources/bdp/js/bootstrap-table/bootstrap-table-zh-CN.min.js\"></script>\r\n<script src=\"".toCharArray();
    _jsp_string2 = "\";\r\n</script>\r\n\r\n<link href=\"".toCharArray();
    _jsp_string9 = "/resources/bdp/bootstrap/css/summernote.css\" rel=\"stylesheet\">\r\n<!--  bootstrap \u56fe\u6807-->\r\n<link href=\"".toCharArray();
    _jsp_string33 = "\";\r\nfunction operateFormatter(value, row, index) {\r\n    return [\r\n            '&nbsp;<a class=\"check\"  href=\"javascript:void(0)\" title=\"\u67e5\u770b\">',\r\n            '<i class=\"glyphicon glyphicon-link\"></i>',\r\n            '</a> &nbsp; ',\r\n            '  <a class=\"edit\" href=\"javascript:void(0)\" title=\"\u7f16\u8f91\">',\r\n            '<i class=\"glyphicon glyphicon-edit\"></i>',\r\n            '</a> &nbsp; ',\r\n            ' <a class=\"delete\"  href=\"javascript:void(0)\" title=\"\u5220\u9664\">',\r\n            '<i class=\"glyphicon glyphicon-remove-circle\"></i>',\r\n            '</a>'\r\n    ].join('');\r\n}\r\n\r\nwindow.operateEvents = {\r\n    'click .edit': function (e, value, row, index) {\r\n	    object_operate.show_modify_modal(row);\r\n    },\r\n    'click .check': function (e, value, row, index) {\r\n    	object_operate.show_view_modal(row);\r\n    },\r\n    'click .delete': function (e, value, row, index) {\r\n    	object_operate.del();\r\n   }\r\n};\r\nglobal_variable.model = \"AdPlacePrice\";\r\nglobal_variable.model_cn = \"\u520a\u4f8b\u4ef7\u7ba1\u7406\";\r\nglobal_variable.sortName=\"\";\r\nglobal_variable.columns =\r\n[ \r\n {field: '',checkbox:true},\r\n {field: 'id',title: 'id',formatter: function(value,row,index){return row.id;}}, \r\n {field: 'companygroup',title: '\u96c6\u56e2',formatter: function(value,row,index){return row.companygroup;}}, \r\n {field: 'websiteid',title: '\u7f51\u7ad9',formatter: function(value,row,index){return row.websiteid;}}, \r\n {field: 'channelid',title: '\u9891\u9053',formatter: function(value,row,index){return row.channelid;}}, \r\n {field: 'platform',title: '\u5e73\u53f0',formatter: function(value,row,index){return row.platform;}}, \r\n {field: 'adplaceid',title: '\u5e7f\u544a\u4f4d',formatter: function(value,row,index){return row.adplaceid;}}, \r\n {field: 'originality',title: '\u521b\u610f',formatter: function(value,row,index){return row.originality;}}, \r\n {field: 'priceyear',title: '\u5e74\u4efd',formatter: function(value,row,index){return row.priceyear;}}, \r\n {field: 'price',title: '\u4ef7\u683c',formatter: function(value,row,index){return row.price;}}, \r\n {field: 'state',title: '\u72b6\u6001',formatter: function(value,row,index){return row.state;}},\r\n {field: 'addtime',title: '\u6dfb\u52a0\u65f6\u95f4',formatter: function(value,row,index){return row.addtime;}}, \r\n	\r\n /* {field: 'creatDate',sortable:true,title: '\u521b\u5efa\u65f6\u95f4',formatter: function(value,row,index){\r\n	 return  dateFormat(row.creatDate, 'yyyy-MM-dd HH:mm:ss');}}, */\r\n {field: 'operate',title: '\u64cd\u4f5c',events: operateEvents,formatter: operateFormatter}\r\n]		\r\nglobal_variable.onLoadSuccess=function(result){\r\n}\r\nglobal_variable.showExport = false;\r\nobject_operate.del=function(){\r\n	var rows = $(\"#\"+global_variable.model+\"_table\").bootstrapTable(\"getSelections\");\r\n	var ids = [];\r\n	//for( var o in rows) {\r\n		//ids.push(rows[o].id);\r\n	//}\r\n	for( var o in rows) {		\r\n		var k=0;//\u83b7\u53d6\u7b2c\u4e00\u5217\r\n		for(var i in rows[o]){\r\n			if(k==0){\r\n				ids.push(rows[o][i]);\r\n			}\r\n			k++;\r\n		}\r\n	}\r\n	\r\n	if(rows.length > 0){\r\n		if(confirm(\"\u8bf7\u786e\u8ba4\u662f\u5426\u6279\u91cf\u5220\u9664\"+global_variable.model_cn)) {\r\n			  $.ajax({\r\n					 async : false,\r\n					 type: 'POST',\r\n			         data:JSON.stringify(ids),\r\n					 url:\"delete\"+object_name+\".do\",\r\n					 dataType:\"json\",\r\n					 contentType:\"application/json\",\r\n					 error: function (result) {//\u8bf7\u6c42\u5931\u8d25\u5904\u7406\u51fd\u6570\r\n						 alert(\"\u8bf7\u6c42\u5931\u8d25\");\r\n					  },\r\n					 success:function(result){ //\u8bf7\u6c42\u6210\u529f\u540e\u5904\u7406\u51fd\u6570\u3002 \r\n						alert(result.msg);\r\n						object_operate.success();\r\n					 }\r\n				 }); \r\n		}	\r\n	}else {\r\n		alert(\"\u8bf7\u5148\u9009\u62e9\u5220\u9664\u884c\");\r\n	}\r\n}\r\nobject_operate.show_add_modal=function(){\r\n	$(\"#\"+global_variable.model+\"_submit\").removeAttr('disabled');\r\n	this.type = \"add\";\r\n	object_form_operate.setTitle();\r\n	$(\"#hiddenID\").val(0);//\u8bbe\u7f6e\u9ed8\u8ba4\u503c\r\n	object_form_operate.reset();\r\n	$(\"#\"+global_variable.model+\"_Modal\").modal(\"show\");\r\n	$(\"#\"+global_variable.model+\"_submit\").unbind(\"click\");\r\n	$(\"#\"+global_variable.model+\"_submit\").bind(\"click\",function(){\r\n		object_operate.add();\r\n		});	\r\n}\r\nobject_operate.add=function(){\r\n        var data= checkForm();\r\n        if(data!=undefined){\r\n        	ajaxHander(\"add\"+object_name+\".do\",data,\"POST\"); \r\n        }\r\n}\r\nobject_operate.show_modify_modal=function(obj){	\r\n	$(\"#\"+global_variable.model+\"_submit\").removeAttr('disabled');\r\n	this.type = \"modify\";\r\n	object_form_operate.setTitle();\r\n	object_form_operate.setValue(obj);\r\n	$(\"#\"+global_variable.model+\"_Modal\").modal(\"show\");\r\n	$(\"#\"+global_variable.model+\"_submit\").unbind(\"click\");\r\n	$(\"#\"+global_variable.model+\"_submit\").bind(\"click\",function(){\r\n		object_operate.modify();\r\n		});\r\n	$(\"#\"+global_variable.model+\"_close\").bind(\"click\",function(){\r\n		});\r\n}\r\nobject_operate.modify=function(){	\r\n	 var data= checkForm();\r\n	 if(data!=undefined){\r\n		 ajaxHander(\"modify\"+object_name+\".do\",data,\"POST\"); \r\n	 }\r\n}\r\nobject_form_operate.setValue=function(obj){	\r\n	var k=0;//\u83b7\u53d6\u7b2c\u4e00\u5217\r\n	for(var i in obj){\r\n		if(k==0){\r\n			$(\"#hiddenID\").val(obj[i]);//\u8bbe\u7f6e\u4fee\u6539\u4e3b\u952e\r\n		}\r\n		k++;\r\n	}\r\n	\r\n	for(var o in obj) {\r\n		if($(\"#\"+global_variable.model+\"_form input[name='\"+o+\"']\").attr('type') == 'radio'){\r\n			$(\"#\"+global_variable.model+\"_form input[value='\"+obj[o]+\"']\").attr(\"checked\",\"checked\");\r\n		}\r\n	   if($(\"#\"+global_variable.model+\"_form input[name='\"+o+\"']\").attr('type') == 'text'||\r\n		   $(\"#\"+global_variable.model+\"_form input[name='\"+o+\"']\").attr('type') == undefined){\r\n		   $(\"#\"+global_variable.model+\"_form input[name='\"+o+\"']\").val(obj[o]);\r\n		}\r\n	}\r\n}\r\nobject_form_operate.setViewValue=function(obj,parentName){\r\n	if(!parentName) {\r\n		parentName = \"\";\r\n	}else {\r\n		parentName += \".\";\r\n	}\r\n    for(var o in obj) {\r\n    	$(\"#\"+global_variable.model+\"_view_form label[name='\"+parentName+o+\"']\").text(obj[o]);\r\n		if(obj[o] instanceof Object) {\r\n			object_form_operate.setViewValue(obj[o],parentName+o);\r\n		}\r\n	}\r\n}\r\nobject_form_operate.reset=function(){\r\n	$(\"#\"+global_variable.model+\"_form\")[0].reset();\r\n	$(\"#\"+global_variable.model+\"_form input[type='hidden']\").val(\"\");\r\n}\r\nglobal_variable.height=550;\r\n\r\nfunction ajaxHander(url,data,type,value){\r\n	   $.ajax({\r\n			 async : false,\r\n			 type: type,\r\n			 beforeSend: function(){				 \r\n				    },\r\n	         data:data,\r\n			 url:url,\r\n			 success:function(data){ //\u8bf7\u6c42\u6210\u529f\u540e\u5904\u7406\u51fd\u6570\u3002 				\r\n				 alert(data.msg);\r\n				 object_operate.success();\r\n			 }\r\n		 }); \r\n}\r\n	\r\nfunction checkForm(){		\r\n	    //\u9a8c\u8bc1\r\n		return $(\"#\"+global_variable.model+\"_form\").serialize();		\r\n}\r\nfunction dateFormat(time,format){\r\n	   var t = new Date(time);\r\n var tf = function(i){return (i < 10 ? '0' : '') + i};\r\n return format.replace(/yyyy|MM|dd|HH|mm|ss/g, function(a){\r\n     switch(a){\r\n         case 'yyyy':\r\n             return tf(t.getFullYear());\r\n             break;\r\n         case 'MM':\r\n             return tf(t.getMonth() + 1);\r\n             break;\r\n         case 'mm':\r\n             return tf(t.getMinutes());\r\n             break;\r\n         case 'dd':\r\n             return tf(t.getDate());\r\n             break;\r\n         case 'HH':\r\n             return tf(t.getHours());\r\n             break;\r\n         case 'ss':\r\n             return tf(t.getSeconds());\r\n             break;\r\n     }\r\n })\r\n}\r\nfunction checkWebSite()\r\n{\r\n	$.ajax({\r\n		 async : false,\r\n		 type: 'post',\r\n		 beforeSend: function(){				 \r\n			    },\r\n         data:null,\r\n		 url:contextPath+\"/AdPlace/test.do\",\r\n		 success:function(data){ //\u8bf7\u6c42\u6210\u529f\u540e\u5904\u7406\u51fd\u6570\u3002 \r\n			 setSelect(\"#WebList\",data,\"adplace\");\r\n			 //$(\"#WebList\").append(data);\r\n			 //object_operate.success();\r\n		 }\r\n	 }); \r\n	}\r\n	\r\nfunction GetChannel()\r\n{\r\n	$.ajax({\r\n		 async : false,\r\n		 type: 'post',\r\n		 beforeSend: function(){				 \r\n			    },\r\n         data:null,\r\n		 url:contextPath+\"/AdPlace/GetChannel.do\",\r\n		 success:function(data){ //\u8bf7\u6c42\u6210\u529f\u540e\u5904\u7406\u51fd\u6570\u3002 \r\n			 setSelect(\"#channelid\",data,\"channel\");\r\n			 //$(\"#WebList\").append(data);\r\n			 //object_operate.success();\r\n		 }\r\n	 }); \r\n	}\r\n	\r\nfunction GetCity()\r\n{\r\n	$.ajax({\r\n		 async : false,\r\n		 type: 'post',\r\n		 beforeSend: function(){				 \r\n			    },\r\n         data:null,\r\n		 url:'GetCitys.do',\r\n		 success:function(data){ //\u8bf7\u6c42\u6210\u529f\u540e\u5904\u7406\u51fd\u6570\u3002 \r\n			 setSelect(\"#cityid\",data,\"city\");\r\n			 //$(\"#WebList\").append(data);\r\n			 //object_operate.success();\r\n		 }\r\n	 }); \r\n	}\r\n\r\nfunction setSelect(id,obj,type){	 \r\n		if($(id).val()==null){\r\n			var len=obj.length;\r\n		 	var temp=\"<option value=''>\u8bf7\u9009\u62e9</option>\";\r\n			for(var i=0 ;i<len;i++){\r\n				if(type==\"adplace\"){\r\n					temp+=\"<option value='\"+obj[i].id+\"'>\"+obj[i].websitename+\"</option>\";\r\n				}\r\n				if(t".toCharArray();
    _jsp_string34 = "ype==\"channel\"){\r\n					temp+=\"<option value='\"+obj[i].id+\"'>\"+obj[i].channelgroupname+\"</option>\";\r\n				}\r\n				if(type==\"city\"){\r\n					temp+=\"<option value='\"+obj[i].CityId+\"'>\"+obj[i].CityName+\"</option>\";\r\n				}\r\n				if(type==\"adplace2\"){\r\n					temp+=\"<option value='\"+obj[i].id+\"'>\"+obj[i].name+\"</option>\";\r\n				}\r\n			}\r\n			$(id).html(temp);\r\n		} \r\n}\r\nfunction setMultiselect(id) {\r\n		$(id).multiselect({\r\n			maxHeight : 250,\r\n			includeSelectAllOption: true,\r\n			selectAllText: '\u5168\u9009',\r\n			selectAllValue: '0',\r\n			buttonText : function(options, select) {\r\n				if (options.length === 0) {\r\n					return '\u8bf7\u9009\u62e9';\r\n				} else if (options.length > 3) {\r\n					return '\u5df2\u9009\u4e09\u4e2a\u4ee5\u4e0a';\r\n				} else {\r\n					var labels = [];\r\n					options.each(function() {\r\n							labels.push($(this).html());\r\n					});\r\n					return labels.join(', ') + '';\r\n				}\r\n			}\r\n		});\r\n}\r\n\r\nfunction webchange(id)\r\n{\r\n  $.ajax({\r\n		 async : false,\r\n		 type: 'post',\r\n		 beforeSend: function(){				 \r\n			    },\r\n      data: {\r\n    	  id:$(\"#WebList\").val()\r\n      },\r\n		 url:'GetAdPlaceByWeb.do',\r\n		 success:function(data){ //\u8bf7\u6c42\u6210\u529f\u540e\u5904\u7406\u51fd\u6570\u3002 \r\n			 setSelect(\"#adplaceid\",data,\"adplace2\");\r\n			 //$(\"#WebList\").append(data);\r\n			 //object_operate.success();\r\n		 }\r\n	 }); \r\n}\r\n</script>\r\n</head>\r\n<body>\r\n	<div class=\"container\">\r\n		<div class=\"row\">\r\n			<br>\r\n			<div class=\"panel panel-default\">\r\n				<div class=\"panel-heading\">\r\n					<h4 class=\"panel-title\">\r\n						<a data-toggle=\"collapse\"\r\n							style=\"display: block; text-decoration: none;\"\r\n							href=\"#searchAdPlacePrice\"> \u641c\u7d22 </a>\r\n					</h4>\r\n				</div>\r\n				<div id=\"searchAdPlacePrice\" class=\"panel-collapse collapse\">\r\n					<div class=\"panel-body\">\r\n						<form id=\"AdPlacePrice_searchForm\">\r\n							<div class=\"form-group input-group\" style=\"\">\r\n                             \r\n                             <div class=\"form-group input-group\" style=\"\">\r\n                              <span class=\"input-group-addon\">\u96c6\u56e2</span> <select class=\"form-control\" style=\"width: 200px;\" name=\"companygroup\">\r\n                                                                            <option value=\"\">\u8bf7\u9009\u62e9</option>\r\n                                                                            <option value=\"\u65b0\u623f\">\u65b0\u623f</option>\r\n                                                                            </select>\r\n                                                                    \r\n                                <span class=\"input-group-addon\">\u6295\u653e\u5e73\u53f0</span> <select class=\"form-control\" style=\"width: 200px;\" name=\"platform\">\r\n                                                                            <option value=\"\">\u8bf7\u9009\u62e9</option>\r\n                                                                            <option value=\"wap\">wap</option>\r\n                                                                            </select> \r\n                                                                          \r\n                                  <span class=\"input-group-addon\">\u6240\u5c5e\u7f51\u7ad9</span> <select class=\"form-control\" style=\"width: 200px;\" name=\"websiteid\">\r\n                                                                            <option value=\"\">\u8bf7\u9009\u62e9</option>\r\n                                                                            <option value=\"1\">1</option>\r\n                                                                            </select> \r\n                              </div>\r\n                              <div class=\"form-group input-group\" style=\"\">\r\n                                  <span class=\"input-group-addon\">\u6240\u5c5e\u9891\u9053</span> <select class=\"form-control\" style=\"width: 200px;\" name=\"channelid\">\r\n                                                                            <option value=\"\">\u8bf7\u9009\u62e9</option>\r\n                                                                            <option value=\"1\">1</option>\r\n                                                                            </select> \r\n                                                                                                        \r\n                                   <span class=\"input-group-addon\">\u5e7f\u544a\u4f4d</span> <select class=\"form-control\" style=\"width: 200px;\" name=\"adplaceid\">\r\n                                                                            <option value=\"\">\u8bf7\u9009\u62e9</option>\r\n                                                                            <option value=\"2\">2</option>\r\n                                                                         </select>\r\n                                                                         \r\n                                   <span class=\"input-group-addon\">\u521b\u610f\u5f62\u5f0f</span> <select class=\"form-control\" style=\"width: 200px;\" name=\"originality\">\r\n                                                                            <option value=\"\">\u8bf7\u9009\u62e9</option>\r\n                                                                            <option value=\"\u6587\u5b57\">\u6587\u5b57</option>\r\n                                                                         </select> \r\n                               </div>    \r\n                                <div class=\"form-group input-group\" style=\"\">\r\n                                <span class=\"input-group-addon\">\u520a\u4f8b\u4ef7</span> <input type=\"text\" class=\"form-control\" style=\"width: 200px;\" name=\"pricestart\">&nbsp-&nbsp<input type=\"text\" class=\"form-control\" style=\"width: 200px;\" name=\"priceend\">\u5143/0.5\u5929\r\n                                </div>                                                                                                                                                                           \r\n                <!-- <input type=\"text\" class=\"form-control\" style=\"width: 200px;\" name=\"price\" /> -->\r\n							</div>\r\n							<div style=\"float: right;\">\r\n								<input type=\"button\" value=\"\u641c\u7d22\" id=\"AdPlacePrice_search\"\r\n									class=\"btn btn-Default\" /> <input type=\"button\" value=\"\u6e05\u7a7a\"\r\n									id=\"AdPlacePrice_searchReset\" class=\"btn btn-Default\" />\r\n							</div>\r\n						</form>\r\n					</div>\r\n				</div>\r\n			</div>\r\n		 <!--\u529f\u80fd\u83dc\u5355 -->\r\n			<div id=\"AdPlacePrice_toolbar\">			\r\n				<input type=\"button\" class=\"btn btn-primary\" value=\"\u65b0\u589e\"\r\n					id=\"AdPlacePrice_add\">\r\n			</div>\r\n			<table id=\"AdPlacePrice_table\">\r\n			</table>\r\n		</div>\r\n		<!--\u7b2c\u4e00\u5c42\u6a21\u6001\u6846  -->\r\n		<div class=\"modal fade\" id=\"AdPlacePrice_Modal\" tabindex=\"-1\" role=\"dialog\"\r\n			aria-labelledby=\"AdPlacePrice_ModalTitle\" aria-hidden=\"true\">\r\n			<div class=\"modal-dialog\" style=\"width: 600x;\">\r\n				<div class=\"modal-content\">\r\n					<div class=\"modal-header\">\r\n						<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n							aria-hidden=\"true\">&times;</button>\r\n						<h4 class=\"modal-title\" id=\"AdPlacePrice_ModalTitle\"></h4>\r\n					</div>\r\n					<div class=\"modal-body\">\r\n						<form id=\"AdPlacePrice_form\" class=\"form-horizontal\">\r\n						   <input type='hidden' name='id' id='hiddenID'>\r\n             <div class='form-group'>\r\n             <label class='col-sm-3 control-label'><span style='color:red'>*</span>\u96c6\u56e2\uff1a</label>\r\n               <div class='col-sm-9'>\r\n                 <select class='form-control' name='companygroup'>\r\n                 <option>\u65b0\u623f</option>\r\n                 <option>\u4e8c\u624b\u623f</option>\r\n                 <option>\u5bb6\u5c45</option>\r\n                 </select>\r\n               </div>\r\n             </div>\r\n             <div class='form-group'>\r\n             <label class='col-sm-3 control-label'><span style='color:red'>*</span>\u7f51\u7ad9\uff1a</label>\r\n               <div class='col-sm-9'>\r\n                 \r\n                 <select class='form-control' name='websiteid' id=\"WebList\" onchange=\"webchange()\"></select>\r\n               </div>\r\n             </div>\r\n             <div class='form-group'>\r\n             <label class='col-sm-3 control-label'><span style='color:red'>*</span>\u9891\u9053\uff1a</label>\r\n               <div class='col-sm-9'>\r\n                 <select class='form-control' name='channelid' id='channelid'></select>\r\n               </div>\r\n             </div>\r\n             <div class='form-group'>\r\n             <label class='col-sm-3 control-label'><span style='color:red'>*</span>\u5e7f\u544a\u4f4d\uff1a</label>\r\n               <div class='col-sm-9'>\r\n                 <select class='form-control' name='adplaceid' id='adplaceid'></selec".toCharArray();
    _jsp_string20 = "/resources/bdp/js/jquery/jquery.ztree.core-3.5.min.js\"></script>\r\n<script src=\"".toCharArray();
    _jsp_string3 = "/resources/bdp/css/zTreeStyle/zTreeStyle.css\" rel=\"stylesheet\">\r\n<link href=\"".toCharArray();
    _jsp_string22 = "/resources/bdp/js/jquery/jquery.ztree.exedit-3.5.min.js\"></script>\r\n<!--\u4e0b\u62c9\u9009\u62e9\u6846JS  -->\r\n<script src=\"".toCharArray();
    _jsp_string12 = "/resources/bdp/highchart/highcharts.js\"></script>\r\n<script src=\"".toCharArray();
    _jsp_string25 = "/resources/bdp/bootstrap/datetimepicker/js/bootstrap-datetimepicker.fr.js\"></script>\r\n<!--\u5728\u7ebf\u7f16\u8f91\u5668  -->\r\n<script src=\"".toCharArray();
    _jsp_string1 = "\r\n<script type=\"text/javascript\">\r\n	var contextPath=\"".toCharArray();
    _jsp_string10 = "/resources/bdp/bootstrap/bower_components/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n\r\n<script src=\"".toCharArray();
    _jsp_string16 = "/resources/bdp/js/bootstrap-table/bootstrap-table-resize.js\"></script>\r\n\r\n<script src=\"".toCharArray();
    _jsp_string31 = "/resources/bdp/bootstrap/export/bootstrap-table-export.js\"></script> \r\n<script src=\"".toCharArray();
    _jsp_string8 = "/resources/bdp/bootstrap/css/bootstrap-3.0.3.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n<!--  \u5728\u7ebf\u7f16\u8f91\u5668-->\r\n<link href=\"".toCharArray();
  }
}