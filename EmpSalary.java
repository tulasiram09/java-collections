import java.util.*;

class Salary{
    String ename;
    int basic,hra,da,tax;
    Salary(String ename,int basic,int hra,int da,int tax){
        this.ename = ename;
        this.basic = basic;
        this.hra = hra;
        this.da = da;
        this.tax = tax;
    }
    // adding a comment for pull request
    void show_gs(){
        float gs = 0.0f;
        float ts = 0.0f;
        ts = basic +(hra*basic)/100 + (da*basic)/100;
        gs = ts - (tax*ts)/100;
        System.out.printf( "%s %.2f\n",ename,gs);
    }
}


public class EmpSalary {
    public static void main(String[] args) {
        HashMap <Integer,Salary> hm = new HashMap<>();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of employees");
        n = sc.nextInt();
        while(n>0){
            int eid,basic;
            String ename;
            int da,hra,tax;
            System.out.println("Eid : ");
            eid = sc.nextInt();
            System.out.println("Ename : ");
            ename = sc.next();
            System.out.println("basic : ");
            basic = sc.nextInt();
            System.out.println("da% : ");
            da = sc.nextInt();
            System.out.println("Hra% : ");
            hra = sc.nextInt();
            System.out.println("tax% : ");
            tax = sc.nextInt();
            Salary sal_odj = new Salary(ename, basic, hra, da, tax);
            hm.put(eid,sal_odj);
            n--;
        }
        Set <Integer> keys = hm.keySet();
        System.out.println("\n emp salary details:");
        for(int empid:keys){
            Salary obj = hm.get(empid);
            System.out.println("Eid : "+empid);
            obj.show_gs();
        }
        sc.close();
    }
}
