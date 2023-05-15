package javaClass;

public class ButtonEx1 {

	public static void main(String[] args) {
		Button bt = new Button();
		bt.setOnClickListener(new CallListener());
		bt.touch();
		bt.setOnClickListener(new MessageListener());
		bt.touch();

	}

}
