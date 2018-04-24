package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;

public class Mobile implements IMobile {

//-------------------------------Attributs----------------------------
	private int speed;
	private Direction direction;
	private Position position;
	private Dimension dimension;
	private ArrayList<Image> image;
	private Color color;
	private IDogfightModel dogfightModel;
	
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
	public int getSpeed() {
		return this.speed;}

	@Override
	public int getWidth() {
		return this.dimension.getWidth();}

	@Override
	public int getHeight() {
		return this.dimension.getHeight();}
	
	@Override
	public void move() {	}
	
	@Override
	public void placeInArea(IArea area) {	}	
	
	@Override
	public boolean isPlayer(int player) {
		return false;}
	
	private void moveUp() {	}
	
	private void moveRight() {	}
	
	private void moveDown() {	}
	
	private void moveLeft() {	}
	
	public Color getColor() {
		return this.color;}
	
	public IDogfightModel getDogfightModel() {
		return this.dogfightModel;}
	
	@Override
	public void setDogfightModel(IDogfightModel dogfightModel) {
		this.dogfightModel = dogfightModel;}
	
	@Override
	public boolean hit() {
		return false;}
	
	@Override
	public boolean isWeapon() {
		return false;}
	
	@Override
	public Image getImage() {
		return this.image;}
	
}
