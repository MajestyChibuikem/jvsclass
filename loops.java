public class loops {
    public static void main(String[] args) {
        //   out put numbvers 1 to 10
        //starting point
        // int start = 1;
        //ending point
        // int end = 50;

        //if divisible by 3 - fizz
        //if divisible by 5 - buzz
        //if divisible by both 3 and 5 - fizzbuzz
        // while(start <=end){
        //     if(start % 3 == 0  && start %5 == 0){
        //         System.out.println("fizzbuzz");
        //     }
        //     else if(start % 5 == 0){
        //         System.out.println("buzz");
        //     }
        //     else if(start % 3 == 0){
        //         System.out.println("fizz");
        //     }
        //     else{
        //         System.out.println(start);
        //     }
        //     start = start + 1;
        // }
        


        //do while
        
        // do {
        //     System.out.println("this is the value of " + i);
        //     i++;// 4+1 = 5
        // }
        // while (i < 5);

        // int i = 0; //start variable
        // while(i < 5){
        //     System.out.println("this is the value of " + i);
        //     i++;
        // }

        

        for (int b = 0; b <= 50; b++) {
            if(b ==10){
                System.out.println("this is for 10" +b);
                // break;
            }
            else if(b == 12){
                System.out.println("this is for 12" +b);
                continue;
            }
            if(b == 12){
                System.out.println("this is the second for 12" +b);
            }
            else{
                System.out.println(b);
                
            }
            // all the multiples of 5
        }
        
        // time space complexity 


    }
}
