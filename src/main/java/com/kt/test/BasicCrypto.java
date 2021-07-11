package com.kt.test;

public class BasicCrypto implements Crypto {

	//f(x) = y
	public byte[] encrypt(byte[] data) {
		byte[] enc = new byte[data.length];
		
		for(int i =0; i<data.length; i++){
			enc[i] = (byte)((i%2 ==0)? data[i]: data[i] -1);
		}
		
		return enc;
	}
	//g(y) = x
	public byte[] decrypt(byte[] data) {

		byte[] enc = new byte[data.length];
		
		for(int i =0; i<data.length; i++){
			enc[i] = (byte)((i%2 ==0)? data[i]: data[i] +1);
		}
		
		return enc;
	}

}
