import java.util.Scanner;
class p1{
	public static void main(String[] args) {
		int c,i,j,temp,p,q;
	Scanner sc = new Scanner(System.in);

	System.out.println("enter the number of array elements");
	int n = sc.nextInt();
    int array[]=new int[n];

    System.out.println("enter "+n+" elements");
    for(c=0;c<n;c++)
    {
    	array[c]=sc.nextInt();
    }

 for (i = 0; i < ( n - 1 ); i++) {
      for (j = 0; j < n - i - 1; j++) {
        if (array[j] > array[j+1]) 
        {
           temp = array[j];
           array[j] = array[j+1];
           array[j+1] = temp;
        }
      }
    }

System.out.println("sorted array in ascending order is");
for(i=0;i<n;i++)
{
	System.out.println(array[i]);
}


for (p = 0; p < ( n - 1 ); p++) {
      for (q = 0; q < n - p - 1; q++) {
        if (array[q] < array[q+1]) 
        {
           temp = array[q];
           array[q] = array[q+1];
           array[q+1] = temp;
        }
      }
    }
System.out.println("sorted array in descending order is");
for(p=0;p<n;p++)
{
	System.out.println(array[p]);
}
}}
