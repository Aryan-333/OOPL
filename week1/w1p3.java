import java.util.Scanner;
class w1p3{
	public static void main(String[] args) {

    System.out.println("enter the number");
	Scanner sc = new Scanner(System.in);
    int num = sc.nextInt(); 

    int large = fact(num);

    System.out.println(large + " is the factorial");

    System.out.println("enter value of r");
    int r = sc.nextInt();

    int rp = fact(r);

    int nr = fact(num-r);
    int ncr = large/(rp*nr);
    System.out.println(ncr + " is the ncr");
    
    


	}
	static int fact(int num)
  {
   int i;
   int facto=1;
   for(i=num;i>0;i--)
   {
    facto =facto*i;
   }
    return facto;

  }
}