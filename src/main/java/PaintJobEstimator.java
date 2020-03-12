
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mason
 */
public class PaintJobEstimator {

static final double LABOUR_CHARGE_PER_HR=18.00;

static final int PAINT_REQ_PER_SQ_FT=115;

static final int WORK_HRS_PER_DAY=8;

public static void main(String[] args) {


// Declaring variables

int wall_space;

double price;

/*

* Creating an Scanner class object which is used to get the inputs

* entered by the user

*/

Scanner sc = new Scanner(System.in);

// Getting the wall space

System.out.print("How many total square feet need to be painted? :");

wall_space=sc.nextInt();

// Getting the price of the paint per gallon entered by the user

System.out.print("What is the cost of the paint per gallon? ");

price=sc.nextDouble();

// Calling the functions

double paint_required = paintReq(wall_space);

double cost_of_paint = costOfPaint(paint_required, price);

double hours = hoursOfLabor(wall_space);

double labor_charges = calLaborCharges(hours);

double tot_cost = totalCost(cost_of_paint, labor_charges);

// Displaying the results

System.out.printf("The cost of Paint $%.2f\n" , cost_of_paint );

System.out.printf("The cost for labor is $%.2f\n" , labor_charges);

System.out.printf("The total cost for the job is $%.2f\n" , tot_cost);

  

}

private static double totalCost(double cost_of_paint, double labor_charges) {

return (cost_of_paint + labor_charges);

}

private static double calLaborCharges(double hours) {

return hours * LABOUR_CHARGE_PER_HR;

}

private static double hoursOfLabor(int wall_space) {

return ((double)wall_space / PAINT_REQ_PER_SQ_FT) * WORK_HRS_PER_DAY;

}

private static double costOfPaint(double paint_required, double price) {

return paint_required * price;

}

private static double paintReq(int wall_space) {

return (double)wall_space / PAINT_REQ_PER_SQ_FT;

}

}

