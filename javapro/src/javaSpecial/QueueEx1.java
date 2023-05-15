package javaSpecial;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx1 {

	public static void main(String[] args) {
		Queue<Message> mq = new LinkedList<Message>();
		mq.offer(new Message("ÀÌ¸ŞÀÏ","È«±æµ¿"));
		mq.offer(new Message("SMS","±èÃ¶¼ö"));
		mq.offer(new Message("Ä«Ä«¿ÀÅå","¼ÕÈï¹Î"));
		while(!mq.isEmpty()) {
			Message message = mq.poll();
			System.out.println(message.getEmail() + "À»(¸¦) "+message.getPerson() + "¿¡°Ô º¸³À´Ï´Ù.");
			
		}

	}

}
