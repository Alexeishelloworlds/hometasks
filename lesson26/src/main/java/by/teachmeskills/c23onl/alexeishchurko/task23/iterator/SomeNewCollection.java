package by.teachmeskills.c23onl.alexeishchurko.task23.iterator;

public class SomeNewCollection implements Iterable {

    String[] collection = new String[]{"element1", "element2", "element3"};

    @Override
    public Iterator getIterator() {
        return null;
    }

    private class IteratorOfNewCollection implements Iterator {

        private int i = 0;

        @Override
        public boolean hasNext() {
            if (i < collection.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return collection[i++];
        }
    }
}
