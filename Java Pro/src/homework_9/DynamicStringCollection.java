package homework_9;

import java.util.Arrays;

public class DynamicStringCollection {
    private String[] array;
    private int size;

    public DynamicStringCollection() {
        array = new String[10];
        size = 0;
    }

    public boolean add(int index, String value) {
        if (index < 0 || index > size) {
            return false;
        }
        ensureCapacity();
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = value;
        size++;
        return true;
    }
    public boolean add(String value) {
        ensureCapacity();
        array[size] = value;
        size++;
        return true;
    }
    public boolean delete(int index) {
        if (index < 0 || index >= size) {
            return false;
        }
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[size - 1] = null; // Очистити останній елемент
        size--;
        return true;
    }
    public boolean delete(String value) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                return delete(i);
            }
        }
        return false;
    }
    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return array[index];
    }
    private void ensureCapacity() {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
}
