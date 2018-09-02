package com.tcvm.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.tcvm.model.Container;


public class ContainerController { 

	static Container container;

	public Container getContainerInstance() throws IOException {
		Map<String, Integer> containerData = createContainerData();
 
		if (container == null) {
			container = new Container(containerData.get("teaContainer"),
					containerData.get("coffeeContainer"), containerData.get("sugarContainer"),
					containerData.get("waterContainer"), containerData.get("milkContainer"));
		}
		return container;

	}

	public Map createContainerData() {
		Map<String, Integer> containerData = new HashMap<String, Integer>();
		containerData.put("teaContainer", 2000);
		containerData.put("coffeeContainer", 2000);
		containerData.put("sugarContainer", 8000);
		containerData.put("waterContainer", 15000);
		containerData.put("milkContainer", 10000);

		return containerData;
	}
 
}
