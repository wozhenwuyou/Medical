// 执行查询

function fnReset(){
	$("#provinceId").combobox('setValue', ''); // 省份id
	$("#cityId").combobox('setValue', ''); // 城市名
	$("#hospitalId").combobox('setValue', '');// 医院名
	doSearch();
}

function doSearch() {
	
	var provinceId = $("#provinceId").combobox('getValue'); // 省份id
	var cityId = $("#cityId").combobox('getValue'); // 城市名
	var hospitalId = $("#hospitalId").combobox('getValue');// 医院名

	$("#datagrid").datagrid({
		url : '/back/phr/count',
		pagination : true,
		pageSize : 19,
		pageList : [ 10, 15, 19, 20, 50, 100, 1000 ],
		queryParams : {
			'provinceId' : provinceId,
			'cityId' : cityId,
			'hospitalId' : hospitalId
		},
		columns : [ [ {
			field : 'provinceName',
			title : '省份',
			width : 100
		},{
			field : 'cityName',
			title : '城市',
			width : 100
		}, {
			field : 'hospitalAddress',
			title : '诊所地址',
			width : 100
		}, {
			field : 'hospitalName',
			title : '诊所名称',
			width : 100
		}, {
			field : 'archiveCount',
			title : '档案数',
			width : 100
		} ] ]
	});

}

$(function(){
	$('#provinceId').combobox({
		valueField : 'id',
		textField : 'name',
		editable : false,
		multiple : false,
		panelHeight : 200,
		onSelect: function(rec){    
            var url = '/back/getCityArray?provinceId='+rec.id;    
            $('#cityId').combobox('reload', url);    
        },
		url : "/back/getProvinceArray"
	});
	$('#cityId').combobox({
		valueField : 'id',
		textField : 'name',
		editable : false,
		multiple : false,
		panelHeight : 200,
		url : "/back/getCityArray?provinceId=1"
	});
	$('#hospitalId').combobox({
		valueField : 'id',
		textField : 'name',
		editable : true,
		multiple : false,
		panelHeight : 200,
		url : "/back/getHospitalArray"
	});
	
	doSearch();
});
