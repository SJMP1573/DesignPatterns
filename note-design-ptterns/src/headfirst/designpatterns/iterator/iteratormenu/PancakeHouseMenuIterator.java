package headfirst.designpatterns.iterator.iteratormenu;

import java.util.List;

/**
 * @author: sjmp1573
 * @date: 2022/6/5 11:55
 * @description:
 */

public class PancakeHouseMenuIterator implements Iterator{

    List<MenuItem> items;

    public PancakeHouseMenuIterator(List<MenuItem> items) {
        this.items = items;
    }

    int position =0;

    @Override
    public boolean hasNext() {
        return items.size() > position;
    }

    @Override
    public Object next() {
        return items.get(position++);
    }
}
