<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/views/common/meta_info.htm"%>
<%@ include file="/views/common/common_css.htm"%>
<link rel="stylesheet" type="text/css" href="/css/front/style.css"
	title="v" />
</head>
<body>
	<%@ include file="/views/front/common/doctor/top.htm"%>
	<div class="pz_main">
		<%@ include file="/views/front/common/doctor/doctorTop.htm"%>
		<div class="w_1000">
			<%@ include file="/views/front/common/doctor/doctorLeft.htm"%><!-- 左边菜单栏 -->
			<div class="w_851">
				<div class="c_851">
					<div class="t_851_2">写随手记</div>
					<div class="d_851_form">
						<div class="title">
							<table cellpadding="0" cellspacing="0" border="0" width="811">
								<tr height="58" valign="middle" align="left">
									<td width="46" style="color: #333333; font-size: 14px;">标题：</td>
									<td width="435"><input type="text" id="title"
										class="input5" /></td>
									<td width="330" style="color: #5c8c3f">（1~50字）</td>
								</tr>
								<%--  <tr>
                                    <td width="67" style="line-height:30px;">封面图片</td>
		                           	<td>
		                        	<div style="display:inline-block;float:left;">
										 <img  id="pic" class="picurl"  src="${pic.picPath}" style="height:60px;max-width:100px;overflow:hidden;padding:5px;"/>
										 <input type="hidden" name="filePaths" id="filePaths" value="${pic.picPath}"/>
										 <input type="hidden" name="fileDBIds" id="fileDBIds"/>
									 </div>
									 <button id="browse" type="button" class="sub_fil hover" >选择图片</button>
		                       		</td>
			                    </tr>
		                        <tr>
		                        	<td colspan="3" >
		                        		 <div id="upload_outer_div" style="margin-top:30px;"><!-- 上传文件进度展示 --></div>
		                        	</td>
		                        </tr> --%>
							</table>
						</div>
						<div class="text1">
							<div class="edit">
								<script id="editor" type="text/plain"
									style="width: 810px; height: 420px;"></script>
							</div>
							<div class="form"></div>
						</div>
						<div class="Submit" style="padding-left: 220px;">
							<input type="submit" style="margin: 5px;" class="input9"
								onclick="addOrUpdateArticle();" value="提交 " /> <input
								type="submit" style="margin: 5px;" class="input9"
								onclick="lh.back();" value="返回" />
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="pz_down">
		<%@ include file="/views/front/common/bottom.htm"%><!-- 底部栏 -->
	</div>
	<%@ include file="/views/common/common_js.htm"%>
	<%@ include file="/views/common/common_ueditor_js.htm"%>
	<%@ include file="/views/common/common_front_js.htm"%>
	<%-- <%@ include file="/views/common/common_upload_js.htm"%> --%>
	<script type="text/javascript"> lh.param = ${paramJson}; </script>
	<script type="text/javascript"
		src="/js/front/domain/doctor/doctorCommon.js" title="v"></script>
	<script type="text/javascript"
		src="/js/front/base/article/addOrUpdateArticlePrivate.js" title="v"></script>
</body>
</html>
