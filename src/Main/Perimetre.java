package Main;



public interface Perimetre {

	public double distance(Point p1, Point p2) {
		double x = p1.x - p2.x;
		double y = p1.y - p2.y;
		return Math.sqrt(x*x + y*y);
	}
	
	public double perimetre(Point[] tab) {
		double res = distance(tab[0], tab[tab.length]);
		for(int i = 0; i < tab.length-1; i++) {
			res += distance(tab[i], tab[i+1]);
		}
		return res;
	}

}
