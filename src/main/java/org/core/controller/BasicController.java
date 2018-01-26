package org.core.controller;

import java.util.Date;

public class BasicController {
	public static void main(String[] args) {
		long expireTime = 30 * 60;
		long currentTimeMills = System.currentTimeMillis();
		long expireEndTime = currentTimeMills + expireTime * 1000;
		Date expiration = new Date(expireEndTime);
		System.out.println(currentTimeMills);
		System.out.println(expireEndTime);
		System.out.println(expiration);
	}
}
