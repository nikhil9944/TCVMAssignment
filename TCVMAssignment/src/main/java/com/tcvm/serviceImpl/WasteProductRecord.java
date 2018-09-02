package com.tcvm.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.tcvm.model.Container;



public class WasteProductRecord {

	List<Container> wasteProductList = new ArrayList();

	public void addWasteProductInList(Container product) {
		wasteProductList.add(product);
	}

}
 