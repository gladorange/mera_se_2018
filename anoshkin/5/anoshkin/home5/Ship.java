package anoshkin.home5;

public abstract class Ship implements Vehicle {
    protected Integer draft;
    protected String currentLocation = "Factory";
    protected String oldLocation = "Factory";

    protected Ship(Integer draft){
        this.draft = draft;
    }

    public Integer getDraft(){
        return this.draft;
    }

    @Override
    public boolean moveTo(String newLocation) {
        System.out.printf("Shipping from %s to %s\n", this.currentLocation, newLocation);
        this.oldLocation = this.currentLocation;
        this.currentLocation = newLocation;
        return true;
    }

}
