package telukhin.task1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Factory {

    private Set workingPeople = new HashSet<Emploee>();

    public Factory(Set workingPeople) {
        this.workingPeople = workingPeople;
        Iterator iterator = workingPeople.iterator();
        while (iterator.hasNext()){

        }
    }
}
