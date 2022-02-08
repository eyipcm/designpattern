package com.aypc.builder4.builders;

import com.aypc.builder4.cars.Type;
import com.aypc.builder4.components.Engine;
import com.aypc.builder4.components.Transmission;
import com.aypc.builder4.components.TripComputer;
import com.aypc.builder4.components.GPSNavigator;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
	    void setType(Type type);
	    void setSeats(int seats);
	    void setEngine(Engine engine);
	    void setTransmission(Transmission transmission);
	    void setTripComputer(TripComputer tripComputer);
	    void setGPSNavigator(GPSNavigator gpsNavigator);
}

