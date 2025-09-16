package lab6.prob1;

import java.util.Arrays;

public class MyStringList {
	private final int INITIAL_LENGTH = 4;
	private String[] strArray;
	private int size;

	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}

    // Assignment section start
    public int indexOf(String s){
        if(!s.isEmpty())
            for(int i = 0; i < this.size; i++){
                if(strArray[i].equals(s)) return i;
            }
        return -1;
    }

    public String removeAt(int index){
        if(index < 0 || index > this.size - 1) return  null;

        String res = this.strArray[index];
        for(int i = index + 1; i < this.size; i++){
            this.strArray[i - 1] = this.strArray[i];
        }
        this.strArray[this.size - 1] = null;
        this.size--;
        return res;
    }

    public void clear(){
        for(int i = 0; i < this.size; i++){
            this.strArray[i] = null;
        }
        this.size = 0;
    }

    public String set(int index, String s){
        if(index < 0 || index > this.size -1) return null;
        String old = this.strArray[index];
        this.strArray[index] = s;
        return old;
    }

    public boolean containsAll(MyStringList other){
        if(other == null || other.size == 0 || this.strArray == null || this.size == 0) return false;

        for(String _other : other.strArray){
            boolean isFound = false;
            for(int i = 0; i < size; i++){
                if(this.strArray[i].equals(_other)){
                    isFound = true;
                    break;
                }
            }
            if(!isFound) return false;
        }

        return true;
    }

    public MyStringList subList(int start, int end){
        MyStringList answer = new MyStringList();
        if(start >= end || start < 0 || end > this.size - 1) return answer;
        for(int i = start; i < end; i++){
            answer.add(this.strArray[i]);
        }
        return  answer;
    }

	// Add an element in last
	public void add(String s) {
		 if(s==null) return;// throw new NullPointerException();
		 //Check for Array is Full
		 if (size == strArray.length)
			resize(); // Array is full
		// Add at the end of the list.
		strArray[size] = s;
		size++; // Increment index to insert the new elements
		// strArray[size++] = s;
	}

	public String get(int i) {
		if (i < 0 || i > size - 1) {
			// throw new IndexOutOfBoundsException("Invalid index i" + i);
			return null;
		}
		return strArray[i];
	}

	public boolean find(String s) {
		if (s == null)
			return false;
		for (int i = 0; i < size; i++)// for (String test: strArray)
		{
			if (s.equals(strArray[i]))
				return true;

		}
		return false; // The element is not in the list
	}

	/* 1. Using System.arrayopy()
	  public void insert(String s, int pos){
	     if(pos > size-1 || pos<0 )
	         return;//allowed to add 0 to size-1
	  if(s==null) return;
	  if(pos == strArray.length) {
	      resize();
	   }
	  String[] temp = new String[strArray.length];
	   System.arraycopy(strArray,0,temp,0,pos); // src, spos,des,dspos,number of elements temp[pos] = s;
	    temp[pos] = s;
	  System.arraycopy(strArray,pos,temp,pos+1, strArray.length - pos);// count =size - pos

	  strArray = temp;
	  ++size;
	   }
	 */
	/* 2. Without Temp array
	// Shift elements to the right to make space for the new element
        for (int i = size; i > pos; i--) {
            array[i] = array[i - 1];
        }
        // Insert the new element
        array[pos] = s;
        size++;
    }

	 */
	// can insert the elements 0 to size position
	public void insert(String s, int pos) {
		if (pos < 0 || pos > size)
			return;
		// If the array gets full
		if (size == strArray.length) {
			resize();
		}
		String[] temp = new String[strArray.length];

		for (int i = 0; i < pos; i++)
			temp[i] = strArray[i];
		temp[pos] = s;

		for (int i = pos + 1; i < size; i++)
			temp[i] = strArray[i - 1];

		strArray = temp;
		++size;
	}

	public boolean remove(String s) {
		if (size == 0)
			return false; // the list is empty
		if (s == null)
			return false;
		int index = -1;
		for (int i = 0; i < size; ++i) {
			if (strArray[i].equals(s)) {
				index = i;
				break;
			}
		}
		if (index == -1)
			return false; // s is not found in the list
		String[] temp = new String[strArray.length];
		System.arraycopy(strArray, 0, temp, 0, index);
		System.arraycopy(strArray, index + 1, temp, index,
				strArray.length - (index + 1));
		strArray = temp;
		--size;
		return true;
	}

	private void resize() {
		System.out.println("resizing");
		int len = strArray.length;// Original array length
		int newlen = 2 * len; // Twice the original length
		// String[] temp = new String[newlen];
		// System.arraycopy(strArray,0,temp,0,len);
		// strArray = temp;
		strArray = Arrays.copyOf(strArray, newlen);

	}

	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size; ++i) {
			sb.append(strArray[i] + (i == size - 1 ? "" : ", "));
		}
		sb.append("]");
		return sb.toString();
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		/*
		 * if(size==0) return false; else return true;
		 */
		return (size == 0);
	}
	
	public static void main(String[] args) {
		MyStringList l = new MyStringList();
		l.add("Bob");
		l.add("Steve");
		l.add("Susan");
		l.add("Mark");
		l.insert("Renuka", 4); // Position reached the length
		l.insert("Mohanraj", 5); // Position reached the length
		System.out.println(l);
		//l.add("Dave");
		//System.out.println("The list of size " + l.size() + " is " + l);
		//l.remove("Mark");
		//l.remove("Bob");
		//System.out.println("The list of size " + l.size() + " is " + l);
		//l.insert("Richard", 3);
		//System.out.println("The list of size " + l.size() + " after inserting Richard into pos 3 is " + l);
		//l.insert("Tonya", 0);
		//System.out.println("The list of size " + l.size() + " after inserting Tonya into pos 0 is " + l);
		//System.out.println(l.find("Susan"));
		// String[] x = (String[]) l.clone();
		// System.out.println(Arrays.toString(x));

        System.out.println(l.indexOf("Bob"));

        System.out.println("RemoveAt: " + l.removeAt(0));

        System.out.println("set: " + l.set(1, "Set"));

        System.out.println("Contains all: " + l.containsAll(new MyStringList(){
            {
                add("Susan");
                add("Mark");
            }
        }));

        System.out.println("subList: " + l.subList(1,4));

        System.out.println(l);

        System.out.println("clearing...");
        l.clear();

        System.out.println(l);

	}
}
