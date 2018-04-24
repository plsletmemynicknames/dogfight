package jpu2016.dogfight.view;

import java.util.Observable;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.model.IDogfightModel;

public class DogfightView implements IViewSystem {
	
	public DogfightView(IOrderPerformer overPerformer, IDogfightModel dogfightModel, Observable observable) {}
	
	private void run() {}
	
	public void displayMessage(String message) {}
	
	public void closeAll() {}

}
