abstract class Car{
    protected String brand;
    protected String model;
    protected boolean isEngineOn;
    protected int currentSpeed;
    public Car(String brand,String model)
    {   //initialization
        this.brand=brand;
        this.model=model;
        this.isEngineOn=false;
        this.currentSpeed=0;
        System.out.println("This is a "+brand+" with the model "+model);
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
    //abstract methods
    public abstract void accelerate();
    public abstract void brake();
}
//child class 1
class ManualCar extends Car{
    private int currentGear;
    public ManualCar(String brand,String model)
    {   //initialization
        super(brand,model);
        this.currentGear=0;
    }
    public void display_details()
    {
        System.out.println("brand: "+brand);
        System.out.println("model: "+model);
        System.out.println("engine status: "+isEngineOn);
        System.out.println("current speed: "+currentSpeed);
        System.out.println("current gear: "+currentGear);
    }
    @Override
    public void accelerate()
    {
        if(!isEngineOn)
        {
            System.out.println("first turn on the engine before accelerating");
            return;
        }
        else
        {
            currentSpeed+=10;
            System.out.println("speed is increased by 10km/hr");
        }
    }
    @Override
    public void brake()
    {
        if(!isEngineOn)
        {
            System.out.println("first turn on the engine before braking");
            return;
        }
        else
        {
            currentSpeed-=10;
            if(currentSpeed<0)
                currentSpeed=0;
            System.out.println("speed is decreased by 10km/hr");
        }
    }
}
//child class 2
class ElectricCar extends Car{
    public ElectricCar(String brand,String model)
    {   //initialization
        super(brand,model);
    }
    @Override
    public void accelerate()
    {
        if(!isEngineOn)
        {
            System.out.println("first turn on the engine before accelerating");
            return;
        }
        else
        {
            currentSpeed+=20;
            System.out.println("speed is increased by 20km/hr");
        }
    }
    @Override
    public void brake()
    {
        if(!isEngineOn)
        {
            System.out.println("first turn on the engine before braking");
            return;
        }
        else
        {
            currentSpeed-=20;
            if(currentSpeed<0)
                currentSpeed=0;
            System.out.println("speed is decreased by 20km/hr");
        }
    }
}
public class dynamic_polymorphism {
    public static void main(String[] args) {
        Car car1=new ManualCar("Toyota","Corolla");
        car1.startEngine();
        car1.accelerate();
        car1.brake();
        System.out.println("current speed of the car is: "+car1.currentSpeed);
        System.out.println("--------------------------------------------------");
        Car car2=new ElectricCar("Tesla","Model S");
        car2.startEngine();
        car2.accelerate();
        car2.brake();
        System.out.println("current speed of the car is: "+car2.currentSpeed);
    }
}