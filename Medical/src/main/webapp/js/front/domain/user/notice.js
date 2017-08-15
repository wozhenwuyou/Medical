$(function(){	
	initData();
	loadGridData();
});


function initData(){
	$('#_strSpan').click(function(){
	   $('#hidden_div').slideToggle(0);
	   $(this).toggleClass('hover');
	   
	   var _txt=$(this).text();
	   if(_txt=='展开详情＞')
	   {
		   $(this).text('收起＞');
		   }
	   else{$(this).text('展开详情＞');}
	});
	
	
	$(window).resize(function () { goTop(); });
    $(window).scroll(function () { goTop(); });
}

function loadGridData(page,size,count){
	if(!page)page = 1;
	if(!size)size = lh.grid.frontSize || 20;
	if(!count)count = 1;
	var userId = $("#userId").val();
	if(!userId)userId = null;
	var name = $("#name").val();
	if(!name)	name = null;
	$.post('/getMessageList',{page:page,rows:size,senderId:userId,title:name,notReadFirst:1},function(rsp){///getNoticeList,receiverId:userId,
		if(rsp.success){
			var totalNumber = rsp.total || 0;
		    $('#noticeList').html(buildDom(rsp.rows));
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
			mainStatusName:function(){
				var status = this.logicStatus;
				var replyContent = this.replyContent;
				if(!replyContent){
					return logicStatusName = "未回复";
				}else if(status == 2){
					return logicStatusName = "已读";
				}
				return logicStatusName = '<span style="color:orange;">未读</span>';
			}
		} 
	var template = $('#template').html();
	Mustache.parse(template);
	var rendered = Mustache.render(template, obj);
	return rendered;
}

function readMessage(messageId){
	$.post('/readMessage',{messageId:messageId},function(rsp){
		if(rsp.success){
		   $('#statusName_'+messageId).text('已读');
		   var notReadMsgCount = $('#notReadMsgCount').text();
		   if(notReadMsgCount)notReadMsgCount = parseInt(notReadMsgCount);
		   notReadMsgCount--;
		   if(notReadMsgCount<=0){
		   		$('#notReadMsgCount').hide();
		   }
		   $('#notReadMsgCount').text(notReadMsgCount);
		}else{
			if(rsp.code == 'aleady_read')return;
			lh.alert(rsp.msg);return;
		}
	});
}
