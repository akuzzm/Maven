package com.telesens.academy.lesson12;

import java.util.Comparator;

public class ByKeyComparator implements Comparator<Entry> {
    @Override
    public int compare(Entry o1, Entry o2) {
//        return Long.compare(o1.getKey(), o2.getKey());
    if (o2.getKey() < o1.getKey())
        return -1;

    if (o2.getKey() > o1.getKey())
        return 1;

    else
        return 0;
    }
}
