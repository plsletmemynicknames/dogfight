package jpu2016.dogfight.model;

import java.awt.Image;
import java.awt.Point;

public class Mobile implements IMobile {

//-------------------------------Attributs----------------------------
	private int speed;
	private Direction direction;
	private Position position;
	private Dimension dimension;
	
//-------------------------------Constructor----------------------------	
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
		this.speed = speed;
		this.direction = direction;
		this.position = position;}
	
//-------------------------------Méthodes----------------------------	
	@Override
	public Direction getDirection() {
		return this.direction;}

	@Override
	public void setDirection(Direction direction) {
		this.direction = direction;}

	@Override
	public Position getPosition() {
		return this.position;}

	@Override
	public Dimension getDimension() {
		return this.dimension;}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void placeInArea(IArea area) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isPlayer(int player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setDogfightModel(DogfightModel dogfightModel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hit() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWeapon() {
		// TODO Auto-generated method stub
		return false;
	}

	
}
