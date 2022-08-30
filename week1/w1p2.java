import java.util.Scanner;
class w1p2{
	public static void main(String[] args) {

    System.out.println("enter three numbers");
	Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int large = largest(a,b,c);

    System.out.println(large + "is the largest number");


	}
	static int largest(int a, int b, int c)
  {
   int num;
   if(a>b && a>c)
   	num=a;
   else if(b>a && b>c)
   	num=b;
   else 
    num=c;
      
    return num;

  }
}