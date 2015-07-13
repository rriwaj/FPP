package q2;

class MyHashSet {
	private final static int CAPACITY = 50;
	MySet[] set;
	private int count = 0;

	public MyHashSet() {
		set = new MySet[CAPACITY];
		for (int i = 0; i < CAPACITY; i++)
			set[i] = null;
	}

	public String get(String key) {
		// compute hash
		int hash = (Math.abs(key.hashCode()) % CAPACITY);
		// find the position of key
		while (set[hash] != null && !set[hash].key.equalsIgnoreCase(key))
			hash = (hash + 1) % CAPACITY;
		if (set[hash] == null) // key not found
			return null;
		else
			return set[hash].key; // return value

	}

	public String remove(String key) {
		String ret = null;
		// compute hash
		int hash = (Math.abs(key.hashCode()) % CAPACITY);
		// find the position of key
		while (set[hash] != null && !set[hash].key.equalsIgnoreCase(key))
			hash = (hash + 1) % CAPACITY;
		if (set[hash] == null) // key not found
			return null;
		else
			ret = set[hash].key;
		set[hash] = null;
		return ret;

	}

	public boolean find(String key) {

		// compute hash of given key
		int hash = (Math.abs(key.hashCode()) % CAPACITY);
		// find location until hash of key is matched
		while (set[hash] != null && !set[hash].key.equalsIgnoreCase(key)) {
			hash = (hash + 1) % CAPACITY;
		}

		if (set[hash] == null) // key not found
			return false;
		else
			return true;

	}

	public boolean add(String key) {
		// compute hash
		int hash = (Math.abs(key.hashCode()) % CAPACITY);
		// check if index is occupied
		// if occupied compute next hash
		while (set[hash] != null && !set[hash].key.equals(key)) {
			hash = (hash + 1) % CAPACITY;
		}
		set[hash] = new MySet(key); // add element into new hash
		count++;
		return true;

	}

	public int size() {
		return count;
	}

	public void show() {
		for (int i = 0; i < set.length; i++) {
			if (set[i] != null) {
				String key = set[i].key;
				System.out.println(key);				
			}
		}
		System.out.println("");
	}

	private class MySet {
		String key;

		public MySet(String key) {
			this.key = key;
		}
	}

}