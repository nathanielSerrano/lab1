package lab1;

public class myArrayList {
	private static final int INITIAL_CAPACITY = 50;
	private static final double GROWTH_RATE= 0.2;
	private Fraction[] list = null;
	private int size = INITIAL_CAPACITY;
	
	
	
	public myArrayList() {
		list = new Fraction[size];
    }

	public myArrayList(int n) {
		list = new Fraction[n];
	}
	
	
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
        for (int i = 0; i < size; i++) {
            if (data[i].hasSameValue(input)) {
                return true; // Found a matching fraction
            }
        }
        return false; // Fraction not found in the list
    }
	
	
	
}
