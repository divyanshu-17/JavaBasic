public class TypeCasting {
    //🌟🌟🌟🌟🌟🌟🌟🌟🌟🌟🌟‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️🌟🌟🌟🌟🌟🌟🌟🌟🌟🌟🌟

    public static void main(String[] args) {
        double d=4.5;
        // we want to keep this value saved up

        //‼️int i=d; error as double!=int

        int i= (int) d; // now it works as we sacrificed .5 to convert it to int
    }
}
