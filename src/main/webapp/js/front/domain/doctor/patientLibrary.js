$(function(){
	highLightLeftMenu('lm_patient');
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
	var username = $("#username").val();
	var province = $("#province").val();
	if(!province) province = null;
	if(!username) username = null;
	var searchType = $("#searchType").val();
	var ascOrdesc = $("#ascOrdesc").val();
	if(!searchType){searchType = null;}
	if(!ascOrdesc){ascOrdesc = null;}
	if(username){
		username = username.trim();
	}
	$.post('/getPatientList',{page:page,rows:size,province:province,username:username,ascOrdesc:ascOrdesc,searchType:searchType},function(rsp){
		if(rsp.success){
			var totalNumber = rsp.total || 0;
		   $('#dataListContainer').html(buildDom(rsp.rows));
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

function fnViewDangAn(basicInfoId, name){
	var index = layer.open({
		  type: 2,
		  shade: false,
		  scrollbar: false,
		  title: '查看<font color=red>【{0}】</font>的档案信息'.format(name), //不显示标题
		  area : [ '1000px', '680px' ],
		  content: '/views/front/domain/doctor/catalog.jsp?openType=detail&basicInfoId=' + basicInfoId,
		  cancel: function(){
		  }
	});
	layer.full(index);
}

function buildDom(data){
	if(!data) return '';
	var obj = {
			rows:data,
			createDate:function(){
				return lh.formatDate({date:this.createdAt});
			},
			getUsername:function(){
				return this.realName || this.username;
			},
			fmtPhrBasicInfoId:function(){
				if(this.phrBasicInfoId){
					return '<button type="button" class="btn btn-primary btn-xs" onclick="fnViewDangAn({0}, \'{1}\');">查看</button>'.format(this.phrBasicInfoId, (this.realName || this.username));
				}
				return "";
			}
		} 
		var template = $('#template').html();
		Mustache.parse(template);
		var rendered = Mustache.render(template, obj);
	return rendered;
}

function editPatient(id,opt){
	var url = "/patientAddOrUpdate?patientId="+id;
	if(opt)url += "&opt="+opt;
	lh.jumpToUrl(url);
}
/**重置查询条件*/
function restSearch(){
	$("#province").val('');
	$("#username").val('');
	$("#searchType").val(null);
	$("#ascOrdesc").val(null);
}

/** 删除病历模板 */
function deletePatient(id){
	if(!id)return;
	if(!lh.preventRepeat()){
		return lh.showRepeatTip();//提示重复提交
	}
	lh.post('front', '/updatePatientDelete', {patientId:id},function(rsp){
		if(rsp.success){
			loadGridData();
			lh.alert('您已经成功删除该用户');
		}else{
			lh.alert(rsp.msg);
		}
	});
}
