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
<body style="min-width: 1000px;">
	<!-- 查询条件  开始 -->
	<table id="mainQueryTable">
		<tbody>
			<tr class="tr_ht" align="right">
				<td class="td_pad"><span>用户名：</span><input role="textbox"
					id="sc_patientName" class="domain-input easyui-textbox width140" /></td>
				<td class="td_pad"><span>排序：</span><input role="combobox"
					id="sc_ascOrdesc" class="domain-input easyui-combobox width140" /></td>
				<td class="td_pad"></td>
				<td class="td_pad"><button id="searchYes"
						onclick="doSearch();return false;"
						class="button button-primary button-rounded button-small">查
						询</button></td>
			</tr>
			<tr class="tr_ht" align="right">
				<td class="td_pad"><span>艾迪康编号：</span><input role="textbox"
					id="sc_adiconBarcodeLike"
					class="domain-input easyui-textbox width140" /></td>
				<td class="td_pad"><span>性别：</span><input role="combobox"
					id="sc_sex" class="domain-input easyui-combobox width140" /></td>
				<td class="td_pad"><span>状态：</span><input role="combobox"
					id="sc_mainStatus" class="domain-input easyui-combobox width140" /></td>
				<td class="td_pad"><button id="searchClear"
						onclick="clearSearch();return false;"
						class="button button-primary button-rounded button-small">重
						置</button></td>
			</tr>
		</tbody>
	</table>
	<div class="clear-both height10"></div>
	<!-- 查询条件 结束 -->
	<!-- <div id="opt_outer_div">
		<div class="fl_opt_div">
			<button role="opt_1" onclick="addMainObj()" class="button button-primary button-rounded button-small">添加</button>
			<button role="opt_1" id="btn_batchDelete" onclick="lh.commonBatchDelete()"  class="button button-primary button-rounded button-small">批量删除</button>
		</div>
	</div>  -->
	<div id="opt_outer_div">
		<div class="fl_opt_div">
			<button role="opt_1" onclick="addMainObj()"
				class="button button-primary button-rounded button-small">添加</button>
			<button role="opt_1" id="btn_batchDelete"
				onclick="lh.commonBatchDelete()"
				class="button button-primary button-rounded button-small">批量删除</button>
			<!-- <button role="opt_1" onclick="addMainObj()" class="button button-primary button-rounded button-small">添加</button>
			<button  onclick="resetPassword()" class="button button-primary button-rounded button-small">重置密码</button> -->
			<button onclick="exportpatientReport()"
				class="button button-primary button-rounded button-small">导出
				血液检测信息</button>
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

	<div id="mainObjWindiv" style="display: none; margin: 20px;">
		<div id='mainObjWin' class="easyui-window" title="血液检测"
			style="width: 700px;"
			data-options="modal:true,closed:true,maximizable:false,collapsible:false,minimizable:false">
			<div id="mainObjTip"></div>
			<form id="mainObjForm">
				<br />
				<table id="mainObjTable" class="padL5">
					<tbody>
						<tr class="tr_ht" align="right">
							<td class="td_pad"><span><span
									style="color: red; font-weight: bolder;">*</span>条形码：</span><input
								role="textbox" id="f_adiconBarcode"
								class="domain-input easyui-textbox width140"
								data-options="required:true" /></td>
							<td class="td_pad"><span><span
									style="color: red; font-weight: bolder;">*</span>用户：</span><input
								role="combobox" id="f_patientId"
								class="domain-input easyui-combobox width140"
								data-options="required:true" /></td>
							<td class="td_pad"><span><span
									style="color: red; font-weight: bolder;">*</span>关联医生：</span><input
								role="combobox" id="f_doctorId"
								class="domain-input easyui-combobox width140"
								data-options="required:true" /></td>
						</tr>
						<tr class="tr_ht" align="right">
							<td class="td_pad"><span><span
									style="color: red; font-weight: bolder;">*</span>身份证号：</span><input
								role="textbox" id="f_idcardNum"
								class="domain-input easyui-textbox width140"
								data-options="required:false" /></td>
							<td class="td_pad"><span><span
									style="color: red; font-weight: bolder;">*</span>患者姓名：</span><input
								role="textbox" id="f_patientName"
								class="domain-input easyui-textbox width140"
								data-options="required:false" /></td>
							<td class="td_pad"><span><span
									style="color: red; font-weight: bolder;">*</span>电话号码：</span><input
								role="textbox" id="f_phone"
								class="domain-input easyui-textbox width140"
								data-options="required:false" /></td>
							<!-- <td class="td_pad"><span>用户年龄：</span><input role="textbox" id="f_patientAge" class="domain-input easyui-textbox width140" data-options="required:false"/></td> -->
						</tr>
						<tr class="tr_ht" align="right">
							<td class="td_pad"><span><span
									style="color: red; font-weight: bolder;">*</span>年龄：</span><input
								role="numberbox" id="f_age"
								class="domain-input easyui-numberbox width140"
								data-options="required:false" /></td>
							<td class="td_pad"><span><span
									style="color: red; font-weight: bolder;">*</span>用户性别：</span><input
								role="combobox" id="f_sex"
								class="domain-input easyui-combobox width140"
								data-options="required:false" /></td>
							<td class="td_pad"><span><span
									style="color: red; font-weight: bolder;">*</span>用户职业：</span><input
								role="combobox" id="f_attrInt"
								class="domain-input easyui-combobox width140"
								data-options="required:false" /></td>
							<!-- <td class="td_pad"><span style="color:gray;">出生日期：</span><input role="datebox" id="f_birthday" class="domain-input easyui-datebox width140" data-options="required:false"/></td> -->
						</tr>
						<tr class="tr_ht" align="right">
							<!-- ,height:40,multiline:true,width:580 -->
							<td class="td_pad"><span><span
									style="color: red; font-weight: bolder;">*</span>采血日期：</span><input
								role="datebox" id="f_attrDate"
								class="domain-input easyui-datebox width140"
								data-options="required:true" /></td>
							<td class="td_pad" colspan="1"><span><span
									style="color: red; font-weight: bolder;">*</span>检测项：</span><input
								role="combobox" id="f_itemCodes"
								class="domain-input easyui-combobox width140"
								data-options="multiple:false,required:true" /></td>
							<td class="td_pad"><span><span
									style="color: red; font-weight: bolder;">*</span>状态：</span><input
								role="combobox" id="f_mainStatus"
								class="domain-input easyui-combobox width140" /></td>
						</tr>
					</tbody>
				</table>
			</form>
			<div class="inline-center mgV20">
				<button id="mainObjSave" onclick="saveMainObj()"
					class="button button-primary button-rounded button-small">保存</button>
				<button id="mainObjBack" onclick="closeMainObjWin()"
					class="button button-primary button-rounded button-small">返回</button>
			</div>
		</div>
	</div>

	<%@ include file="/views/common/common_js.htm"%>
	<%@ include file="/views/common/common_back_js.htm"%>
	<%@ include file="/views/common/common_upload_js.htm"%>
	<script type="text/javascript">
  		lh.paramJsonStr = '${paramJson}';
  	</script>
	<script type="text/javascript" src="/js/common/back_template.js"
		title="v"></script>
	<script type="text/javascript"
		src="/js/back/domain/user/patientReport.js" title="v"></script>
</body>
</html>