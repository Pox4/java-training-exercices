package io.robusta.java.classic;

/**
 * Created by nicorama on 22/06/2017.
 */
public class FoodApp {

	static final int TRAVEL_COST = 2;

	int money = 0;
	int foodStock = 1000;

	void reset() {

		money = 0;
		foodStock = 1000;

	}

	int deliver(int food) {

		int gross = food * 2;

		money = money + gross - TRAVEL_COST;

		foodStock = foodStock - food;

		return gross;
	}

	int deliverAll(int count, int food) {

		int value = count * food * 2;

		money = money + value - TRAVEL_COST * count;

		return value;
	}

}
