package atarasov.lesson10;

public interface CocktailMaker {

    String getDrink();
    String getToping();

    default String makeCocktail() {
        return String.format("%s-cocktail with %s", getDrink(), getToping());
    }
}
