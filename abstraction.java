interface Car{
    void startEngine();
    void shiftGear(int gear);
    void accelerate();
    void brake();
    void stopEngine();
}
class SportsCar implements Car{
    String model;
    String brand;
    boolean isEngineOn=false;
    int currentSpeed=0;
    int currentGear=0;
    public SportsCar(String model,String brand){
        this.model=model;
        this.brand=brand;
    }
    @Override
    public void startEngine()
    {
        isEngineOn=true;
        System.out.println("engine is started");
    }
    @Override
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
    @Override
    public void accelerate()
    {
        if(!isEngineOn)
        {
            System.out.println("the engine is not on");
            return;
        }
        else
        {
            currentSpeed+=10;
            System.out.println("speed is increased to "+currentSpeed);
        }        
    }
    @Override
    public void brake()
    {
        currentSpeed-=10;
        if(currentSpeed<0)
        {
            currentSpeed=0;
            System.out.println("the car has successfully stopped");
        }
    }
    @Override
    public void stopEngine()
    {
        isEngineOn=false;
        currentGear=0;
        currentSpeed=0;
        System.out.println("the engine has stopped");
    }
    public class abstraction{
        public static void main(String[] args)
        {
            SportsCar car=new SportsCar("Mustang","Ford");
            car.startEngine();
            car.shiftGear(1);
            car.accelerate();
            car.shiftGear(2);
            car.accelerate();
            car.brake();
            car.stopEngine();
        }
    }
}