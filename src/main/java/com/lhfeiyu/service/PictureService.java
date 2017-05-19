package com.lhfeiyu.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhfeiyu.config.AssetsPath;
import com.lhfeiyu.dao.PictureMapper;
import com.lhfeiyu.po.Picture;
import com.lhfeiyu.tools.CommonGenerator;

/**
 * <strong> 描&nbsp;&nbsp;&nbsp;&nbsp;述：</strong> 业务层：通用-图片-Picture
 * <p>
 * <strong> 作&nbsp;&nbsp;&nbsp;&nbsp;者：</strong> 虞荣华
 * <p>
 * <strong> 编写时间：</strong> 2016年3月1日20:32:42
 * <p>
 * <strong> 公&nbsp;&nbsp;&nbsp;&nbsp;司：</strong> 成都蓝海飞鱼科技有限公司
 * <p>
 * <strong> 版&nbsp;&nbsp;&nbsp;&nbsp;本：</strong> 2.0
 * <p>
 */
@Service
public class PictureService extends CommonService<Picture> {
	@Autowired
	PictureMapper mapper;

	/** 将上传的图片添加到数据库，并返回ID */
	public Integer insertJustUploadPicture(String filePath) {
		Date date = new Date();
		Picture pic = new Picture();
		int idx1 = filePath.indexOf("__");
		int idx2 = filePath.lastIndexOf(".");
		String title = "";
		if (idx1 > 1 && idx2 > 1)
			title = filePath.substring(idx1 + 2, idx2);
		String serial = CommonGenerator.getSerialByDate("p");
		pic.setPicPath(filePath);
		pic.setSerial(serial);
		pic.setHits(1);
		pic.setScans(1);
		pic.setTitle(title);
		pic.setMainStatus(1);
		pic.setCreatedAt(date);
		mapper.insert(pic);
		return pic.getId();
	}

	public Integer insertPicAndTransfer(String filePath, String basePath, String targetFolder){
		// String basePath =
		// request.getSession().getServletContext().getRealPath("/");
		String savePath = basePath + targetFolder; // 文件保存目录路径 file/dust/
		File dirSaveFile = new File(savePath);// 创建文件夹
		if (!dirSaveFile.exists()) {
			dirSaveFile.mkdirs();
		}
		//File picFile = new File(basePath + "file/dust/" + filePath);// 图片地址
		String picPath = basePath + filePath.substring(1);
		String savePic = savePath + filePath.replace( "/"+ AssetsPath.defaultFileFolder, "");
		try {
			FileInputStream input = new FileInputStream(picPath);// 可替换为任何路径何和文件名
			FileOutputStream output = new FileOutputStream(savePic);// 可替换为任何路径何和文件名
			int in = input.read();
			while (in != -1) {
				output.write(in);
				in = input.read();
			}
			input.close();
			output.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return insertJustUploadPicture(filePath);
    }

}
