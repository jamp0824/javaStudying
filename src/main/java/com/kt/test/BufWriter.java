package com.kt.test;
import java.io.*;
public class BufWriter {
	public static void main(String[] args) {
		
	try{	
	BufferedWriter bw = new BufferedWriter(
			new FileWriter("C:\\Users\\junee\\Documents\\Test\\output.txt"));
			bw.write("karen\n");
			bw.write("chad\n");
			bw.write("becky\n");
			bw.close();
	}catch(Exception ex){
		return;
	}
	}
}
