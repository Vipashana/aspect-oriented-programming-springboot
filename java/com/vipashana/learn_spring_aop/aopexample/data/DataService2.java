package com.vipashana.learn_spring_aop.aopexample.data;

import org.springframework.stereotype.Repository;

//Since this is Data layer use @Repository 
//instead of  @Component
@Repository
public class DataService2 {

	public int[] retrieveData() {
		
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new int[] {111,132,13,1415};
	}
	
}
