package com.raj.testproj.dao;

import java.util.List;

import com.raj.testproj.model.Vehicle;

public interface ParkingLevelDataManager<T extends Vehicle>
{
	public int parkCar(T vehicle);
	
	public boolean leaveCar(int slotNumber);
	
	public List<String> getStatus();
	
	public List<String> getRegNumberForColor(String color);
	
	public List<Integer> getSlotNumbersFromColor(String colour);
	
	public int getSlotNoFromRegistrationNo(String registrationNo);
	
	public int getAvailableSlotsCount();
	
	public void doCleanUp();
}
