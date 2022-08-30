import java.util.Scanner;
class p2 {
  public static void main(String[] args) {
    int c,pos,n,x;

    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of array elements");
     n = sc.nextInt(); 
    int array[]=new int[n+1];

    System.out.println("enter "+n+" elements");
    for(int i=0; i<n;i++)
     {
      array[i] = sc.nextInt();
     }

     System.out.print("enter the position where you want to insert element:");
     pos = sc.nextInt();

     System.out.print("Enter the element you want to insert:");
     x = sc.nextInt();

for(int i = (n-1); i >= (pos-1); i--)
{
array[i+1] = array[i];
}
array[pos-1] = x;
System.out.println("After inserting:");
for(int i = 0; i < n; i++)
{
System.out.print(array[i]+",");
}
System.out.println(array[n]);





int flag = 1, loc = 0;
Scanner s = new Scanner(System.in);
System.out.print("Enter the number of elements : ");
n = s.nextInt();
int a[] = new int[n];
System.out.println("Input the array elements :");
for (int i = 0; i < n; i++)
{
a[i] = s.nextInt();
}
System.out.print("Enter the element you want to delete:");
x = s.nextInt();
for (int i = 0; i < n; i++)
{
if(a[i] == x)
{
flag =1;
loc = i;
break;
}
else
{
flag = 0;
}
}
if(flag == 1)
{
for(int i = loc+1; i < n; i++)
{
a[i-1] = a[i];
}
System.out.print("After Deleting:");
for (int i = 0; i < n-2; i++)
{
System.out.print(a[i]+",");
}
System.out.print(a[n-2]);
}
else
{
System.out.println("Element not found");
}
}
}

