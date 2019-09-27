package com.exercise.ch10.innerclass;

import static net.mindview.util.Print.print;

class Sequence3 {
	private Object[] items;
	private int next = 0;

	public Sequence3(int size) {
		items = new Object[size];
	}

	public void add(Object x) {
		if (next < items.length)
			items[next++] = x;
	}

	private class SequenceSelector implements Selector {
		private int i = 0;

		public boolean end() {
			return i == items.length;
		}

		public Object current() {
			return Sequence3.this;
		}

		public void next() {
			if (i < items.length)
				i++;
		}

		// public Sequence3 getSequence3() {
		// return Sequence3.this;
		// }
	}

	public Selector selector() {
		return new SequenceSelector();
	}

}

public class Exe04 {
	public static void main(String[] args) {
		Sequence3 sequence = new Sequence3(2);

		for (int i = 0; i < 10; i++)
			sequence.add(Integer.toString(i));
		Selector selector = sequence.selector();
		while (!selector.end()) {

			print(selector.current() + " ");
			selector.next();

		}
	}
}
