package jpu2016.dogfight.model;

public class Missile extends Mobile {
	
	private static int SPEED = 4;
	private static int WIDTH = 30;
	private static int HEIGHT = 10;
	private static int MAX_DISTANCE_TRAVELED = 1400;
	private static String IMAGE = "missile";
	private int distanceTraveled = 0;
	
	public Missile(Direction direction, Dimension dimension) {
		super(direction, new Position(0,0,0,0), new Dimension(WIDTH, HEIGHT), SPEED, IMAGE);}
	
	public static int getWidthWithADirection(Direction direction) {
		return 0;}
	
	public static int getHeightWithADirection(Direction direction) {
		return 0;}
	
	public void move() {
		super.move();}
	
	public boolean isWeapon() {
		return super.isWeapon();}
	
}
