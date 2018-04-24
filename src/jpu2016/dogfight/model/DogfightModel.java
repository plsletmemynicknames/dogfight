package jpu2016.dogfight.model;

import java.util.ArrayList;
import java.util.Observable;

public class DogfightModel extends Observable implements IDogfightModel {
	
	private ArrayList<IMobile> mobiles;
	private Sky sky;

	public DogfightModel() {
		this.mobiles = new ArrayList<IMobile>();}
	
	@Override
	public IArea getArea() {
		return null;}

	@Override
	public void buildArea(Dimension dimension) {	}

	@Override
	public void addMobile(IMobile Mobile) {		}

	@Override
	public void removeMobile(IMobile Mobile) {		}

	@Override
	public ArrayList<IMobile> getMobiles() {
		return null;}

	@Override
	public IMobile getMobileByPlayer(int player) {
		return null;}

	@Override
	public void setMobilesHavesMoved() {	}
	
}
