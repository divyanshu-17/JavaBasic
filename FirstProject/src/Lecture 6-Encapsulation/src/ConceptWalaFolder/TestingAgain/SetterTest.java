package ConceptWalaFolder.TestingAgain;

import ConceptWalaFolder.GetterSetter.Car;

public class SetterTest {
    public static void main(String[] args) {  //‼️🌟Jaisa ki hum log dekh skte h ki ye private ko bhi update kr rha h
        Car car = new Car("Green", "Helix", 7, 4800000); //👽 to private ka  faeda hi kya h
        System.out.printf("%s %s ",car.getColor(),car.getModel()); //👽 Ye humne constructor lgaya h uski wajah se ho rha h
                                                                   //👽 ek bar set hoga
        car.setColor("Blue");                                      //👽 ab getColor se keval dekh skte h aur change usko
        System.out.println(car.getColor());                        //👽 keval setColor se
                                                                   //👽 get  & set standard tarika hai
        car.setColor("Yellow");
        System.out.println(car.getColor());

    }
}
