public class market {
    public static void main(String[] args) {
        //noOfItems, pricePerItem, currency, totalPrice
        // 50 cb, price 9.99
        // 12 fruitballs, price 10
        //balls, 10 balls, 5.98

        //cheese balls
        int noOfcb = 50;
        float priceofcb = 9.99f;
        float totalpriceCb = noOfcb * priceofcb;
        System.out.println("for the cheese balls"+ totalpriceCb);

        //fruitballs
        int noOFB = 12;
        float priceofFB = 10.99f;
        float totalpricefb = noOFB * priceofFB;
        System.out.println("for the fruit balls" + totalpricefb);
        
        //balls
        int noOfBalls = 10;
        float priceofBalls = 5.98f;
        float totalpriceBalls = noOfBalls * priceofBalls;

        //total sum
        float totalsum = totalpriceCb + totalpricefb + totalpriceBalls;
        System.out.println(totalsum);

    }
    
}
