package HelloWorld;

import java.util.Scanner;

public class ZybooksLab {
   
   public static int fibonacci(int n) {
      if (n < 0) {
         return -1;
      }
      int num0 = 0;
      int num1 = 1;
      
      for (int i = 0; i < n; i++) {
         int num2 = num1 + num0;
         num0 = num1;
         num1 = num2;
      } 
      return num0;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int startNum;
      
      startNum = scnr.nextInt();
      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
   }
}