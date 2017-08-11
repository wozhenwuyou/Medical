<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/views/common/meta_info.htm"%>
<%@ include file="/views/common/common_back_css.htm"%>
<link rel="stylesheet" type="text/css" href="/css/back/back.css"
	title="v" />
</head>
<body style="min-width: 1200px;">
	<!-- 查询条件  开始 -->
	<table id="mainQueryTable">
		<tbody>
			<tr class="tr_ht" align="right">
				<td class="td_pad"><span>预约时间：</span><input role="datebox"
					id="sc_bespeakTime" class="domain-input easyui-datebox width140" /></td>
				<td class="td_pad"><span>类型：</span><input role="combobox"
					id="sc_typeId" class="domain-input easyui-combobox width140" /></td>
				<td class="td_pad"><span>服务项目：</span><input role="combobox"
					id="sc_isRegisterAgent"
					class="domain-input easyui-combobox width140" /></td>
				<td class="td_pad"><span>检测类型：</span><input role="combobox"
					id="sc_cancerTypes" class="domain-input easyui-combobox width140" /></td>
				<td class="td_pad"><button id="searchYes"
						onclick="doSearch();return false;"
						class="button button-primary button-rounded button-small">查
						询</button></td>
			</tr>
			<tr class="tr_ht" align="right">
				<td class="td_pad"><span>医生：</span><input role="combobox"
					id="sc_doctorId" class="domain-input easyui-combobox width140" /></td>
				<td class="td_pad"><span>基本病情：</span><input role="textbox"
					id="sc_baseCondition" class="domain-input easyui-textbox width140" /></td>
				<td class="td_pad"><span>状态：</span><input role="combobox"
					id="sc_mainStatus" class="domain-input easyui-combobox width140" /></td>
				<td class="td_pad"><span>排序：</span><input role="combobox"
					id="sc_ascOrdesc" class="domain-input easyui-combobox width140" /></td>
				<!-- <td class="td_pad"></td> -->
				<td class="td_pad"><button id="searchClear"
						onclick="clearSearch();return false;"
						class="button button-primary button-rounded button-small">重
						置</button></td>
			</tr>
		</tbody>
	</table>
	<div class="clear-both height10"></div>
	<!-- 查询条件 结束 -->
	<div id="opt_outer_div">
		<div class="fl_opt_div">
			<button role="opt_1" id="btn_batchDelete"
				onclick="lh.commonBatchDelete()"
				class="button button-primary button-rounded button-small">批量删除</button>
			<button role="opt_1" onclick="addMainObj()"
				class="button button-primary button-rounded button-small">添加</button>
			<button role="opt_2" id="btn_batchRecover"
				onclick="lh.commonBatchRecover()"
				class="hide button button-primary button-rounded button-small">批量恢复</button>
			<button role="opt_2" id="btn_throughDelete"
				onclick="lh.commonBatchThoroughDelete()"
				class="hide button button-primary button-rounded button-small">彻底删除</button>

		</div>
		<div class="fr_opt_div">
			<button role="opt_1" id="btn_trash" onclick="lh.commonShowTrash()"
				class="button button-primary button-rounded button-small">回收站</button>
			<button role="opt_2" id="btn_trashBack"
				onclick="lh.commonReturnBack()"
				class="hide button button-primary button-rounded button-small">返回</button>
		</div>
	</div>
	<!-- 表格  开始 -->
	<div id='datagrid_div'>
		<table id="datagrid"></table>
	</div>
	<!-- 表格  结束 -->

	<div id="mainObjWindiv" style="display: none;">
		<div id='mainObjWin' class="easyui-window" title="预约"
			style="width: 680px;"
			data-options="modal:true,closed:true,maximizable:false,collapsible:false,minimizable:false">
			<div id="mainObjTip"></div>
			<form id="mainObjForm">
				<br />
				<table id="mainObjTable" class="padL5">
					<tbody>
						<tr class="tr_ht" align="right">
							<td class="td_pad"><span><span
									style="color: red; font-weight: bolder;">*</span>预约时间：</span><input
								role="datetimebox" id="f_bespeakTime"
								class="domain-input easyui-datetimebox width140"
								data-options="required:true" /></td>
							<td class="td_pad"><span><span
									style="color: red; font-weight: bolder;">*</span>类型：</span><input
								role="combobox" id="f_typeId"
								class="domain-input easyui-combobox width140"
								data-options="required:true" /></td>
							<td class="td_pad"><span>医生：</span><input role="combobox"
								id="f_doctorId" class="domain-input easyui-combobox width140"
								data-options="required:false" /></td>
						</tr>
						<tr class="tr_ht" align="right">
							<td class="td_pad"><span>服务项目：</span><input role="combobox"
								id="f_isRegisterAgent"
								class="domain-input easyui-combobox width140" /></td>
							<td class="td_pad"><span>检测类型：</span><input role="combobox"
								id="f_cancerTypes" class="domain-input easyui-combobox width140" /></td>
							<td class="td_pad"><span>处理情况：</span><input role="combobox"
								id="f_logicStatus" class="domain-input easyui-combobox width140" /></td>
						</tr>
						<tr class="tr_ht" align="right">
							<td class="td_pad"><span>状态：</span><input role="combobox"
								id="f_mainStatus" class="domain-input easyui-combobox width140"
								data-options="required:false" /></td>
						</tr>
						<tr class="tr_ht" align="right">
							<td class="td_pad" colspan="3"><span>基本病情：</span><input
								role="textbox" id="f_baseCondition"
								class="domain-input easyui-textbox width140"
								data-options="required:false,multiline:true,height:100,width:580" /></td>
						</tr>
					</tbody>
				</table>
			</form>
			<div class="inline-center mgV40">
				<button id="mainObjSave" onclick="saveMainObj()"
					class="button button-primary button-rounded button-small">保存</button>
				<button id="mainObjBack" onclick="closeMainObjWin()"
					class="button button-primary button-rounded button-small">返回</button>
			</div>
		</div>
	</div>
	<%@ include file="/views/common/common_js.htm"%>
	<%@ include file="/views/common/common_back_js.htm"%>
	<script type="text/javascript">
  		lh.paramJsonStr = '${paramJson}';
  	</script>
	<script type="text/javascript" src="/js/common/back_template.js"
		title="v"></script>
	<script type="text/javascript" src="/js/back/domain/bespeak/bespeak.js"
		title="v"></script>
</body>
</html>