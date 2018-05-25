package anoshkin.home10;

public interface Item {
    String getName();
    Float getPrice();
    Integer getRest();
    Integer getRealized();
    boolean sell(Integer count);
}
