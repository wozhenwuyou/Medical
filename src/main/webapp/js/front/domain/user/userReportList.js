$(function(){
	initData();
});
function initData(){
	jQuery(".Box").slide({mainCell:".bd ul",autoPlay:true});
	loadGridData();
}

function loadGridData(page,size,count){
	if(!page)page = 1;
	if(!size)size = lh.grid.frontSize || 20;
	if(!count)count = 1;
	var name = $("#name").val();
	if(!name)	name = null;
	$.post('/getUserReportList',{page:page,rows:size,itemNameLike:name, isLink:1},function(rsp){
		if(rsp.success){
			var totalNumber = rsp.total || 0;
		    $('#reportList').html(buildDom(rsp.rows));
		    $('#page').empty().Paging({
		    	current:page,
		    	pagesize:size,
		    	count:totalNumber,
		    	toolbar:false,
		    	callback:function(page,size,count){
		    		loadGridData(page,size,count);
		    	}
		    });
		}else{
			lh.alert(rsp.msg);return;
		}
	});
}

function resetQuery(){
	$("#name").val(null);
}

function buildDom(data){
	if(!data) return '';
	var obj = {
			rows:data,
			createDate:function(){
				return lh.formatDate({date:this.createdAt});
			},
			getAttrDate:function(){
				if(!this.attrDate)return '';
				return lh.formatDate({date:this.attrDate,flag:'date'});
			},
			resultHintName:function(){
				var resultHint = this.resultHint;
				if(resultHint == 'd'){
					return '<span style="color:red;">异常</span>';//'低'
				}else if(resultHint == 'z'){
					return '<span style="color:green;">正常</span>';
				}else if(resultHint == 'g'){
					return '<span style="color:red;">异常</span>';//'高'
				}
			}
		} 
	var template = $('#template').html();
	Mustache.parse(template);
	var rendered = Mustache.render(template, obj);
	return rendered;
}

function readPatientReport(id){
	lh.jumpToUrl("/userReportDetail/"+id);
}


