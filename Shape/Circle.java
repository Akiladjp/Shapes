class Circle extends Shape {
	private double radius;

	public Circle() {
		super();
		double radius = 1.0;
	}

	public Circle(String color, boolean filled) {
		super(color,filled);
		double radius = 1.0;
	}

	public Circle(String color, boolean filled, double radius) {
		super(color,filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius() {
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI()*radius*radius;
	}

	public double getPerimeter() {
		return Math.PI()*2*radius;
	}

	public String toString() {
		return super.toString() + "\nRadius : "+ getRadius +"\nArea : "+getArea+"\nPerimeter :"+getPerimeter;
	}
}