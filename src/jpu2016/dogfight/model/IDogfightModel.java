package jpu2016.dogfight.model;

import java.util.ArrayList;

public interface IDogfightModel {
	
	public IArea getArea();
	
	public void buildArea(Dimension dimension);
	
	public void  addMobile(Imobile Mobile);
	
	public void removeMobile(Imobile Mobile);
	
	public ArrayList<IMobile> getMobiles();
	
	public IMobile getMobileByPlayer(int player);
	
	public void setMobilesHavesMoved();
	
}
