package com.traveloka.creditUser.dao.common;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.naming.ConfigurationException;

/*
 * 读写配置文件
 */
public class PropertiesUtil {
	private Properties config = new Properties();// 记录配置项

	private String fn = null;// 记录配置文件名

	public PropertiesUtil(String fileName) throws ConfigurationException {
		try {
			InputStream fin = this.getClass().getClassLoader().getResourceAsStream(fileName);
			config.load(fin); // 载入文件
			fin.close();
		} catch (IOException ex) {
			throw new ConfigurationException("无法读取指定的配置文件1:" + fileName);
		}
		fn = fileName;
	}
	public PropertiesUtil(String fileName,boolean fullPath) throws ConfigurationException {
		if(fullPath==false){
			new PropertiesUtil(fileName);
		}
		else{
			try {
				InputStream fin = new  FileInputStream(fileName);
				config.load(fin); // 载入文件
				fin.close();
			} catch (IOException ex) {
				throw new ConfigurationException("无法读取指定的配置文件1:" + fileName);
			}
			fn = fileName;
		}
	}
	// 指定配置项名称，返回配置值
	public String getValue(String itemName) throws IOException,
			ConfigurationException {
		return config.getProperty(itemName);
	}

	// 设置配置项名称及其值
	public void setValue(String itemName, String value) {
		config.setProperty(itemName, value);
		return;
	}

	// 保存配置文件，指定文件名和抬头描述
	public void saveFile(String description) throws ConfigurationException {
		try {
			String file=Thread.currentThread().getContextClassLoader().getResource(fn).getFile();
			FileOutputStream fout = new FileOutputStream(file);
			config.store(fout, description);// 保存文件
			fout.close();
		} catch (IOException ex) {
			throw new ConfigurationException("无法保存指定的配置文件:" + fn);
		}
	}
}