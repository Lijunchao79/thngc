package day01;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

/**
 * @author zx
 * @date 下午4:32:26
 * @version 1.0
 * @description:模拟小球运动
 */
public class Myball extends JFrame implements KeyListener{
	int x = 50;
	int y = 50;
	int speed = 50;
	public Myball(){
		setVisible(true);
		setSize(500,500);
		setLocation(100,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.addKeyListener(this);
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.red);
		g.drawOval(x, y, 100, 100);
	}
	public static void main(String[] args) {
		Myball myball = new Myball();
	}
	@Override
	public void keyTyped(KeyEvent e) {
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP){
			y-=speed;
		}else if(e.getKeyCode() == KeyEvent.VK_DOWN){
			y+=speed;
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT){
			x-=speed;
		}else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			x+=speed;
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

}
