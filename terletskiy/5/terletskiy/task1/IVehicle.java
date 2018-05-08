package terletskiy.task1;

public interface IVehicle {
    // Текущее местоположение должно быть запомнено.
    public void moveTo(String newLocation);

    //отправить домой
    public void moveHomeCity();
}

