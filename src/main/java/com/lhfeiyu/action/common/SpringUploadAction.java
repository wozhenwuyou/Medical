package com.lhfeiyu.action.common;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;
import com.lhfeiyu.tools.Result;

@Controller
public class SpringUploadAction {
	
	/*@Autowired
	private PictureService pictureService;*/
	
	private static Logger logger = Logger.getLogger("R");
	
	@ResponseBody
	@RequestMapping(value = "/uploadFile", method=RequestMethod.POST)
	public JSONObject  uploadFile(HttpServletRequest request,//@RequestParam String name, 
			@RequestParam MultipartFile multipartFile){
		JSONObject json = new JSONObject();
		try{
			String basePath = request.getServletContext().getRealPath("/");
			 if (!multipartFile.isEmpty()) {
				 //+ name
				 String path = basePath+"d:/contract/"  + multipartFile.getOriginalFilename().substring( multipartFile.getOriginalFilename().lastIndexOf("."));
				 File newFile = new File(path);
				 multipartFile.transferTo(new File(path));
		         json.put("path", newFile.getAbsolutePath()); 
		        }
		}catch(Exception e){
			Result.catchError(e, logger, "LH_ERROR-Upload-AJAX-/uploadFile-上传附件出现异常", json);
		}
		return Result.success(json);
	}
	
	/*@RequestMapping(value = "/upload.do")
    public String updateThumb(@RequestParam("name") String name,
            @RequestParam("file") MultipartFile file)
            throws IllegalStateException, IOException {
        if (!file.isEmpty()) {
            file.transferTo(new File("d:/temp/"
                    + name
                    + file.getOriginalFilename().substring(
                            file.getOriginalFilename().lastIndexOf("."))));
            return "redirect:success.html";
        } else {
            return "redirect:fail.html";
        }
    }*/
	
}
