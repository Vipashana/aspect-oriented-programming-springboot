package com.vipashana.learn_spring_aop.aopexample.business;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.vipashana.learn_spring_aop.aopexample.data.DataService2;

//Instead of @Component use @Service since its 
//Business Logic class
@Service
public class BusinessService2 {
	
	private DataService2 dataService2;
	
	public BusinessService2(DataService2 dataService2) {
		super();
		this.dataService2 = dataService2;
	}



	public int calcMin() {
		
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int[] data = dataService2.retrieveData();
		
		//throw new RuntimeException("Something Went Wrong");
		
		return Arrays.stream(data).min().orElse(0);
	}

}
