package assignments;

public class timer {
    public static void main(String[] args) {
        // 2012 two thousand and twelve
        //counts down from 10 to 0
        int start  = 10;
        int end = 0;
        while (start >= end){
            System.out.println(start);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
               System.out.println("you cancelled the bomb");
            }
            start--;
        }
    }
}
