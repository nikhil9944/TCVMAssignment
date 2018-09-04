package com.tcvm.serviceImpl;

import java.io.IOException;

import com.tcvm.controller.ContainerController;
import com.tcvm.model.Container;



public class ResetContainer {
 
	public boolean resetContainer() throws IOException {
		Container container = new ContainerController().getContainerInstance();

		container.setTeaContainer(2000);
		container.setCoffeeContainer(2000);
		container.setMilkContainer(10000);
		container.setWaterContainer(15000);
		container.setSugarContainer(8000);

		return true;
		
	}

}
