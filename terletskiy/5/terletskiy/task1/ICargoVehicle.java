package terletskiy.task1;

import java.util.ArrayList;

public interface ICargoVehicle extends IVehicle{

    /**
     * Метод loadCargo должен запоминать название груза, переданного в качестве аргумента.
     * @param cargo название груза
     */
    public void loadCargo(String cargo);
    public void clearStuff();
    public int getMaxWeight();

    public ArrayList<String> stuffs = new ArrayList<String>();


}
