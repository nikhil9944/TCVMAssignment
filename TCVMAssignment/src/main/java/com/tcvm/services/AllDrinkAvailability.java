package com.tcvm.services;

import java.io.IOException;

public interface AllDrinkAvailability {
	public boolean checkAvailabilityForDrink(int quantity) throws IOException;

}
