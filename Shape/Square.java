class Square extends Rectangle {

	public Square(double side) {
   		super(side, side);
	}

	public Square(String color, boolean filled, double side) {
		super(color,filled,side,side);
	}

	public void setLength(double side) {
		super.setLength(side);
	}

	public void setWidth(double side) {
		super.setWidth(side);
	}

	
}