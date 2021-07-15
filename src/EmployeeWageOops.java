public class EmployeeWageOops 
{
	int IsFullTime;
    int IsPartTime;
   private  int wagePerHr;
   private final int fullDayHr;
   private final int partTimeHr;
   private final int empHr;

   public EmployeeWageOops(int isFullTime, int isPartTime, int wagePerHr, int fullDayHr, int partTimeHr, int empHr, String company) {
       IsFullTime = isFullTime;
       IsPartTime = isPartTime;
       this.wagePerHr = wagePerHr;
       this.fullDayHr = fullDayHr;
       this.partTimeHr = partTimeHr;
       this.empHr = empHr;
   }

   public  void computeWage(String company){
       this.setWagePerHr(company);

       int dailyEmpWage=0;
       int day = 0;

       double empCheck = Math.floor(Math.random() * 10) % 3;
       System.out.println(empCheck);
       while (day <= 19) {

           int n =(int)(Math.random() * 10) % 3;
           switch (n) {
               case 1:
                   System.out.println("present fullday");
                   dailyEmpWage = (dailyEmpWage + (wagePerHr * fullDayHr));

                   day++;
                   break;
               case 2:
                   System.out.println("present PartTime");
                   dailyEmpWage = (dailyEmpWage + (wagePerHr * partTimeHr));


                   day++;
                   break;
               default:
                   System.out.println("Employee is absent. ");
                   dailyEmpWage = (dailyEmpWage + (wagePerHr * empHr));
                   day++;

                   if( empHr== 100)
                       break;
           }
       }
       System.out.println("total wage of a month is::" + dailyEmpWage);


   }

   private void setWagePerHr(String company) {

       switch (company) {
           case "A":
               this.wagePerHr = 10;
               break;
           case "B":
               this.wagePerHr = 100;
               break;
           case "C":
               this.wagePerHr = 1000;
               break;
           case "D":
               this.wagePerHr = 10000;
               break;

           default:
               this.wagePerHr = 5;
               break;
       }
   }

   public static void main(String[] args) {
       System.out.println("Welcome to Employee Wage Computation....!!!");


       System.out.println("This is for compony A::");
       EmployeeWageOops e1= new EmployeeWageOops(100,100,100,100,100,7,"A");
       e1. computeWage("A");

       System.out.println("This is for compony B::");
       EmployeeWageOops e2= new EmployeeWageOops(100,100,100,100,100,7, "B");
       e2.computeWage("B");

       System.out.println("This is for compony C::");
       EmployeeWageOops e3= new EmployeeWageOops(100,100,100,100,100,7, "C");
       e3.computeWage("C");

       System.out.println("This is for compony D::");
       EmployeeWageOops e4= new EmployeeWageOops(100,100,100,100,100,7, "D");
       e4.computeWage("D");

   }

}