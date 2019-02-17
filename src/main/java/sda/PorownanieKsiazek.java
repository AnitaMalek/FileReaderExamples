package sda;

import java.util.Collections;
import java.util.Comparator;

public class PorownanieKsiazek implements Comparator<Books> {

    @Override
    public int compare(Books o1, Books o2) {
        if (o2.isInStock() && o1.isInStock()) {
            return Double.compare(o1.getPrice(), o2.getPrice());
        }
        return Boolean.compare(o2.isInStock(), o1.isInStock());
    }
    }

