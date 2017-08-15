function fnView(basicInfoId, name) {
	var index = layer
			.open({
				type : 2,
				shade : false,
				scrollbar : false,
				title : '查看<font color=red>【{0}】</font>的档案信息'.format(name), // 不显示标题
				area : [ '1000px', '680px' ],
				content : '/views/front/domain/doctor/catalog.jsp?openType=detail&basicInfoId='
						+ basicInfoId,
				btn : [ '打印', '取消' ],
				yes : function() {
					var catalogBody = $(top.frames[1].document.body);
					var alinks = catalogBody.find("#catalogList li a");
					var pageUrls = [];
					$.each(alinks, function(i, onelink) {
						pageUrls.push($(onelink).attr('href'));
					});
					iframeprint(pageUrls);
				},
				btn2 : function() {
					top.layer.close(index);
				}
			});
	top.layer.full(index);
}
