//parent class
class Car{
    //these variables will be used by 2 child classes also
    protected String brand;
    protected String model;
    protected boolean isEngineOn;
    protected int  currentSpeed;
    public Car(String brand,String model)
    {
        this.brand=brand;
        this.model=model;
        isEngineOn=false;
        currentSpeed=0;
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
        System.out.println("engine is turned off");
    }
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
}
//child class-1
class ElectricCar extends Car{
    //put this as public so that it can be accesse in the main method.
    public int batteryPower;
    public ElectricCar(String brand,String model)
    {   //refers to the parent variable 
        super(brand,model);
        this.batteryPower=100;
    }
    public void chargeBattery()
    {
        batteryPower=100;
        System.out.println("battery is fully charged");
    }
}
//child class-2
class ManualCar extends Car{
    public int currentGear;
    public ManualCar(String brand,String model)
    {
        super(brand,model);
        currentGear=0;
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
//main class
public class inheritance{
    public static void main(String[] args)
    {
        ElectricCar tesla=new ElectricCar("Tesla","Model S");
        //methods from the parent class are accessed by the object of the child class
        tesla.startEngine();
        tesla.accelerate();
        tesla.brake();
        tesla.chargeBattery();
        System.out.println("current speed of the car is "+tesla.currentSpeed+"km/hr");
        System.out.println("brand of the car is "+tesla.brand);
        System.out.println("model of the car is "+tesla.model);
        System.out.println("battery power of the car is "+tesla.batteryPower+"%");
        
        ManualCar honda=new ManualCar("Honda","Civic");
        //parent class methods are accessed by the child class objects
        honda.startEngine();
        honda.shiftGear(2);
        honda.accelerate();
        honda.brake();
        System.out.println("current speed of the car is "+honda.currentSpeed+"km/hr");
        System.out.println("brand of the car is "+honda.brand);
        System.out.println("model of the car is "+honda.model);
    }
}
