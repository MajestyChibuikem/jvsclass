package oop;

public class mmadu {
    public static void main(String[] args) {
        Human human = new Human();
        human.setNoOfEyes(10);
        System.out.println(human.getNoOfEye());

        //human.noOfEyes = 5; -- IGNORE --
        //sout(human.noOfEyes) -- IGNORE --


        // System.out.println(human.noOfEyes); --- IGNORE ---


    }
}
class Human{


    private int noOfEyes;
    private int noOfNose;
    private int noOfEars;
    private int noOfTongue;
    private int noOfSkin;
    private String skinColor;

    //noOfEyes
    //getter method
    public int getNoOfEye(){
        return noOfEyes;
    }
    //setter method
    public void setNoOfEyes(int noOfEyes){
        this.noOfEyes = noOfEyes;
    }


    //noOfNose
    //getter method
    public int getnoOfNose(){
        return noOfNose;
    }
    //setter method
    public void setNoOfNose(int noOfNose){
        this.noOfNose = noOfNose;
    }
    //noOfEars
    //getter method
    public int getnoOfEars(){
        return noOfEars;
    }
    //setter method
    public void setNoOfEars(int noOfEars){
        this.noOfEars = noOfEars;
    }

    //noOfTongue
    //getter method
    public int getnoOfTongue(){
        return noOfTongue;
    }
    //setter method
    public void setnNOfTongue(int noOfTongue){
        this.noOfTongue = noOfTongue;
    }


    //noOfSkin
    //getter method
    public int getnoOfSkin(){
        return noOfSkin;
    }
    //setter method
    public void setnoOfSkin(int noOfSkin){
        this.noOfSkin = noOfSkin;
    }

    //skinColor
    //getter method
    public String getskinColor(){
        return skinColor;
    }
    //setter method
    public void setskinColor(String skinColor){
        this.skinColor = skinColor;
    }
    

    
   
}
