public class Main{
     public static void main(String[] args) {
        String name = "Carol";
        int noOfBooks = 3;
        double priceOfEach = 20.42;
        char currency = '$';
        boolean isUseful = false;
        int total = (int) (noOfBooks * priceOfEach);

         System.out.println("Hello "+name+ " How many books did you buy : " +noOfBooks);
         System.out.println("What was the price of each book? :");
         System.out.println("So in total it was? " +currency+ " " +total );
         if (isUseful){
             System.out.println("Am happy the books are helping you");
         }else {
             System.out.println("Maybe you should take a different set of books");
         }
    }
}