package tcgwars.logic.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author axpendix@hotmail.com
 */
public class BenchSet extends PcsList {

	private final int benchSize;
	public BenchSet(int benchSize) {
		this.benchSize = benchSize;
		for (int i = 0; i < benchSize; i++) {
			super.add(null);
		}
	}

	@Override
	public void add(int index, PokemonCardSet element) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int size() {
		int count = 0;
		for (int i = 0; i < benchSize; i++) {
			PokemonCardSet bench = super.get(i);
			if (bench != null) {
				count++;
			}
		}
		return count;
	}

	@Override
	public Object[] toArray() {
		return getNonNullList().toArray();
	}

	public int getBenchSize() {
		return benchSize;
	}

	public int getBenchCount() {
		return size();
	}

	public int getFreeBenchCount() {
		return benchSize - size();
	}

	public boolean isFull() {
		return getFreeBenchCount() == 0;
	}

	public boolean isNotFull() {
		return !isFull();
	}

	@Override
	public boolean isEmpty() {
		return getNonNullList().isEmpty();
	}

	public boolean isNotEmpty(){
		return !isEmpty();
	}
	
	public boolean notEmpty(){
		return !isEmpty();
	}

	public int getFirstFreeIndex() {
		for (int i = 0; i < super.size(); i++) {
			PokemonCardSet bench = super.get(i);
			if (bench == null) {
				return i;
			}
		}
		return -1;
	}

	public int[] getFreeIndexes() {
		List<Integer> freeIntegers = new ArrayList<Integer>();
		for (int i = 0; i < benchSize; i++) {
			PokemonCardSet bench = super.get(i);
			if (bench == null) {
				freeIntegers.add(i);
			}
		}
		int[] arr = new int[freeIntegers.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = freeIntegers.get(i);
		}
		return arr;
	}

	public int[] getFullIndexes() {
		List<Integer> full = new ArrayList<Integer>();
		for (int i = 0; i < benchSize; i++) {
			PokemonCardSet bench = super.get(i);
			if (bench != null) {
				full.add(i);
			}
		}
		int[] arr = new int[full.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = full.get(i);
		}
		return arr;
	}

	public int getNextFreeIndex(int index) {
		int[] is = getFreeIndexes();
		for (int i = 0; i < is.length; i++) {
			if (index < is[i]) {
				return is[i];
			}
		}
		if (is.length >= 1) {
			return is[0];
		}
		return -1;
	}

	public PcsList getNonNullList(){
		PcsList list = new PcsList();
		for (PokemonCardSet bench : this) {
			list.add(bench);
		}
		return PcsList.unmodifiableList(list);
	}

	@Override
	public boolean add(PokemonCardSet e) {
		if (isFull()) {
			throw new IllegalStateException("Bench is full");
		}
		set(getFirstFreeIndex(), e);
		return true;
	}

	@Override
	public boolean remove(Object o) {
		if (o instanceof PokemonCardSet) {
			PokemonCardSet pcs = (PokemonCardSet) o;
			set(this.indexOf(pcs), null);
			return true;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public Iterator<PokemonCardSet> iterator() {
		return new Iterator<PokemonCardSet>() {
			int cursor = 0;
			int[] full = getFullIndexes();

			@Override
			public boolean hasNext() {
				return cursor < full.length;
			}

			@Override
			public PokemonCardSet next() {
				return get(full[cursor++]);
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}

}
