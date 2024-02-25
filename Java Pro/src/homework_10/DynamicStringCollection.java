package homework_10;

import java.util.Arrays;

public class DynamicStringCollection implements Collection {
    private String[] array;
    private int size;

    public DynamicStringCollection() {
        array = new String[10];
        size = 0;
    }

    @Override
    public boolean add(String o) {
        ensureCapacity();
        array[size] = o;
        size++;
        return true;
    }

    @Override
    public boolean add(int index, String o) {
        if (index < 0 || index > size) {
            return false;
        }
        ensureCapacity();
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = o;
        size++;
        return true;
    }

    @Override
    public boolean delete(String o) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)) {
                System.arraycopy(array, i + 1, array, i, size - i - 1);
                array[size - 1] = null; // Очистити останній елемент
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return array[index];
    }

    @Override
    public boolean contain(String o) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Collection collection) {
        if (this.size != collection.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!this.get(i).equals(collection.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean clear() {
        Arrays.fill(array, 0, size, null);
        size = 0;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
    }
}
