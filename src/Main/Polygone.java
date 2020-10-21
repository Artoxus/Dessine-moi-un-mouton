package Main;

public class Polygone extends Image implements TransformationImage {
	Point[] points;
	
	public void Polygone(Point[] pts) {
		this.points = pts;
		this.formes = { pts };
	}
	
}
