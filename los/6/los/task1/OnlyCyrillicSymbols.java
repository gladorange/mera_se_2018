package los.task1;

public class OnlyCyrillicSymbols extends Exception
{
    @Override
    public String toString()
    {
        return "Ошибка: фамилия сотрудника должна содержать только символы кириллицы";
    }
}