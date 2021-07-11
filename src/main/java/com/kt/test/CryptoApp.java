package com.kt.test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class CryptoApp {
	public static void main(String[] args) throws Exception {
		Crypto crypto = new BasicCrypto();
		
		String data = "Hello world";
		String enc = new String(crypto.encrypt(data.getBytes()));
		String dec = new String(crypto.decrypt(enc.getBytes()));
		
		System.out.println("Original : "+data);
		System.out.println("Encrypted : "+enc);
		System.out.println("Decrypted: "+dec);
		
		//C:\Users\junee\workspace\TestProject
		byte[] data1 = Files.readAllBytes(Paths.get(System.getProperty("user.dir")+"\\src\\main\\java\\com\\kt\\test\\data1.txt"));
		byte[] data2 = crypto.encrypt(data1);
		byte[] data3 = crypto.decrypt(data2);
		
		System.out.println("data1"+System.getProperty("user.dir"));
		Files.write(Paths.get(System.getProperty("user.dir")+"\\src\\main\\java\\com\\kt\\test\\data2.txt"),data2);
		Files.write(Paths.get(System.getProperty("user.dir")+"\\src\\main\\java\\com\\kt\\test\\data3.txt"),data3);
		
	}
}
