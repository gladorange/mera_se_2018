package anoshkin.home10;

public class Flower implements Item{
    private float price = 5.f;
    private Integer rest = 0;
    private Integer realized = 0;

    public Flower(Float price, Integer amount){
        this.price = price;
        this.rest = amount;
    }

    @Override
    public boolean sell(Integer count){
        if(rest >= count){
            rest -= count;
            realized += count;
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return "Flower";
    }

    @Override
    public Float getPrice() {
        return price;
    }

    @Override
    public Integer getRest() {
        return rest;
    }

    @Override
    public Integer getRealized() {
        return realized;
    }

    @Override
    public String toString() {
        return getName() + " " + rest.toString() + " " + Float.toString(price);
    }
}
