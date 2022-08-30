import java.util.Scanner;
class w1p4{
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

    double root1, root2, discriminant;
    double imaginary;

     System.out.println("Enter value of 'a' of quadratic equation (aX^2 + bX + c): ");
    float a = sc.nextInt(); 
     System.out.println("Enter value of 'b' of quadratic equation (aX^2 + bX + c): ");
    float b = sc.nextInt();
     System.out.println("Enter values of 'c' of quadratic equation (aX^2 + bX + c): ");
    float c = sc.nextInt();
    int choice; 
    // Find discriminant of the equation
    discriminant = (b * b) - (4 * a * c);
    if(discriminant > 0)
        choice=1;
    else if(discriminant == 0)
        choice=0;
    else choice = -1;

    switch(choice)
    {
        case -1:
            // If discriminant is negative
            root1 = root2 = -b / (2 * a);
            imaginary = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Two distinct complex roots exists:" +root1+ imaginary+ root2+ imaginary);
            break;
    case 1:
        // If discriminant is positive
        root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        System.out.println("Two distinct and real roots exists:"  + root1 + root2);
        break;
    case 0:
            // If discriminant is zero
            root1 = root2 = -b / (2 * a);
            System.out.println("Two equal and real roots exists:"+ root1+ root2);
            break;
        }
    }
}
