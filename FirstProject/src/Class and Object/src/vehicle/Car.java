package vehicle;

class Car {
    static int carSales; //👽

    int noOfWheels;

    String colour;

    float maxSpeed;

    float currentFuelInLiters;

    int noOfSeats;     //These are all Properties/Attributes of a car
    // Aka INSTANCE VARIABLES

    static {
        carSales=0;
        System.out.println("Inside static");

    }

    {
        System.out.println("Inside Non static");
        carSales++;
    }

    public Car start(){   //insisted of public void start(), we are using this to use THIS keyword
        if(currentFuelInLiters==0){  //
            System.out.println("vehicle.Car is out of fuel");
        } else if (currentFuelInLiters<5) {
            System.out.println("vehicle.Car is in reserved mode");
        }
        else{
            System.out.println("vehicle.Car just started... vroooom");
        }
        return this;
    }

    public void drive(){
            System.out.println("vehicle.Car is driving");
            currentFuelInLiters--;
    }
    public void addFuel(float fuel){
        currentFuelInLiters+=fuel;
    }
    public float currentFuelLevel(){
         return currentFuelInLiters;
    }                                   // Different Methods
    //Aka Instance Methods

    // Let's define a constructors(aka. these are default value, preset you can change them in your
    // object: myCar.anyInstanceVar;

    Car(float currentFuelInLiters) {  // passing values will give user choice
        colour="Black";
        noOfWheels=4;
        noOfSeats=5;
        maxSpeed=150;
        this.currentFuelInLiters=currentFuelInLiters;
    }
    Car(){
        this(2);
    }
    // Ab ye yha add krne se ye hoga ki udhar obj me chahe hum fuel ltr choice pass kre to thk nhi to ye by
    //🌟🌟‼️‼️This is known as chaining constructor🌟🌟‼️‼️                                 default 2 le lega
}
