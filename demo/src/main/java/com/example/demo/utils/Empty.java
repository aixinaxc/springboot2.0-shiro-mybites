package com.example.demo.utils;

public class Empty {
	/**
	 * 判断是否为空是返回true，不是返回false
	 * 
	 * @param val 值
	 * @return 为空返回true
	 */
	public static boolean isEmpty(String val) {
		return null == val || "".equals(val.trim()) || "nil".equals(val.trim()) || "[]".equals(val.trim());
	}

}
