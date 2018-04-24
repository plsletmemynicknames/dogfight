package jpu2016.gameframe;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;
import javax.swing.JFrame;

public class GameFrame extends JFrame implements KeyListener{
	
	private IEventPerformer eventPerformer;
	
	public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder graphicsBuilder, Observable observable) {
		this.eventPerformer=performer;
	}
	
	public void keyPressed(KeyEvent keyEvent) {}
	
	public void keyReleased(KeyEvent keyEvent) {}
	
	public void keyTyped(KeyEvent keyEvent) {}

}
