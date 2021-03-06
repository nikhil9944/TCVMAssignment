package com.tcvm.controller;

import java.io.IOException;

import com.tcvm.Makeimpl.MakeBlackCoffee;
import com.tcvm.Makeimpl.MakeBlackTea;
import com.tcvm.Makeimpl.MakeCoffee;
import com.tcvm.Makeimpl.MakeTea;
import com.tcvm.serviceImpl.BlackCoffeeAvailability;
import com.tcvm.serviceImpl.BlackTeaAvailability;
import com.tcvm.serviceImpl.CheckTotalSale;
import com.tcvm.serviceImpl.CoffeeAvailability;
import com.tcvm.serviceImpl.ContainerStatus;
import com.tcvm.serviceImpl.InputScanner;
import com.tcvm.serviceImpl.RefillContainer;
import com.tcvm.serviceImpl.ResetContainer;
import com.tcvm.serviceImpl.TeaAvailability;
import com.tcvm.services.TCVMMakingDrink;





public class TCVMControllerMenu {

	InputScanner inputScanner;

	TCVMMakingDrink makeDrink;

	RefillContainer refillContainer;
	MakeTea makeTea;
	MakeCoffee makeCoffee;
	MakeBlackTea makeBlackTea;
	MakeBlackCoffee makeBlackCoffee;

	CheckTotalSale checkTotalSale;

	ContainerStatus containerStatus;

	ResetContainer resetContainer;
	TeaAvailability teaAvailability;
	CoffeeAvailability coffeeAvailability;
	BlackTeaAvailability blackTeaAvailability;
	BlackCoffeeAvailability blackCoffeeAvailability;

	public TCVMControllerMenu() {

		inputScanner = new InputScanner();

		makeTea = new MakeTea();
		makeCoffee = new MakeCoffee();
		makeBlackTea = new MakeBlackTea();
		makeBlackCoffee = new MakeBlackCoffee();

		refillContainer = new RefillContainer();

		checkTotalSale = new CheckTotalSale();

		containerStatus = new ContainerStatus();

		resetContainer = new ResetContainer();
		teaAvailability = new TeaAvailability();
		coffeeAvailability = new CoffeeAvailability();
		blackTeaAvailability = new BlackTeaAvailability();
		blackCoffeeAvailability = new BlackCoffeeAvailability();

	}

	public TCVMControllerMenu(InputScanner inputScanner, TCVMMakingDrink makeDrink, RefillContainer refillContainer,
			CheckTotalSale checkTotalSale, ContainerStatus containerStatus, ResetContainer resetContainer,
			TeaAvailability teaAvailability, CoffeeAvailability coffeeAvailability,
			BlackTeaAvailability blackTeaAvailability, BlackCoffeeAvailability blackCoffeeAvailability, MakeTea makeTea,
			MakeCoffee makeCoffee, MakeBlackTea makeBlackTea, MakeBlackCoffee makeBlackCoffee) {

		super();
		this.inputScanner = inputScanner;
		this.makeDrink = makeDrink;
		this.refillContainer = refillContainer;
		this.checkTotalSale = checkTotalSale;
		this.containerStatus = containerStatus;
		this.resetContainer = resetContainer;
		this.teaAvailability = teaAvailability;
		this.coffeeAvailability = coffeeAvailability;
		this.blackTeaAvailability = blackTeaAvailability;
		this.blackCoffeeAvailability = blackCoffeeAvailability;
		this.makeTea = makeTea;
		this.makeCoffee = makeCoffee;
		this.makeBlackTea = makeBlackTea;
		this.makeBlackCoffee = makeBlackCoffee;

	}

	public int getQuantity() {

		return inputScanner.nextInt();
	}

	public void repeatMenu() {
		int i = inputScanner.nextInt();
		if (i == 0)
			viewMenu();
	}

	public void chooseAnyOptions() throws IOException {

		viewMenu();
		int inputChoice = inputScanner.nextInt();

		switch (inputChoice) {

		case 1:
			System.out.println("You are selecting Tea");
			System.out.println("Please Enter Quantity");
			Integer quantity1 = getQuantity();
			if (!teaAvailability.checkAvailabilityForDrink(quantity1)) {
				System.out.println("NO ENOUGH MATERIAL AVAILABLE..");
				System.out.println("Press 0 for main menu");
				if (getQuantity() == 0)
					viewMenu();
			} else {
				makeDrink.makeProcess(quantity1);
				System.out.println("Press 0 for main menu");
				if (getQuantity() == 0)
					viewMenu();
			}

			break;
		case 2:
			System.out.println("You are selecting Coffee");
			System.out.println("Please Enter Quantity");
			Integer quantity2 = getQuantity();
			if (!coffeeAvailability.checkAvailabilityForDrink(quantity2)) {
				System.out.println("NO ENOUGH MATERIAL AVAILABLE..");
				System.out.println("Press 0 for main menu");
				if (getQuantity() == 0)
					viewMenu();
			} else {
				makeDrink.makeProcess(quantity2);
				System.out.println("Press 0 for main menu");
				if (getQuantity() == 0)
					viewMenu();
			}

			break;

		case 3:
			System.out.println("You are selecting black Tea");
			System.out.println("Please Enter Quantity");
			Integer quantity3 = getQuantity();
			if (!blackTeaAvailability.checkAvailabilityForDrink(quantity3)) {
				System.out.println("NO ENOUGH MATERIAL AVAILABLE..");
				System.out.println("Press 0 for main menu");
				if (getQuantity() == 0)
					viewMenu();
			} else {
				makeDrink.makeProcess(quantity3);
				System.out.println("Press 0 for main menu");
				if (getQuantity() == 0)
					viewMenu();
			}
			break;

		case 4:
			System.out.println("You are selecting Black coffee");
			System.out.println("Please Enter Quantity");
			Integer quantity4 = getQuantity();
			if (!blackCoffeeAvailability.checkAvailabilityForDrink(quantity4)) {
				System.out.println("NO ENOUGH MATERIAL AVAILABLE..");
				System.out.println("Press 0 for main menu");
				if (getQuantity() == 0)
					viewMenu();
			} else {

				makeDrink.makeProcess(quantity4);
				System.out.println("Press 0 for main menu");
				if (getQuantity() == 0)
					viewMenu();
			}
			break;

		case 5:
			System.out.println("Refilling Container.....");

			System.out.println("Enter the below Option to refill Container :" + "\n " + "1 For Tea " + "\n"
					+ "2 For Coffee " + "\n" + "3 For Sugar " + "\n" + "4 For Milk " + "\n" + "5 For Water ");

			refillContainer.refillContainer(getQuantity());
			System.out.println("Press 0 for main menu");
			/*
			 * if (getQuantity() == 0) viewMenu();
			 */
			repeatMenu();
			break;

		case 6:
			System.out.println("Check Total Sale....");
			checkTotalSale.productTotalSale();
			System.out.println("Press 0 for main menu");
			// int inputScanner.nextInt();
			/*
			 * if (getQuantity() == 0) viewMenu();
			 */
			repeatMenu();

			break;

		case 7:
			System.out.println("Container Status");
			containerStatus.showContainerStatus();
			System.out.println("Press 0 for main menu");
			if (getQuantity() == 0)
				viewMenu();

			break;

		case 8:
			System.out.println("Reset Container");
			resetContainer.resetContainer();
			System.out.println("Press 0 for main menu");
			if (getQuantity() == 0)
				viewMenu();

			break;

		case 9:
			System.out.println("exited from the system");

			break;

		default:
			System.out.println("Please select valid input choice");
			chooseAnyOptions();
			break;
		}

	}

	public void viewMenu() {
		System.out.println("Please select option from the following:");
		System.out.println(
				"1. Tea \n2. Coffee \n3. Black Tea \n4. Black Coffee \n5. Refill Container \n6. Check Total Sale \n7. Container Status \n8. Reset Container \n 9.Exit TCVM");

	}

}
