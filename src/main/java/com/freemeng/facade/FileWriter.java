package com.freemeng.facade;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @ClassName:FileWriter
 * @Description:TODO
 * @author: zhangzhenyang
 * @time:2017年6月15日 下午2:02:51
 */
public class FileWriter {
	public void write(String encryptstr, String fileNameDesc) {
		OutputStream os= null;
		File file = new File(fileNameDesc);
		try {
			os = new BufferedOutputStream(new FileOutputStream(file));
			os.write(encryptstr.getBytes());
			os.flush();
			os.close();
		} catch (FileNotFoundException e) {
			System.out.println("文件不存在！");
		} catch (IOException e) {
			System.out.println("IO 异常！");
		}
	}
}
