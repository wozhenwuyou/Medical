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
<link rel="stylesheet" type="text/css"
	href="/third-party/bootstrap-datetimepicker/css/bootstrap-datetimepicker.css" />
<link rel="stylesheet" type="text/css"
	href="/third-party/pagination/paging.css" />
</head>
<body>
	<%@ include file="/views/front/common/hospital/top.htm"%>
	<div class="pz_main">
		<%@ include file="/views/front/common/hospital/hospitalTop.htm"%>
		<!-- 顶部菜单栏 -->
		<div class="w_1000">
			<%@ include file="/views/front/common/hospital/hospitalLeft.htm"%><!-- 左边菜单栏 -->
			<div class="w_851">
				<div class="t_851_2">药品销售汇总</div>
				<div class="c_851">
					<div class="t_851_3">
						<table cellpadding="0" cellspacing="0" border="0">
							<tr height="44" valign="middle">
								<td width="70">医生：</td>
								<td width="80">
									<!-- <input type="text" class="text_input2" style="width: 80px;" id="doctorName" /> -->
									<select id="doctorName" class="text_input2"
									style="width: 80px;">
										<option value="">全部</option>
										<c:forEach items="${doctorList}" var="doctor">
											<option value="${doctor.realname}">${doctor.realname}</option>
										</c:forEach>
								</select>
								</td>
								<td width="70">药品：</td>
								<td width="80"><input type="text" class="text_input2"
									style="width: 80px;" id="medicationName" /></td>
								<td width="70">日期：</td>
								<td width="100"><input type="text" class="text_input2"
									style="width: 100px;" id="dateFrom" /></td>
								<td width="70">至：</td>
								<td width="100"><input type="text" class="text_input2"
									style="width: 100px;" id="dateTo" /></td>
								<td width="70">排序：</td>
								<td width="90"><select id="searchType" class="text_input2"
									style="width: 90px;">
										<option value="">请选择</option>
										<option value="1">日期升序</option>
										<option value="2">日期降序</option>
										<option value="3">药品升序</option>
										<option value="4">药品降序</option>
								</select></td>
								<!-- <td width="70"><select id="ascOrdesc" class="text_input2" style="width: 70px;">
										<option value="">请选择</option>
										<option value="ASC">升序</option>
										<option value="DESC">降序</option>
								</select></td> -->
								<td width="64"><input type="submit" class="sub_1"
									value="搜索" onclick="loadGridData()" /></td>
								<td width="64"><input type="submit" class="sub_1"
									value="重置" onclick="resetQuery()" style="margin-left: 10px;" /></td>
							</tr>
						</table>
					</div>
					<div class="d_851_1">
						<table cellpadding="0" cellspacing="0" border="0" width="849">
							<tbody id="dataListContainerList">
							</tbody>
						</table>
						<div class="fy_new">
							<div id="page" class="inline-center"></div>
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
	<%@ include file="/views/common/common_front_js.htm"%>
	<script type="text/javascript"
		src="/third-party/bootstrap-datetimepicker/js/bootstrap-datetimepicker.js"></script>
	<script type="text/javascript"
		src="/third-party/bootstrap-datetimepicker/js/locales/bootstrap-datetimepicker.zh-CN.js"></script>
	<script type="text/javascript"
		src="/js/front/domain/hospital/hospitalCommon.js" title="v"></script>
	<script type="text/javascript"
		src="/js/front/domain/hospital/medicationSumList.js" title="v"></script>

	<script id="template" type="x-tmpl-mustache"><!-- -->
		<tr height="53" align="center" style="font-size:14px; color:#63a13f">
        	<td width="95">药品名称</td>
			<td width="95">药品类型</td>
            <td width="70">销售总数</td>
        </tr>
		{{#rows}}
		<tr height="58" align="center" style="color:#666666">
	        <td width="70">{{medicationName}}</td>
	        <td width="155">{{medicationTypeName}}</td>
	        <td width="155">{{medicationSumCount}}</td>
	    </tr>
		{{/rows}}		 		 
	</script>
</body>
</html>

