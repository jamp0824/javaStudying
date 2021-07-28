package com.kt.test;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ChatWindow {
	private String name;
	private Frame frame;
	private Panel pannel;
	private Button buttonSend;
	private TextField textField;
	private TextArea textArea;
	
	private Socket socket;
	
	public ChatWindow(String name, Socket socket) {
		this.name =name;
		frame = new Frame(name);
		pannel = new Panel();
		buttonSend = new Button("Send");
		textField = new TextField();
		textArea = new TextArea(30,80);
		this.socket = socket;
		
		new ChatClientReceiveThreads(socket).start();
		
	}
	
	public void show() {
		//Button
		buttonSend.setBackground(Color.gray);
		buttonSend.setForeground(Color.WHITE);
		buttonSend.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				sendMessage();
			}
		});
		
		//Pannel
		pannel.setBackground(Color.LIGHT_GRAY);
		pannel.add(textField);
		pannel.add(buttonSend);
		frame.add(BorderLayout.SOUTH,pannel);
		
		//TextArea
		textArea.setEditable(false);
		frame.add(BorderLayout.CENTER,textArea);
		
		//Frame
		frame.addWindowListener(new WindowAdapter() {
		});
		frame.setVisible(true);
		frame.pack();
	}
	//쓰레드를 만들어서 대화를 보내기
	private void sendMessage() {
		PrintWriter pw;
		try {
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8),true);
			String message = textField.getText();
			String request = "message:"+message+"\r\n";
			pw.println(request);
			
			textField.setText("");
			textField.requestFocus();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	private class ChatClientReceiveThreads extends Thread{
		Socket socket = null;
		
		ChatClientReceiveThreads(Socket socket) {
			this.socket = socket;
		}
		public void run() {
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),StandardCharsets.UTF_8));
				while(true) {
					String msg = br.readLine();
					textArea.append(msg);
					textArea.append("\n");
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
