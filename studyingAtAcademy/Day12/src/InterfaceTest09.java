public class InterfaceTest09 {
	public static void main(String[] args) {
		SmartTv st=new SmartTv();
		
		st.turnOn();
		st.setVolume(8);
		st.search("네이버");
		st.turnOff();
	}

}
