package exercise;

public class Mouse extends HardWare implements IUsb{

	@Override
	public void work() {
		System.out.println("鼠标点击");
	}

	@Override
	public void open() {
		System.out.println("鼠标连接");
		
	}

	@Override
	public void close() {
		System.out.println("鼠标关闭");
	}

}
