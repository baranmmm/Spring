package com.carpet;

import com.carpet.enums.City;
import com.carpet.services.Calculator;
import com.carpet.services.floor.Bedroom;
import com.carpet.services.states.CarpetVA;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class SpringLab01CarpetCalculatorApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ApplicationContext container = SpringApplication.run(SpringLab01CarpetCalculatorApplication.class, args);

		System.out.println("*****************WELCOME TO CARPET HEAVEN***************************");
		System.out.println("You can calculate your carpet price by choosing your options below");

		String state;
		while (true){
			System.out.println("Please choose your state(VA or TX): ");
			 state= sc.nextLine();
			if(state.equalsIgnoreCase("VA") || state.equalsIgnoreCase("TX")){
				break;
			}
			else {
				System.out.println("You entered a wrong value please type VA or TX");
			}
		}

		Bedroom bedroom = container.getBean("bedroom", Bedroom.class);
		System.out.println("bedroom.getArea() = " + bedroom.getArea());


	}

}
