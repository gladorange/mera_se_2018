package los.task1;

public class AbsentManager extends Exception
{
    @Override
    public String toString()
    {
        return "Ошибка: необходимо задать менеджера для работника";
    }
}