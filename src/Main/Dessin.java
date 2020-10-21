package Main;

public /* static ??? */abstract class Dessin implements TransformationImage {
	Image[] images;
	
	void translation(Image[] d){
		for(Image i : d) {
			translation(i);
		}
	}
	
	void homothetie(Image[] d){
		for(Image i : d) {
			homothetie(i);
		}
	}
	
	void symAxe(Image[] d){
		for(Image i : d) {
			symAxe(i);
		}
	}
	
	void symCentre(Image[] d){
		for(Image i : d) {
			symCentre(i);
		}
	}
}
