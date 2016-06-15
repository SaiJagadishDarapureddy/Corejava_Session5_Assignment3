
public class Area_Square_Rectangle {

static int side;
static int width;

	Area_Square_Rectangle(int a){
		side=a;
		System.out.println("SIDE OF THESQUARE IS " +a);
		
	}
	
	Area_Square_Rectangle(int a, int b){
		side=a;
		width=b;
		System.out.println("LENGTH OF THE RECTANGLE IS " +a);
		System.out.println("WIDTH OF THE TRIANGLE IS " +b);
		}
	void display1(){
		System.out.println("AREA OF THE SQUARE IS " +(side*side));
	}
	void display2(){
		System.out.println("AREA OF THE TRIANGLE IS " +(side*width));
	}
	public static void main(String[] args) {
		
		Area_Square_Rectangle area1 = new Area_Square_Rectangle(10);
		
		area1.display1();
		
		System.out.println("**********************************************");
		
		Area_Square_Rectangle area2 = new Area_Square_Rectangle(10, 15);
		area2.display2();
		
	}
}
