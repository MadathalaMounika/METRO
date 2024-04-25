package com.srkr.metro;


	import java.util.*;

	public class CustomArrayList<E> {
	    private static final int DEFAULT_CAPACITY = 10;

	    private Object[] elements;
	    private int size;

	    public CustomArrayList() {
	        this(DEFAULT_CAPACITY);
	    }

	    public CustomArrayList(int capacity) {
	        elements = new Object[capacity];
	        size = 0;
	    }

	    public int size() {
	        return size;
	    }

	    public boolean isEmpty() {
	        return size == 0;
	    }

	    public void add(E element) {
	        if (size == elements.length) {
	            resize();
	        }
	        elements[size++] = element;
	    }

	    @SuppressWarnings("unchecked")
	    public E get(int index) {
	        if (index < 0 || index >= size) {
	            throw new IndexOutOfBoundsException("Index out of range: " + index);
	        }
	        return (E) elements[index];
	    }

	    public void remove(int index) {
	        if (index < 0 || index >= size) {
	            throw new IndexOutOfBoundsException("Index out of range: " + index);
	        }
	        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
	        elements[--size] = null; // to allow garbage collection
	    }

	    private void resize() {
	        int newCapacity = elements.length * 2;
	        elements = Arrays.copyOf(elements, newCapacity);
	    }

	  
	}


