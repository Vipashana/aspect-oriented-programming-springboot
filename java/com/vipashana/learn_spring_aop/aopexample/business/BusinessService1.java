package com.vipashana.learn_spring_aop.aopexample.business;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.vipashana.learn_spring_aop.aopexample.data.DataService1;

//Instead of @Component use @Service since its 
//Business Logic class
@Service
public class BusinessService1 {
	
	private DataService1 dataService1;
	
	public BusinessService1(DataService1 dataService1) {
		super();
		this.dataService1 = dataService1;
	}



	public int calcMax() {
		
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int[] data = dataService1.retrieveData();
		
		//throw new RuntimeException("Something Went Wrong");
		
		return Arrays.stream(data).max().orElse(0);
	}

}
