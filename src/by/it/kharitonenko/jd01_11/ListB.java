package by.it.kharitonenko.jd01_11;

import java.util.*;

class ListB<T> implements List<T> {
    private T[] elements = (T[]) new Object[1];
    private int size = 0;

    @Override
    public String toString() {
        if (size == 0) {
            return "List is empty.";
        }
        StringBuilder strBuilder = new StringBuilder();
        String delimiter = "";
        strBuilder.append("[");
        for (int i = 0; i < size; i++) {
            strBuilder.append(delimiter).append(elements[i]);
            delimiter = ", ";
        }
        strBuilder.append("]");
        return strBuilder.toString();
    }

    @Override
    public boolean add(T element) {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, elements.length * 3 / 2 + 1);
        }
        elements[size++] = element;
        return true;
    }

    @Override
    public T remove(int index) {
        T prev = elements[index];
        System.arraycopy(elements, index + 1, elements, index, --size - index);
        return prev;
    }

    @Override
    public T get(int index) {
        return elements[index];
    }

    @Override
    public T set(int index, T element) {
        T prev = elements[index];
        elements[index] = element;
        return prev;
    }

    @Override
    public void add(int index, T element) {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, elements.length * 3 / 2 + 1);
        }
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
//        if (elements.length == size) {
//            elements = Arrays.copyOf(elements, elements.length + c.size());
//        }
        if (c.toArray().getClass() == this.elements.getClass()) {
            for (int i = 0; i < c.size(); i++) {
                this.add((T) c.toArray()[i]);
            }
            return true;
        }
        return false;
    }

    /* =========================DON'T NEED========================== */

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}