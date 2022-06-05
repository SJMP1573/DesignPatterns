package headfirst.designpatterns.iterator.iteratormenu;



/**
 * @author: sjmp1573
 * @date: 2022/6/5 11:53
 * @description:
 */

public class DinerMenuIterator implements Iterator {

    MenuItem[] items;

    int position =0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >=items.length || items[position] == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position = position+1;
        return menuItem;
    }
}
