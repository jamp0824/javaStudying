package com.kt.test;
import java.io.*;
public class BufReaderWriter {

	public static void main(String[] args) {
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\junee\\Documents\\Test\\bf_copy.txt"));
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\junee\\Documents\\Test\\output.txt"));
			String s;
		while((s=br.readLine())!=null){
			bw.write(s+"\n");
		}
		br.close();
		bw.close();
		}catch(Exception e){
			e.printStackTrace();
			return;
		}
	}
}
