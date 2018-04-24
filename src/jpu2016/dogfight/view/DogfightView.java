package jpu2016.dogfight.view;

import java.util.Observable;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.gameframe.GameFrame;

public class DogfightView implements IViewSystem, Runnable {
	
	private EventPerformer eventPerformer;
	private GameFrame gameFrame;
	private GraphicsBuilder graphicsBuilder;
	
	public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable) {}
	
	public void displayMessage(String message) {}
	
	public void closeAll() {}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
