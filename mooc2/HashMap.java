public class HashMap<K, V> {
	
	private List<Pair<K, V>>[] values;
	private int firstFreeIndex;

	public HashMap() {
		this.values = new List[32];
		this.firstFreeIndex = 0;
	}

	public V get(K key) {
		// begin by calculating a hash value for the key
		// and using it to figure out which is the
		// relevant index of the internal array of the
		// hashmap.
		// 
		// Hash value is calculated with the hashCode method
		// that each object has.
		//
		// Then modulo is used for ensuring that the index
		// stays within the size boundaries of the internal
		// array.
		int hashValue = Math.abs(key.hashCode() % this.values.length);
		if (this.values[hashValue] == null) {
			return null;
		}

		List<Pair<K, V>> valuesAtIndex = this.values[hashValue];

		for (int i = 0; i < valuesAtIndex.size(); ++i) {
			if (valuesAtIndex.value(i).getKey().equals(key)) {
				return valuesAtIndex.value(i).getValue();
			}
		}

		return null;
	}
}
