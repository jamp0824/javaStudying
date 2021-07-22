package com.kt.test;

import java.util.Properties;

import javax.naming.Context;

public class MessageQueueSender {
	public static void main(String[] args) {
		if(args.length!=1) {
			System.out.println("사용법: MessageQueueSender 전송할 메시지");
			System.exit(0);
		}
		try {
			Properties h = new Properties();
			h.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
			h.put(Context.PROVIDER_URL, "t3://localhost7001");
			
			//1.Connection
			  //QueueConnectionFactory factory = (QueueConnectionFactory)ctx.lookup("weblogic.jms.ConnectionFactory");
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
