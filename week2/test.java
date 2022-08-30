import java.util.Scanner;
class test{
  public static void main(String[] args) {
    int c;

    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of array elements");
    int n = sc.nextInt(); 
    int array[]=new int[n];

    System.out.println("enter"+n+"elements");
    for(c=0; c<n;c++)
     {
      array[c] = sc.nextInt();
     }

     //to display array elements
     for(c=0;c<n;c++)
     {
      System.out.println(array[c]);
     }
}
}