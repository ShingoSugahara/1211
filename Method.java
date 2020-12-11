import java.util.Scanner;
public class Method {

	public static int userInput() {
		System.out.print("値を入力してください:");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	public static double triangle(int input,int input2) {
		return (double)input*(double)input2/2;
	}
	public static void triangleResult(double triangle) {
		System.out.println(triangle);
	}

	public static void main(String[] args) {
	int input =0;
	int input2 =0;
	double triangleArea =0;
	String triangleResult="";
	   input = userInput();
	   input2 = userInput();//底辺と高さを入力する
	   triangleArea =triangle(input,input2); //三角形の面積を求める
	   triangleResult(triangle);//表示する
		//半径を入力する
		//円の面積を求める
		//表示する
	}

}
