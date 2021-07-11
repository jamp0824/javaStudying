package com.kt.test;

public class CryptoApp {
	public static void main(String[] args) {
		Crypto crypto = new BasicCrypto();
		
		String data = "Hello world";
		String enc = new String(crypto.encrypt(data.getBytes()));
		String dec = new String(crypto.decrypt(data.getBytes()));
		
		System.out.println("Original"+data);
		System.out.println("Encrypted"+enc);
		System.out.println("Decrypted"+dec);
	}
}
