class Rectangle extends Shape {
	private double width;
	private double length;

	public Rectangle() {
		super();
		double width = 1.0;
		double length = 1.0;
	}

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	public Rectangle(String color, boolean filled, double length, double width) {
		super(color,filled);
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	public double getArea() {
		return length*width;
	}

	public double getPerimeter() {
		return (length+width)*2;
	}

	public String toString() {
		return super.toString() + "\nWidth : "+ getWidth() +"\nLength : "+getLength()+"\nArea : "+getArea()+"\nPerimeter :"+getPerimeter() ;
	}
}