package exercise;

/**
 * @author zx
 * @version 1.0
 * @description:面向对象
 * 封装，继承，接口，多态
 */
public class Test01 {

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.open();
		
		Mouse mouse = new Mouse();
		computer.userUsb(mouse);
		
		KeyBoard keyBoard = new KeyBoard();
		computer.userUsb(keyBoard);
		
		computer.close();
	}

}
