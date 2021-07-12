package com.kt.test;

import java.security.MessageDigest;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.CharEncoding;
import org.apache.commons.codec.binary.Base64;


 
public class Crypto_2 {
 
        public static void main(String[] args) {
 
               String str1 = "암호화되지 않은 문자";
               System.out.println("plain : " + str1);
 
               String str2 = encryptAES128(str1);
               System.out.println("AES128 encrypted : " + str2);
 
               String str3 = decryptAES128(str2);
               System.out.println("AES128 decrypted : " + str3);
               
               String str4 = encryptAES256(str1);
               System.out.println("AES256 encrypted : " + str4);
               
               String str5 = decryptAES256(str4);
               System.out.println("AES256 decrypted : " + str5);
               
               String str6 = encryptSHA256(str1);
               System.out.println("SHA256 encrypted : " + str6);
 
        }
 
        // 키
        private final static String KEY = "01234567890123456789012345678901";
 
        // 128bit (16자리)
        private final static String KEY_128 = KEY.substring(0, 128 / 8);
        
        // 256bit (32자리)
        private final static String KEY_256 = KEY.substring(0, 256 / 8);
 
        // AES 128 암호화
        public static String encryptAES128(String string) {
 
               try {
                       byte[] keyData = KEY_128.getBytes(CharEncoding.UTF_8);
 
                       // 운용모드 CBC, 패딩은 PKCS5Padding
                       Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
 
                       // key 와 iv 같게..
                       // 블록 암호의 운용 모드(Block engine modes of operation)가 CBC/OFB/CFB를 사용할 경우에는
                       // Initialization Vector(IV), IvParameterSpec를 설정해줘야한다. 아니면 InvalidAlgorithmParameterException 발생
                       
                       cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(keyData, "AES"), new IvParameterSpec(keyData));
 
                       // AES 암호화
                       byte[] encrypted = cipher.doFinal(string.getBytes(CharEncoding.UTF_8));
 
                       // base64 인코딩
                       byte[] base64Encoded = Base64.encodeBase64(encrypted);
 
                       // 결과
                       String result = new String(base64Encoded, CharEncoding.UTF_8);
 
                       return result;
               }
               catch (Exception e) {
                       return null;
               }
        }
 
        // AES 128복호화
        public static String decryptAES128(String string) {
 
               try {
                       byte[] keyData = KEY_128.getBytes(CharEncoding.UTF_8);
 
                       // 운용모드 CBC, 패딩은 PKCS5Padding
                       Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
 
                       cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(keyData, "AES"), new IvParameterSpec(keyData));
 
                       // base64 디코딩
                       byte[] base64Decoded = Base64.decodeBase64(string.getBytes(CharEncoding.UTF_8));
 
                       // AES 복화화
                       byte[] decrypted = cipher.doFinal(base64Decoded);
 
                       // 결과
                       String result = new String(decrypted, CharEncoding.UTF_8);
 
                       return result;
               }
               catch (Exception e) {
                       return null;
               }
        }
        
        // AES 256 암호화
        public static String encryptAES256(String string) {
 
               try {
                       byte[] key256Data = KEY_256.getBytes(CharEncoding.UTF_8);
                       byte[] key128Data = KEY_128.getBytes(CharEncoding.UTF_8);
 
                       // 운용모드 CBC, 패딩은 PKCS5Padding
                       Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
 
                       // key 와 iv 같게..
                       // 블록 암호의 운용 모드(Block engine modes of operation)가 CBC/OFB/CFB를 사용할 경우에는
                       // Initialization Vector(IV), IvParameterSpec를 설정해줘야한다. 아니면 InvalidAlgorithmParameterException 발생
                       
                       // AES 256은 미국만 되는거라. JDK/JRE 패치를 해야된다.
                       // http://www.oracle.com/technetwork/java/javase/downloads/index.html 에서 
                       // Java Cryptography Extension (JCE) Unlimited Strength Jurisdiction Policy Files for JDK/JRE 8 이런 링크 찾아서 다운
                       // $JAVA_HOME\jre\lib\security 아래에 local_policy.jar, US_export_policy.jar 파일 overwrite!
                       
                       // iv값이 16자리가 아니면..
                       // java.security.InvalidAlgorithmParameterException: Wrong IV length: must be 16 bytes long 발생
                       
                       cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key256Data, "AES"), new IvParameterSpec(key128Data));
 
                       // AES 암호화
                       byte[] encrypted = cipher.doFinal(string.getBytes(CharEncoding.UTF_8));
 
                       // base64 인코딩
                       byte[] base64Encoded = Base64.encodeBase64(encrypted);
 
                       // 결과
                       String result = new String(base64Encoded, CharEncoding.UTF_8);
 
                       return result;
               }
               catch (Exception e) {
                       return null;
               }
        }
        // AES 256복호화
        public static String decryptAES256(String string) {
 
               try {
                       byte[] key256Data = KEY_256.getBytes(CharEncoding.UTF_8);
                       byte[] key128Data = KEY_128.getBytes(CharEncoding.UTF_8);
                       
                       // 운용모드 CBC, 패딩은 PKCS5Padding
                       Cipher cipher = Cipher.getInstance("AES/CBC/PKCS6Padding");
                       
                       cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(key256Data, "AES"), new IvParameterSpec(key128Data));
                       
                       //base64 디코딩
                       byte[] base64Decoded = Base64.decodeBase64(string.getBytes(CharEncoding.UTF_8));
                       
                       // AES 복화화
                       byte[] decrypted = cipher.doFinal(base64Decoded);
                       
                       //결과
                       String result = new String(decrypted, CharEncoding.UTF_8);
                       
                       return result;
               }catch(Exception e){
            	   
            	   return null;
            }
        }

        public static String encryptSHA256(String string){
        	
        	try{
        		MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        		
        		byte[] stringBytes = string.getBytes();
        		int stringBytesLength = stringBytes.length;
        		
        		byte[] dataBytes = new byte[1024];
        		for(int i = 0; i< stringBytesLength; i++){
        			dataBytes[i] = stringBytes[i];
        		}
        		messageDigest.update(dataBytes,0,stringBytesLength);
        		
        		byte[] encrypted = messageDigest.digest();
        		
        		//hex,16진수
        		// StringBuffer sb= new StringBuffer();
        		// for (int i = 0; i < encrypted.length; i++){
        		// sb.append(Integer.toString((encrypted[i] &0xff) + 0x100, 16).substring(1));
        		// }
        		// 결과
        		// String result = sb.toString();
        		
        		// commons codec lib 사용하면 아래처럼 간단하게..
        		// String result = Hex.encodeHexString(encrypted);
        		
        		// base64 인코딩
        		byte[] base64Encoded = Base64.encodeBase64(encrypted);
        		//결과
        		String result = new String(base64Encoded, CharEncoding.UTF_8);
        		
        		return result;
        	}catch(Exception e){
        		
        		return null;
        	}
        }
   }       