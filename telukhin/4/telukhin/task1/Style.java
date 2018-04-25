package telukhin.task1;

public enum Style {
    IMPRESSIONISM,
    EXPRESSIONISM,
    CUBISM,
    MODERNISM,
    NEOCLASSICISM,
    ROMANTISM,
    REALISM;




    public static String toRussian(Style style) {
        String result = "";
        switch (style){
            case IMPRESSIONISM:
                result = "Импрессионизм";
                break;
            case EXPRESSIONISM:
                result = "Экспрессионизм";
                break;
            case CUBISM:
                result = "Кубизм";
                break;
            case MODERNISM:
                result = "Модернизм";
                break;
            case NEOCLASSICISM:
                result = "Неоклассицизм";
                break;
            case ROMANTISM:
                result = "Романтизм ";
                break;
            case REALISM:
                result = "Реализм";
                break;
        }
        return result;
    }
}


