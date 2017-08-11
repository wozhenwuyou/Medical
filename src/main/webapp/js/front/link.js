$(function () {
	loadLinkList();
});

function loadLinkList(){
	lh.post('front', '/getLinkList', function(rsp){
		if(rsp.success){
			var baseLinkList = rsp.baseLinkList;
			var linkFamousList = rsp.linkFamousList;
			var linkTypeAry = rsp.linkTypeAry;
			var dom = '';
			for(var i in baseLinkList){
				var link = baseLinkList[i];
				dom += '<li style="width:200px;"><a href="'+link.dictValue+'" target="_blank">'+link.dictName+'</a></li>';
			}
			var famousDom = '';
			/*for(var j in linkTypeAry){
				var linkType = linkTypeAry[j];
				var code = linkType.code;
				famousDom += '<span style="font-size: 16px;font-weight: bold;">'+linkType.codeName+'</span><ul class="clearfix" style="height:auto;">';// <li class="fb">'+linkType.codeName+'</li>
				for(var k in linkFamousList){
					var lf = linkFamousList[k];
					if(lf.code == code)
					famousDom += '<li style="width:200px;display:inline-block;"><a href="'+lf.dictValue+'" target="_blank">'+lf.dictName+'</a></li>';
				}
				famousDom += '</ul>';
			}*/
			for(var j in linkTypeAry){
				var linkType = linkTypeAry[j];
				var code = linkType.code;
				//famousDom += '<tr height="30" valign="bottom">';// <li class="fb">'+linkType.codeName+'</li>
				famousDom += '<tr valign="bottom" align="left">';
				for(var k in linkFamousList){
					var lf = linkFamousList[k];
					if(lf.code == code){
						var trFlag = false;
						if(k==0 || k==5 || k==10 || k==15 || k==20 || k==25 || k==30 || k==35 || k==40 || k==45 || k==50 || k==55 || k==60 || k==65 || k==70){
							trFlag = true;
							famousDom += '</tr><tr valign="bottom" align="left">';
						}
						famousDom += '<td width="100" height="38" style=""><a href="'+lf.dictValue+'" target="_blank">'+lf.dictName+'</a></td>';
					}
				}
				//famousDom += '</tr>';
			}
			$('#baseLinkUl').html(dom);
			//$('#linkFamousDiv').html(famousDom);
			$('#linkFamousTable').html(famousDom);
			//$('#linkFamousTable tr:first').hide();
			
			initLink();//绑定事件
		}
	});
}

//友情链接
function initLink(){
	var param = lh.paramJson;
	if(param && param.link){
		var content = param.link.content;
		//_.replace(content, '&lt;' "\\<");
		//_.replace(content, '&gt;' '>');
		var beginIndex = content.indexOf("&lt;div id=&#39;otherlink&#39;&gt;");
		var endIndex = content.indexOf('&lt;!--over--&gt;');
		content = content.substring(beginIndex, endIndex);
		$('#link').html(content);
	}
    var linkul = document.getElementById('link-ul');
    var linkli = linkul.getElementsByTagName('li');
    var partlink = document.getElementById('otherlink').getElementsByTagName('div');
    for(var i=0;i<linkli.length;i++){
        linkli[i].index = i;
        linkli[i].onmouseover = function() {
            show(this.index);
        }
    }
    function show(a) {
        index = a;
        for (var j = 0; j < linkli.length; j++) {
            linkli[j].className = "";
            partlink[j].style.display = "none";
        }
        linkli[index].className = "link1";
        partlink[index].style.display = "block";
    }
}
