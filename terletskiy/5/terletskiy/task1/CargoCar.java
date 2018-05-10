package terletskiy.task1;

import java.util.ArrayList;

public abstract class CargoCar extends Car implements ICargoVehicle{
    private final static int defaoulMaxWeight = 10000;
    private final int maxWeight;
    private double maximumLoad = 0;
    /**
     * поле максимальная грузоподъемность
     */
    public CargoCar(String cargo, int maxWeight){
        this.maxWeight = maxWeight;
        stuffs.add(cargo);
    }

    public CargoCar(){
        maxWeight = defaoulMaxWeight;
    }

    public void loadCargo(String cargo){
        stuffs.add(cargo);
        System.out.println(String.format("груз: %s загружен в CargoCar", cargo));
    }

    public void clearStuff(){
        stuffs.clear();
    }
}
