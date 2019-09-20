package exercise;

public class Computer {
	
	public void open() {
		System.out.println("开机");
		Screen screen = new Screen();
		screen.work();
	}
	
	
	public void close() {
		System.out.println("关机");
	}
	
	public void userUsb(IUsb iUsb) {
		iUsb.open();
		iUsb.work();
		iUsb.close();
	}

}
