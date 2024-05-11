import java.util.Scanner;

public class simpleInterest {
    double simpleInt(int principleAmount,int rateOfInterest,int timePeriod){
        return (double)(principleAmount*rateOfInterest*timePeriod)/100;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter principal amount");
        int principalAmount=scanner.nextInt();
        System.out.println("enter rate of interest");
        int rateOfInterest=scanner.nextInt();
        System.out.println("enter time period");
        int timePeriod=scanner.nextInt();
        simpleInterest obj=new simpleInterest();
        double SimpleInterest=obj.simpleInt(principalAmount,rateOfInterest,timePeriod);
        System.out.println("the simple interest is "+SimpleInterest);
    }
}
