package sixth;

import java.util.Comparator;

public class SortByValue implements Comparator<Thing> {
    @Override
    public int compare(Thing o1, Thing o2) {
        return o2.getValue() - o1.getValue();
    }
}
