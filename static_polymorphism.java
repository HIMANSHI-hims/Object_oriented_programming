class ManualCar{
    private String brand;
    private String model;
    private boolean isEngineOn;
    private int currentSpeed;
    private int currentGear;
    //constructor
    public ManualCar(String brand,String model)
    {   //initialization
        this.brand=brand;
        this.model=model;
        this.isEngineOn=false;
        this.currentSpeed=0;
        this.currentGear=0;
        System.out.println("This is a "+brand+" with the model "+model);
    }
    public void display_details()
    {
        System.out.println("brand: "+brand);
        System.out.println("model: "+model);
        System.out.println("engine status: "+isEngineOn);
        System.out.println("current speed: "+currentSpeed);
        System.out.println("current gear: "+currentGear);
    }
    public void startEngine()
    {
        isEngineOn=true;
        System.out.println("engine is started");
    }
    public void stopEngine()
    {
        isEngineOn=false;
        currentSpeed=0;
        currentGear=0;
        System.out.println("engine is turned off");
    }
    //method overloading
    public void accelerate()
    {
        if(!isEngineOn)
        {
            System.out.println("first trun on the engine before accelerating");
            return;
        }
        else
        {
            currentSpeed+=10;
            System.out.println("speed is increased by 10km/hr");
        }
    }
    //method with a variable
    public void accelerate(int speed)
    {
        if(!isEngineOn)
        {
            System.out.println("first trun on the engine before accelerating");
            return;
        }
        else
        {
            currentSpeed+=speed;
            System.out.println("speed is increased by "+speed+"km/hr");
        }
    }
    public void brake()
    {
        if(!isEngineOn)
        {
            System.out.println("the engine is already turned off");
            return;
        }
        else
        {
            currentSpeed-=10;
            if(currentSpeed<0)
            {
                currentSpeed=0;
                System.out.println("brakes are applied");
            }
            else
            {
                System.out.println("speed is decreasing by 10km/hr");
            }
        }
    }
    public void shiftGear(int gear)
    {
        if(!isEngineOn)
        {
            System.out.println("the engine is not on");
            return;
        }
        else
        {
            currentGear=gear;
            System.out.println("gear is shifted to "+currentGear);
        }        
    }

}
public class static_polymorphism {
    public static void main(String[] args)
    {  //object of the class is created
        ManualCar car=new ManualCar("Toyota","Corolla");
        car.startEngine();
        car.accelerate();
        car.accelerate(20);
        car.shiftGear(2);
        car.brake();
        car.stopEngine();
    }
    
}
