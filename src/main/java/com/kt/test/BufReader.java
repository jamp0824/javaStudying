package com.kt.test;
import java.io.*;
public class BufReader {

	public static void main(String[] args) {
		try{
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\junee\\Documents\\Test\\output.txt"));
		String s;
		while((s = br.readLine())!=null){
			System.out.println(s);
		}
		br.close();
		}catch(Exception ex){
		return;
	}
	}
}
