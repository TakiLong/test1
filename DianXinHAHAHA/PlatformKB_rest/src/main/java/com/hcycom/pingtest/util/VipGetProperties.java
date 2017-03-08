/*
 * File name:          VipGetProperties.java
 * Copyright@Lanqiao (China)
 * Editor:           JDK1.6.32
 */
package com.hcycom.pingtest.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * TODO: File comments
 * <p>
 * <p>
 * Author:           卢广超
 * <p>
 * Date:           2016年12月11日
 * <p>
 * Time:           上午11:14:14
 * <p>
 * Director:        卢广超
 * <p>
 * <p>
 */
public class VipGetProperties {
	/**
	 * 专门为VIP网管的获取配置文件服务，获取说有产品类型
	 * @return
	 */
	public List<String> readProperties() {
		String productName = "";
		//而在java类中需要new一个Properties类的对象，如下：
		Properties properties = new Properties();
		//接下来需要获取test.properties的文件路径：
		String path = Thread.currentThread().getContextClassLoader().getResource("productSource.properties").getPath();
		//System.out.println("获取的properties的路径：" + path);
		//然后加载该文件：
		try {
			properties.load(new FileInputStream(path));
			productName = properties.getProperty("productName");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String temp[] = productName.split(",");
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < temp.length; i++) {
			list.add(temp[i]);
		}
		/*for (String name : list) {
			System.out.println(name);
		}
		*/
		return list;
	}

	/**
	 * 输入产品类型获取select后的字段
	 * @param productName
	 * @return
	 */
	public String readPropertiesField(String productName) {
		String fieldName = "";
		//而在java类中需要new一个Properties类的对象，如下：
		Properties properties = new Properties();
		//接下来需要获取test.properties的文件路径：
		String path = Thread.currentThread().getContextClassLoader().getResource("productSource.properties").getPath();
		//System.out.println("获取的properties的路径：" + path);
		//然后加载该文件：
		try {
			properties.load(new FileInputStream(path));
			fieldName = properties.getProperty(productName + ".field");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fieldName;
	}

	/**
	 * 输入产品类型获取对应表名
	 * @param productName
	 * @return
	 */
	public String readPropertiesTable(String productName) {
		String tableName = "";
		//而在java类中需要new一个Properties类的对象，如下：
		Properties properties = new Properties();
		//接下来需要获取test.properties的文件路径：
		String path = Thread.currentThread().getContextClassLoader().getResource("productSource.properties").getPath();
		//System.out.println("获取的properties的路径：" + path);
		//然后加载该文件：
		try {
			properties.load(new FileInputStream(path));
			tableName = properties.getProperty(productName + ".table");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tableName;
	}

}
