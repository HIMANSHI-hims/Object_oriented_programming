abstract class Car{
    protected String brand;
    protected String model;
    protected boolean isEngineOn;
    protected int currentSpeed;
    //constructor
    public Car(String brand,String model){
        this.brand=brand;
        this.model=model;
        this.isEngineOn=false;
        this.currentSpeed=0;
        System.out.println("this is a "+brand+"with the model"+model);
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
    public abstract void accelerate(int speed);
    public abstract void brake();
}
class ManualCar extends Car{
    private int currentGear;
    //constructor
    public ManualCar(String brand,String model)
    {
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
    public void accelerate(int speed)
    {
        if(!isEngineOn)
        {
            System.out.println("first turn on the engine before accelerating");
            return;
        }
        else
        {
            currentSpeed+=speed;
            System.out.println("speed is increased by "+speed+"km/hr");
        }
    }
    @Override
    public void brake()
    {
        if(currentSpeed<0)
        {
            currentSpeed=0;
            System.out.println("the engine is turned off");
        }
        else
        {
            currentSpeed-=10;
            System.out.println("speed is decreased by 10km/hr");
        }
    }
}
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
            currentSpeed+=10;
            System.out.println("speed is increased by 10km/hr");
        }
    }
    @Override
    public void accelerate(int speed)
    {
        if(!isEngineOn)
        {
            System.out.println("first turn on the engine before accelerating");
            return;
        }
        else
        {
            currentSpeed+=speed;
            System.out.println("speed is increased by "+speed+"km/hr");
        }
    }
    @Override
    public void brake()
    {
        if(currentSpeed<0)
        {
            currentSpeed=0;
            System.out.println("the engine is turned off");
        }
        else
        {
            currentSpeed-=10;
            System.out.println("speed is decreased by 10km/hr");
        }
    }
}
class static_and_dynamic_plymorphism{
    public static void main(String args[])
    {
        //static polymorphism
        ManualCar manualCar=new ManualCar("Maruti","Swift");
        manualCar.display_details();
        manualCar.startEngine();
        manualCar.accelerate();
        manualCar.accelerate(20);
        manualCar.brake();
        manualCar.stopEngine();
        System.out.println("--------------------------------------------------");
        //dynamic polymorphism
        Car electricCar=new ElectricCar("Tata","Nexon");
        electricCar.startEngine();
        electricCar.accelerate();
        electricCar.accelerate(30);
        electricCar.brake();
        electricCar.stopEngine();
    }
}
