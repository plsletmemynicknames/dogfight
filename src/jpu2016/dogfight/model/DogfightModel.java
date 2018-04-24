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
		return this.sky;}

	@Override
	public void buildArea(Dimension dimension) {
		this.sky = new Sky(dimension);}

	@Override
	public void addMobile(IMobile Mobile) {
		this.mobiles.add(Mobile);}

	@Override
	public void removeMobile(IMobile Mobile) {
		this.mobiles.remove(Mobile);}

	@Override
	public ArrayList<IMobile> getMobiles() {
		return this.mobiles;}

	@Override
	public IMobile getMobileByPlayer(int player) {
		return null;}

	@Override
	public void setMobilesHavesMoved() {	}
	
}
