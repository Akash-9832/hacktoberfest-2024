import java.util.Scanner;

class Stack_Fn {
    int n=10;
    int arr[]=new int[n];
    int top = -1;

    void push() {
        if (top == n - 1) {
            System.out.println("Overflow occurs...");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the data: ");
            int a = sc.nextInt();
            top += 1;
            arr[top] = a;
            System.out.println(arr[top]);
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("Underflow occurs...");
        }
        else{
            top-=1;
        }
    }
    void display(){
        System.out.println("Stack values are: ");
        for (int j = top; j >= 0; j--) {
            System.out.println(arr[j]);
        }
    }
}

public class Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack_Fn sf = new Stack_Fn();
        int k,p;
        do {
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. DISPLAY");
            System.out.print("Enter your choice: ");
            p=sc.nextInt();
            switch (p) {
                case 1:{
                    sf.push();
                    break;
                }
                case 2:{
                    sf.pop();
                    break;
                }
                case 3:{
                    sf.display();
                    break;
                }
                default:{
                    System.out.println("Please choose between 3 options.");
                    System.exit(0);
                }
            }
            System.out.print("Enter '0' to view menu or '1' to exit: ");
            k =sc.nextInt();
        } while (k==0);
    }
}
