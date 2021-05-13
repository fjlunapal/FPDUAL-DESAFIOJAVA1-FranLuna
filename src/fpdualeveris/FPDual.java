package fpdualeveris;

import variables.Developer;

public class FPDual {

	/**
	 * Método Principal
	 * @param args
	 * @author Fran Luna
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variablesChallenge();
	}

	/** Método variablesChallege*/
	private static void variablesChallenge() {
		/** Instancia de cuatro programadores*/
		Developer dev0 = new Developer("Fran Luna");
		Developer dev1 = new Developer("Manuel Palma");
		Developer dev2 = new Developer("Isabel Garcia");
		Developer dev3 = new Developer("Felipe Suarez");

		/** Mostrar la cantidad de empleados desde diferentes programadores*/
		System.out.println("Employees amount: " + dev0.getEmployees_amount());
		System.out.println("Employees amount: " + dev3.getEmployees_amount());

		/** Mostrar la ID de todos los programadores*/
		System.out.println("ID First developer: " + dev0.getEmployee_id());
		System.out.println("ID Second developer: " + dev1.getEmployee_id());
		System.out.println("ID Third developer: " + dev2.getEmployee_id());
		System.out.println("ID Fourth developer: " + dev3.getEmployee_id());

		/** Reducir las vacaciones del segundo programador en dos días*/
		dev1.reduceHolidays(2);

		/** Mostrar los días de vacaciones de todos los empleados*/
		System.out.println("First developer holidays: " + dev0.getHolidays());
		System.out.println("Second developer holidays: " + dev1.getHolidays());
		System.out.println("Third developer holidays: " + dev2.getHolidays());
		System.out.println("Fourth developer holidays: " + dev3.getHolidays());

	}

}
