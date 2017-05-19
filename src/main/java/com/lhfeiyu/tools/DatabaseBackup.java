package com.lhfeiyu.tools;

import java.io.File;
import java.util.Date;

import com.lhfeiyu.config.Const;

/**
 * <strong> 描&nbsp;&nbsp;&nbsp;&nbsp;述：</strong> 数据库定时备份
 * <p>
 * <strong> 作&nbsp;&nbsp;&nbsp;&nbsp;者：</strong> 虞荣华
 * <p>
 * <strong> 编写时间：</strong> 2015年10月30日18:02:29
 * <p>
 * <strong> 公&nbsp;&nbsp;&nbsp;&nbsp;司：</strong> 成都蓝海飞鱼科技有限公司
 * <p>
 * <strong> 版&nbsp;&nbsp;&nbsp;&nbsp;本：</strong> 1.0
 * <p>
 */
public class DatabaseBackup {

	public static void run() {
		// FileSystemView fsv = FileSystemView.getFileSystemView();//
		// 列出所有windows 磁盘
		//File[] fs = File.listRoots();
		File file = null;
		// 显示磁盘卷标
		// System.out.println(fsv.getSystemDisplayName(fs[i]));
		String str = "";
		//str = "mysqldump -uroot -proot crm_test>d:\\CRMTWO数据库备份/crm(%date:~0,4%年%date:~5,2%月%date:~8,2%日%time:~0,2%时%time:~3,2%分%time:~6,2%秒).sql";
		/*if (fs.length > 1) {
			file = new File("C:\\database_backup");
			str = "mysqldump -uroot -proot crm_test>d:\\CRMTWO数据库备份/crm(%date:~0,4%年%date:~5,2%月%date:~8,2%日%time:~0,2%时%time:~3,2%分%time:~6,2%秒).sql";
		} else {
			file = new File("C:\\database_backup");
			str = "mysqldump -uroot -proot zero>c:\\CRMTWO数据库备份/crm(%date:~0,4%年%date:~5,2%月%date:~8,2%日%time:~0,2%时%time:~3,2%分%time:~6,2%秒).sql";
		}*/
		file = new File("C:\\database_backup");
		String dateStr = DateFormat.getDateToFormatString(new Date(), "yyyy年MM月dd日HH时mm分ss秒");
		str = "mysqldump -uroot -p"+Const.db_password+" medical>c:\\database_backup/medical("+dateStr+").sql";
		try {
			// 判断文件夹是否存在,如果不存在则创建文件夹
			if (!file.exists()) {
				file.mkdir();
			}
			Runtime rt = Runtime.getRuntime();
			rt.exec("cmd /c" + str);

			File files[] = file.listFiles();
			if (files.length > 7) {//保存最近7份
				for (int j = 0; j < files.length; j++) {
					long createTime = (new Date(files[j].lastModified()).getTime() + 1000 * 60 * 60 * 24 * 7);
					long nowTimes = (new Date().getTime());
					if (createTime < nowTimes) {
						File dflie = new File("C:\\database_backup" + "\\" + files[j].getName());
						dflie.delete();
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

