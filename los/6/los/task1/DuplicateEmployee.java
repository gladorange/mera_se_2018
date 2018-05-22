package los.task1;

public class DuplicateEmployee extends Exception
{
    @Override
    public String toString()
    {
        return "Ошибка: с такими введенными данными сотрудник уже существует";
    }
}
