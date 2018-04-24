package jpu2016.dogfight.model;

public class Dimension {
	
//-------------------------------Attributs----------------------------
		private int width;
		private int height;
		
//-------------------------------Constructor----------------------------	
		public Dimension(int width, int height) {
			this.width = width;
			this.height = height;}
		
		public Dimension(Dimension dimension) {
			this.width = dimension.width;
			this.height = dimension.height;}
		
//-------------------------------M�thodes----------------------------
		public int getWidth() {
			return this.getWidth();}
		
		public void setWidth(int width) {
			this.width = width;}
		
		public int getHeight() {
			return this.height;}
		
		public void setHeight(int height) {
			this.height = height;}
		
}
