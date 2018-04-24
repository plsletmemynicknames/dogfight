package jpu2016.dogfight.model;

public class Position {
	
//-------------------------------Attributs----------------------------
	private double x;
	private double y;
	private double maxX;
	private double maxY;
	
//-------------------------------Constructor----------------------------	
	public Position(double x, double y, double maxX, double maxY) {
		this.x = x;
		this.y = y;
		this.maxX = maxX;
		this.maxY = maxY;}
	
	public Position(Position position) {
		this.x = position.x;
		this.y = position.y;
		this.maxX = position.maxX;
		this.maxY = position.maxY;}
	
//-------------------------------Méthodes----------------------------	
	public double getX() {
		return this.x;}
	
	public void setX(int x) {
		this.x = x;}
	
	public double getY() {
		return this.y;}
	
	public void setY(int y) {
		this.y = y;}
	
	protected void setMaxX(double maxX) {
		this.maxX = maxX;}
	
	protected void setMaxY(double maxY) {
		this.maxY = maxY;}
	
	
}
