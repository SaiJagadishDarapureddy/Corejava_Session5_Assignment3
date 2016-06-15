package shape_Areas1;

public class Area_Square_Rectangle {

	static Area_Square_Rectangle area;

	void Area(int a){
		System.out.println("SIDE OF THESQUARE IS " +a);
		System.out.println("AREA OF THE SQUARE IS " +(a*a));
	}
	
	void Area(int a, int b){
		System.out.println("LENGTH OF THE RECTANGLE IS " +a);
		System.out.println("WIDTH OF THE TRIANGLE IS " +b);
		System.out.println("AREA OF THE TRIANGLE IS " +(a*b));
		}
		
	public static void main(String[] args) {
		
		Area_Square_Rectangle.area = new Area_Square_Rectangle();	
		area.Area(5);
		System.out.println("**********************************************");
		area.Area(10, 15);
	}
}

