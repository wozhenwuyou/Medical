$(function(){
	//loadGridData();
});

function loadGridData(page,size,count){
	if(!page)page = 1;
	if(!size)size = lh.grid.frontSize || 20;
	if(!count)count = 1;
	var title = $("#title").val();
	if(!title) title = null;
	$.post('/doctor/getAnnouncementList',{page:page,rows:size,title:title},function(rsp){
		if(rsp.success){
			var totalNumber = rsp.total || 0;
		    $('#dataList').html(buildDom(rsp.rows));
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

function buildDom(data){
	if(!data) return '';
	var obj = {
			rows:data,
			createDate:function(){
				return lh.formatDate({date:this.createdAt, flag:'datetime'});
			}
		} 
		var template = $('#template').html();
		Mustache.parse(template);
		var rendered = Mustache.render(template, obj);
	return rendered;
}

function showContent(id){
	var content = $("#showContent_"+id);
	lh.alert(content[0].innerHTML);
}

var resetQuery = function(){
	$("#title").val(null);
}


BESPEAKTYPEID = 1;
function sendMessage(){
	var doctorId = $("#doctorId").val();
	var hospitalId = $("#hospitalId").val();
	var content = $("#content").val();
	if(!content){lh.alert("请填写留言内容");return;}
	var obj = {receiverId:doctorId,content:content,hospitalId:hospitalId};
	if(lh.preventRepeat()){//防止重复提交
		saveData(obj);
	}else{
		//lh.showRepeatTip();//提示重复提交
		lh.alert('请不要重复提交数据');
	}
}

function saveData(obj){
	lh.post("front", "/addMessageToDoctor", obj, function(rsp){
		if(rsp.status == 'success'){
			lh.alert('留言发送成功');
			$("#content").val('');
		}else{
			lh.alert(rsp.msg);
		}
	}, "json");
}

function selectBespeak(id,hospitalId){
	DOCTORID = id;
	HOSPITALID = hospitalId;
	var dom = '<div class="modal fade" id="R_DIALOG_ID" aria-labelledby="R_T2_ID" data-backdrop="static" role="dialog">'+
		'<div class="modal-dialog" role="document">'+
			'<div class="modal-content">'+
				'<div class="modal-header">'+
					'<button type="button" class="close" data-dismiss="modal" aria-label="Close">'+
						'<span aria-hidden="true">&times;</span>'+
					'</button>'+
					'<h4 class="modal-title">请选择预约类型</h4>'+
				'</div>'+
				'<div class="modal-body">'+
					'<select id="bespeakTypeId" onchange="getBespeakTypeId()"><option value="1">远程诊疗</option><option value="2">上门服务</option><option value="3">血液检测</option></select>'+
				'</div>'+
				'<div class="modal-footer inline-center">'+
					'<button type="button" class="btn btn-success" onclick="getBespeak()" data-dismiss="modal">R_YES</button>'+
				'</div>'+
			'</div>'+
		'</div>'+
	'</div>';
	var dialogId = lh.createSerial();
	var yesId = lh.createSerial();
	dom = dom.replace('R_DIALOG_ID', dialogId)
			.replace('R_Y_ID', yesId)
			.replace('R_YES', '确定');;
	$('body').append(dom);
	$('#'+dialogId).modal('show');
}

function getBespeakTypeId(){
	var bespeakTypeId = $("#bespeakTypeId").val();
	BESPEAKTYPEID = bespeakTypeId;
}

function getBespeak(){
	if(BESPEAKTYPEID == 1){
		lh.jumpToUrl('/userBespeak/'+BESPEAKTYPEID+'/'+DOCTORID+'/'+HOSPITALID);
	}else if(BESPEAKTYPEID == 2){
		lh.jumpToUrl('/userBespeak/'+BESPEAKTYPEID+'/'+DOCTORID+'/'+HOSPITALID);
	}else if(BESPEAKTYPEID == 3){
		lh.jumpToUrl('/bloodTest/'+HOSPITALID+'?isBloodTest=1&doctorId='+DOCTORID);
	}
}