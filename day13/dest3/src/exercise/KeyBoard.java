package exercise;

public class KeyBoard extends HardWare implements IUsb {

	@Override
	public void open() {
		System.out.println("连接键盘");

	}

	@Override
	public void close() {
		System.out.println("断开键盘");
	}

	@Override
	public void work() {
		System.out.println("键盘按键");

	}

}
