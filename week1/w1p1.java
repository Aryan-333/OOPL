
import java.util.Scanner;
class w1p1{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt(); 


    //int num;
    
    if (!isPrime(num))
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");

    // second part

    System.out.println("enter the value of n");
    int n = sc.nextInt();

    int i;
    int p=0;
    for(i=2;i>=0;i++)

    {
      if(!isPrime(i)){
        p++;
        System.out.println(i);
      }
      else
        continue;

      if(p==n)
        break;

    }


  }
  static boolean isPrime(int num)
  {
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {

      if (num % i == 0) {
        flag = true;
        break;
      }
    }
    return flag;

  }
}
