package com.kt.test;

public interface Crypto {
	byte[] encrypt(byte[] data);
	byte[] decrypt(byte[] data);
}
