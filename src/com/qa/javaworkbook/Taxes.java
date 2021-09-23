package com.qa.javaworkbook;

public class Taxes {
	private int salary;

	public Taxes(int salary) {
		super();
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void taxAmount() {
		if (getSalary() >= 45000) {
			System.out.println("25%");
		}
		else if (getSalary() >= 30000 && getSalary() <= 44999) {
			System.out.println("20%");
		}
		else if (getSalary() >= 20000 && getSalary() <= 29999) {
			System.out.println("15%");
		}
		else if (getSalary() >= 15000 && getSalary() <= 20000) {
			System.out.println("10%");
		}
		else {
			System.out.println("0%");
		}
	}
	
	public void preciseTax() {
		double x = getSalary();
		double total = 0;
		for(int i = 5; i > 0; i-- ) {
			if(x >= 45000) {
				double taxable = (x - 45000) *0.25;
				total = total + taxable;
				System.out.println(x - 45000 + " Taxed at 25%");
				x = 44999;
				i--;
			}
			if(x >= 30000 && x <= 44999) {
				double taxable = (x - 30000) *0.20;
				total = total + taxable;
				System.out.println(x - 30000 + " Taxed at 20%");
				x = 29999;
				i--;
			}
			if(x >= 20000 && x <= 29999) {
				double taxable = (x - 20000) *0.15;
				total = total + taxable;
				System.out.println(x - 20000 + " Taxed at 15%");
				x = 19999;
				i--;
			}
			if(x >= 15000 && x <= 19999) {
				double taxable = (x - 15000) *0.1;
				total = total + taxable;
				System.out.println(x - 15000 + " Taxed at 10%");
				x = 14999;
				i--;
			}
			if(x >= 0 && x <= 14999) {
				System.out.println("14999 and below is not taxed");
				i = 0;
			}
			i--;
		}
		System.out.println("Total tax for the year " + total);
	}


}
