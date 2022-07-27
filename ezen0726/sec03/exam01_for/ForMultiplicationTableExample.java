package ezen0726.sec03.exam01_for;
public class ForMultiplicationTableExample {
   public static void main(String[] args) {
      
//      for (int m=2; m<=9; m++) {
//         System.out.println("*** " + m + "단 ***");
//         for (int n=1; n<=19; n++) {
//            System.out.println(m + " x " + n + " = " + (m*n));
//         }
//      }
      
//      for (int m=2; m<=9; m++) {
//         for (int n=1; n<=9; n++) {
//            System.out.print(m + " x " + n + " = " + (m*n) + "\t");            
//         }
//         System.out.println();
//      }
      
      for (int m=1; m<=9; m++) {
         for (int n=2; n<=9; n++) {
            System.out.print(n + " x " + m + " = " + (m*n) + "\t");            
         }
         System.out.println();
      }
   }
}

//m=2 n=1 2 3 4 5 6 7 8 9
//m=3 n=1 2 3 4 5 6 7 8 9
//m=4 n=1 2 3 4 5 6 7 8 9
//m=5 n=1 2 3 4 5 6 7 8 9
//m=6 n=1 2 3 4 5 6 7 8 9
//m=7 n=1 2 3 4 5 6 7 8 9
//m=8 n=1 2 3 4 5 6 7 8 9
//m=9 n=1 2 3 4 5 6 7 8 9