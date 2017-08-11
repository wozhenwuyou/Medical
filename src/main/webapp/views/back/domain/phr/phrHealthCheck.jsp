<!doctype html>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>

<head>
<meta http-equiv=Content-Type content="text/html; charset=utf-8">
<meta name=Generator content="Microsoft Word 14 (filtered)">
<link type="text/css" rel="stylesheet" href="/third-party/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/third-party/bootstrap-datetimepicker/css/bootstrap-datetimepicker.css" />
<style>
<!-- /* Font Definitions */
@font-face {
	font-family: 宋体;
	panose-1: 2 1 6 0 3 1 1 1 1 1;
}

@font-face {
	font-family: "Cambria Math";
	panose-1: 2 4 5 3 5 4 6 3 2 4;
}

@font-face {
	font-family: 仿宋_GB2312;
}

@font-face {
	font-family: "\@宋体";
	panose-1: 2 1 6 0 3 1 1 1 1 1;
}

@font-face {
	font-family: "\@仿宋_GB2312";
}
/* Style Definitions */
p.MsoNormal, li.MsoNormal, div.MsoNormal {
	margin: 0cm;
	margin-bottom: .0001pt;
	text-align: justify;
	text-justify: inter-ideograph;
	font-size: 10.5pt;
	font-family: "Times New Roman", "serif";
}

p.MsoHeader, li.MsoHeader, div.MsoHeader {
	mso-style-link: "页眉 Char";
	margin: 0cm;
	margin-bottom: .0001pt;
	text-align: center;
	layout-grid-mode: char;
	border: none;
	padding: 0cm;
	font-size: 9.0pt;
	font-family: "Calibri", "sans-serif";
}

p.MsoFooter, li.MsoFooter, div.MsoFooter {
	mso-style-link: "页脚 Char";
	margin: 0cm;
	margin-bottom: .0001pt;
	layout-grid-mode: char;
	font-size: 9.0pt;
	font-family: "Calibri", "sans-serif";
}

span.Char {
	mso-style-name: "页眉 Char";
	mso-style-link: 页眉;
}

span.Char0 {
	mso-style-name: "页脚 Char";
	mso-style-link: 页脚;
}

.MsoChpDefault {
	font-family: "Calibri", "sans-serif";
}
/* Page Definitions */
@page WordSection1 {
	size: 595.3pt 841.9pt;
	margin: 72.0pt 90.0pt 72.0pt 90.0pt;
	layout-grid: 15.6pt;
}

div.WordSection1 {
	page: WordSection1;
}
-->
</style>
<%
String openType = request.getParameter("openType");
request.setAttribute("openType", openType);
%>
</head>

<body lang=ZH-CN style='text-justify-trim: punctuation'>
<!--print start-->
	<div class=WordSection1 style='layout-grid: 15.6pt'>

		<div align=center>
			<form id="phrHealthCheckForm" method="POST" action="/back/phr/phrHealthCheck/save">
				<!-- 隐藏字段 -->
				<input type="hidden" name="id" value="${model.id }" id="id" />
			<table class=MsoNormalTable border=1 cellspacing=0 cellpadding=0
				style='border-collapse: collapse; border: none'>
				<tr style='height: 1.0pt'>
					<td width=108 colspan=2
						style='width: 81.0pt; border: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'><p
							class="MsoNormal" style="line-height: 16.0pt">
							<span style="font-family: 宋体; color: blue">体检日期</span>
						</p></td>
					<td width=207 colspan=4
						style='width: 155.25pt; border: solid windowtext 1.0pt; border-left: none; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'><p
							class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<input type="text" name="tjrq" id="tjrq"
								value='<fmt:formatDate value="${model.tjrq }" pattern="yyyy-MM-dd" />'>
						</p></td>
					<td width=106 colspan=6
						style='width: 79.45pt; border: solid windowtext 1.0pt; border-left: none; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'><p
							align="center" class="MsoNormal"
							style="text-align: center; line-height: 16.0pt">
							<span style="font-family: 宋体; color: blue">责任医生</span>
						</p></td>
					<td width=168 colspan=10
						style='width: 125.8pt; border: solid windowtext 1.0pt; border-left: none; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span lang=EN-US style='font-family: 仿宋_GB2312; color: blue'>
								<input type="text" name="zrys" id="zrys" value="${model.zrys }">
								&nbsp;
							</span>
						</p>
					</td>
				</tr>
				<tr style='height: 1.0pt'>
					<td width=57
						style='width: 42.75pt; border: solid windowtext 1.0pt; border-top: none; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<b><span style='font-family: 宋体'>内</span></b><b><span
								style='font-family: 仿宋_GB2312'> </span></b><b><span
								style='font-family: 宋体'>容</span></b>
						</p>
					</td>
					<td width=532 colspan=21
						style='width: 398.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=center
							style='margin-left: 10.5pt; text-align: center; line-height: 16.0pt'>
							<b><span style='font-family: 宋体'>检</span></b><b><span
								lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp; </span></b><b><span
								style='font-family: 宋体'>查</span></b><b><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp; </span></b><b><span
								style='font-family: 宋体'>项</span></b><b><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp; </span></b><b><span
								style='font-family: 宋体'>目</span></b>
						</p>
					</td>
				</tr>
				<tr style='height: 51.5pt'>
					<td width=57 rowspan=2
						style='width: 42.75pt; border: solid windowtext 1.0pt; border-top: none; padding: 0cm 0cm 0cm 0cm; height: 51.5pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>症</span>
						</p>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>状</span>
						</p>
					</td>
					<td width=532 colspan=21 valign=top
						style='width: 398.75pt; border: none; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 51.5pt'>
						<p class=MsoNormal
							style='margin-right: 4.2pt; line-height: 16.0pt'>
							<span style='font-family: 宋体'> <input type="checkbox"
								name="zhengzhuang" value="无症状"
								${fn:contains(model.zhengzhuang, '无症状') ? 'checked' : '' }>
								无症状
							</span><span style='font-family: 宋体'> <input type="checkbox"
								name="zhengzhuang" value="头痛"
								${fn:contains(model.zhengzhuang, '头痛') ? 'checked' : '' }>
								头痛
							</span><span lang=EN-US style='font-family: 仿宋_GB2312'> <input
								type="checkbox" name="zhengzhuang" value="头晕"
								${fn:contains(model.zhengzhuang, '头晕') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>头晕</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'> <input type="checkbox"
								name="zhengzhuang" value="心悸"
								${fn:contains(model.zhengzhuang, '心悸') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>心悸</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="zhengzhuang" value="胸闷"
								${fn:contains(model.zhengzhuang, '胸闷') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>胸闷</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="zhengzhuang" value="胸痛"
								${fn:contains(model.zhengzhuang, '胸痛') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>胸痛</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="zhengzhuang" value="慢性咳嗽"
								${fn:contains(model.zhengzhuang, '慢性咳嗽') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>慢性咳嗽</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="zhengzhuang" value="咳痰"
								${fn:contains(model.zhengzhuang, '咳痰') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>咳痰</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="zhengzhuang" value="呼吸困难"
								${fn:contains(model.zhengzhuang, '呼吸困难') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>呼吸困难</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="zhengzhuang" value="多饮"
								${fn:contains(model.zhengzhuang, '多饮') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>多饮</span><span
								style='font-family: 仿宋_GB2312'> </span>
						</p>
						<p class=MsoNormal
							style='margin-right: 4.2pt; line-height: 16.0pt'>
							<span style="font-family: 仿宋_GB2312"> <input
								type="checkbox" name="zhengzhuang" value="多尿"
								${fn:contains(model.zhengzhuang, '多尿') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>多尿</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="zhengzhuang" value="体重下降"
								${fn:contains(model.zhengzhuang, '体重下降') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>体重下降</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="zhengzhuang" value="乏力"
								${fn:contains(model.zhengzhuang, '乏力') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>乏力</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="zhengzhuang" value="关节肿痛"
								${fn:contains(model.zhengzhuang, '关节肿痛') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>关节肿痛</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="zhengzhuang" value="视力模糊"
								${fn:contains(model.zhengzhuang, '视力模糊') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>视力模糊</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="zhengzhuang" value="手脚麻木"
								${fn:contains(model.zhengzhuang, '手脚麻木') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>手脚麻木</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="zhengzhuang" value="尿急"
								${fn:contains(model.zhengzhuang, '尿急') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>尿急</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="zhengzhuang" value="尿痛"
								${fn:contains(model.zhengzhuang, '尿痛') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>尿痛</span>
						</p>
						<p class=MsoNormal
							style='margin-right: 4.2pt; line-height: 16.0pt'>
							<span style="font-family: 仿宋_GB2312"> <input
								type="checkbox" name="zhengzhuang" value="便秘"
								${fn:contains(model.zhengzhuang, '便秘') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>便秘</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="zhengzhuang" value="腹泻"
								${fn:contains(model.zhengzhuang, '腹泻') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>腹泻</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="zhengzhuang" value="恶心呕吐"
								${fn:contains(model.zhengzhuang, '恶心呕吐') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>恶心呕吐</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="zhengzhuang" value="眼花"
								${fn:contains(model.zhengzhuang, '眼花') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>眼花</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="zhengzhuang" value="耳鸣"
							${fn:contains(model.zhengzhuang, '耳鸣') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>耳鸣</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="zhengzhuang" value="乳房胀痛"
							${fn:contains(model.zhengzhuang, '乳房胀痛') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>乳房胀痛</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="zhengzhuang" value="其他"
								${fn:contains(model.zhengzhuang, '其他') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>其他</span><span
								style='font-family: 仿宋_GB2312'><span lang=EN-US> <input
									type="text" name="zhengzhuangQt" id="zhengzhuangQt" value="${model.zhengzhuangQt }">
							</span></span>
						</p>
					</td>
				</tr>
				<tr style='height: 12.05pt'>
					<td width=261 colspan=6 valign=top
						style='width: 195.9pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 12.05pt'>
						<p class=MsoNormal align=right
							style='margin-right: 4.2pt; text-align: right; line-height: 16.0pt'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span>
						</p>
					</td>
					<td width=270 colspan=15 valign=top
						style='width: 202.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 12.05pt'>
						<p class=MsoNormal align=right
							style='margin-right: 4.2pt; text-align: right; line-height: 16.0pt'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 1.0pt'>
					<td width=57 rowspan=10
						style='width: 42.75pt; border: solid windowtext 1.0pt; border-top: none; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>一</span>
						</p>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>般</span>
						</p>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>状</span>
						</p>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>况</span>
						</p>
					</td>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>体</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;&nbsp; </span><span
								style='font-family: 宋体'>温</span>
						</p>
					</td>
					<td width=156 colspan=3
						style='width: 116.65pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=right
							style='margin-right: 10.5pt; text-align: right; line-height: 16.0pt'>
							<b><span style='font-family: 宋体; color: blue'> <input
									type="text" name="ybqkTw" style="width:80px;" id="ybqkTw" value="${model.ybqkTw }">
									℃
							</span></b>
						</p>
					</td>
					<td width=81 colspan=4
						style='width: 60.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>脉</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;&nbsp; </span><span
								style='font-family: 宋体'>率</span>
						</p>
					</td>
					<td width=193 colspan=12
						style='width: 144.5pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=right
							style='margin-right: 6.2pt; text-align: right; line-height: 16.0pt'>
							<b><span style='font-family: 宋体; color: blue'> <input
									type="text" name="ybqkMl" id="ybqkMl" value="${model.ybqkMl }" width="80px">
									次
							</span></b><b><span lang=EN-US
								style='font-family: 仿宋_GB2312; color: blue'>/</span></b><b><span
								style='font-family: 宋体; color: blue'>分钟</span></b>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 1.0pt'>
					<td width=102 colspan=2 rowspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>呼吸频率</span>
						</p>
					</td>
					<td width=156 colspan=3 rowspan=2
						style='width: 116.65pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=right
							style='margin-right: 10.5pt; text-align: right; line-height: 16.0pt'>
							<b><span style='font-family: 宋体; color: blue'> <input
									type="text" name="ybqkHxpl" id="ybqkHxpl" value="${model.ybqkHxpl }" style="width:40px;">
									次
							</span></b><b><span lang=EN-US
								style='font-family: 仿宋_GB2312; color: blue'>/</span></b><b><span
								style='font-family: 宋体; color: blue'>分钟</span></b>
						</p>
					</td>
					<td width=81 colspan=4 rowspan=2
						style='width: 60.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>血</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;&nbsp; </span><span
								style='font-family: 宋体'>压</span>
						</p>
					</td>
					<td width=55 colspan=4
						style='width: 41.55pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=center
							style='margin-top: 0cm; margin-right: 3.55pt; margin-bottom: 0cm; margin-left: 0cm; margin-bottom: .0001pt; text-align: center; text-indent: -1.05pt; line-height: 16.0pt'>
							<span style='font-family: 宋体'>左</span><span
								style='font-family: 仿宋_GB2312'> </span><span
								style='font-family: 宋体'>侧</span>
						</p>
					</td>
					<td width=137 colspan=8
						style='width: 102.95pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=right
							style='margin-right: 6.2pt; text-align: right; line-height: 16.0pt'>
							<b><span style="font-family: 宋体; color: blue"> <input
									type="text" name="ybqkXwZc1" id="ybqkXwZc1" value="${model.ybqkXwZc1 }" style="width:60px">
							</span><span lang=EN-US style='font-family: 仿宋_GB2312; color: blue'>/&nbsp;&nbsp;</span><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="ybqkXwZc2" id="ybqkXwZc2" value="${model.ybqkXwZc2 }" style="width:60px">
							</span><span lang=EN-US style='font-family: 仿宋_GB2312; color: blue'>&nbsp;&nbsp;&nbsp;&nbsp;
									mmHg</span></b>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 1.0pt'>
					<td width=55 colspan=4
						style='width: 41.55pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=center
							style='margin-top: 0cm; margin-right: 3.55pt; margin-bottom: 0cm; margin-left: 0cm; margin-bottom: .0001pt; text-align: center; text-indent: -1.05pt; line-height: 16.0pt'>
							<span style='font-family: 宋体'>右</span><span
								style='font-family: 仿宋_GB2312'> </span><span
								style='font-family: 宋体'>侧</span>
						</p>
					</td>
					<td width=137 colspan=8
						style='width: 102.95pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=right
							style='margin-right: 6.2pt; text-align: right; line-height: 16.0pt'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'><b><span
									style="font-family: 宋体; color: blue"> <input type="text"
										name="ybqkXwYc1" id="ybqkXwYc1" style="width:60px" value="${model.ybqkXwYc1 }">
								</span></b>/&nbsp;&nbsp;<b><span style="font-family: 宋体; color: blue">
										<input type="text" name="ybqkXwYc2" id="ybqkXwYc2" style="width:60px" value="${model.ybqkXwYc2 }"
										width="80px">
								</span></b>&nbsp;&nbsp;&nbsp;&nbsp; mmHg</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 1.0pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>身</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;&nbsp; </span><span
								style='font-family: 宋体'>高</span>
						</p>
					</td>
					<td width=156 colspan=3
						style='width: 116.65pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=right
							style='margin-right: 10.5pt; text-align: right; line-height: 16.0pt'>
							<b><span style="font-family: 宋体; color: blue"> <input
									type="text" name="ybqkSg" id="ybqkSg" value="${model.ybqkSg }" style="width:80px;">
							</span><span lang=EN-US style='font-family: 仿宋_GB2312; color: blue'>cm</span></b>
						</p>
					</td>
					<td width=81 colspan=4
						style='width: 60.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>体</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;&nbsp; </span><span
								style='font-family: 宋体'>重</span>
						</p>
					</td>
					<td width=193 colspan=12
						style='width: 144.5pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=right
							style='margin-right: 6.2pt; text-align: right; line-height: 16.0pt'>
							<b><span style="font-family: 宋体; color: blue"> <input
									type="text" name="ybqkTz" id="ybqkTz" value="${model.ybqkTz }" style="width:80px;">
							</span><span lang=EN-US style='font-family: 仿宋_GB2312; color: blue'>Kg</span></b>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 1.0pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>腰</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;&nbsp; </span><span
								style='font-family: 宋体'>围</span>
						</p>
					</td>
					<td width=156 colspan=3
						style='width: 116.65pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=right
							style='margin-right: 10.5pt; text-align: right; line-height: 16.0pt'>
							<b><span style="font-family: 宋体; color: blue"> <input
									type="text" name="ybqkYw" id="ybqkYw" value="${model.ybqkYw }" style="width:80px;">
							</span><span lang=EN-US style='font-family: 仿宋_GB2312; color: blue'>cm</span></b>
						</p>
					</td>
					<td width=81 colspan=4
						style='width: 60.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>体质指数（</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>BMI</span><span
								style='font-family: 宋体'>）</span>
						</p>
					</td>
					<td width=193 colspan=12
						style='width: 144.5pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=right
							style='margin-right: 6.2pt; text-align: right; line-height: 16.0pt'>
							<b><span style="font-family: 宋体; color: blue"> <input
									type="text" name="ybqkTzzs" id="ybqkTzzs" value="${model.ybqkTzzs }" width="80px">
							</span><span lang=EN-US style='font-family: 仿宋_GB2312; color: blue'>Kg/m2</span></b>
						</p>
					</td>
				</tr>
				
				<tr style='page-break-inside: avoid; height: 1.0pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>臀</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;&nbsp; </span><span
								style='font-family: 宋体'>围</span>
						</p>
					</td>
					<td width=156 colspan=3
						style='width: 116.65pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=right
							style='margin-right: 10.5pt; text-align: right; line-height: 16.0pt'>
							<b><span style="font-family: 宋体; color: blue"> <input
									type="text" name="ybqkTunWei" id="ybqkTunWei" value="${model.ybqkTunWei }" style="width:80px;">
							</span><span lang=EN-US style='font-family: 仿宋_GB2312; color: blue'>cm</span></b>
						</p>
					</td>
					<td width=81 colspan=4
						style='width: 60.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>腰臀围比值</span>
						</p>
					</td>
					<td width=193 colspan=12
						style='width: 144.5pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=right
							style='margin-right: 6.2pt; text-align: right; line-height: 16.0pt'>
							<b><span style="font-family: 宋体; color: blue"> <input
									type="text" name="ybqkYtwbz" id="ybqkYtwbz" value="${model.ybqkYtwbz }" style="width:195px;">
							</span></b>
						</p>
					</td>
				</tr>
				
				<tr style='page-break-inside: avoid; height: 28.9pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 28.9pt'><p
							align="center" class="MsoNormal"
							style="text-align: center; line-height: 16.0pt">
							<b><span style="font-family: 宋体; color: lime">老年人健康状态自我评估</span></b><b><span
								style="font-family: 仿宋_GB2312; color: lime" lang="EN-US">*</span></b>
						</p></td>
					<td width=388 colspan=18
						style='width: 291.15pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 28.9pt'>
						<p class=MsoNormal
							style='margin-right: 10.5pt; line-height: 16.0pt'>
							<span style="font-family: 宋体"> <input type="radio"
								name="ybqkZwpgJkzk" value="满意" ${model.ybqkZwpgJkzk == '满意' ? 'checked' : ''  }>
							</span><span style='font-family: 宋体'>满意</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;<span
								style="font-family: 宋体"> <input type="radio" name="ybqkZwpgJkzk"
								value="基本满意" ${model.ybqkZwpgJkzk == '基本满意' ? 'checked' : ''  }>
							</span></span><span style='font-family: 宋体'>基本满意</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;<span
								style="font-family: 宋体"> <input type="radio" name="ybqkZwpgJkzk"
								value="说不清楚" ${model.ybqkZwpgJkzk == '说不清楚' ? 'checked' : ''  }>
							</span></span><span style='font-family: 宋体'>说不清楚</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;</span><span
								style="font-family: 宋体"> <input type="radio" name="ybqkZwpgJkzk"
								value="不太满意" ${model.ybqkZwpgJkzk == '不太满意' ? 'checked' : ''  }>
							</span><span style='font-family: 宋体'>不太满意</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;<span
								style="font-family: 宋体"> <input type="radio" name="ybqkZwpgJkzk"
								value="不满意" ${model.ybqkZwpgJkzk == '不满意' ? 'checked' : ''  }>
							</span></span><span style='font-family: 宋体'>不满意</span>
						</p>
					</td>
					<td width=41 colspan=1
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 28.9pt'>
						<p class=MsoNormal align=right
							style='margin-left: 5.25pt; text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 1.0pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'><p
							align="center" class="MsoNormal"
							style="text-align: center; text-indent: 5.25pt; line-height: 16.0pt">
							<b><span style="font-family: 宋体; color: lime">老年人生活自理能力自我评估</span></b><b><span
								style="font-family: 仿宋_GB2312; color: lime" lang="EN-US">*</span></b>
						</p></td>
					<td width=388 colspan=17
						style='width: 291.15pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 宋体"> <input type="radio"
								name="ybqkZwpgZlnl" value="可自理" ${model.ybqkZwpgZlnl == '可自理' ? 'checked' : ''  }>
							</span><span style='font-family: 宋体'>可自理（</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>0</span><span
								style='font-size: 12.0pt; font-family: 宋体'>～</span><span
								lang=EN-US style='font-family: 仿宋_GB2312'>3</span><span
								style='font-family: 宋体'>分）</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;&nbsp;&nbsp;&nbsp;<span
								style="font-family: 宋体"> <input type="radio" name="ybqkZwpgZlnl"
							 value="轻度依赖" ${model.ybqkZwpgZlnl == '轻度依赖' ? 'checked' : ''  }>
							</span></span><span style='font-family: 宋体'>轻度依赖（</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>4</span><span
								style='font-size: 12.0pt; font-family: 宋体'>～</span><span
								lang=EN-US style='font-family: 仿宋_GB2312'>8</span><span
								style='font-family: 宋体'>分）</span>
						</p>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 宋体"> <input type="radio"
								name="ybqkZwpgZlnl" value="中度依赖" ${model.ybqkZwpgZlnl == '中度依赖' ? 'checked' : ''  }>
							</span><span style='font-family: 宋体'>中度依赖（</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>9</span><span
								style='font-size: 12.0pt; font-family: 宋体'>～</span><span
								lang=EN-US style='font-family: 仿宋_GB2312'>18</span><span
								style='font-family: 宋体'>分</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>)&nbsp;&nbsp; 4<span
								style="font-family: 宋体"> <input type="radio" name="ybqkZwpgZlnl"
									value="不能自理" ${model.ybqkZwpgZlnl == '不能自理' ? 'checked' : ''  }>
							</span></span><span style='font-family: 宋体'>不能自理（≥</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>19</span><span
								style='font-family: 宋体'>分）</span>
						</p>
					</td>
					<td width=41 colspan=2
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=right
							style='text-align: right; text-indent: 10.5pt; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 1.0pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=center
							style='text-align: center; text-indent: 5.25pt; line-height: 16.0pt'>
							<span style='font-family: 宋体'>老年人</span>
						</p>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>认知功能</span><span lang=EN-US>*</span>
						</p>
					</td>
					<td width=388 colspan=17
						style='width: 291.15pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 宋体"> <input type="radio"
								name="ybqkRzgn" value="粗筛阴性" ${model.ybqkRzgn == '粗筛阴性' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>粗筛阴性</span>
						</p>
						<p class=MsoNormal
							style='line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 宋体"> <input type="radio"
								name="ybqkRzgn" value="粗筛阳性" ${model.ybqkRzgn == '粗筛阳性' ? 'checked' : '' }> 粗筛阳性，
							</span> <span style='font-family: 宋体'>简易智力状态检查，总分</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="ybqkRzgnZf" id="ybqkRzgnZf" value="${model.ybqkRzgnZf }" style="width:40px;">
							</span></b>
						</p>
					</td>
					<td width=41 colspan=2
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=right
							style='margin-left: 5.25pt; text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US>&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 1.0pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>老年人</span>
						</p>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>情感状态</span><span lang=EN-US>*</span>
						</p>
					</td>
					<td width=388 colspan=17
						style='width: 291.15pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 宋体"> <input type="radio"
								name="ybqkQgzt" value="粗筛阴性" ${model.ybqkQgzt == '粗筛阴性' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>粗筛阴性</span>
						</p>
						<p align="left" class="MsoNormal"
							style="text-align: left; line-height: 16.0pt; layout-grid-mode: char">
							<span style="font-family: 宋体"> <input name="ybqkQgzt"
								type="radio" value="粗筛阳性" ${model.ybqkQgzt == '粗筛阳性' ? 'checked' : '' }>
							</span><span style="font-family: 宋体">粗筛阳性，</span><span
								style="font-family: 仿宋_GB2312"> </span><span
								style="font-family: 宋体">老年人抑郁评分检查，总分</span> <input
											name="ybqkQgztZf" type="text" id="ybqkQgztZf" value="${model.ybqkQgztZf }" style="width:40px;">
						</p>
					</td>
					<td width=41 colspan=2
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=right
							style='margin-left: 5.25pt; text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span>
						</p>
						<p class=MsoNormal align=right
							style='margin-left: 121.95pt; text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US>&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 1.0pt'>
					<td width=57 rowspan=13
						style='width: 42.75pt; border: solid windowtext 1.0pt; border-top: none; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>生</span>
						</p>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>活</span>
						</p>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>方</span>
						</p>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>式</span>
						</p>
					</td>
					<td width=102 colspan=2 rowspan=3
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>体育锻炼</span>
						</p>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<b><span style='font-family: 宋体; color: lime'>（如选有则该栏全部要填）</span></b>
						</p>
					</td>
					<td width=95
						style='width: 71.1pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>锻炼频率</span>
						</p>
					</td>
					<td width=293 colspan=18
						style='width: 220.05pt; border: none; border-right: solid windowtext 1.0pt;border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 宋体"> <input type="radio"
								name="shfsTydlDlpl"  value="每天" ${model.shfsTydlDlpl == '每天' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>每天</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp; <span
								style="font-family: 宋体"> <input type="radio" name="shfsTydlDlpl"
									 value="每周一次以上" ${model.shfsTydlDlpl == '每周一次以上' ? 'checked' : '' }>
							</span></span><span style='font-family: 宋体'>每周一次以上</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp; <span
								style="font-family: 宋体"> <input type="radio" name="shfsTydlDlpl"
									 value="偶尔" ${model.shfsTydlDlpl == '偶尔' ? 'checked' : '' }>
							</span></span><span style='font-family: 宋体'>偶尔</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp; <span
								style="font-family: 宋体"> <input type="radio" name="shfsTydlDlpl"
									 value="不锻炼" ${model.shfsTydlDlpl == '不锻炼' ? 'checked' : '' }>
							</span></span><span style='font-family: 宋体'>不锻炼</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 1.0pt'>
					<td width=95
						style='width: 71.1pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>每次锻炼时间</span>
						</p>
					</td>
					<td width=95 colspan=5
						style='width: 71.15pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=right
							style='margin-right: 10.5pt; text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<b><span style="font-family: 宋体; color: blue"> <input
									type="text" name="shfsTydlMcdlsj" id="shfsTydlMcdlsj" style="width:40px;" value="${model.shfsTydlMcdlsj }">
							</span><span style='font-family: 宋体; color: blue'>分钟</span></b>
						</p>
					</td>
					<td width=113 colspan=6
						style='width: 84.8pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>坚持锻炼时间</span>
						</p>
					</td>
					<td width=126 colspan=7
						style='width: 94.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'><p
							class=MsoNormal align=left
							style='text-align: left; text-indent: 79.05pt; line-height: 16.0pt; layout-grid-mode: char'>
							<b><span style="font-family: 宋体; color: blue"> <input
									type="text" name="shfsTydlJcdlsj" id="shfsTydlJcdlsj" style="width:40px" value="${model.shfsTydlJcdlsj }">
							</span><span style='font-family: 宋体; color: blue'>年</span></b>
						</p></td>
				</tr>
				<tr style='page-break-inside: avoid; height: 1.0pt'>
					<td width=95
						style='width: 71.1pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>锻炼方式</span>
						</p>
					</td>
					<td width=334 colspan=18
						style='width: 250.8pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span> <input
								type="text" name="shfsTydlDlfs" id="shfsTydlDlfs" value="${model.shfsTydlDlfs }">
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 1.0pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'><p
							align="center" class="MsoNormal"
							style="text-align: center; line-height: 16.0pt; layout-grid-mode: char">
							<span style="font-family: 宋体">饮食习惯</span>
						</p></td>
					<td width=354 colspan=18
						style='width: 265.55pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 仿宋_GB2312"> <input
								type="checkbox" name="shfsYsxg" value="荤素均衡" ${fn:contains(model.shfsYsxg, '荤素均衡') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>荤素均衡</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="shfsYsxg" value="荤食为主" ${fn:contains(model.shfsYsxg, '荤食为主') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>荤食为主</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="shfsYsxg" value="素食为主" ${fn:contains(model.shfsYsxg, '素食为主') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>素食为主</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="shfsYsxg" value="嗜盐" ${fn:contains(model.shfsYsxg, '嗜盐') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>嗜盐</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="shfsYsxg" value="嗜油" ${fn:contains(model.shfsYsxg, '嗜油') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>嗜油</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="shfsYsxg" value="嗜糖" ${fn:contains(model.shfsYsxg, '嗜糖') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>嗜糖</span>
						</p>
					</td>
					<td width=75 colspan=1
						style='width: 56.35pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'><p
							class=MsoNormal align=right
							style='margin-left: 3.15pt; text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span>
						</p></td>
				</tr>
				<tr style='page-break-inside: avoid; height: 1.0pt'>
					<td width=102 colspan=2 rowspan=3
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>吸烟情况</span>
						</p>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<b><span style='font-family: 宋体; color: lime'>（如吸烟则该栏全部要填）</span></b>
						</p>
					</td>
					<td width=95
						style='width: 71.1pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>吸烟状况</span>
						</p>
					</td>
					<td width=293 colspan=17
						style='width: 220.05pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 宋体"> <input type="radio"
								name="shfsXyqkXyzk" value="从不吸烟" ${model.shfsXyqkXyzk == '从不吸烟' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>从不吸烟</span><span
								style="font-family: 宋体"> <input type="radio" name="shfsXyqkXyzk"
								value="已戒烟" ${model.shfsXyqkXyzk == '已戒烟' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>已戒烟</span><span
								style="font-family: 宋体"> <input type="radio" name="shfsXyqkXyzk"
								value="吸烟" ${model.shfsXyqkXyzk == '吸烟' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>吸烟</span>
						</p>
					</td>
					<td width=41 colspan=1
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=right
							style='text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<b><span lang=EN-US
								style='font-family: 仿宋_GB2312; color: blue'>&nbsp;</span></b>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 1.0pt'>
					<td width=95
						style='width: 71.1pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>日吸烟量</span>
						</p>
					</td>
					<td width=334 colspan=18
						style='width: 250.8pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>平均</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="shfsXyqkRxyl" id="shfsXyqkRxyl" style="width:40px" value="${model.shfsXyqkRxyl }">
							</span></b><span style='font-family: 宋体'>支</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 1.0pt'>
					<td width=95
						style='width: 71.1pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>开始吸烟年龄</span>
						</p>
					</td>
					<td width=95 colspan=6
						style='width: 71.15pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'><p
							class=MsoNormal style='text-indent: 57.75pt; line-height: 20.0pt'>
							<span style='font-family: 宋体'><b><span
									style="font-family: 宋体; color: blue"> <input type="text"
										name="shfsXyqkKsxynl" id="shfsXyqkKsxynl" style="width:40px;" value="${model.shfsXyqkKsxynl }">
								</span></b>岁</span>
						</p></td>
					<td width=113 colspan=5
						style='width: 84.8pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 20.0pt'>
							<span style='font-family: 宋体'>戒烟年龄</span>
						</p>
					</td>
					<td width=126 colspan=7
						style='width: 94.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal
							style='text-indent: 78.75pt; line-height: 20.0pt'>
							<span style='font-family: 宋体'><b><span
									style="font-family: 宋体; color: blue"> <input type="text"
										name="shfsXyqkJynl" id="shfsXyqkJynl" style="width:40px" value="${model.shfsXyqkJynl }">
								</span></b>岁</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 1.0pt'>
					<td width=102 colspan=2 rowspan=5
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>饮酒情况</span>
						</p>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<b><span style='font-family: 宋体; color: lime'>（如饮酒则该栏全部要填）</span></b>
						</p>
					</td>
					<td width=95
						style='width: 71.1pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>饮酒频率</span>
						</p>
					</td>
					<td width=293 colspan=16
						style='width: 220.05pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 宋体"> <input type="radio"
								name="shfsYjqkYjpl" value="从不" ${model.shfsYjqkYjpl == '从不' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>从不</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp; <span
								style="font-family: 宋体"> <input type="radio" name="shfsYjqkYjpl"
									value="偶尔">
							</span></span><span style='font-family: 宋体'>偶尔</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;<span
								style="font-family: 宋体"> <input type="radio" name="shfsYjqkYjpl"
									value="经常" ${model.shfsYjqkYjpl == '经常' ? 'checked' : '' }>
							</span></span><span style='font-family: 宋体'>经常</span><span
								style='font-family: 宋体'><span style="font-family: 宋体">
									<input type="radio" name="shfsYjqkYjpl" value="每天" ${model.shfsYjqkYjpl == '每天' ? 'checked' : '' }>
							</span>每天</span>
						</p>
					</td>
					<td width=41 colspan=2
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=right
							style='margin-left: 4.2pt; text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<b><span lang=EN-US
								style='font-family: 仿宋_GB2312; color: blue'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							</span></b>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 1.0pt'>
					<td width=95
						style='width: 71.1pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>日饮酒量</span>
						</p>
					</td>
					<td width=334 colspan=18
						style='width: 250.8pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>平均</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;<b><span
									style="font-family: 宋体; color: blue"> <input type="text"
										name="shfsYjqkRyjl" id="shfsYjqkRyjl" style="width:40px" value="${model.shfsYjqkRyjl }">
								</span></b>
							</span><span style='font-family: 宋体'>两</span><span
								style='font-family: 仿宋_GB2312'> </span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 5.5pt'>
					<td width=95
						style='width: 71.1pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 5.5pt'>
						<p class=MsoNormal style='line-height: 20.0pt'>
							<span style='font-family: 宋体'>是否戒酒</span>
						</p>
					</td>
					<td width=293 colspan=16
						style='width: 220.05pt; border: none; padding: 0cm 0cm 0cm 0cm; height: 5.5pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 20.0pt'>
							<span style='font-family: 宋体'> <input type="radio"
								name="shfsYjqkSfjj" value="未戒酒" ${model.shfsYjqkSfjj == '未戒酒' ? 'checked' : '' }> 未戒酒
							</span><span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;<span
								style="font-family: 宋体"> <input type="radio" name="shfsYjqkSfjj"
									 value="已戒酒" ${model.shfsYjqkSfjj == '已戒酒' ? 'checked' : '' }>
							</span></span><span style='font-family: 宋体'>已戒酒，戒酒年龄：</span><span
								style='font-family: 宋体'><b><span
									style="font-family: 宋体; color: blue"> <input type="text"
										name="shfsYjqkJjnl" id="shfsYjqkJjnl" value="${model.shfsYjqkJjnl }" style="width:40px">
								</span></b>岁</span>
						</p>
					</td>
					<td width=41 colspan=2
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 5.5pt'>
						<p class=MsoNormal align=right
							style='margin-left: 4.2pt; text-align: right; line-height: 20.0pt'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 15.7pt'>
					<td width=95
						style='width: 71.1pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 15.7pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>开始饮酒年龄</span>
						</p>
					</td>
					<td width=95 colspan=5
						style='width: 71.15pt; border: solid windowtext 1.0pt; border-left: none; padding: 0cm 0cm 0cm 0cm; height: 15.7pt'>
						<input type="text" name="shfsYjqkKsyjnl" id="shfsYjqkKsyjnl"
						style="width:40px;" value="${model.shfsYjqkKsyjnl }"> 岁
					</td>
					<td width=132 colspan=7
						style='width: 98.65pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 15.7pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>近一年内是否曾醉酒</span>
						</p>
					</td>
					<td width=67 colspan=5
						style='width: 50.25pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 15.7pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 宋体"> <input type="radio"
								name="shfsYjqkJynnsfzj" value="是" ${model.shfsYjqkJynnsfzj == '是' ? 'checked' : '' }>是&nbsp; <input
								type="radio" name="shfsYjqkJynnsfzj" value="否 " ${model.shfsYjqkJynnsfzj == '否' ? 'checked' : '' }>否 
						</p>
					</td>
					<td width=41 colspan=1
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 15.7pt'>
						<p class=MsoNormal align=right
							style='text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 1.0pt'>
					<td width=95
						style='width: 71.1pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>饮酒种类</span>
						</p>
					</td>
					<td width=255 colspan=19
						style='width: 191.6pt; border: none; border-right: solid windowtext 1.0pt;border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<span style="font-family: 仿宋_GB2312"> <input
							type="checkbox" name="shfsYjqkYjzl" value="白酒" ${fn:contains(model.shfsYjqkYjzl, '白酒') ? 'checked' : '' }>
					</span><span style='font-family: 宋体'>白酒</span><span
						style="font-family: 仿宋_GB2312"> <input type="checkbox"
							name="shfsYjqkYjzl" value="啤酒" ${fn:contains(model.shfsYjqkYjzl, '啤酒') ? 'checked' : '' }>
					</span><span style='font-family: 宋体'>啤酒</span><span
						style="font-family: 仿宋_GB2312"> <input type="checkbox"
							name="shfsYjqkYjzl" value="红酒" ${fn:contains(model.shfsYjqkYjzl, '红酒') ? 'checked' : '' }>
					</span><span style='font-family: 宋体'>红酒</span><span lang=EN-US
						style='font-family: 仿宋_GB2312'> <input type="checkbox"
							name="shfsYjqkYjzl" value="黄酒" ${fn:contains(model.shfsYjqkYjzl, '黄酒') ? 'checked' : '' }>
					</span><span style='font-family: 宋体'>黄酒</span><span
						style='font-family: 仿宋_GB2312'> </span><span
						style='font-family: 宋体'><span
							style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="shfsYjqkYjzl" value="其他" ${fn:contains(model.shfsYjqkYjzl, '其他') ? 'checked' : '' }>
						</span>其他</span> <input type="text" name=shfsYjqkYjzlQt id="shfsYjqkYjzlQt" value="${model.shfsYjqkYjzlQt }"
						style="width:50px;">
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 69.55pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 69.55pt'>
						<p class=MsoNormal align=center
							style='text-align: center; layout-grid-mode: char'>
							<span style='font-family: 宋体'>职业病危害因素接触史</span>
						</p>
						<p class=MsoNormal align=center style='text-align: center; layout-grid-mode: char'>
							<input type="button" value="+" class="btn-info" onclick='fnAddShfsZybwhysjcs(this);'>
						</p>
					</td>
					<td width=388 colspan=18 id="zybwhysjcs"
						style='width: 291.15pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 69.55pt'>
						${model.shfsZybwhysjcs }
					</td>
					<td width=41 colspan=1
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 69.55pt'>
						<p class=MsoNormal align=right
							style='text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<b><span lang=EN-US
								style='font-family: 仿宋_GB2312; color: blue'>&nbsp;</span></b>
						</p>
						<p class=MsoNormal align=right
							style='text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span>
						</p>
						<p class=MsoNormal align=right
							style='text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span>
						</p>
						<p class=MsoNormal align=right
							style='text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span>
						</p>
						<p class=MsoNormal align=right
							style='text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<b><span lang=EN-US
								style='font-family: 仿宋_GB2312; color: blue'>&nbsp;</span></b>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 20.9pt'>
					<td width=57 rowspan=4
						style='width: 42.75pt; border: solid windowtext 1.0pt; border-top: none; padding: 0cm 0cm 0cm 0cm; height: 20.9pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>脏</span>
						</p>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>器</span>
						</p>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>功</span>
						</p>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>能</span>
						</p>
					</td>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 20.9pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>口</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;&nbsp; </span><span
								style='font-family: 宋体'>腔</span>
						</p>
					</td>
					<td width=388 colspan=17
						style='width: 291.15pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 20.9pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>口唇<span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
									name="zqgnKqKc" value="红润" ${fn:contains(model.zqgnKqKc, '红润') ? 'checked' : '' }>
							</span></span><span style='font-family: 宋体'>红润</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'> <input type="checkbox"
								name="zqgnKqKc" value="苍白" ${fn:contains(model.zqgnKqKc, '苍白') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>苍白</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'> <input type="checkbox"
								name="zqgnKqKc" value="发绀" ${fn:contains(model.zqgnKqKc, '发绀') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>发绀</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="zqgnKqKc" value="皲裂" ${fn:contains(model.zqgnKqKc, '皲裂') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>皲裂</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'> <input type="checkbox"
								name="zqgnKqKc" value="疱疹" ${fn:contains(model.zqgnKqKc, '疱疹') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>疱疹</span>
						</p>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>齿列</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="zqgnKqCl" value="正常" ${fn:contains(model.zqgnKqCl, '正常') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>正常</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="zqgnKqCl" value="缺齿" ${fn:contains(model.zqgnKqCl, '缺齿') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>缺齿</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="zqgnKqCl" value="龋齿" ${fn:contains(model.zqgnKqCl, '龋齿') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>龋齿</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="zqgnKqCl" value="义齿" ${fn:contains(model.zqgnKqCl, '义齿') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>义齿</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>(</span><span
								style='font-family: 宋体'>假牙</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>)</span>
						</p>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>咽部</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'> <input type="checkbox"
								name="zqgnKqYb" value="无充血" ${fn:contains(model.zqgnKqYb, '无充血') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>无充血</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="zqgnKqYb" value="充血" ${fn:contains(model.zqgnKqYb, '充血') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>充血</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'> <input type="checkbox"
								name="zqgnKqYb" value="淋巴滤泡增生" ${fn:contains(model.zqgnKqYb, '淋巴滤泡增生') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>淋巴滤泡增生</span>
						</p>
					</td>
					<td width=41 colspan=2
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 20.9pt'>
						<p class=MsoNormal align=right
							style='text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<b><span lang=EN-US
								style='font-family: 仿宋_GB2312; color: blue'>&nbsp;</span></b>
						</p>
						<p class=MsoNormal align=right
							style='text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<b><span lang=EN-US
								style='font-family: 仿宋_GB2312; color: blue'>&nbsp;</span></b>
						</p>
						<p class=MsoNormal align=right
							style='text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 20.9pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 20.9pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>视</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;&nbsp; </span><span
								style='font-family: 宋体'>力</span>
						</p>
					</td>
					<td width=429 colspan=19
						style='width: 321.9pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 20.9pt'><p
							align="right" class="MsoNormal"
							style="text-align: right; line-height: 16.0pt; layout-grid-mode: char">
							<b><span style="font-family: 宋体; color: blue">左眼</span></b><b><span
								style="font-family: 宋体; color: blue"> <input
									name="zqgnSlZy" type="text" id="zqgnSlZy" style="width:40px" value="${model.zqgnSlZy }">
							</span></b><b><span style="font-family: 宋体; color: blue">右眼</span></b><b><span
								style="font-family: 宋体; color: blue"> <input
									name="zqgnSlYy" type="text" id="zqgnSlYy" style="width:40px" value="${model.zqgnSlYy }">
							</span><span style="font-family: 仿宋_GB2312; color: blue" lang="EN-US">
									&nbsp; </span></b><span style="font-family: 仿宋_GB2312" lang="EN-US">&nbsp;</span><span
								style="font-family: 宋体">（矫正视力：左眼</span><span
								style="font-family: 宋体"><b><span
									style="font-family: 宋体; color: blue"> <input
										name="zqgnSlJzZy" type="text" id="zqgnSlJzZy" style="width:40px" value="${model.zqgnSlJzZy }">
										右
								</span></b>眼<b><span style="font-family: 宋体; color: blue"> <input
										name="zqgnSlJzYy" type="text" id="zqgnSlJzYy" style="width:40px" value="${model.zqgnSlJzYy }">
								</span></b>）</span>
						</p></td>
				</tr>
				<tr style='page-break-inside: avoid; height: 20.95pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 20.95pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>听</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;&nbsp; </span><span
								style='font-family: 宋体'>力</span>
						</p>
					</td>
					<td width=388 colspan=17
						style='width: 291.15pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 20.95pt'>
						<p class=MsoNormal align=left
							style='margin-right: -.2pt; text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 宋体"> <input type="radio"
								name="zqgnTl" value="听见" value="radio" ${model.zqgnTl == '听见' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>听见</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'> <span
								style="font-family: 宋体"> <input type="radio" name="zqgnTl"
									value="听不清或无法听见" ${model.zqgnTl == '听不清或无法听见' ? 'checked' : '' }>
							</span></span><span style='font-family: 宋体'>听不清或无法听见</span>
						</p>
					</td>
					<td width=41 colspan=2
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 20.95pt'>
						<p class=MsoNormal align=right
							style='margin-top: 0cm; margin-right: -.2pt; margin-bottom: 0cm; margin-left: 7.9pt; margin-bottom: .0001pt; text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<b><span lang=EN-US
								style='font-family: 仿宋_GB2312; color: blue'>&nbsp;</span></b>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 14.2pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 14.2pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>运动功能</span>
						</p>
					</td>
					<td width=388 colspan=17
						style='width: 291.15pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 14.2pt'>
						<p class=MsoNormal
							style='line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 宋体"> <input type="radio"
								name="zqgnYdgn" value="可顺利完成" ${model.zqgnYdgn == '可顺利完成' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>可顺利完成</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp; <span
								style="font-family: 宋体"> <input type="radio" name="zqgnYdgn"
									value="无法独立完成其中任何一个动作" ${model.zqgnYdgn == '无法独立完成其中任何一个动作' ? 'checked' : '' }>
							</span></span><span style='font-family: 宋体'>无法独立完成其中任何一个动作</span>
						</p>
					</td>
					<td width=41 colspan=2
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 14.2pt'>
						<p class=MsoNormal align=right
							style='margin-left: 8.95pt; text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<b><span lang=EN-US
								style='font-family: 仿宋_GB2312; color: blue'>&nbsp;</span></b>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 22.7pt'>
					<td width=57 rowspan=19
						style='width: 42.75pt; border: solid windowtext 1.0pt; border-top: none; padding: 0cm 0cm 0cm 0cm; height: 22.7pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>查</span>
						</p>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>体</span>
						</p>
					</td>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 22.7pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span lang=EN-US>&nbsp;</span><span style='font-family: 宋体'>眼</span><span
								lang=EN-US>&nbsp;&nbsp; </span><span style='font-family: 宋体'>底</span><span
								lang=EN-US>*</span>
						</p>
					</td>
					<td width=388 colspan=17
						style='width: 291.15pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 22.7pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 宋体"> <input type="radio"
								name="ctYd" value="正常" ${model.ctYd == '正常' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>正常</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;<span
								style="font-family: 宋体"> <input type="radio" name="ctYd"
									value="异常" ${model.ctYd == '异常' ? 'checked' : '' }>
							</span></span><span style='font-family: 宋体'>异常</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="ctYdZyjc" id="ctYdZyjc" style="width:40px" value="${model.ctYdZyjc }">
							</span></b><span style='font-family: 宋体'>（属专业检查）</span>
						</p>
					</td>
					<td width=41 colspan=2
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 22.7pt'>
						<p class=MsoNormal align=right
							style='margin-left: 6.3pt; text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US>&nbsp; </span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 22.7pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 22.7pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体; letter-spacing: -1.0pt'>皮</span><span
								lang=EN-US
								style='font-family: 仿宋_GB2312; letter-spacing: -1.0pt'>&nbsp;&nbsp;&nbsp;&nbsp;
							</span><span style='font-family: 宋体; letter-spacing: -1.0pt'>肤</span>
						</p>
					</td>
					<td width=388 colspan=19
						style='width: 291.15pt; border: none; border-right: solid windowtext 1.0pt;border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 22.7pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="ctPf" value="正常" ${fn:contains(model.ctPf, '正常') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>正常</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="ctPf" value="潮红" ${fn:contains(model.ctPf, '潮红') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>潮红</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="ctPf" value="苍白" ${fn:contains(model.ctPf, '苍白') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>苍白</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="ctPf" value="发绀" ${fn:contains(model.ctPf, '发绀') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>发绀</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="ctPf" value="黄染" ${fn:contains(model.ctPf, '黄染') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>黄染</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="ctPf" value="色素沉着" ${fn:contains(model.ctPf, '色素沉着') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>色素沉着</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="ctPf" value="其他" ${fn:contains(model.ctPf, '其他') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>其他</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="ctPfQt" id="ctPfQt" style="width:40px" value="${model.ctPfQt }">
							</span></b>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 22.7pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 22.7pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体; letter-spacing: -1.0pt'>巩</span><span
								lang=EN-US
								style='font-family: 仿宋_GB2312; letter-spacing: -1.0pt'>&nbsp;&nbsp;&nbsp;&nbsp;
							</span><span style='font-family: 宋体; letter-spacing: -1.0pt'>膜</span>
						</p>
					</td>
					<td width=388 colspan=17
						style='width: 291.15pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 22.7pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 仿宋_GB2312"> <input
								type="checkbox" name="ctGm" value="正常" ${fn:contains(model.ctGm, '正常') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>正常</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp; <input
								type="checkbox" name="ctGm" value="黄染" ${fn:contains(model.ctGm, '黄染') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>黄染</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="ctGm" value="充血" ${fn:contains(model.ctGm, '充血') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>充血</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="ctGm" value="其他" ${fn:contains(model.ctGm, '其他') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>其他</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name=ctGmQt id="ctGmQt" style="width:40px" value="${model.ctGmQt }">
							</span></b><span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span>
						</p>
					</td>
					<td width=41 colspan=2
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 22.7pt'>
						<p class=MsoNormal align=right
							style='margin-left: 6.3pt; text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<b><span lang=EN-US
								style='font-family: 仿宋_GB2312; color: blue'>&nbsp;</span></b>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 22.7pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 22.7pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>淋巴结</span>
						</p>
					</td>
					<td width=388 colspan=17
						style='width: 291.15pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 22.7pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 仿宋_GB2312"> <input
								type="checkbox" name="ctLbj" value="未触及" ${fn:contains(model.ctLbj, '未触及') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>未触及</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;&nbsp; <input
								type="checkbox" name="ctLbj" value="锁骨上" ${fn:contains(model.ctLbj, '锁骨上') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>锁骨上</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;&nbsp; <input
								type="checkbox" name="ctLbj" value="腋窝" ${fn:contains(model.ctLbj, '腋窝') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>腋窝</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;&nbsp; <input
								type="checkbox" name="ctLbj" value="其他" ${fn:contains(model.ctLbj, '其他') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>其他</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="ctLbjQt" id="ctLbjQt" style="width:40px" value="${model.ctLbjQt }">
							</span></b>
						</p>
					</td>
					<td width=41 colspan=2
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 22.7pt'>
						<p class=MsoNormal align=right
							style='margin-left: 8.95pt; text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<b><span lang=EN-US
								style='font-family: 仿宋_GB2312; color: blue'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							</span></b>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 19.85pt'>
					<td width=102 colspan=2 rowspan=3
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 19.85pt'>
						<p class=MsoNormal align=center
							style='margin-top: 3.1pt; text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>肺</span>
						</p>
					</td>
					<td width=388 colspan=17
						style='width: 291.15pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 19.85pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>桶状胸：</span><span
								style="font-family: 宋体"> <input type="radio" name="ctFTzx"
								value="否 " ${model.ctFTzx == '否' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>否 <input type="radio"
								name="ctFTzx" value="是" ${model.ctFTzx == '是' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>是</span>
						</p>
					</td>
					<td width=41 colspan=2
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 19.85pt'>
						<p class=MsoNormal align=right
							style='margin-left: 8.95pt; text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<b><span lang=EN-US
								style='font-family: 仿宋_GB2312; color: blue'>&nbsp;</span></b>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 19.85pt'>
					<td width=388 colspan=17
						style='width: 291.15pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 19.85pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>呼吸音：</span><span
								style="font-family: 宋体"> <input type="radio" name="ctFHxy"
								value="正常" ${model.ctFHxy == '正常' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>正常</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;<span
								style="font-family: 宋体"> <input type="radio" name="ctFHxy"
								value="异常" ${model.ctFHxy == '异常' ? 'checked' : '' }>
							</span></span><span style='font-family: 宋体'>异常</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="ctFHxyQt" id="ctFHxyQt" style="width:40px" value="${model.ctFHxyQt }">
							</span></b>
						</p>
					</td>
					<td width=41 colspan=2
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 19.85pt'>
						<p class=MsoNormal align=right
							style='text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<b><span lang=EN-US
								style='font-family: 仿宋_GB2312; color: blue'>&nbsp;</span></b>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 19.85pt'>
					<td width=388 colspan=17
						style='width: 291.15pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 19.85pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>罗</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp; </span><span
								style='font-family: 宋体'>音：</span><span style="font-family: 宋体">
								<input type="radio" name="ctFLy" value="无" ${model.ctFLy == '无' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>无</span><span
								style='font-family: 仿宋_GB2312'> </span><span
								style="font-family: 宋体"> <input type="radio" name="ctFLy"
								value="干罗音" ${model.ctFLy == '干罗音' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>干罗音</span><span
								style="font-family: 宋体"> <input type="radio" name="ctFLy"
								value="湿罗音" ${model.ctFLy == '湿罗音' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>湿罗音</span><span
								style="font-family: 宋体"> <input type="radio" name="ctFLy"
								value="其他" ${model.ctFLy == '其他' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>其他</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="ctFLyQt" id="ctFLyQt" style="width:40px" value="${model.ctFLyQt }">
							</span></b>
						</p>
					</td>
					<td width=41 colspan=2
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 19.85pt'>
						<p class=MsoNormal align=right
							style='text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<b><span lang=EN-US
								style='font-family: 仿宋_GB2312; color: blue'>&nbsp;</span></b>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 34.1pt'>
					<td width=102 colspan=2 valign=top
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 34.1pt'>
						<p class=MsoNormal align=center
							style='margin-top: 3.1pt; text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>心</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;&nbsp; </span><span
								style='font-family: 宋体'>脏</span>
						</p>
					</td>
					<td width=388 colspan=19
						style='width: 291.15pt; border: none; border-right: solid windowtext 1.0pt;border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 34.1pt'>
						<p class=MsoNormal
							style='line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>心率</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="ctXzXl" id="ctXzXl" value="${model.ctXzXl }" style="width:40px">
							</span></b><span style='font-family: 宋体'>次</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>/</span><span
								style='font-family: 宋体'>分钟</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;&nbsp;&nbsp; </span><span
								style='font-family: 宋体'>心律：</span><span style="font-family: 宋体">
								<input type="radio" name="ctXzXlq" value="齐" ${model.ctXzXlq == '齐' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>齐</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;<span
								style="font-family: 宋体"> <input type="radio" name="ctXzXlq"
									value="不齐" ${model.ctXzXlq == '不齐' ? 'checked' : '' }>
							</span></span><span style='font-family: 宋体'>不齐</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;<span
								style="font-family: 宋体"> <input type="radio" name="ctXzXlq"
									value="绝对不齐" ${model.ctXzXlq == '绝对不齐' ? 'checked' : '' }>
							</span></span><span style='font-family: 宋体'>绝对不齐</span>
						</p>
						<p class=MsoNormal
							style='line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>杂音：</span><span
								style="font-family: 宋体"> <input type="radio" name="ctXzZy"
								value="无" ${model.ctXzZy == '无' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>无</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'><span
								style="font-family: 宋体"> <input type="radio" name="ctXzZy"
								value="有" ${model.ctXzZy == '有' ? 'checked' : '' }>
							</span></span><span style='font-family: 宋体'>有</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="ctXzZyQt" id="ctXzZyQt" style="width:40px" value="${model.ctXzZyQt }">
							</span></b>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 1.0pt'>
					<td width=102 colspan=2 valign=top
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=center
							style='margin-top: 3.1pt; text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>腹</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;&nbsp; </span><span
								style='font-family: 宋体'>部</span>
						</p>
					</td>
					<td width=388 colspan=17
						style='width: 291.15pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt'>
							<span style='font-family: 宋体'>压痛：</span><span
								style="font-family: 宋体"> <input type="radio" name="ctFbYt"
								value="无" ${model.ctFbYt == '无' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>无</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'><span
								style="font-family: 宋体"> <input type="radio" name="ctFbYt"
								value="有" ${model.ctFbYt == '有' ? 'checked' : '' }>
							</span></span><span style='font-family: 宋体'>有</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="ctFbYtQt" id="ctFbYtQt" style="width:40px" value="${model.ctFbYtQt }">
							</span></b>
						</p>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt'>
							<span style='font-family: 宋体'>包块：</span><span class="MsoNormal"
								style="line-height: 16.0pt; layout-grid-mode: char"><span
								style="font-family: 宋体"> <input type="radio" name="ctFbBk"
									value="无" ${model.ctFbBk == '无' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>无</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'><span
									style="font-family: 宋体"> <input type="radio"
										name="ctFbBk" value="有" ${model.ctFbBk == '有' ? 'checked' : '' }>
								</span></span><span style='font-family: 宋体'>有</span><b><span
									style="font-family: 宋体; color: blue"> <input type="text"
										name="ctFbBkQt" id="ctFbBkQt" style="width:40px" value="${model.ctFbBkQt }">
								</span></b></span>
						</p>
						<p align="left" class="MsoNormal"
							style="text-align: left; line-height: 16.0pt">
							<span style="font-family: 宋体">肝大：</span><span class="MsoNormal"
								style="line-height: 16.0pt; layout-grid-mode: char"><span
								style="font-family: 宋体"> <input name="ctFbGd" type="radio"
									value="无" ${model.ctFbGd == '无' ? 'checked' : '' }>
							</span><span style="font-family: 宋体">无</span><span
								style="font-family: 仿宋_GB2312" lang="EN-US"><span
									style="font-family: 宋体"> <input name="ctFbGd"
										type="radio" value="有" ${model.ctFbGd == '有' ? 'checked' : '' }>
								</span></span><span style="font-family: 宋体">有</span><b><span
									style="font-family: 宋体; color: blue"> <input
										name="ctFbGdQt" type="text" id="ctFbGdQt" style="width:40px" value="${model.ctFbGdQt }">
								</span></b></span>
						</p>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt'>
							<span style='font-family: 宋体'>脾大：</span><span class="MsoNormal"
								style="line-height: 16.0pt; layout-grid-mode: char"><span
								style="font-family: 宋体"> <input type="radio" name="ctFbPd"
									value="无" ${model.ctFbPd == '无' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>无</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'><span
									style="font-family: 宋体"> <input type="radio"
										name="ctFbPd" value="有" ${model.ctFbPd == '有' ? 'checked' : '' }>
								</span></span><span style='font-family: 宋体'>有</span><b><span
									style="font-family: 宋体; color: blue"> <input type="text"
										name="ctFbPdQt" id="ctFbPdQt" style="width:40px" value="${model.ctFbPdQt }">
								</span></b></span>
						</p>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt'>
							<span style='font-family: 宋体'>移动性浊音：</span><span
								class="MsoNormal"
								style="line-height: 16.0pt; layout-grid-mode: char"><span
								style="font-family: 宋体"> <input type="radio" name="ctFbYdxzy"
									value="无" ${model.ctFbYdxzy == '无' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>无</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'><span
									style="font-family: 宋体"> <input type="radio"
										name="ctFbYdxzy" value="有" ${model.ctFbYdxzy == '有' ? 'checked' : '' }>
								</span></span><span style='font-family: 宋体'>有</span><b><span
									style="font-family: 宋体; color: blue"> <input type="text"
										name="ctFbYdxzyQt" id="ctFbYdxzyQt" style="width:40px" value="${model.ctFbYdxzyQt }">
								</span></b></span>
						</p>
					</td>
					<td width=41 colspan=2
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=right
							style='margin-left: 8.95pt; text-align: right; line-height: 16.0pt'>
							<b><span lang=EN-US
								style='font-family: 仿宋_GB2312; color: blue'>&nbsp;</span></b>
						</p>
						<p class=MsoNormal align=right
							style='margin-left: 8.95pt; text-align: right; line-height: 16.0pt'>
							<b><span lang=EN-US
								style='font-family: 仿宋_GB2312; color: blue'>&nbsp;</span></b>
						</p>
						<p class=MsoNormal align=right
							style='margin-left: 8.95pt; text-align: right; line-height: 16.0pt'>
							<b><span lang=EN-US
								style='font-family: 仿宋_GB2312; color: blue'>&nbsp;</span></b>
						</p>
						<p class=MsoNormal align=right
							style='margin-left: 8.95pt; text-align: right; line-height: 16.0pt'>
							<b><span lang=EN-US
								style='font-family: 仿宋_GB2312; color: blue'>&nbsp;</span></b>
						</p>
						<p class=MsoNormal align=right
							style='margin-left: 8.95pt; text-align: right; line-height: 16.0pt'>
							<b><span lang=EN-US
								style='font-family: 仿宋_GB2312; color: blue'>&nbsp;</span></b>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 17.85pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 17.85pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>下肢水肿</span>
						</p>
					</td>
					<td width=396 colspan=19
						style='width: 297.35pt; border: none; border-bottom: solid windowtext 1.0pt;border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 17.85pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 宋体"> <input type="radio"
								name="ctXzsz" value="无" ${model.ctXzsz == '无' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>无</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;&nbsp;<span
								style="font-family: 宋体"> <input type="radio" name="ctXzsz"
								value="单侧" ${model.ctXzsz == '单侧' ? 'checked' : '' }>
							</span></span><span style='font-family: 宋体'>单侧</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;&nbsp; <span
								style="font-family: 宋体"> <input type="radio" name="ctXzsz"
								value="双侧不对称" ${model.ctXzsz == '双侧不对称' ? 'checked' : '' }>
							</span></span><span style='font-family: 宋体'>双侧不对称</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;&nbsp;<span
								style="font-family: 宋体"> <input type="radio" name="ctXzsz"
								value="双侧对称" ${model.ctXzsz == '双侧对称' ? 'checked' : '' }>
							</span></span><span style='font-family: 宋体'>双侧对称</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 17.85pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 17.85pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>足背动脉搏动</span>
						</p>
					</td>
					<td width=396 colspan=19
						style='width: 297.35pt; border: none; border-bottom: solid windowtext 1.0pt;border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 17.85pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 宋体"> <input type="radio"
								name="ctZbdmbd" value="未触及" ${model.ctZbdmbd == '未触及' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>未触及</span><span
								style="font-family: 宋体"> <input type="radio" name="ctZbdmbd"
								value="触及双侧对称" ${model.ctZbdmbd == '触及双侧对称' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>触及双侧对称</span><span
								style="font-family: 宋体"> <input type="radio" name="ctZbdmbd"
								value="触及左侧弱或消失" ${model.ctZbdmbd == '触及左侧弱或消失' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>触及左侧弱或消失</span><span
								style="font-family: 宋体"> <input type="radio" name="ctZbdmbd"
								value="触及右侧弱或消失" ${model.ctZbdmbd == '触及右侧弱或消失' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>触及右侧弱或消失</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 1.0pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=center
							style='margin-top: 3.1pt; text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>肛门指诊</span><b>*</b>
						</p>
					</td>
					<td width=388 colspan=19 valign=top
						style='width: 291.15pt; border: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt;padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 宋体"> <input type="radio"
								name="ctGmzz" value="未及异常" ${model.ctGmzz == '未及异常' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>未及异常</span><span
								style="font-family: 宋体"> <input type="radio" name="ctGmzz"
								value="触痛" ${model.ctGmzz == '触痛' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>触痛<span
								style="font-family: 宋体"> <input type="radio" name="ctGmzz"
								value="包块" ${model.ctGmzz == '包块' ? 'checked' : '' }>
							</span></span><span style='font-family: 宋体'>包块<span
								style="font-family: 宋体"> <input type="radio" name="ctGmzz"
								value="前列腺异常" ${model.ctGmzz == '前列腺异常' ? 'checked' : '' }>
							</span></span><span style='font-family: 宋体'>前列腺异常<span
								style="font-family: 宋体"> <input type="radio" name="ctGmzz"
								value="其他" ${model.ctGmzz == '其他' ? 'checked' : '' }>
							</span></span><span style='font-family: 宋体'>其他</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="ctGmzzQt" id="ctGmzzQt" style="width:40px;" value="${model.ctGmzzQt }">
							</span></b><span style='font-family: 宋体'> </span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;&nbsp;&nbsp;&nbsp; </span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 1.0pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=center
							style='margin-top: 3.1pt; text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>乳</span><span lang=EN-US>&nbsp;&nbsp;
							</span><span style='font-family: 宋体'>腺</span><span lang=EN-US>*</span>
						</p>
					</td>
					<td width=350 colspan=19
						style='width: 262.7pt; border: none; border-bottom: solid windowtext 1.0pt;border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal
							style='line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 仿宋_GB2312"> <input
								type="checkbox" name="ctRx" value="未见异常" ${fn:contains(model.ctRx, '未见异常') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>未见异常</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="ctRx" value="乳房切除" ${fn:contains(model.ctRx, '乳房切除') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>乳房切除</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="ctRx" value="异常泌乳" ${fn:contains(model.ctRx, '异常泌乳') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>异常泌乳</span>
							<span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="ctRx" value="乳腺包块" ${fn:contains(model.ctRx, '乳腺包块') ? 'checked' : '' }>
							</span>
							<span
								style='font-family: 宋体'>乳腺包块</span><span style='font-family: 宋体'><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="ctRx" value="其他" ${fn:contains(model.ctRx, '其他') ? 'checked' : '' }>
							</span>其他</span><b><span style="font-family: 宋体; color: blue"> <input
									type="text" name="ctRxQt" id="ctRxQt" style="width:40px" value="${model.ctRxQt }">
							</span></b>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 1.0pt'>
					<td width=51 rowspan=5
						style='width: 38.25pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=center
							style='margin-top: 3.1pt; text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>妇科</span><span lang=EN-US>*</span>
						</p>
					</td>
					<td width=51
						style='width: 38.6pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=center
							style='margin-top: 3.1pt; text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>外阴</span>
						</p>
					</td>
					<td width=350 colspan=15
						style='width: 262.7pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal
							style='line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 宋体"> <input type="radio"
								name="ctFkWy" value="未见异常" ${model.ctFkWy == '未见异常' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>未见异常</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;<span
								style="font-family: 宋体"> <input type="radio" name="ctFkWy"
									value="异常" ${model.ctFkWy == '异常' ? 'checked' : '' }>
							</span></span><span style='font-family: 宋体'>异常</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="ctFkWyQt" id="ctFkWyQt" style="width:120px" value="${model.ctFkWyQt }">
							</span></b>
						</p>
					</td>
					<td width=79 colspan=4
						style='width: 59.2pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=right
							style='text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 1.0pt'>
					<td width=51
						style='width: 38.6pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=center
							style='margin-top: 3.1pt; text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>阴道</span>
						</p>
					</td>
					<td width=350 colspan=15
						style='width: 262.7pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal
							style='line-height: 16.0pt; layout-grid-mode: char'>
							<span class="MsoNormal"
								style="line-height: 16.0pt; layout-grid-mode: char"><span
								style="font-family: 宋体"> <input type="radio" name="ctFkYd"
								value="未见异常" ${model.ctFkYd == '未见异常' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>未见异常</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;<span
									style="font-family: 宋体"> <input type="radio"
										name="ctFkYd" value="异常" ${model.ctFkYd == '异常' ? 'checked' : '' }>
								</span></span><span style='font-family: 宋体'>异常</span><b><span
									style="font-family: 宋体; color: blue"> <input type="text"
										name="ctFkYdQt" id="ctFkYdQt" style="width:120px" value="${model.ctFkYdQt }">
								</span></b></span>
						</p>
					</td>
					<td width=79 colspan=4
						style='width: 59.2pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=right
							style='text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 1.0pt'>
					<td width=51
						style='width: 38.6pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=center
							style='margin-top: 3.1pt; text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>宫颈</span>
						</p>
					</td>
					<td width=350 colspan=15
						style='width: 262.7pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal
							style='line-height: 16.0pt; layout-grid-mode: char'>
							<span class="MsoNormal"
								style="line-height: 16.0pt; layout-grid-mode: char"><span
								style="font-family: 宋体"> <input type="radio" name="ctFkGj"
									value="未见异常" ${model.ctFkGj == '未见异常' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>未见异常</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;<span
									style="font-family: 宋体"> <input type="radio"
										name="ctFkGj" value="异常" ${model.ctFkGj == '异常' ? 'checked' : '' }>
								</span></span><span style='font-family: 宋体'>异常</span><b><span
									style="font-family: 宋体; color: blue"> <input type="text"
										name="ctFkGjQt" id="ctFkGjQt" style="width:120px" value="${model.ctFkGjQt }">
								</span></b></span>
						</p>
					</td>
					<td width=79 colspan=4
						style='width: 59.2pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=right
							style='text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 1.0pt'>
					<td width=51
						style='width: 38.6pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=center
							style='margin-top: 3.1pt; text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>宫体</span>
						</p>
					</td>
					<td width=350 colspan=15
						style='width: 262.7pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal
							style='line-height: 16.0pt; layout-grid-mode: char'>
							<span class="MsoNormal"
								style="line-height: 16.0pt; layout-grid-mode: char"><span
								style="font-family: 宋体"> <input type="radio" name="ctFkGt"
									value="未见异常" ${model.ctFkGt == '未见异常' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>未见异常</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;<span
									style="font-family: 宋体"> <input type="radio"
										name="ctFkGt" value="异常" ${model.ctFkGt == '异常' ? 'checked' : '' }>
								</span></span><span style='font-family: 宋体'>异常</span><b><span
									style="font-family: 宋体; color: blue"> <input type="text"
										name="ctFkGtQt" id="ctFkGtQt" style="width:120px" value="${model.ctFkGtQt }">
								</span></b></span>
						</p>
					</td>
					<td width=79 colspan=4
						style='width: 59.2pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=right
							style='text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 1.0pt'>
					<td width=51
						style='width: 38.6pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=center
							style='margin-top: 3.1pt; text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>附件</span>
						</p>
					</td>
					<td width=350 colspan=15
						style='width: 262.7pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal
							style='line-height: 16.0pt; layout-grid-mode: char'>
							<span class="MsoNormal"
								style="line-height: 16.0pt; layout-grid-mode: char"><span
								style="font-family: 宋体"> <input type="radio" name="ctFkFj"
									value="未见异常" ${model.ctFkFj == '未见异常' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>未见异常</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;<span
									style="font-family: 宋体"> <input type="radio"
										name="ctFkFj" value="异常" ${model.ctFkFj == '异常' ? 'checked' : '' }>
								</span></span><span style='font-family: 宋体'>异常</span><b><span
									style="font-family: 宋体; color: blue"> <input type="text"
										name="ctFkFjQt" id="ctFkFjQt" style="width:120px" value="${model.ctFkFjQt }">
								</span></b></span>
						</p>
					</td>
					<td width=79 colspan=4
						style='width: 59.2pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 1.0pt'>
						<p class=MsoNormal align=right
							style='text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 35.55pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 35.55pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 58.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>其</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;&nbsp; </span><span
								style='font-family: 宋体'>他</span><span lang=EN-US>*</span>
						</p>
					</td>
					<td width=429 colspan=20 valign=top
						style='width: 321.9pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 35.55pt'><textarea
							name="ctQt" id="ctQt" cols="45" rows="5" >${model.ctQt }</textarea></td>
				</tr>
				<tr style='page-break-inside: avoid; height: 15.65pt'>
					<td width=57 rowspan=15
						style='width: 42.75pt; border: solid windowtext 1.0pt; border-top: none; padding: 0cm 0cm 0cm 0cm; height: 15.65pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>辅</span>
						</p>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>助</span>
						</p>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>检</span>
						</p>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>查</span>
						</p>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<b><span
								style='font-size: 10.0pt; font-family: 仿宋_GB2312; color: lime'>老年人年度体检包括：血尿常规、肝功<span
									lang=EN-US>(</span>谷丙谷草总胆<span lang=EN-US>),</span>肾功<span
									lang=EN-US>(</span>肌酐尿素氮<span lang=EN-US>)</span>血糖血脂<span
									lang=EN-US>,</span>心电图
							</span></b>
						</p>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<b><span
								style='font-size: 10.0pt; font-family: 仿宋_GB2312; color: fuchsia'>重精病人年度体检包括：血常规（含<span
									lang=EN-US>WBC</span>分类）转氨酶、血糖、心电图
							</span></b>
						</p>
						<p class=MsoNormal align=center
							style='margin-left: 6.85pt; text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US>&nbsp;</span>
						</p>
					</td>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 15.65pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<b><span style='font-family: 宋体; color: lime'>血常</span></b><b><span
								style='font-size: 10.0pt; font-family: 仿宋_GB2312; color: fuchsia'>规<span
									lang=EN-US>*</span></span></b>
						</p>
					</td>
					<td width=429 colspan=19
						style='width: 321.9pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 15.65pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>血红蛋白</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="fzjcXcgXhdb" id="fzjcXcgXhdb" style="width:40px" value="${model.fzjcXcgXhdb }">
							</span></b><span lang=EN-US style='font-family: 仿宋_GB2312'>g/L</span><span
								lang=EN-US> </span><span style='font-family: 宋体'>白细胞</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="fzjcXcgBxb" id="fzjcXcgBxb" style="width:40px" value="${model.fzjcXcgBxb }">
							</span></b><span style='font-family: 宋体'>×</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>10<sup>9</sup>/L
							</span><span style='font-family: 宋体'>血小板</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="fzjcXcgXxb" id="fzjcXcgXxb" style="width:40px" value="${model.fzjcXcgXxb }">
							</span></b><span style='font-family: 宋体'>×</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>10<sup>9</sup>/L
							</span><span lang=EN-US> </span>
							<span style='font-family: 宋体'>其他</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="fzjcXcgQt" id="fzjcXcgQt" style="width:40px" value="${model.fzjcXcgQt }">
							</span></b>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 29.8pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 29.8pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<b><span style='font-family: 宋体; color: lime'>尿常</span></b><span
								style='font-family: 宋体'>规</span><span lang=EN-US>*</span>
						</p>
					</td>
					<td width=429 colspan=19
						style='width: 321.9pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 29.8pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>尿蛋白</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="fzjcNcgNdb" id="fzjcNcgNdb" style="width:40px" value="${model.fzjcNcgNdb }">
							</span></b><span style='font-family: 宋体'>尿糖</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="fzjcNcgNt" id="fzjcNcgNt" style="width:40px" value="${model.fzjcNcgNt }">
							</span></b><span style='font-family: 宋体'>尿酮体</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="fzjcNcgNtt" id="fzjcNcgNtt" style="width:40px" value="${model.fzjcNcgNtt }">
							</span></b><span style='font-family: 宋体'>尿潜血</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="fzjcNcgNqx" id="fzjcNcgNqx" style="width:40px" value="${model.fzjcNcgNqx }">
							</span></b>
							<span style='font-family: 宋体'>其他</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="fzjcNcgQt" id="fzjcNcgQt" style="width:40px" value="${model.fzjcNcgQt }">
							</span></b>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 20.2pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 20.2pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<b><span style='font-family: 宋体; color: lime'>空腹</span></b><b><span
								style='font-size: 10.0pt; font-family: 仿宋_GB2312; color: fuchsia'>血糖<span
									lang=EN-US>*</span></span></b>
						</p>
					</td>
					<td width=429 colspan=19
						style='width: 321.9pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 20.2pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<b><span style="font-family: 宋体; color: blue"> <input
									type="text" name="fzjcKfxtMm" id="fzjcKfxtMm" style="width:40px" value="${model.fzjcKfxtMm }">
							</span></b><span lang=EN-US style='font-family: 仿宋_GB2312'>mmol/L</span><span
								lang=EN-US> </span><span style='font-family: 宋体'>或</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="fzjcKfxtMg" id="fzjcKfxtMg" style="width:40px" value="${model.fzjcKfxtMg }">
							</span></b><span lang=EN-US style='font-family: 仿宋_GB2312'>mg/dL</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 20.2pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 20.2pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<b><span style='font-family: 宋体; color: lime'>心电</span></b><b><span
								style='font-size: 10.0pt; font-family: 仿宋_GB2312; color: fuchsia'>图<span
									lang=EN-US>*</span></span></b>
						</p>
					</td>
					<td width=388 colspan=17
						style='width: 291.15pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 20.2pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 宋体"> <input type="radio"
								name="fzjcXdt" value="正常" ${model.fzjcXdt == '正常' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>正常</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;<span
								style="font-family: 宋体"> <input type="radio" name="fzjcXdt"
									value="异常" ${model.fzjcXdt == '异常' ? 'checked' : '' }>
							</span></span><span style='font-family: 宋体'>异常</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="fzjcXdtQt" id="fzjcXdtQt" style="width:40px" value="${model.fzjcXdtQt }">
							</span></b>
						</p>
					</td>
					<td width=41 colspan=2
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 20.2pt'>
						<p class=MsoNormal align=right
							style='margin-left: 6.85pt; text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 20.2pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 20.2pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>尿微量白蛋白</span><span lang=EN-US>*</span>
						</p>
					</td>
					<td width=429 colspan=19
						style='width: 321.9pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 20.2pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<b><span style="font-family: 宋体; color: blue"> <input
									type="text" name="fzjcNwlbdb" id="fzjcNwlbdb" style="width:40px" value="${model.fzjcNwlbdb }">
							</span></b><span lang=EN-US style='font-family: 仿宋_GB2312'>mg/dL</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 20.2pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 20.2pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>大便潜血</span><span lang=EN-US>*</span>
						</p>
					</td>
					<td width=388 colspan=17
						style='width: 291.15pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 20.2pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 宋体"> <input type="radio"
								name="fzjcDbqx" value="阴性" ${model.fzjcDbqx == '阴性' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>阴性</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;<span
								style="font-family: 宋体"> <input type="radio" name="fzjcDbqx"
								value="阳性" ${model.fzjcDbqx == '阳性' ? 'checked' : '' }>
							</span></span><span style='font-family: 宋体'>阳性</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							</span>
						</p>
					</td>
					<td width=41 colspan=2
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 20.2pt'>
						<p class=MsoNormal align=right
							style='margin-left: 6.85pt; text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 20.2pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 20.2pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>糖化血红蛋白</span><span lang=EN-US>*</span>
						</p>
					</td>
					<td width=429 colspan=19
						style='width: 321.9pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 20.2pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<b><span style="font-family: 宋体; color: blue"> <input
									type="text" name="fzjcThxhdb" id="fzjcThxhdb" style="width:40px" value="${model.fzjcThxhdb }">
							</span></b><span lang=EN-US>%</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 20.2pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 20.2pt'><p
							align="center" class="MsoNormal"
							style="text-align: center; line-height: 16.0pt; layout-grid-mode: char">
							<span style="font-family: 宋体">乙型肝炎</span>
						</p>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>表面抗原</span><span lang=EN-US>*</span>
						</p></td>
					<td width=388 colspan=17
						style='width: 291.15pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 20.2pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 宋体"> <input type="radio"
								name="fzjcYxgybmky" value="阴性" ${model.fzjcYxgybmky == '阴性' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>阴性</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;<span
								style="font-family: 宋体"> <input type="radio" name="fzjcYxgybmky"
								value="阳性" ${model.fzjcYxgybmky == '阳性' ? 'checked' : '' }>
							</span></span><span style='font-family: 宋体'>阳性</span>
						</p>
					</td>
					<td width=41 colspan=2
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 20.2pt'>
						<p class=MsoNormal align=right
							style='margin-left: 6.85pt; text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 20.2pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 20.2pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>肝功能</span><span lang=EN-US>*</span>
						</p>
					</td>
					<td width=429 colspan=19
						style='width: 321.9pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 20.2pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<b><span style='font-family: 宋体; color: lime'>血清谷</span></b><b><span
								style='font-size: 10.0pt; font-family: 仿宋_GB2312; color: fuchsia'>丙转氨酶</span></b><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="fzjcGgnXqgbzam" id="fzjcGgnXqgbzam" style="width:40px" value="${model.fzjcGgnXqgbzam }">
							</span></b><span lang=EN-US style='font-family: 仿宋_GB2312'>U/L&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							</span><b><span style='font-family: 宋体; color: lime'>血清谷</span></b><b><span
								style='font-size: 10.0pt; font-family: 仿宋_GB2312; color: fuchsia'>草转氨酶</span></b><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="fzjcGgnXqgczam" id="fzjcGgnXqgczam" style="width:40px" value="${model.fzjcGgnXqgczam }">
							</span></b><span lang=EN-US style='font-family: 仿宋_GB2312'>U/L</span>
						</p>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>白蛋白</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="fzjcGgnBdb" id="fzjcGgnBdb" style="width:40px" value="${model.fzjcGgnBdb }">
							</span></b><span lang=EN-US style='font-family: 仿宋_GB2312'>g/L&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							</span><b><span style='font-family: 宋体; color: lime'>总胆</span></b><span
								style='font-family: 宋体'>红素</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="fzjcGgnZdhs" id="fzjcGgnZdhs" style="width:40px" value="${model.fzjcGgnZdhs }">
							</span></b><span lang=EN-US>μ</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>mol/L</span>
						</p>
						<p class=MsoNormal
							style='line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>结合胆红素</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="fzjcGgnJhdhs" id="fzjcGgnJhdhs" style="width:40px" value="${model.fzjcGgnJhdhs }">
							</span></b><span lang=EN-US>μ</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>mol/L&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 41.5pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 41.5pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>肾功能</span><span lang=EN-US>*</span>
						</p>
					</td>
					<td width=429 colspan=19
						style='width: 321.9pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 41.5pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>血清<b><span
									style='color: lime'>肌酐</span></b></span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="fzjcXgnXqjg" id="fzjcXgnXqjg" style="width:40px" value="${model.fzjcXgnXqjg }">
							</span></b><span lang=EN-US>μ</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>mol/L&nbsp;&nbsp;&nbsp;&nbsp;
							</span><span style='font-family: 宋体'>血尿<b><span
									style='color: lime'>素氮</span></b></span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="fzjcXgnXnsd" id="fzjcXgnXnsd" style="width:40px" value="${model.fzjcXgnXnsd }">
							</span></b><span lang=EN-US style='font-family: 仿宋_GB2312'>mmol/L</span>
						</p>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>血钾浓度</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="fzjcXgnXjnd" id="fzjcXgnXjnd" style="width:40px" value="${model.fzjcXgnXjnd }">
							</span></b><span lang=EN-US style='font-family: 仿宋_GB2312'>mmol/L&nbsp;&nbsp;&nbsp;&nbsp;
							</span><span style='font-family: 宋体'>血钠浓度</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="fzjcXgnXnnd" id="fzjcXgnXnnd" style="width:40px" value="${model.fzjcXgnXnnd }">
							</span></b><span lang=EN-US style='font-family: 仿宋_GB2312'>mmol/L</span>
						</p>
						<p class=MsoNormal align=right
							style='margin-left: 6.85pt; text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US>&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 49.85pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 49.85pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>血</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;&nbsp; </span><span
								style='font-family: 宋体'>脂</span><span lang=EN-US>*</span>
						</p>
					</td>
					<td width=388 colspan=17
						style='width: 291.15pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 49.85pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<b><span style='font-family: 宋体; color: lime'>总胆</span></b><span
								style='font-family: 宋体'>固醇</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="fzjcXzZdgc" id="fzjcXzZdgc" style="width:40px" value="${model.fzjcXzZdgc }">
							</span></b><span lang=EN-US style='font-family: 仿宋_GB2312'>mmol/L&nbsp;&nbsp;&nbsp;&nbsp;
							</span><b><span style='font-family: 宋体; color: lime'>甘油</span></b><span
								style='font-family: 宋体'>三酯</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="fzjcXzGysz" id="fzjcXzGysz" style="width:40px" value="${model.fzjcXzGysz }">
							</span></b><span lang=EN-US style='font-family: 仿宋_GB2312'>mmol/L</span>
						</p>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<b><span style='font-family: 宋体; color: lime'>血清</span></b><span
								style='font-family: 宋体'>低密度脂蛋白胆固醇</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="fzjcXzXqdmdzdbdgc" id="fzjcXzXqdmdzdbdgc" style="width:40px" value="${model.fzjcXzXqdmdzdbdgc }">
							</span></b><span lang=EN-US style='font-family: 仿宋_GB2312'>mmol/L</span>
						</p>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<b><span style='font-family: 宋体; color: lime'>血清</span></b><span
								style='font-family: 宋体'>高密度脂蛋白胆固醇</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="fzjcXzXqgmdzdbdgc" id="fzjcXzXqgmdzdbdgc" style="width:40px" value="${model.fzjcXzXqgmdzdbdgc }">
							</span></b><span lang=EN-US style='font-family: 仿宋_GB2312'>mmol/L</span>
						</p>
					</td>
					<td width=41 colspan=2
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 49.85pt'>
						<p class=MsoNormal align=right
							style='margin-left: 6.85pt; text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US>&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 18.45pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>胸部</span><span lang=EN-US>X</span><span
								style='font-family: 宋体'>线片</span><span lang=EN-US>*</span>
						</p>
					</td>
					<td width=388 colspan=17
						style='width: 291.15pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span class="MsoNormal"
								style="text-align: left; line-height: 16.0pt; layout-grid-mode: char"><span
								style="font-family: 宋体"> <input type="radio" name="fzjcXbxxp"
								value="正常" ${model.fzjcXbxxp == '正常' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>正常</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;<span
									style="font-family: 宋体"> <input type="radio"
										name="fzjcXbxxp" value="异常" ${model.fzjcXbxxp == '异常' ? 'checked' : '' }>
								</span></span><span style='font-family: 宋体'>异常</span><b><span
									style="font-family: 宋体; color: blue"> <input type="text"
										name="fzjcXbxxpQt" style="width:40px" value="${model.fzjcXbxxpQt }">
								</span></b></span>
						</p>
					</td>
					<td width=41 colspan=2
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=right
							style='margin-left: 6.85pt; text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US>&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 18.45pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US>B&nbsp;&nbsp; </span><span
								style='font-family: 宋体'>超</span><span lang=EN-US>*</span>
						</p>
					</td>
					<td width=388 colspan=17 valign=top
						style='width: 291.15pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal
							style='line-height: 16.0pt; layout-grid-mode: char'>
							<span class="MsoNormal"
								style="text-align: left; line-height: 16.0pt; layout-grid-mode: char"><span
								style="font-family: 宋体"> <input type="radio" name="fzjcBc"
								value="正常" ${model.fzjcBc == '正常' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>正常</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;<span
									style="font-family: 宋体"> <input type="radio"
										name="fzjcBc" value="异常" ${model.fzjcBc == '异常' ? 'checked' : '' }>
								</span></span><span style='font-family: 宋体'>异常</span><b><span
									style="font-family: 宋体; color: blue"> <input type="text"
										name="fzjcBcQt" id="fzjcBcQt" style="width:40px" value="${model.fzjcBcQt }">
								</span></b></span>
						</p>
					</td>
					<td width=41 colspan=2
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=right
							style='text-align: right; text-indent: 5.25pt; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US>&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 18.45pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>宫颈涂片</span><span lang=EN-US>*</span>
						</p>
					</td>
					<td width=388 colspan=19
						style='width: 291.15pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span class="MsoNormal"
								style="text-align: left; line-height: 16.0pt; layout-grid-mode: char"><span
								style="font-family: 宋体"> <input type="radio" name="fzjcGjtp" value="正常" ${model.fzjcGjtp == '正常' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>正常</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;<span
									style="font-family: 宋体"> <input type="radio"
										name="fzjcGjtp" value="异常" ${model.fzjcGjtp == '异常' ? 'checked' : '' }>
								</span></span><span style='font-family: 宋体'>异常</span><b><span
									style="font-family: 宋体; color: blue"> <input type="text"
										name="fzjcGjtpQt" id="fzjcGjtpQt" style="width:40px" value="${model.fzjcGjtpQt }">
								</span></b></span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 27.55pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 27.55pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>其</span><span lang=EN-US>&nbsp;&nbsp;
							</span><span style='font-family: 宋体'>他</span><span lang=EN-US>*</span>
						</p>
					</td>
					<td width=429 colspan=19
						style='width: 321.9pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 27.55pt'><p
							class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span
								style="width: 321.9pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 35.55pt">
								<textarea name="fzjcQt" id="fzjcQt" cols="45" rows="5">${model.fzjcQt }</textarea>
							</span>
						</p></td>
				</tr>
				<tr style='page-break-inside: avoid; height: 18.4pt'>
					<td width=57 rowspan=9
						style='width: 42.75pt; border: solid windowtext 1.0pt; border-top: none; padding: 0cm 0cm 0cm 0cm; height: 18.4pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>中医体质辨识</span><span lang=EN-US>*</span>
						</p>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<b><span style='font-family: 宋体; color: lime'>老年人中医管理要填这栏</span></b>
						</p>
					</td>
					<td width=102 colspan=2 valign=top
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.4pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>平和质</span>
						</p>
					</td>
					<td width=388 colspan=17 valign=top
						style='width: 291.15pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.4pt'>
						<p class=MsoNormal
							style='line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 宋体"> <input type="radio"
								name="zytzbsPhz" value="是" ${model.zytzbsPhz == '是' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>是</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;<span
								style="font-family: 宋体"> <input type="radio" name="zytzbsPhz"
								value="基本是" ${model.zytzbsPhz == '基本是' ? 'checked' : '' }>
							</span></span><span style='font-family: 宋体'>基本是</span>
						</p>
					</td>
					<td width=41 colspan=2 valign=top
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.4pt'>
						<p class=MsoNormal align=right
							style='text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 18.4pt'>
					<td width=102 colspan=2 valign=top
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.4pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>气虚质</span>
						</p>
					</td>
					<td width=388 colspan=17 valign=top
						style='width: 291.15pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.4pt'>
						<p class=MsoNormal
							style='line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 宋体"> <input type="radio"
								name="zytzbsQxz" value="是" ${model.zytzbsQxz == '是' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>是</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;<span
								style="font-family: 宋体"> <input type="radio" name="zytzbsQxz"
								value="倾向是" ${model.zytzbsQxz == '倾向是' ? 'checked' : '' }>
							</span></span><span style='font-family: 宋体'>倾向是</span>
						</p>
					</td>
					<td width=41 colspan=2 valign=top
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.4pt'>
						<p class=MsoNormal align=right
							style='text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 18.4pt'>
					<td width=102 colspan=2 valign=top
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.4pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>阳虚质</span>
						</p>
					</td>
					<td width=388 colspan=17 valign=top
						style='width: 291.15pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.4pt'>
						<p class=MsoNormal
							style='line-height: 16.0pt; layout-grid-mode: char'>
							<span class="MsoNormal"
								style="line-height: 16.0pt; layout-grid-mode: char"><span
								style="font-family: 宋体"> <input type="radio" name="zytzbsYanx"
									value="是" ${model.zytzbsYanx == '是' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>是</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;<span
									style="font-family: 宋体"> <input type="radio"
										name="zytzbsYanx" value="倾向是" ${model.zytzbsYanx == '倾向是' ? 'checked' : '' }>
								</span></span><span style='font-family: 宋体'>倾向是</span></span>
						</p>
					</td>
					<td width=41 colspan=2 valign=top
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.4pt'>
						<p class=MsoNormal align=right
							style='text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 18.4pt'>
					<td width=102 colspan=2 valign=top
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.4pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>阴虚质</span>
						</p>
					</td>
					<td width=388 colspan=17 valign=top
						style='width: 291.15pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.4pt'>
						<p class=MsoNormal
							style='line-height: 16.0pt; layout-grid-mode: char'>
							<span class="MsoNormal"
								style="line-height: 16.0pt; layout-grid-mode: char"><span
								style="font-family: 宋体"> <input type="radio" name="zytzbsYinx"
									value="是" ${model.zytzbsYinx == '是' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>是</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;<span
									style="font-family: 宋体"> <input type="radio"
										name="zytzbsYinx" value="倾向是" ${model.zytzbsYinx == '倾向是' ? 'checked' : '' }>
								</span></span><span style='font-family: 宋体'>倾向是</span></span>
						</p>
					</td>
					<td width=41 colspan=2 valign=top
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.4pt'>
						<p class=MsoNormal align=right
							style='text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 18.4pt'>
					<td width=102 colspan=2 valign=top
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.4pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>痰湿质</span>
						</p>
					</td>
					<td width=388 colspan=17 valign=top
						style='width: 291.15pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.4pt'>
						<p class=MsoNormal
							style='line-height: 16.0pt; layout-grid-mode: char'>
							<span class="MsoNormal"
								style="line-height: 16.0pt; layout-grid-mode: char"><span
								style="font-family: 宋体"> <input type="radio" name="zytzbsTx"
									value="是" ${model.zytzbsTx == '是' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>是</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;<span
									style="font-family: 宋体"> <input type="radio"
										name="zytzbsTx" value="倾向是" ${model.zytzbsTx == '倾向是' ? 'checked' : '' }> 
								</span></span><span style='font-family: 宋体'>倾向是</span></span>
						</p>
					</td>
					<td width=41 colspan=2 valign=top
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.4pt'>
						<p class=MsoNormal align=right
							style='text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 18.4pt'>
					<td width=102 colspan=2 valign=top
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.4pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>湿热质</span>
						</p>
					</td>
					<td width=388 colspan=17 valign=top
						style='width: 291.15pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.4pt'>
						<p class=MsoNormal
							style='line-height: 16.0pt; layout-grid-mode: char'>
							<span class="MsoNormal"
								style="line-height: 16.0pt; layout-grid-mode: char"><span
								style="font-family: 宋体"> <input type="radio" name="zytzbsXr"
									value="是" ${model.zytzbsXr == '是' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>是</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;<span
									style="font-family: 宋体"> <input type="radio"
									name="zytzbsXr" value="倾向是" ${model.zytzbsXr == '倾向是' ? 'checked' : '' }>
								</span></span><span style='font-family: 宋体'>倾向是</span></span>
						</p>
					</td>
					<td width=41 colspan=2 valign=top
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.4pt'>
						<p class=MsoNormal align=right style='text-align: right'>
							<span lang=EN-US>&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 18.4pt'>
					<td width=102 colspan=2 valign=top
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.4pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>血瘀质</span>
						</p>
					</td>
					<td width=388 colspan=17 valign=top
						style='width: 291.15pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.4pt'>
						<p class=MsoNormal
							style='line-height: 16.0pt; layout-grid-mode: char'>
							<span class="MsoNormal"
								style="line-height: 16.0pt; layout-grid-mode: char"><span
								style="font-family: 宋体"> <input type="radio" name="zytzbsXy"
								value="是" ${model.zytzbsXy == '是' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>是</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;<span
									style="font-family: 宋体"> <input type="radio"
									name="zytzbsXy" value="倾向是" ${model.zytzbsXy == '倾向是' ? 'checked' : '' }>
								</span></span><span style='font-family: 宋体'>倾向是</span></span>
						</p>
					</td>
					<td width=41 colspan=2 valign=top
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.4pt'>
						<p class=MsoNormal align=right style='text-align: right'>
							<span lang=EN-US>&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 18.4pt'>
					<td width=102 colspan=2 valign=top
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.4pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>气郁质</span>
						</p>
					</td>
					<td width=388 colspan=17 valign=top
						style='width: 291.15pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.4pt'>
						<p class=MsoNormal
							style='line-height: 16.0pt; layout-grid-mode: char'>
							<span class="MsoNormal"
								style="line-height: 16.0pt; layout-grid-mode: char"><span
								style="font-family: 宋体"> <input type="radio" name="zytzbsQy"
								value="是" ${model.zytzbsQy == '是' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>是</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;<span
									style="font-family: 宋体"> <input type="radio"
								name="zytzbsQy" value="倾向是" ${model.zytzbsQy == '倾向是' ? 'checked' : '' }>
								</span></span><span style='font-family: 宋体'>倾向是</span></span>
						</p>
					</td>
					<td width=41 colspan=2 valign=top
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.4pt'>
						<p class=MsoNormal align=right style='text-align: right'>
							<span lang=EN-US>&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 18.4pt'>
					<td width=102 colspan=2 valign=top
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.4pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>特秉质</span>
						</p>
					</td>
					<td width=388 colspan=17 valign=top
						style='width: 291.15pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.4pt'>
						<p class=MsoNormal
							style='line-height: 16.0pt; layout-grid-mode: char'>
							<span class="MsoNormal"
								style="line-height: 16.0pt; layout-grid-mode: char"><span
								style="font-family: 宋体"> <input type="radio" name="zytzbsTb"
								value="是" ${model.zytzbsTb == '是' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>是</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;<span
									style="font-family: 宋体"> <input type="radio"
										name="zytzbsTb" value="倾向是" ${model.zytzbsTb == '倾向是' ? 'checked' : '' }>
								</span></span><span style='font-family: 宋体'>倾向是</span></span>
						</p>
					</td>
					<td width=41 colspan=2 valign=top
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.4pt'>
						<p class=MsoNormal align=right style='text-align: right'>
							<span lang=EN-US>&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 18.45pt'>
					<td width=57 rowspan=10
						style='width: 42.75pt; border: solid windowtext 1.0pt; border-top: none; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>现存主要健康问题</span>
						</p>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span>
						</p>
					</td>
					<td width=102 colspan=2 rowspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>脑血管疾病</span>
						</p>
					</td>
					<td width=429 colspan=19
						style='width: 321.9pt; border: none; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 仿宋_GB2312"> <input
								type="checkbox" name="xczyjkwtNxgjb" value="未发现" ${fn:contains(model.xczyjkwtNxgjb, '未发现') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>未发现</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="xczyjkwtNxgjb" value="缺血性卒中" ${fn:contains(model.xczyjkwtNxgjb, '缺血性卒中') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>缺血性卒中</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="xczyjkwtNxgjb" value="脑出血" ${fn:contains(model.xczyjkwtNxgjb, '脑出血') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>脑出血</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'> <input type="checkbox"
								name="xczyjkwtNxgjb" value="蛛网膜下腔出血" ${fn:contains(model.xczyjkwtNxgjb, '蛛网膜下腔出血') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>蛛网膜下腔出血</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="xczyjkwtNxgjb" value="短暂性脑缺血发作" ${fn:contains(model.xczyjkwtNxgjb, '短暂性脑缺血发作') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>短暂性脑缺血发作</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;&nbsp;&nbsp;&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 18.45pt'>
					<td width=316 colspan=13 valign=top
						style='width: 237.3pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal
							style='line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 仿宋_GB2312"> 
							<input type="checkbox" name="xczyjkwtNxgjb" value="其他" ${fn:contains(model.xczyjkwtNxgjb, '其他') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>其他</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="xczyjkwtNxgjbQt" id="xczyjkwtNxgjbQt" style="width:120px" value="${model.xczyjkwtNxgjbQt }">
							</span></b>
						</p>
					</td>
					<td width=113 colspan=6 valign=top
						style='width: 84.6pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=right
							style='text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 18.45pt'>
					<td width=102 colspan=2 rowspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>肾脏疾病</span>
						</p>
					</td>
					<td width=429 colspan=19
						style='width: 321.9pt; border: none; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 仿宋_GB2312"> <input
								type="checkbox" name="xczyjkwtSzjb" value="未发现" ${fn:contains(model.xczyjkwtSzjb, '未发现') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>未发现</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp; <input
								type="checkbox" name="xczyjkwtSzjb" value="糖尿病肾病" ${fn:contains(model.xczyjkwtSzjb, '糖尿病肾病') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>糖尿病肾病</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp; <input
								type="checkbox" name="xczyjkwtSzjb" value="肾功能衰竭" ${fn:contains(model.xczyjkwtSzjb, '肾功能衰竭') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>肾功能衰竭</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp; <input
								type="checkbox" name="xczyjkwtSzjb" value="急性肾炎" ${fn:contains(model.xczyjkwtSzjb, '急性肾炎') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>急性肾炎</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp; <input
								type="checkbox" name="xczyjkwtSzjb" value="慢性肾炎" ${fn:contains(model.xczyjkwtSzjb, '慢性肾炎') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>慢性肾炎</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp;&nbsp;&nbsp;&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 18.45pt'>
					<td width=316 colspan=13
						style='width: 237.3pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 仿宋_GB2312"> <input
								type="checkbox" name="xczyjkwtSzjb" value="其他" ${fn:contains(model.xczyjkwtSzjb, '其他') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>其他</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="xczyjkwtSzjbQt" id="xczyjkwtSzjbQt" style="width:40px" value="${model.xczyjkwtSzjbQt }">
							</span></b>
						</p>
					</td>
					<td width=113 colspan=6 valign=top
						style='width: 84.6pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=right
							style='margin-left: 6.85pt; text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 18.45pt'>
					<td width=102 colspan=2 rowspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>心脏疾病</span>
						</p>
					</td>
					<td width=429 colspan=19
						style='width: 321.9pt; border: none; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 仿宋_GB2312"> <input
								type="checkbox" name="xczyjkwtXzjb" value="未发现" ${fn:contains(model.xczyjkwtXzjb, '未发现') ? 'checked' : '' }> 
							</span><span style='font-family: 宋体'>未发现</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp; <input
								type="checkbox" name="xczyjkwtXzjb" value="心肌梗死" ${fn:contains(model.xczyjkwtXzjb, '心肌梗死') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>心肌梗死</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp; <input
								type="checkbox" name="xczyjkwtXzjb" value="心绞痛" ${fn:contains(model.xczyjkwtXzjb, '心绞痛') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>心绞痛</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp; <input
								type="checkbox" name="xczyjkwtXzjb" value="冠状动脉血运重建" ${fn:contains(model.xczyjkwtXzjb, '冠状动脉血运重建') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>冠状动脉血运重建<span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="xczyjkwtXzjb" value="充血性心力衰竭" ${fn:contains(model.xczyjkwtXzjb, '充血性心力衰竭') ? 'checked' : '' }>
							</span></span><span style='font-family: 宋体'>充血性心力衰竭</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 18.45pt'>
					<td width=316 colspan=13
						style='width: 237.3pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 仿宋_GB2312"> <input
								type="checkbox" name="xczyjkwtXzjb" value="心前区疼痛" ${fn:contains(model.xczyjkwtXzjb, '心前区疼痛') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>心前区疼痛</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp; <input
								type="checkbox" name="xczyjkwtXzjb" value="其他" ${fn:contains(model.xczyjkwtXzjb, '其他') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>其他</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="xczyjkwtXzjbQt" id="xczyjkwtXzjbQt" style="width:40px" value="${model.xczyjkwtXzjbQt }">
							</span></b>
						</p>
					</td>
					<td width=113 colspan=6
						style='width: 84.6pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=right
							style='margin-left: 6.85pt; text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 18.45pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>血管疾病</span>
						</p>
					</td>
					<td width=350 colspan=19
						style='width: 262.7pt; border: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt;padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 仿宋_GB2312"> <input
								type="checkbox" name="xczyjkwtXgjb" value="未发现" ${fn:contains(model.xczyjkwtXgjb, '未发现') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>未发现</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'> <input type="checkbox"
								name="xczyjkwtXgjb" value="夹层动脉瘤" ${fn:contains(model.xczyjkwtXgjb, '夹层动脉瘤') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>夹层动脉瘤</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp; <input
								type="checkbox" name="xczyjkwtXgjb" value="动脉闭塞性疾病" ${fn:contains(model.xczyjkwtXgjb, '动脉闭塞性疾病') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>动脉闭塞性疾病</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'> <input type="checkbox"
								name="xczyjkwtXgjb" value="其他" ${fn:contains(model.xczyjkwtXgjb, '其他') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>其他</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="xczyjkwtXgjbQt" id="xczyjkwtXgjbQt" style="width:40px" value="${model.xczyjkwtXgjbQt }">
							</span></b>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 36.25pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 36.25pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>眼部疾病</span>
						</p>
					</td>
					<td width=350 colspan=19
						style='width: 262.7pt; border: none; border-right: solid windowtext 1.0pt;border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 36.25pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 仿宋_GB2312"> <input
								type="checkbox" name="xczyjkwtYbjb" value="未发现" ${fn:contains(model.xczyjkwtYbjb, '未发现') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>未发现</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="xczyjkwtYbjb" value="视网膜出血或渗出" ${fn:contains(model.xczyjkwtYbjb, '视网膜出血或渗出') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>视网膜出血或渗出</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'> <input type="checkbox"
								name="xczyjkwtYbjb" value="视乳头水肿" ${fn:contains(model.xczyjkwtYbjb, '视乳头水肿') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>视乳头水肿</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="xczyjkwtYbjb" value="白内障" ${fn:contains(model.xczyjkwtYbjb, '白内障') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>白内障</span>
							<span class="MsoNormal"
								style="text-align: left; line-height: 16.0pt; layout-grid-mode: char"><span
								lang=EN-US style='font-family: 仿宋_GB2312'> <input
									type="checkbox" name="xczyjkwtYbjb" value="其他" ${fn:contains(model.xczyjkwtYbjb, '其他') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>其他</span><b><span
									style="font-family: 宋体; color: blue"> <input type="text"
										name="xczyjkwtYbjbQt" id="xczyjkwtYbjbQt" style="width:40px" value="${model.xczyjkwtYbjbQt }">
								</span></b></span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 18.45pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>神经系统疾病</span>
						</p>
					</td>
					<td width=388 colspan=17
						style='width: 291.15pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 宋体"> <input type="radio"
								name="xczyjkwtSjxtjb" value="未发现" ${model.xczyjkwtSjxtjb == '未发现' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>未发现</span><span
								style="font-family: 宋体"> <input type="radio" name="xczyjkwtSjxtjb"
								value="有" ${model.xczyjkwtSjxtjb == '有' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>有<b><span
									style="font-family: 宋体; color: blue"> <input type="text"
										name="xczyjkwtSjxtjbQt" id="xczyjkwtSjxtjbQt" style="width:40px" value="${model.xczyjkwtSjxtjbQt }">
								</span></b></span>
						</p>
					</td>
					<td width=41 colspan=2
						style='width: 30.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=right
							style='text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 18.45pt'>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>其他系统疾病</span>
						</p>
					</td>
					<td width=350 colspan=15
						style='width: 262.7pt; border: none; border-bottom: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 宋体"> <input type="radio"
								name="xczyjkwtQtxtjb" value="未发现" ${model.xczyjkwtQtxtjb == '未发现' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>未发现</span><span
								style="font-family: 宋体"> <input type="radio" name="xczyjkwtQtxtjb"
								value="有" ${model.xczyjkwtQtxtjb == '有' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>有</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="xczyjkwtQtxtjbQt" id="xczyjkwtQtxtjbQt" style="width:40px" value="${model.xczyjkwtQtxtjbQt }">
							</span></b>
						</p>
					</td>
					<td width=79 colspan=4
						style='width: 59.2pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=right
							style='text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 18.45pt'>
					<td width=57 rowspan=6
						style='width: 42.75pt; border: solid windowtext 1.0pt; border-top: none; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>住院治疗情况</span>
						</p>
					</td>
					<td width=102 colspan=2 rowspan=3
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>住院史</span>
						</p>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<input type="button" value="+" class="btn-info" onclick="javascript:fnAddZys(this);">
						</p>
					</td>
					<td width=159 colspan=4
						style='width: 119.05pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>入</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>/</span><span
								style='font-family: 宋体'>出院日期</span>
						</p>
					</td>
					<td width=84 colspan=4
						style='width: 62.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>原</span><span
								style='font-family: 仿宋_GB2312'> </span><span
								style='font-family: 宋体'>因</span>
						</p>
					</td>
					<td width=108 colspan=7
						style='width: 80.8pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>医疗机构名称</span>
						</p>
					</td>
					<td width=79 colspan=4
						style='width: 59.2pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>病案号</span>
						</p>
					</td>
				</tr>
				
				<tr style='page-break-inside: avoid; height: 18.45pt'>
					<td width=159 colspan=19 id="td_zys"
						style='width: 119.05pt; border-top: none; border-left: none; border-bottom: none; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						${model.zysDes }
					</td>
				</tr>
				<tr style='page-break-inside: avoid;'>
					<td width=159 colspan=19
						style='width: 119.05pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
					&nbsp;
					</td>
				</tr>
				
				<tr style='page-break-inside: avoid; height: 18.45pt'>
					<td width=102 colspan=2 rowspan=3
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>家</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp; </span><span
								style='font-family: 宋体'>庭</span>
						</p>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>病床史</span>
						</p>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<input type="button" value="+" class="btn-info" onclick="javascript:fnAddJtbcs(this);">
						</p>
					</td>
					<td width=159 colspan=4
						style='width: 119.05pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>建</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>/</span><span
								style='font-family: 宋体'>撤床日期</span>
						</p>
					</td>
					<td width=84 colspan=4
						style='width: 62.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>原</span><span
								style='font-family: 仿宋_GB2312'> </span><span
								style='font-family: 宋体'>因</span>
						</p>
					</td>
					<td width=108 colspan=7
						style='width: 80.8pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>医疗机构名称</span>
						</p>
					</td>
					<td width=79 colspan=4
						style='width: 59.2pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>病案号</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 18.45pt'>
					<td width=159 colspan=19 id="td_jtbcsDes"
						style='width: 119.05pt; border-top: none; border-left: none; border-bottom: none; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
					${model.jtbcsDes }
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 18.45pt'>
					<td width=159 colspan=19
						style='width: 119.05pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 18.45pt'>
					&nbsp;
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 38.9pt'>
					<td width=57 rowspan=7
						style='width: 42.75pt; border: solid windowtext 1.0pt; border-top: none; padding: 0cm 0cm 0cm 0cm; height: 38.9pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>主要用药</span>
						</p>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt'>
							<span style='font-family: 宋体'>情况</span>
						</p>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<input type="button" value="+" class="btn-info" onclick="javascript:fnAddYyqk(this);">
						</p>
					</td>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 38.9pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>药物名称</span>
						</p>
					</td>
					<td width=131 colspan=2
						style='width: 98.45pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 38.9pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>用法</span>
						</p>
					</td>
					<td width=58 colspan=4
						style='width: 43.8pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 38.9pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>用量</span>
						</p>
					</td>
					<td width=79 colspan=4
						style='width: 59.4pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 38.9pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>用药时间</span>
						</p>
					</td>
					<td width=160 colspan=9
						style='width: 120.25pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 38.9pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>服药依从性</span>
						</p>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'>1</span><span
								style='font-family: 宋体'>规律 </span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>2</span><span
								style='font-family: 宋体'>间断 </span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>3</span><span
								style='font-family: 宋体'>不服药</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 22.7pt'>
					<td width=102 colspan=21 id="td_yy"
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: none; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 22.7pt'>
						${model.yyqkDes }
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 22.7pt'>
					<td width=102 colspan=21
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: none; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 22.7pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							&nbsp;
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 22.7pt'>
					<td width=102 colspan=21
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: none; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 22.7pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							&nbsp;
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 22.7pt'>
					<td width=102 colspan=21
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: none; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 22.7pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							&nbsp;
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 22.7pt'>
					<td width=102 colspan=21
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: none; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 22.7pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							&nbsp;
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 22.7pt'>
					<td width=102 colspan=21
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 22.7pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							&nbsp;
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 22.7pt'>
					<td width=57 rowspan=4
						style='width: 42.75pt; border: solid windowtext 1.0pt; border-top: none; padding: 0cm 0cm 0cm 0cm; height: 22.7pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 12.0pt'>
							<span style='font-family: 宋体'>非免疫</span>
						</p>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 12.0pt'>
							<span style='font-family: 宋体'>规划预防接种史</span>
						</p>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<input type="button" value="+" class="btn-info" onclick="javascript:fnAddJzs(this);">
						</p>
					</td>
					<td width=102 colspan=2
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 22.7pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>名称</span>
						</p>
					</td>
					<td width=131 colspan=2
						style='width: 98.45pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 22.7pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>接种日期</span>
						</p>
					</td>
					<td width=298 colspan=17
						style='width: 223.45pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 22.7pt'>
						<p class=MsoNormal align=center
							style='margin-left: 2.05pt; text-align: center; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>接种机构</span>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 22.7pt'>
					<td width=102 colspan=21 id="td_jzs"
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: none; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 22.7pt'>
						${model.fmyghyfjzsDes }
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 22.7pt'>
					<td width=102 colspan=21
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: none; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 22.7pt'>
						&nbsp;
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 22.7pt'>
					<td width=102 colspan=21
						style='width: 76.85pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 22.7pt'>
						&nbsp;
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 109.5pt'>
					<td width=57
						style='width: 42.75pt; border: solid windowtext 1.0pt; border-top: none; padding: 0cm 0cm 0cm 0cm; height: 109.5pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 12.0pt'>
							<span style='font-family: 宋体'>健康</span>
						</p>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 12.0pt'>
							<span style='font-family: 宋体'>评价</span>
						</p>
					</td>
					<td width=532 colspan=21
						style='width: 398.75pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 109.5pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 宋体"> <input type="radio"
								name="jkpj" value="体检无异常" ${model.jkpj == '体检无异常' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>体检无异常</span>
						</p>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 宋体"> <input type="radio"
								name="jkpj" value="有异常" ${model.jkpj == '有异常' ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>有异常</span>
						</p>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span class="MsoNormal"
								style="text-align: left; line-height: 16.0pt; layout-grid-mode: char"><span
								style='font-family: 宋体'>异常</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>1&nbsp; </span><u><span
									style="font-family: 宋体"> <input type="text"
										name="jkpjDes1" id="jkpjDes1" value="${model.jkpjDes1 }">
								</span></u></span>
						</p>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>异常</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>2&nbsp; </span><u><span
								style="font-family: 宋体"> <input type="text"
									name="jkpjDes2" id="jkpjDes2" value="${model.jkpjDes2 }">
							</span></u>
						</p>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>异常</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>3&nbsp; </span><u><span
								style="font-family: 宋体"> <input type="text"
									name="jkpjDes3" id="jkpjDes3" value="${model.jkpjDes3 }">
							</span></u>
						</p>
						<p class=MsoNormal
							style='line-height: 150%; layout-grid-mode: char'>
							<span style='line-height: 150%; font-family: 宋体'>异常</span><span
								lang=EN-US style='line-height: 150%; font-family: 仿宋_GB2312'>4&nbsp;
							</span><u><span style="font-family: 宋体"> <input type="text"
									name="jkpjDes4" id="jkpjDes4" value="${model.jkpjDes4 }">
							</span></u>
						</p>
						<p class=MsoNormal
							style='line-height: 150%; layout-grid-mode: char'>
							<span style='line-height: 150%; font-family: 宋体'>异常</span><span
								lang=EN-US style='line-height: 150%; font-family: 仿宋_GB2312'>5&nbsp;
							</span><u><span style="font-family: 宋体"> <input type="text"
									name="jkpjDes5" id="jkpjDes5" value="${model.jkpjDes5 }">
							</span></u>
						</p>
					</td>
				</tr>
				<tr style='page-break-inside: avoid; height: 102.25pt'>
					<td width=57
						style='width: 42.75pt; border: solid windowtext 1.0pt; border-top: none; padding: 0cm 0cm 0cm 0cm; height: 102.25pt'>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 12.0pt'>
							<span style='font-family: 宋体'>健</span>
						</p>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 12.0pt'>
							<span style='font-family: 宋体'>康</span>
						</p>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 12.0pt'>
							<span style='font-family: 宋体'>指</span>
						</p>
						<p class=MsoNormal align=center
							style='text-align: center; line-height: 12.0pt'>
							<span style='font-family: 宋体'>导</span>
						</p>
					</td>
					<td width=272 colspan=7
						style='width: 204.1pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 102.25pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<b><span style='font-family: 宋体; color: lime'>（如有疾病要填本栏）</span></b>
						</p>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 仿宋_GB2312"> <input
								type="checkbox" name="jkzdDes" value="定期随访" ${fn:contains(model.jkzdDes, '定期随访') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>定期随访</span>
						</p>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 仿宋_GB2312"> <input
								type="checkbox" name="jkzdDes" value="纳入慢性病患者健康管理" ${fn:contains(model.jkzdDes, '纳入慢性病患者健康管理') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>纳入慢性病患者健康管理</span>
						</p>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 仿宋_GB2312"> <input
								type="checkbox" name="jkzdDes" value="建议复查" ${fn:contains(model.jkzdDes, '建议复查') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>建议复查</span>
						</p>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 仿宋_GB2312"> <input
								type="checkbox" name="jkzdDes" value="建议转诊" ${fn:contains(model.jkzdDes, '建议转诊') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>建议转诊</span>
						</p>
						<p class=MsoNormal align=right
							style='text-align: right; line-height: 16.0pt; layout-grid-mode: char'>
							<span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span>
						</p>
					</td>
					<td width=260 colspan=14
						style='width: 194.65pt; border-top: none; border-left: none; border-bottom: solid windowtext 1.0pt; border-right: solid windowtext 1.0pt; padding: 0cm 0cm 0cm 0cm; height: 102.25pt'>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 20.0pt; layout-grid-mode: char'>
							<span style='font-family: 宋体'>危险因素控制：</span><span
								style='font-family: 仿宋_GB2312'> </span>
						</p>
						<p class=MsoNormal
							style='line-height: 20.0pt; layout-grid-mode: char'>
							<span style="font-family: 仿宋_GB2312"> <input
								type="checkbox" name="wxyskz" value="戒烟" ${fn:contains(model.wxyskz, '戒烟') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>戒烟</span><span lang=EN-US
								style='font-family: 仿宋_GB2312'>&nbsp; <input
								type="checkbox" name="wxyskz" value="健康饮酒" ${fn:contains(model.wxyskz, '健康饮酒') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>健康饮酒</span><span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="wxyskz" value="饮食" ${fn:contains(model.wxyskz, '饮食') ? 'checked' : '' }>
							</span>
							<span style='font-family: 宋体'>饮食</span><span lang=EN-US style='font-family: 仿宋_GB2312'>&nbsp;</span>
								<span
								style="font-family: 仿宋_GB2312"> <input type="checkbox"
								name="wxyskz" value="锻炼" ${fn:contains(model.wxyskz, '锻炼') ? 'checked' : '' }>
							</span>
							<span style='font-family: 宋体'>锻炼</span>
						</p>
						<p class=MsoNormal
							style='line-height: 20.0pt; layout-grid-mode: char'>
							<span style="font-family: 仿宋_GB2312"> <input
								type="checkbox" name="wxyskz" value="减体重" ${fn:contains(model.wxyskz, '减体重') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>减体重（目标<b><span
									style="font-family: 宋体; color: blue"> <input type="text"
										name="wxyskzMb" id="wxyskzMb" style="width:40px" value="${model.wxyskzMb }">
								</span></b>）
							</span>
						</p>
						<p class=MsoNormal
							style='line-height: 20.0pt; layout-grid-mode: char'>
							<span style="font-family: 仿宋_GB2312"> <input
								type="checkbox" name="wxyskz" value="建议接种疫苗" ${fn:contains(model.wxyskz, '建议接种疫苗') ? 'checked' : '' }>
							</span><span style='font-family: 宋体'>建议接种疫苗</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="wxyskzJyjzym" id="wxyskzJyjzym" style="width:40px" value="${model.wxyskzJyjzym }">
							</span></b>
						</p>
						<p class=MsoNormal align=left
							style='text-align: left; line-height: 16.0pt; layout-grid-mode: char'>
							<span style="font-family: 仿宋_GB2312"> <input ${fn:contains(model.wxyskz, '其他') ? 'checked' : '' }
								type="checkbox" name="wxyskz" value="其他">
							</span><span style='font-family: 宋体'>其他</span><b><span
								style="font-family: 宋体; color: blue"> <input type="text"
									name="wxyskzQt" id="wxyskzQt" style="width:300px" value="${model.wxyskzQt }">
							</span></b>
						</p>
					</td>
				</tr>
				<tr height=0>
					<td width=57 style='border: none'></td>
					<td width=51 style='border: none'></td>
					<td width=51 style='border: none'></td>
					<td width=95 style='border: none'></td>
					<td width=36 style='border: none'></td>
					<td width=24 style='border: none'></td>
					<td width=3 style='border: none'></td>
					<td width=11 style='border: none'></td>
					<td width=20 style='border: none'></td>
					<td width=47 style='border: none'></td>
					<td width=6 style='border: none'></td>
					<td width=19 style='border: none'></td>
					<td width=7 style='border: none'></td>
					<td width=23 style='border: none'></td>
					<td width=11 style='border: none'></td>
					<td width=14 style='border: none'></td>
					<td width=5 style='border: none'></td>
					<td width=29 style='border: none'></td>
					<td width=4 style='border: none'></td>
					<td width=34 style='border: none'></td>
					<td width=8 style='border: none'></td>
					<td width=33 style='border: none'></td>
				</tr>
			</table>
</form>
		</div>

		<p class=MsoNormal>
			<span lang=EN-US>&nbsp;</span>
		</p>
		
	</div>
	<!--print end-->
	<script src="/third-party/jquery/jquery-1.11.3.min.js"></script>
	<script src="/third-party/z.js"></script>
	<script type="text/javascript" src="/third-party/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="/third-party/bootstrap-datetimepicker/js/bootstrap-datetimepicker.js"></script>
	<script type="text/javascript" src="/third-party/bootstrap-datetimepicker/js/locales/bootstrap-datetimepicker.zh-CN.js"></script>
	<script type="text/javascript" src="/third-party/layer/layer.js" title="v"></script>
	<script type="text/javascript">
		$(document).ready(function() {

			var openType = '${openType}';
			
			if(openType != 'detail'){
				bindDateField("#tjrq");
			}
			
			
			if(openType == 'detail'){
				$("input[type=checkbox], input[type=radio]").attr('disabled', true);
				$("input[type=text]").attr('readonly', true);
				$("input[type=button]").css('display', 'none');
				
				$("input").css('border-style', 'none');
				$("textarea").css('border-style', 'none');
			}
		});
		
		
		
		function bindDateField(selector) {
			$(selector).datetimepicker({
				bootcssVer : 3,
				format : 'yyyy-mm-dd',
				todayBtn : true,
				language : 'zh-CN',
				startView : 2,
				viewSelect : 'year',
				minView : 2, //选择日期后，不会再跳转去选择时分秒 
				autoclose : true
			});
		}
		
		
		
		function fnAddJzs(btn){
			
			var index = layer.open({
				  title: '添加非免疫性接种史',
				  area: ['700px', '180px'],
				  btn : ['确定', '取消'],
				  content: '名称：<input style="width:80px;" type="text" name="_jzs1">&nbsp;接种日期：<input style="width:80px;" type="text" name="_jzs2">&nbsp;接种机构：<input style="width:80px;" type="text" name="_jzs3">',
				  success : function(layero, index){
					  bindDateField($("input[name='_jzs2']"));
				  },
				  yes : function(){
					  var v0 = $("input[name='_jzs1']").val();
					  var v1 = $("input[name='_jzs2']").val();
					  var v2 = $("input[name='_jzs3']").val();
					  var tpl = '<p>名称：{0}，接种日期：{1}，接种机构：{2}。&nbsp;<input value="x" type="button" class="btn-danger" onclick="$(this).parent().remove();"></p>';
					  $("#td_jzs").append(tpl.format([v0, v1, v2]));
					  layer.close(index);
				  },
				  btn2 : function(){
					  layer.close(index);
				  }
				});
		}
		function fnAddYyqk(btn){
			var index = layer.open({
				  title: '添加用药情况',
				  area: ['800px', '180px'],
				  btn : ['确定', '取消'],
				  content: '药物名称：<input style="width:80px;" type="text" name="_yy1">&nbsp;用法：<input style="width:80px;" type="text" name="_yy2">&nbsp;用量：<input style="width:80px;" type="text" name="_yy3">&nbsp;用药时间：<input style="width:80px;" type="text" name="_yy4">&nbsp;<select style="width:80px;" name="_yy5"><option value="规律">规律</option><option value="间断">间断</option><option value="不服药">不服药</option></select>',
				  success : function(){
					  bindDateField($("input[name='_yy4']"));
				  },
				  yes : function(){
					  var v0 = $("input[name='_yy1']").val();
					  var v1 = $("input[name='_yy2']").val();
					  var v2 = $("input[name='_yy3']").val();
					  var v3 = $("input[name='_yy4']").val();
					  var v4 = $("select[name='_yy5']").val();
					  var tpl = '<p>药物名称：{0}，用法：{1}，用量：{2}，用药时间：{3}，服药依从性：{4}。&nbsp;<input class="btn-danger" value="x" type="button" onclick="$(this).parent().remove();"></p>';
					  $("#td_yy").append(tpl.format([v0, v1, v2, v3, v4]));
					  layer.close(index);
				  },
				  btn2 : function(){
					  layer.close(index);
				  }
				});
		}
		function fnAddJtbcs(btn){
			var index = layer.open({
				  title: '添加家庭病床史',
				  area: ['850px', '180px'],
				  btn : ['确定', '取消'],
				  content: '建床日期：<input style="width:80px;" type="text" name="_jt0">&nbsp;撤床日期：<input style="width:80px;" type="text" name="_jt1">&nbsp;原因：<input style="width:80px;" type="text" name="_jt2">&nbsp;医疗机构名称：<input style="width:80px;" type="text" name="_jt3">&nbsp;病案号：<input style="width:80px;" type="text" name="_jt4">',
				  success : function(){
					  bindDateField($("input[name='_jt0']"));
					  bindDateField($("input[name='_jt1']"));
				  },
				  yes : function(){
					  var v0 = $("input[name='_jt0']").val();
					  var v1 = $("input[name='_jt1']").val();
					  var v2 = $("input[name='_jt2']").val();
					  var v3 = $("input[name='_jt3']").val();
					  var v4 = $("input[name='_jt4']").val();
					  var tpl = '<p>建床：{0}，撤床：{1}，原因：{2}，医疗机构：{3}，病案号：{4}。&nbsp;<input value="x" class="btn-danger" type="button" onclick="$(this).parent().remove();"></p>';
					  $("#td_jtbcsDes").append(tpl.format([v0, v1, v2, v3, v4]));
					  layer.close(index);
				  },
				  btn2 : function(){
					  layer.close(index);
				  }
				});
		}
		function fnAddZys(btn){
			var index = layer.open({
				  title: '添加住院史',
				  area: ['850px', '180px'],
				  btn : ['确定', '取消'],
				  content: '入院日期：<input style="width:80px;" type="text" name="_zysj">&nbsp;出院日期：<input style="width:80px;" type="text" name="_cysj">&nbsp;原因：<input style="width:80px;" type="text" name="_zyyy">&nbsp;医疗机构名称：<input style="width:80px;" type="text" name="_yljgmc">&nbsp;病案号：<input style="width:80px;" type="text" name="_bah">',
				  success : function(){
					bindDateField($("input[name='_zysj']"))
					bindDateField($("input[name='_cysj']"))
				  },
				  yes : function(){
					  var v0 = $("input[name='_zysj']").val();
					  var v1 = $("input[name='_cysj']").val();
					  var v2 = $("input[name='_zyyy']").val();
					  var v3 = $("input[name='_yljgmc']").val();
					  var v4 = $("input[name='_bah']").val();
					  var tpl = '<p>入院：{0}，出院：{1}，原因：{2}，医疗机构名称：{3}，病案号：{4}。&nbsp;<input value="x" class="btn-danger" type="button" onclick="$(this).parent().remove();"></p>';
					  $("#td_zys").append(tpl.format([v0, v1, v2, v3, v4]));
					  layer.close(index);
				  },
				  btn2 : function(){
					  layer.close(index);
				  }
				});
		}
		//添加xx接触史
		function fnAddShfsZybwhysjcs(btn){
			var index = layer.open({
				  title: '添加职业病史',
				  area: ['700px', '180px'],
				  btn : ['确定', '取消'],
				  content: '工种：<input style="width:80px;" type="text" name="_gz">&nbsp;从业时间：<input style="width:80px;" type="text" name="_cysj">年，毒物种类：<input style="width:80px;" type="text" name="_dwzl">&nbsp;防护措施：<input style="width:80px;" type="text" name="_fhcs">',
				  yes : function(){
					  var v0 = $("input[name='_gz']").val();
					  var v1 = $("input[name='_cysj']").val();
					  var v2 = $("input[name='_dwzl']").val();
					  var v3 = $("input[name='_fhcs']").val();
					  var tpl = '<p>工种：{0}，从业时间：{1}年，毒物种类：{2}，防护措施：{3}&nbsp;<input value="x" type="button" class="btn-danger" onclick="$(this).parent().remove();"></p>';
					  $("#zybwhysjcs").append(tpl.format([v0, v1, v2, v3]));
					  layer.close(index);
				  },
				  btn2 : function(){
					  layer.close(index);
				  }
				});
		}
		
		
		//比值计算
		function round(v,e){
				var t=1;
				for(;e>0;t*=10,e--);
				for(;e<0;t/=10,e++);
				return Math.round(v*t)/t;
			}
		function ytwbz(){
			var yw = $.trim($('#ybqkYw').val());
			var tw = $.trim($('#ybqkTunWei').val());
			
			if(yw && tw){
				
				yw = parseFloat(yw), tw = parseFloat(tw);
				
				$('#ybqkYtwbz').val(round(yw/tw, 3));
				
			}
			
		}
		$('#ybqkYw').keyup(ytwbz);
		$('#ybqkTunWei').keyup(ytwbz);
		
	</script>
</body>

</html>
