package atarasov.lesson10;

public class IceCocktailMaker implements CocktailMaker {
    @Override
    public String getDrink() {
        return "Water";
    }

    @Override
    public String getToping() {
        return "Ice";
    }

    public static void main(String[] args) {
        IceCocktailMaker k = new IceCocktailMaker();
        System.out.println(k.makeCocktail());

        IcecreamCocktailMaker i = new IcecreamCocktailMaker();
        System.out.println(i.makeCocktail());
    }
}
