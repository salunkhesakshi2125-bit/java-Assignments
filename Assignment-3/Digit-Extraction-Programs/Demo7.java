import java.util.Scanner;
class Demo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int last = num % 10;  
        int first = num;       
        while (first >= 10) {
            first = first / 10;
        }

        System.out.println("First element: " + first + " Last element: " + last);
    }
}
