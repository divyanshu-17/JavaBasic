package in.Wrapper;
// It is mostly used in collection where primitive dt isn't used, we can only use object
public class TestingWrapper {
    public static void main(String[] args) {
        //Integer zero= new Integer(55); ‼️error- declaring it this way was discontinued in java ver 9

        Integer first= Integer.valueOf(55); // we are basically creating a object of int
        Integer second= Integer.valueOf("55");// it will even convert string value into int
        System.out.println(first);
        System.out.println(second);

        Integer third= 55; //🌟 simple and best way(AUTO BOXING)
        System.out.println(third);

        Integer fourth= null;// suppose we want to declare a int value but we will get it's value later on, so till
        // now we are just assigning it as 0 or 1, but what if they are one of the values we are finding, so to prevent
        // that we can use this and assign null.

    }
}
