package com.xworkz.xworkzapp.CitywardDTO;



public class Operation {

	public CityWardDTO[] citywarddtos;
	public int size;
	
	public Operation(int size){
		CityWardDTO[] CityWardDTO = new CityWardDTO[size];
		System.out.println("Operation object created");
	}
	
	public void addCityWardInfo(){
		if (citywarddtos !=null){
			System.out.println("Add the city ward information");
			
		}
	}
	
	public CityWardDTO[] searchCityByName(){
		System.out.println("Enter a name to be searched");
		
	}
		
		
		return citywarddtos;
		
	}
	public CityWardDTO displayAllCityWardDetails(){
		CityWardDTO citywardDTOs = null;
		System.out.println("Showing city Cityward details");
		for(int i=0; i<citywarddtos.length; i++){
			if(citywarddtos[i]!=null){
				citywardDTOs=citywarddtos[i];
				System.out.println(citywarddtos[i].getWardname());
			}else if(citywarddtos[i] ==null){
				System.out.println("City ward details is not available");
			}
		}
		System.out.println("end of showing city ward details");
		return citywardDTOs;
	}
	
	
	
	}
		
	
			
	

