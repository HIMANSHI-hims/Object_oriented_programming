class SportsCar{
  private String brand;
  private String model;
  private boolean isEngineOn=false;
  private int currentSpeed=0;
  private int currentGear=0;
  private String tyreCompany;
  public SportsCar(String brand,String model)
  {
    this.brand=brand;
    this.model=model;
  }
  public void Type()
  {
    System.out.println("This is a "+brand+" with the model "+model);
  }
  public int getSpeed()
  {
    return currentSpeed;
  }
  public String getTyreCompany()
  {
    return tyreCompany;
  }
  public void setTyreCompany(String tyreCompany)
  {
    this.tyreCompany=tyreCompany;
  }
  public void startEngine()
  {
    isEngineOn=true;
    System.out.println("engine is started");
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
  public void brake()
  {
    currentSpeed-=10;
    if(currentSpeed<0)
    {
      currentSpeed=0;
      System.out.println("the car has successfully stopped");
    }
  }
  public void stopEngine()
  {
    isEngineOn=false;
    currentGear=0;
    currentSpeed=0;
    System.out.println("the engine has stopped");
  }
}
public class encapsulation {
    public static void main(String[] args) {
        SportsCar car=new SportsCar("Ferrari","F8");
        car.setTyreCompany("Pirelli");
        car.startEngine();
        car.shiftGear(1);
        car.accelerate();
        car.Type();
        System.out.println("Current speed: " + car.getSpeed());
        System.out.println("Tyre company: " + car.getTyreCompany());    
    }

}
