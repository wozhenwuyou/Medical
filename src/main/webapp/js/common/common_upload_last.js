/**
 * 2015年11月20日11:23:33 虞荣华
 * Plupload上传组件，公共方法JS
 * http://www.cnblogs.com/2050/p/3913184.html
 * 描述：
 * 需要页面提供：var fileDom = $('#filePaths'); var fileDBIdsDom = $('#fileDBIds');
   上传成功后，将数据保存在：$('#filePaths')，$('#fileDBIds')，UPLOAD_OBJ_1
 */
 
UPLOAD_OBJ_1 = {//有关上传的所有变量或数据都保存在此根对象中
	pathStr:'', //图片路径字符串
	idsStr:'', //图片ID字符串
	fileCollection:{}, //上传文件的集合，以file.id作为key
	pathCollection:{}, //图片路径的集合，以file.id作为key
	idsCollection:{}, //图片ID的集合，以file.id作为key
	uploader:{}, //uploader对象
	hasInit:false,
	option:{
		params:{}, //提交参数对象
		autoSubmit:true, //是否自动提交的标识
		multiFlag:true,	//是否允许上传多张图片
		showEdBtns:false, //是否显示完成按钮
		showDelBtn:false,//是否显示删除按钮
		showItemDiv:true, //上传完成是否显示上传文件DIV
		multiReplace:false,//只能上传一个附件时，是否自动替换上一个附件
		file_upload_submit:null,
		chooseBtnDomId:'browse',
		successFun:null,
		file_upload_submit:null,
		file_upload_added:null,
		file_upload_progress:null,
		file_upload_error:null,
		file_upload_uploaded:null
	}
};

function initOption(option, random, namespace){
	if(!option){
		UPLOAD_OBJ_1.option.params.random = random;return;
	}
	var opt = UPLOAD_OBJ_1.option;
	opt.params = option.params || {};
	opt.params.random = random;
	if(option.submitBtnDomId)opt.autoSubmit = false;
	if(!option.multiFlag)opt.multiFlag = false;
	if(option.showEdBtns)opt.showEdBtns = true;
	if(!option.showItemDiv)opt.showItemDiv = false;
	if(option.showDelBtn)opt.showDelBtn = true;
	if(option.successFun)opt.successFun = option.successFun;
	if(option.multiReplace)opt.multiReplace = true;
	if(option.chooseBtnDomId)opt.chooseBtnDomId = chooseBtnDomId;
	opt.file_upload_submit = option.uploadSubmitFun || null;
	opt.file_upload_added = option.filesAddedFun || null;
	opt.file_upload_progress = option.uploadProgressFun || null;
	opt.file_upload_error = option.errorFun || null;
	opt.file_upload_uploaded = option.fileUploadedFun || null;
	UPLOAD_OBJ_1.option = opt;
}

/**
 * 初始化上传组件的简化方法
 */
function initUploadSimple(option, namespace) {
	initUpload('/upload', option, namespace);//调用完整方法
}

/**
 * 初始化上传组件的完整方法
 * @param {提交地址} url
 * @param {配置对象} option
 */
function initUpload(url, option) {
	if(UPLOAD_OBJ_1.uploader.id){
		UPLOAD_OBJ_1.uploader.destroy();//为了避免重复绑定事件
	}
	if(!url)url = '/upload';
	if(!option)option = null;
	//var random = "";for(var i=0;i<2;i++){random += Math.floor(Math.random()*10);}//2位随机数
	var date = (new Date()).valueOf();
	var random = Math.floor(Math.random()*100);//1-100的随机数
	random = date + random;//日期+随机数,添加一个随机数，传到后端防止文件名重复
	initOption(option, random);//初始化配置参数
	var uploader = new plupload.Uploader({
				browse_button : UPLOAD_OBJ_1.option.chooseBtnDomId,
				url : url,
				//file_data_name : fileName,
				//unique_names:true,
				file_data_name : 'multipartFile',
				multi_selection : UPLOAD_OBJ_1.option.multiFlag,
				runtimes : 'html5,flash,silverlight,html4',
				flash_swf_url : '/third-party/plupload/Moxie.swf',
				silverlight_xap_url : '/third-party/plupload/Moxie.xap',
				chunk_size : "512kb",
				max_retries : 2,
				filters : {
					mime_types:[{title:'fileType', extensions:'jpg,jpeg,gif,png,bmp'}],
					max_file_size:'2048kb',
					prevent_duplicates : false
				},
				
				multipart_params:UPLOAD_OBJ_1.option.params//额外参数
				
			});
	uploader.init();
	upload_events(uploader, namespace);//绑定事件
	UPLOAD_OBJ_1.hasInit = true;
}


/**
 * 绑定上传组件的事件：文件添加，上传进度，错误，成功上传
 * @param {基本上传对象} uploader
 */
function upload_events(uploader, namespace){
	var opt = UPLOAD_OBJ_1.option;
	uploader.bind('FilesAdded', UPLOAD_OBJ_1.file_upload_added);
	uploader.bind('UploadProgress', UPLOAD_OBJ_1.file_upload_progress);
	uploader.bind('Error', UPLOAD_OBJ_1.file_upload_error);
	uploader.bind('FileUploaded', UPLOAD_OBJ_1.file_upload_uploaded);
	var submitDomId = opt.submitBtnDomId;
	var submitFun = opt.file_upload_submit;
	if(submitDomId){
		document.getElementById(submitDomId).onclick = function() {
			if(submitFun){
				submitFun(uploader);//执行指定的提交函数
			}else{
				uploader.start();//直接开始上传
			}
		};
	}
	UPLOAD_OBJ_1.uploader = uploader;
}

/** 附件上传： 提交函数(若直接提交，就不需申明此方法) */
/**function file_upload_submit(){} */

/** 附件上传：事件 - 添加附件 */
UPLOAD_OBJ_1.file_upload_added = function (uploader, files){
	var html = '';
	if(!UPLOAD_OBJ_1.option.multiFlag){
		if(uploader.files.length > 1){
			if(UPLOAD_OBJ_1.option.multiReplace){
				uploader.removeFile(uploader.files[0]);
				$('#upload_outer_div').empty();
				$('#file_upload_progress').empty();
				$('#filePaths').val('');
				$('#fileDBIds').val('');
				UPLOAD_OBJ_1.pathStr = '';
				UPLOAD_OBJ_1.idsStr = '';
			}else{
				uploader.removeFile(uploader.files[uploader.files.length-1]);
				alert('一次只能上传一个附件，如果需要重新上传，请选删除附件。');
				return;
			}
		}
	}
	plupload.each(files, function(file) {
		var size = '';
		if(file && file.size){
			size = plupload.formatSize(file.size);
		}
		var name = file.name;
		if(!name)name = '';
		var length = name.length;
		if(length>20){
			name = '...'+name.substring(length-20, length);
		}
		var id = file.id;
		html += 
		'<div class="upld_container" id="upld_container_'+id+'">'+
			'<div class="uploading" id="upld_ing_'+id+'">'+
				'<div class="upld_ing_label">'+
					'<span class="upld_ing_name" id="upld_ing_name_'+id+'">'+name+'：</span><span class="upld_ing_tip">正在上传...</span>'+
					'<button type="button" class="btn btn-info btn-xs fr" onclick="cancelFile(\''+id+'\')">取消上传</button>'+
				'</div>'+
				'<div class="progress clear-both mgBtm5">'+
					'<div id="upld_ing_bar_'+id+'" class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 0%;">0%</div>'+
				'</div>'+
			'</div>'+
			'<div class="upld_ed frontHide" id="upld_ed_'+id+'">'+
				'<div class="upld_ed_label">';
				if(UPLOAD_OBJ_1.option.showEdBtns){
					html += 
					'<button type="button" class="btn btn-danger btn-xs upld_ed_delete" onclick="cancelFile(\''+id+'\')">删除</button>'+
					'<span class="upld_ed_name" id="upld_ed_name_'+id+'">'+name+'：</span><span class="upld_ed_tip">上传成功</span>';
					/*'<a class="preview btn btn-success btn-xs upld_ed_btn" target="_blank" href="'+file.filePath+'">预览</a>'+
					'<a download="'+file.filePath+'" class="download btn btn-success btn-xs upld_ed_btn0" href="'+file.filePath+'">下载</a>';*/
					/*'<button type="button" class="btn btn-success btn-xs upld_ed_btn0" onclick="downFile(\''+id+'\')">下载</button>'+
					'<button type="button" class="btn btn-success btn-xs upld_ed_btn" onclick="showFile(\''+id+'\')">预览</button>';*/
				}else if(UPLOAD_OBJ_1.option.showDelBtn){
					html += 
					'<button type="button" class="btn btn-danger btn-xs upld_ed_delete" onclick="cancelFile(\''+id+'\')">删除</button>'+
					'<span class="upld_ed_name" id="upld_ed_name_'+id+'">'+name+'：</span><span class="upld_ed_tip">上传成功</span>';
				}else{
					html += 
					'<span class="upld_ed_name" id="upld_ed_name_'+id+'">'+name+'：</span><span class="upld_ed_tip">上传成功</span>';
				}
				html += 
				'</div>'+
			'</div>'+
		'</div>'
		var fileId = file.id;
		UPLOAD_OBJ_1.fileCollection[fileId] = file;
	});
	if(UPLOAD_OBJ_1.option.showItemDiv){
		$('#upload_outer_div').append(html);
	}
	if(UPLOAD_OBJ_1.option.autoSubmit){//如果为自动提交，即选择了文件后立即执行上传操作
		uploader.start();
	}
	UPLOAD_OBJ_1.uploader = uploader;
}

/** 附件上传：事件 - 上传进度变化 */
UPLOAD_OBJ_1.file_upload_progress = function (uploader,file){
	var id = file.id;
	var percent = file.percent+"%";
	$('#upld_ing_bar_'+id).css('width', percent).text(percent);
	if(file.percent == 100){
		$('#upld_ing_'+id).hide();
		$('#upld_ed_'+id).show();
	}
}

/** 附件上传：事件 - 完成上传（有可能成功、失败） */
UPLOAD_OBJ_1.file_upload_uploaded = function (uploader, file, response){
	UPLOAD_OBJ_1.uploader = uploader;
	var rsp = JSON.parse(response.response);
	var status = rsp.status;
	if (status && status == 'success') {
		var filePath = rsp.filePath;
		var fileDBId = rsp.fileDBId;
		file_upload_success(filePath, fileDBId, file);
	}else{
		file_upload_failure(rsp.msg);
	}
}

/** 附件上传：事件 - 上传成功 */
UPLOAD_OBJ_1.file_upload_success = function (filePath, fileDBId, file){
	if(UPLOAD_OBJ_1.uploader.files.length <= 1){//第一个附件上传成功后，清除默认路径
		UPLOAD_OBJ_1.pathStr = '';
		UPLOAD_OBJ_1.idsStr = '';
	}
	var fileId = file.id;
	paths += ','+filePath;
	UPLOAD_OBJ_1.pathStr = paths;//保存文件路径到变量中
	
	fileDBIds += ','+fileDBId;
	UPLOAD_OBJ_1.idsStr = fileDBIds;//保存文件ID到变量中
	
	UPLOAD_OBJ_1.pathCollection[fileId] = filePath;
	UPLOAD_OBJ_1.idsCollection[fileId] = fileDBId;
	UPLOAD_OBJ_1.fileCollection[fileId] = file;
	
	if(UPLOAD_OBJ_1.option.successFun){
		UPLOAD_OBJ_1.option.successFun(fileId, filePath);
	}
	
}

/** 附件上传：事件 - 上传失败 */
UPLOAD_OBJ_1.file_upload_failure = function (msg){
	alert("上传出现错误："+msg);
}

/** 附件上传 - 取消上传 */
UPLOAD_OBJ_1.cancelFile = function (fileId){
	var uploader = UPLOAD_OBJ_1.uploader;
	uploader.removeFile(uploader.getFile(fileId));
	$('#upld_container_'+fileId).remove();
	//清除对应附件的路径
	var filePath = UPLOAD_OBJ_1.pathCollection[fileId];
	if(filePath){
		delete UPLOAD_OBJ_1.fileCollection[fileId];
		delete UPLOAD_OBJ_1.pathCollection[fileId];
		delete UPLOAD_OBJ_1.idsCollection[fileId];
		var paths = fileDom.val();
		paths = paths.replace(','+filePath,'');
		UPLOAD_OBJ_1.pathStr = paths;
		
		var idsObj = UPLOAD_OBJ_1.idsCollection;
		var ids = '';
		for(var key in idsObj){
			ids = ','+idsObj[key];
		}
		ids = ids.substring(1);
		
	}
	
}

/** 附件上传：事件 - 上传失败 */
UPLOAD_OBJ_1.file_upload_error = function (uploader,error){
	if(error.code == '-600'){//文件大小超出上限
		alert("文件大小不能超过："+uploader.settings.filters.max_file_size);
	}else if(error.code == '-601'){//文件类型错误
		alert("文件格式不支持，支持的格式："+uploader.settings.filters.mime_types[0].extensions);
	}else{
		alert("上传出现错误："+error.code + ": " + error.message);
	}
}

/** 附件上传：事件 - 重置上传组件 */
UPLOAD_OBJ_1.resetUpload = function (){
	$('#file_upload_progress').empty();
	
	UPLOAD_OBJ_1.uploader.files = {};
	UPLOAD_OBJ_1.pathStr = '';
	UPLOAD_OBJ_1.idsStr = '';
	UPLOAD_OBJ_1.fileCollection = {};
	UPLOAD_OBJ_1.pathCollection = {};
	UPLOAD_OBJ_1.idsCollection = {};
	
}

//initUploadSimple();

