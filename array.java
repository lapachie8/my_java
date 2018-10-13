public class array {

   public static void main(String[] args) {
      double[] halo = {1.9, 2.9, 3.4, 3.5};

      
      for (int i = 0; i < halo.length; i++) {
         System.out.println(halo[i] + " ");
      }
     
      
      double total = 0;
      for (int i = 0; i < halo.length; i++) {
         total += halo[i];
      }
      System.out.println("Total is " + total);
      
      
      double max = halo[0];
      for (int i = 1; i < halo.length; i++) {
         if (halo[i] > max) max = halo[i];
      }
      System.out.println("Max is " + max);  
   }
}