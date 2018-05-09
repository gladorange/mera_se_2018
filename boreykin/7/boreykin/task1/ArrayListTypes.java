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
public class ArrayListTypes 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        final int ELEMENT_NUMBER = 300000;
        
        TimeMeasuredArrayList<String> alString;
        TimeMeasuredArrayList<Integer> alInt;
        TimeMeasuredArrayList<Long> alLong;
        TimeMeasuredArrayList<Person> alPerson;
        
        String elementString;
        Integer elementInteger;
        Long elementLong;
        Person elementPerson;

        alString = new TimeMeasuredArrayList<>();
        alInt = new TimeMeasuredArrayList<>();
        alLong = new TimeMeasuredArrayList<>();
        alPerson = new TimeMeasuredArrayList<>();
        
        System.out.printf("Adding %d elements time:%n", ELEMENT_NUMBER);
        
        for(int baseValue = 0; baseValue < ELEMENT_NUMBER; ++baseValue)
        {
            elementInteger = baseValue;
            elementLong = elementInteger.longValue();
            elementString = elementInteger.toString();
            
            elementPerson = new Person();
            elementPerson.setFirstame(elementString);
            elementPerson.setLastName(elementString);
            
            alString.addElement(elementString);
            alInt.addElement(elementInteger);
            alLong.addElement(elementLong);
            alPerson.addElement(elementPerson);
        }
        
        System.out.printf(" String:  %.9f seconds%n", alString.getAccumulatedAddTime());
        System.out.printf(" Integer: %.9f seconds%n", alInt.getAccumulatedAddTime());
        System.out.printf(" Long:    %.9f seconds%n", alLong.getAccumulatedAddTime());
        System.out.printf(" Person:  %.9f seconds%n", alPerson.getAccumulatedAddTime());
        System.out.println("");
        
        // Make new element of each type but do not add any of them to collections
        elementInteger = ELEMENT_NUMBER + 1;
        elementLong = elementInteger.longValue();
        elementString = elementInteger.toString();
        elementPerson = new Person();
        elementPerson.setFirstame(elementString);
        elementPerson.setLastName(elementString);
        
        System.out.println("Finding first element:");
        
        alString.findFirstElement();
        alInt.findFirstElement();
        alLong.findFirstElement();
        alPerson.findFirstElement();
        
        System.out.printf(" String:  %.9f seconds%n", alString.getLastOperationTime());
        System.out.printf(" Integer: %.9f seconds%n", alInt.getLastOperationTime());
        System.out.printf(" Long:    %.9f seconds%n", alLong.getLastOperationTime());
        System.out.printf(" Person:  %.9f seconds%n", alPerson.getLastOperationTime());
        System.out.println("");
        
        System.out.println("Finding last element:");
        
        alString.findLastElement();
        alInt.findLastElement();
        alLong.findLastElement();
        alPerson.findLastElement();
        
        System.out.printf(" String:  %.9f seconds%n", alString.getLastOperationTime());
        System.out.printf(" Integer: %.9f seconds%n", alInt.getLastOperationTime());
        System.out.printf(" Long:    %.9f seconds%n", alLong.getLastOperationTime());
        System.out.printf(" Person:  %.9f seconds%n", alPerson.getLastOperationTime());
        System.out.println("");
        
        System.out.println("Finding non-existing element:");
        
        alString.hasElement(elementString);
        alInt.hasElement(elementInteger);
        alLong.hasElement(elementLong);
        alPerson.hasElement(elementPerson);
        
        System.out.printf(" String:  %.9f seconds%n", alString.getLastOperationTime());
        System.out.printf(" Integer: %.9f seconds%n", alInt.getLastOperationTime());
        System.out.printf(" Long:    %.9f seconds%n", alLong.getLastOperationTime());
        System.out.printf(" Person:  %.9f seconds%n", alPerson.getLastOperationTime());
    }
}
