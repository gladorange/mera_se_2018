/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boreykin.task1;

/**
 *
 * @author flyer
 */
public class Artist extends Person
{
    public enum Style
    {
        NO_STYLE,
        IMPRESSIONISM,
        EXPRESSIONISM,
        CUBISM,
        MODERNISM,
        NEOCLASSIC,
        ROMANTISM,
        REALISM;
        
        @Override
        public String toString()
        {
            switch(this)
            {
                case NO_STYLE:
                {
                    return "Отсутствует";
                }
                case IMPRESSIONISM:
                {
                    return "Импрессионизм";
                }
                case EXPRESSIONISM:
                {
                    return "Экспрессионизм";
                }
                case CUBISM:
                {
                    return "Кубизм";
                }
                case MODERNISM:
                {
                    return "Модернизм";
                }
                case NEOCLASSIC:
                {
                    return "Неоклассицизм";
                }
                case ROMANTISM:
                {
                    return "Романтизм";
                }
                case REALISM:
                {
                    return "Реализм";
                }
                default:
                {
                    return "Неизвестный стиль";
                }
            }
        }
    }
    
    private Style mainStyle;
    
    public Artist(String firstName, String lastName)
    {
        this(firstName, lastName, Style.NO_STYLE);
    }
    
    public Artist(String firstName, Style mainStyle)
    {
        this(firstName, Person.DEFAULT_LAST_NAME, mainStyle);
    }
    
    public Artist(String firstName, String lastName, Style mainStyle)
    {
        super(firstName,lastName);
        this.mainStyle = mainStyle;
    }
    
    @Override
    public void printInfo()
    {
        super.printInfo();
        System.out.printf("Основной стиль: %s%n", this.mainStyle);
    }

    public Style getMainStyle() {
        return mainStyle;
    }

    public void setMainStyle(Style mainStyle) {
        this.mainStyle = mainStyle;
    }
}
