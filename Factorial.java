import java.util.*;
class Factorial {
 static int factorial(int n){
  if (n == 0)
    return 1;
  else
    return(n * factorial(n-1));
 }
 public static void main(String args[]){
  int i,fact=1;
  System.out.println("Enter The Number for Factorial Limit");
  Scanner sc = new Scanner(System.in);
  int number = sc.nextInt();
  fact = factorial(number);
  System.out.println("Factorial of "+number+" is: "+fact);
 }
}

