package com.lhfeiyu.action.common;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.lhfeiyu.config.AssetsPath;
import com.lhfeiyu.service.PictureService;
import com.lhfeiyu.tools.Plupload;
import com.lhfeiyu.tools.PluploadUtil;
import com.lhfeiyu.tools.Result;

@Controller
public class UploadAction {
	
	@Autowired
	private PictureService pictureService;
	
	private static Logger logger = Logger.getLogger("R");
	
	@RequestMapping(value="/uploadPage")
	public ModelAndView upload_html() {
		return new ModelAndView("/upload/upload");
	}
	
	/*private static String[] folders = {"file/default/","file/common/","file/contract/","file/avatar/",
									   "file/shop/","file/inst/","file/forum/","file/article/","file/sys/",
									   "file/advert/","file/download/"};*/
	/**上传处理方法*/
    @ResponseBody
    @RequestMapping(value="/upload", method = RequestMethod.POST)
    public JSONObject upload(HttpServletRequest request, HttpServletResponse response,
    		Plupload plupload, @RequestParam String random,
    		@RequestParam(required=false)Integer doInsert ) {
    	//String operate="";
    	//System.out.println("operate="+operate+" "+plupload.getChunk() + "===" + plupload.getName() + "---" + plupload.getChunks());
    	//SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
    	//String ymd = sdf.format(new Date());
    	/*if( Check.isNull(folder) ){
        	folder = "default"; //默认文件夹
        }
        folder = "file/" + folder + "/";*/
    	
    	JSONObject json = new JSONObject();
    	String tempFileDir = AssetsPath.defaultTempFileFolder;//pictureService中引用了默认文件路径：file/dust/，这两个地方需要保持一致
    	String folder = AssetsPath.defaultFileFolder;//上传的附件全部保存在dust文件夹中，对应的业务功能跟据附件地址转存到对应文件夹，这可目录可定期清空
        String filename =null;
        plupload.setRequest(request);
        String basePath = request.getSession().getServletContext().getRealPath("/");
        String tempPath = basePath + tempFileDir;// 临时文件目录
        
        String savePath = basePath + folder; // 文件保存目录路径
        File dirSaveFile = new File(savePath);// 创建文件夹
        if (!dirSaveFile.exists()){
        	dirSaveFile.mkdirs();
        }
        File dirTempFile = new File(tempPath);// 创建临时文件夹
        if (!dirTempFile.exists()){
            dirTempFile.mkdirs();
        }
        try {
            filename= PluploadUtil.upload(plupload, dirSaveFile, dirTempFile, random);//上传文件
            if (PluploadUtil.isUploadFinish(plupload)) {//判断文件是否上传成功（被分成块的文件是否全部上传完成）
    	        String filePath = "/" + folder + filename;
    	        json.put("filePath", filePath);
    	        if(null != doInsert){
    	        	Integer fileDBId = insertPicture(filePath);//将上传的图片添加到数据库，并返回ID
    	        	json.put("fileDBId", fileDBId);
    	        }
            }else{
            	return Result.failure(json, "上传失败", "upload_failure");
            }
        } catch (Exception e) {
        	Result.catchError(e, logger, "LH_ERROR-UploadAction-AJAX-/upload-上传附件出现异常", json);
        }
        return Result.success(json);
    }
    
    /** 将上传的图片添加到数据库，并返回ID */
    private Integer insertPicture(String filePath){
    	return pictureService.insertJustUploadPicture(filePath);
    }
    
}

/**
 * try {
	    //上传文件
	    filename= PluploadUtil.upload(plupload, dirFile);
	    //判断文件是否上传成功（被分成块的文件是否全部上传完成）
	    if (PluploadUtil.isUploadFinish(plupload)) {
	        System.out.println(plupload.getName() + "----");
	        System.out.println(savePath+"&&"+filename + "=====");
	        //限制图片大小不能小于300*300
	        BufferedImage bi = ImageIO.read(new FileInputStream(new File(savePath+filename)));
	        System.out.println("width="+bi.getWidth());
	        System.out.println("height="+bi.getHeight());
	        if(bi.getWidth()<200||bi.getHeight()<200){
	            msg.put("fail", "True");
	            msg.put("error","图片尺寸不符合要求，大于300*300");
	        }else{
	            //将图片等比压缩为300*300大小的图片
	            IconCompressUtil.compressImg(new File(savePath+filename), 300, new File(savePath+filename));    
	            msg.put("success", "True");
	            msg.put("filename", filename);
	            msg.put("filepath", savePath+"temp"+filename);
	            System.out.println("头像保存位置="+savePath+"temp"+filename);
	            msg.put("width", bi.getWidth()+"");
	            msg.put("height", bi.getHeight()+"");
	        }
	    }else{
	        msg.put("fail", "True");
	    }
	    
	} catch (IllegalStateException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
 */
