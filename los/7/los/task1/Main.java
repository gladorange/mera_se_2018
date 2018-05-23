package los.task1;

public class Main {
    public static void main(String[] args)
    {
        final int ELEMENTS_NUMBER = 900000;

        TimeMeasurementArrayList<String> arrayListString = new TimeMeasurementArrayList<>();
        TimeMeasurementArrayList<Integer> arrayListInteger = new TimeMeasurementArrayList<>();
        TimeMeasurementArrayList<Long> arrayListLong = new TimeMeasurementArrayList<>();
        TimeMeasurementArrayList<Person> arrayListPerson = new TimeMeasurementArrayList<>();

        timeMeasurementAddingElements(arrayListString, arrayListInteger, arrayListLong, arrayListPerson, ELEMENTS_NUMBER);
        timeMeasurementFindingFirstElement(arrayListString, arrayListInteger, arrayListLong, arrayListPerson);
        timeMeasurementFindingLastElement(arrayListString, arrayListInteger, arrayListLong, arrayListPerson);
        timeMeasurementFindingNonExistingElement(arrayListString, arrayListInteger, arrayListLong, arrayListPerson, ELEMENTS_NUMBER);
    }

    public static void timeMeasurementAddingElements(TimeMeasurementArrayList<String> arrayListString,
                                                     TimeMeasurementArrayList<Integer> arrayListInteger,
                                                     TimeMeasurementArrayList<Long> arrayListLong,
                                                     TimeMeasurementArrayList<Person> arrayListPerson,
                                                     final int ELEMENTS_NUMBER)
    {
        String elementString;
        Integer elementInteger;
        Long elementLong;
        Person elementPerson;

        System.out.printf("Time measurement for adding %d elements into ArrayList %n", ELEMENTS_NUMBER);

        for(int baseValue = 0; baseValue < ELEMENTS_NUMBER; ++baseValue)
        {
            elementInteger = baseValue;
            elementLong = elementInteger.longValue();
            elementString = elementInteger.toString();

            elementPerson = new Person();
            elementPerson.setName(elementString);
            elementPerson.setSurname(elementString);
            elementPerson.setYearBirthday(elementInteger);
            elementPerson.setCountry(elementString);

            arrayListString.addElement(elementString);
            arrayListInteger.addElement(elementInteger);
            arrayListLong.addElement(elementLong);
            arrayListPerson.addElement(elementPerson);
        }

        System.out.printf(" Strings were added:  %.10f seconds %n", arrayListString.getAccumulatedAddTime());
        System.out.printf(" Integers were added: %.10f seconds %n", arrayListInteger.getAccumulatedAddTime());
        System.out.printf(" Longs were added:    %.10f seconds %n", arrayListLong.getAccumulatedAddTime());
        System.out.printf(" Persons were added:  %.10f seconds %n%n", arrayListPerson.getAccumulatedAddTime());
    }

    public static void timeMeasurementFindingFirstElement(TimeMeasurementArrayList<String> arrayListString,
                                                          TimeMeasurementArrayList<Integer> arrayListInteger,
                                                          TimeMeasurementArrayList<Long> arrayListLong,
                                                          TimeMeasurementArrayList<Person> arrayListPerson)
    {
        System.out.println("Time measurement for finding first element in ArrayList:");

        arrayListString.findFirstElement();
        arrayListInteger.findFirstElement();
        arrayListLong.findFirstElement();
        arrayListPerson.findFirstElement();

        System.out.printf(" String was found for:  %.10f seconds %n", arrayListString.getLastOperationTime());
        System.out.printf(" Integer was found for: %.10f seconds %n", arrayListInteger.getLastOperationTime());
        System.out.printf(" Long was found for:    %.10f seconds %n", arrayListLong.getLastOperationTime());
        System.out.printf(" Person was found for:  %.10f seconds %n%n", arrayListPerson.getLastOperationTime());
    }

    public static void timeMeasurementFindingLastElement(TimeMeasurementArrayList<String> arrayListString,
                                                         TimeMeasurementArrayList<Integer> arrayListInteger,
                                                         TimeMeasurementArrayList<Long> arrayListLong,
                                                         TimeMeasurementArrayList<Person> arrayListPerson)
    {
        System.out.println("Time measurement for finding last element in ArrayList:");

        arrayListString.findLastElement();
        arrayListInteger.findLastElement();
        arrayListLong.findLastElement();
        arrayListPerson.findLastElement();

        System.out.printf(" String was found for:  %.10f seconds %n", arrayListString.getLastOperationTime());
        System.out.printf(" Integer was found for: %.10f seconds %n", arrayListInteger.getLastOperationTime());
        System.out.printf(" Long was found for:    %.10f seconds %n", arrayListLong.getLastOperationTime());
        System.out.printf(" Person was found for:  %.10f seconds %n%n", arrayListPerson.getLastOperationTime());
    }

    public static void timeMeasurementFindingNonExistingElement(TimeMeasurementArrayList<String> arrayListString,
                                                                TimeMeasurementArrayList<Integer> arrayListInteger,
                                                                TimeMeasurementArrayList<Long> arrayListLong,
                                                                TimeMeasurementArrayList<Person> arrayListPerson,
                                                                final int ELEMENTS_NUMBER)
    {
        String elementString;
        Integer elementInteger;
        Long elementLong;
        Person elementPerson;

        // Creating non existed elements
        elementInteger = ELEMENTS_NUMBER + 1;
        elementLong = elementInteger.longValue();
        elementString = elementInteger.toString();
        elementPerson = new Person();
        elementPerson.setName(elementString);
        elementPerson.setSurname(elementString);
        elementPerson.setYearBirthday(elementInteger);
        elementPerson.setCountry(elementString);

        System.out.println("Time measurement for finding non-existing element in ArrayList:");

        arrayListString.hasElement(elementString);
        arrayListInteger.hasElement(elementInteger);
        arrayListLong.hasElement(elementLong);
        arrayListPerson.hasElement(elementPerson);

        System.out.printf(" Finding for String:  %.10f seconds %n", arrayListString.getLastOperationTime());
        System.out.printf(" Finding for Integer: %.10f seconds %n", arrayListInteger.getLastOperationTime());
        System.out.printf(" Finding for Long:    %.10f seconds %n", arrayListLong.getLastOperationTime());
        System.out.printf(" Finding for Person:  %.10f seconds %n%n", arrayListPerson.getLastOperationTime());
    }
}

