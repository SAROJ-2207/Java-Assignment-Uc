import java.util.Scanner;
	
public class LengthCalculation {
		
		int x1 , x2, y1, y2;
		double distanceLine;
		public void distanceOfLine(int x1 ,int x2, int y1,int y2){
			
			this.x1=x1;
			this.x2=x2;
			this.y1=y1;
			this.y2=y2;
			
			}
		public double calculateDistanceOfLine() {
			distanceLine =Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
			return distanceLine;
			}
		
		void show() {
			System.out.println("Distance Of Two Line :- "+distanceLine);
			}
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X1 And X2 Co-ordinates :- ");
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		System.out.println("Enter Y1 And Y2 Co-ordinates :- ");
		int y1 = sc.nextInt();
		int y2 = sc.nextInt();
		LengthCalculation obj = new LengthCalculation ();
		obj.distanceOfLine(x1,x2,y1,y2);
		obj.calculateDistanceOfLine();
		obj.show();
	}

}
