package los.task1;

import java.util.Objects;

public class Worker extends Employee
{
    private Manager reportsTo;

    public Worker(String name, String patronymic, String surname, Manager reportsTo) throws OnlyCyrillicSymbols, AbsentManager
    {
        super(name, patronymic, surname);
        if(null != reportsTo)
        {
            this.reportsTo = reportsTo;
        }
        else
        {
            throw new AbsentManager();
        }
    }

    @Override
    public int hashCode()
    {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.reportsTo);
        return hash;
    }
}