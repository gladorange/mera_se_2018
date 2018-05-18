package atarasov.lesson10;

public class IcecreamCocktailMaker implements CocktailMaker {
    @Override
    public String getDrink() {
        return "Water";
    }

    @Override
    public String makeCocktail() {
        return getDrink() + getDrink() + getToping();
    }

    @Override
    public String getToping() {
        return "Icecream";
    }

}
