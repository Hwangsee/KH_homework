package kh.java.inherit.shape;

public class Rectangle extends Shape {

	/**
	 * 필드 points: Point[4] 0번지-leftTop, 1번지-rightTop,
	 * 2번지-rightBottom, 3번지-leftBottom
	 * width : int
	 * height : int
	 * 
	 */
	
	
	private Point[] points = new Point[4];
	private int width;
	private int height;
	
	//기본생성자
	public Rectangle() {
		super();
	}
	
	//파라미터생성자
	public Rectangle(Point[] points, int width, int height) {
		super();
		this.points = points;
		this.width = width;
		this.height = height;
	}

	public Point[] getPoints() {
		return points;
	}

	public void setPoints(Point[] points) {
		this.points = points;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return (double)width*height; }
				
	@Override
	public void draw() {
		System.out.print("네 꼭지점이");
		for (int i = 0; i < points.length; i++) {
			System.out.print(points[i]);
			System.out.print(i != points.length-1? "," : "");
		}
		System.out.println("이고, 너비가" + width + " 높이가" + height + "인 사각형을 그린다.");
	}
	
	@Override
	public String toString() {
		String str = "point=[";
		for (Point p : points) {
			str += p;
		}
		str += "], ";
		str += "width=" + width + ", height=" + height;
				
		return str;
	}

}
