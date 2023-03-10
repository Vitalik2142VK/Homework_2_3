package Vehicle;

public abstract class Vehicle {
    protected String modelName;
    protected int wheelsCount;

    public Vehicle(String modelName, int wheelsCount){
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }
    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre() {
        return;
    }
    public void checkEngine() {
        return;
    }
    public void checkTrailer() {
        return;
    }
}
