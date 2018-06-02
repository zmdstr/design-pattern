package com.freemeng.facade;

/**
 * @ClassName:EncryptFacade
 * @Description:TODO
 * @author: zhangzhenyang
 * @time:2017年6月15日 下午2:12:34
 */
public class EncryptFacade {
	private FileReader fr;
	private FileWriter fw;
	private CipherMachine cm;
	public EncryptFacade(){
		fr = new FileReader();
		fw = new FileWriter();
		cm = new CipherMachine();
	}
	public void encry(String source, String des) {
		String read = fr.read(source);
		String encrypt = cm.encrypt(read);
		fw.write(encrypt, des);
	}
}
