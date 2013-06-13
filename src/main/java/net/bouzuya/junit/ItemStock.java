package net.bouzuya.junit;

import java.util.HashMap;
import java.util.Map;

public class ItemStock {
	private final Map<String, Integer> stock;

	public ItemStock() {
		super();
		stock = new HashMap<String, Integer>();
	}

	public int getNum(Item item) {
		if (!stock.containsKey(item.getName())) {
			return 0;
		}
		Integer num = stock.get(item.getName());
		return num.intValue();
	}

	public void add(Item item) {
		String key = item.getName();
		Integer value = stock.get(key);
		Integer curNum = value != null ? value : Integer.valueOf(0);
		Integer newNum = Integer.valueOf(curNum.intValue() + 1);
		stock.put(key, newNum);
	}

}
