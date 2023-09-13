package lab1;

public class myArrayList {
	public static final int INITIAL_CAPACITY = 50;
	
	
	
	
	
	public boolean add(Fraction input ) {
	  public boolean add(Fraction input) {
        if (list.size() >= capacity) {
            // If the list is full, calculate the new capacity based on the growth policy
            int newCapacity = (int) (capacity + capacity * growthPolicy);
            list.ensureCapacity(newCapacity);
            capacity = newCapacity;
        }
        
        return list.add(input);
    }

	
	public Fraction remove(Fraction input) {
		
		
	}
	
	public boolean contains(Fraction input) {
		
		
	}
	
}
