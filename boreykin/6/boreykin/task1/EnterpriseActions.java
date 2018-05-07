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
public interface EnterpriseActions 
{
    /**
     * hireWorker. Creates new worker object. Manager reference should be set to
     * caller.
     *
     * @param name - worker name in format "FirstName SecondName LastName".
     * SecondName is an optional parameter tthe rest ones are mandatory.
     * @param manager - manager the worker reports to.
     * @return - shows of worker has been added successfully
     * @throws boreykin.task1.ForbiddenSymbols
     * @throws DuplicateEmployee
     * @throws boreykin.task1.NoManager
     */
    public boolean hireEmployee(String name, Manager manager) throws ForbiddenSymbols, DuplicateEmployee, NoManager;

    /**
     * hireEmployee. Adds manager.
     * 
     * @param name - manager name in format "FirstName SecondName LastName".
     * SecondName is an optional parameter tthe rest ones are mandatory.
     * @param department - department the manager responsible for.
     * @return - shows if manager has been added successfully
     * @throws boreykin.task1.ForbiddenSymbols
     * @throws DuplicateEmployee
     * @throws DoubleManagement
     */
    public boolean hireEmployee(String name, String department) throws ForbiddenSymbols, DuplicateEmployee, DoubleManagement;

    /**
     * getWorker.
     * Gets worker object using full name and manager
     * @param name - full name.
     * @param manager - manager worker reports to.
     * @return worker object or null.
     */
    public Worker getWorker(String name, Manager manager);

    /**
     * getManager.
     * Gets  manager object using full name and department
     * @param name - full name.
     * @param department - department manager is responsible for.
     * @return manager object or null.
     */
    public Manager getManager(String name, String department);

    /**
     * moveWorker. Move worker to another manager.
     *
     * @param w - worker to move.
     * @param m - manager to move the worker to.
     * @throws boreykin.task1.NoManager
     */
    public void moveWorker(Worker w, Manager m) throws NoManager;

    /**
     * fireWorker. Fires worker.
     *
     * @param w - Worker object
     */
    public void fireWorker(Worker w);

    /**
     * moveManager.
     * Assigns manager to another department or to empty one.
     * @param m - manager to reassign
     * @param department - department to reassign the manager to
     * @throws DoubleManagement
     */
    public void moveManager(Manager m, String department) throws DoubleManagement;

    /**
     * fireManager. Removes manager.
     * 
     * @param m - manager to remove.
     * @return - shows if manager object has been removed.
     */
    public boolean fireManager(Manager m);
}
