package com.freemeng.facade;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName:FileReader
 * @Description:TODO
 * @author: zhangzhenyang
 * @time:2017年6月15日 上午8:46:46
 */
public class FileReader {
	@SuppressWarnings("resource")
	public String read(String src) {
		InputStream is = null;
		StringBuilder sb = new StringBuilder();
		try {
			File file = new File(src);
			is = new BufferedInputStream((new FileInputStream(file)));
			for (int i = 0, temp = 0; (temp = is.read()) != -1; i++) {
				sb = sb.append((char) temp);
			}
		} catch (FileNotFoundException e) {
			System.out.println("文件不存在！");
		} catch (IOException e) {
			System.out.println("IO异常！");
		}
		return sb.toString();

	}
}
