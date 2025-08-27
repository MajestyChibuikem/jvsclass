public class loops {
    public static void main(String[] args) {
        //   out put numbvers 1 to 10
        //starting point
        int start = 1;
        //ending point
        int end = 50;

        //if divisible by 3 - fizz
        //if divisible by 5 - buzz
        //if divisible by both 3 and 5 - fizzbuzz
        while(start <=end){
            if(start % 3 == 0  && start %5 == 0){
                System.out.println("fizzbuzz");
            }
            else if(start % 5 == 0){
                System.out.println("buzz");
            }
            else if(start % 3 == 0){
                System.out.println("fizz");
            }
            else{
                System.out.println(start);
            }
            start = start + 1;
        }
    }
}
