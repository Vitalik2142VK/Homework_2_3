import Vehicle.*;

public class ServiceStation {
    public void check(Vehicle veh) {
        System.out.println("Обслуживаем " + veh.getModelName());
        for (int i = 0; i < veh.getWheelsCount(); i++) {
            veh.updateTyre();
        }
        veh.checkEngine();
        veh.checkTrailer();
    }
}
