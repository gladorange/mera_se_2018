/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boreykin.task1;

import java.util.HashSet;

/**
 *
 * @author flyer
 */
public class Enterprise implements EnterpriseActions
{
    private HashSet<Employee> employees;
    private HashSet<String> departments;
    
    public Enterprise()
    {
        employees = new HashSet<>();
        departments = new HashSet<>();
    }

    @Override
    public boolean hireEmployee(String name, Manager manager) throws ForbiddenSymbols, DuplicateEmployee, NoManager
    {
        Worker w;
        
        try
        {
            w = new Worker(name, manager);
        }
        catch(WrongWordNumberInName e)
        {
            System.out.println("Failed to create a worker object: " + e);
            return false;
        }
        
        addEmployee(w);
        return true;
    }

    @Override
    public boolean hireEmployee(String name, String department) throws ForbiddenSymbols, DuplicateEmployee, DoubleManagement
    {
        Manager m;
        try 
        {
            m = new Manager(name,department);
        } 
        catch (WrongWordNumberInName e) 
        {
            System.out.println("Failed to create manager object: " + e);
            return false;
        }
        
        checkIfManagerCanBeSetFor(department);
        addEmployee(m);
        return true;
    }
    
    @Override
    public Worker getWorker(String name, Manager manager)
    {
        for(Employee emp:employees)
        {
            if((emp instanceof Worker)
            && (((Worker)emp).getFullName().equals(name))
            && (((Worker)emp).getManager().equals(manager)))
            {
                return (Worker)emp;
            }
        }
        
        return null;
    }
    
    @Override
    public Manager getManager(String name, String department)
    {
         for(Employee emp:employees)
        {
            if((emp instanceof Manager)
            && (((Manager)emp).getFullName().equals(name))
            && (((Manager)emp).getDepartment().equals(department)))
            {
                return (Manager)emp;
            }
        }
        
        return null;
    }

    @Override
    public void moveWorker(Worker w, Manager m) throws NoManager
    {
        if(null != m)
        {
            w.setManager(m);
        }
        else
        {
            throw new NoManager();
        }
    }

    @Override
    public void fireWorker(Worker w) 
    {
        if(null != w)
        {
           employees.remove(w);
        }
    }

    @Override
    public void moveManager(Manager m, String department) throws DoubleManagement
    {
        if(false == m.getDepartment().equals(department))
        {
            checkIfManagerCanBeSetFor(department);
            m.setDepartment(department);
        }
    }

    @Override
    public boolean fireManager(Manager m) 
    {
        if(null == m)
        {
            return false;
        }
        
        for(Employee em:employees)
        {
            if(em instanceof Worker)
            {
                if(((Worker)em).getManager().equals(m))
                {
                    // Removal of manager with at least one worker is not allowed
                    return false;
                }
            }
        }
        
        return true;
    }
    
    private void addEmployee(Employee emp) throws DuplicateEmployee
    {
        if (!employees.add(emp))
        {
            throw new DuplicateEmployee();
        }
    }
    
    private void checkIfManagerCanBeSetFor(String department) throws DoubleManagement
    {
        if((true == checkAndAddDepartment(department))
        && (true == isDepartmentRuledByAnyone(department)))
        {
            throw new DoubleManagement();
        }
       
    }

    /**
     * checkAndAddDepartment.
     * Checks if department is present in department list and adds it if not.
     * @param department - department name to be checked/added
     * @return - true if department exists in the list, otherwise returns false adding department to the list on the way. 
     */
    private boolean checkAndAddDepartment(String department)
    {
        if((null != department)
        && (false == "".equals(department)))
        {
            return !departments.add(department);
        }
        else
        {
            return false;
        }
    }
    
    private boolean isDepartmentRuledByAnyone(String department)
    {
        for(Employee em:employees)
        {
            if(em instanceof Manager)
            {
                if(((Manager)em).getDepartment().equals(department))
                {
                    return true;
                }
            }
        }
        
        return false;
    }
}
