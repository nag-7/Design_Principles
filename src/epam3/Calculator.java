package epam3;
import java.util.*;
public class  Calculator 
{
	public static void main(String[] args) {
		Label:while("True"!=null) {
	    System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Divide");
       
	    System.out.println("Enter your choice:");
     
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    Addition add=new Addition();
	    Subtraction sub=new Subtraction();
	    multiplication mul=new multiplication();
	    Division div=new Division();
        if(n==1) {
        	add.Addition();
        }
        else if(n==2) {
        	sub.Subtraction();
        }
        else if(n==3) {
        	mul.multiplication();
        }
        else if(n==4) {
        	div.Division();
        }
        else {
        	System.out.println("Invalid option!!!!");
        	continue Label;
        }
        
    Label1:while("True"!=null) {    
	System.out.println("Do you want to continue(Y/N):"); 
    Scanner ch=new Scanner(System.in);
    char c=ch.next().charAt(0);
    
        if(c=='Y'||c=='y') {
        	continue Label;
        }
        else if(c=='N'||c=='n'){
        	break Label;
        }
        else if(c!='Y'&&c!='N'&&c!='y'&&c!='n') {
        	System.out.println("Wrong choice");
        	continue Label1;
        }
	}
		}
	}
}
class Addition {
    void Addition()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("How many numbers do you want to add:");

        int n=sc.nextInt();

        double arr[]=new double[n];

        System.out.println("Enter numbers:");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();

        }
        double sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println("Addition of given numbers is:"+sum);
    }
}
class multiplication{
    void multiplication(){
        
    System.out.println("Enter no.of operands:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    double a[]=new double[n];
    System.out.println("Enter the numbers:");
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextDouble();
       
       
    }
    double mul=1;
    for(int j=0;j<n;j++){
        mul=mul*a[j];
    }
    System.out.println("multiplication of given numbers is:"+mul);
}}
class Division{
    void Division()
    {
         Scanner sc=new Scanner(System.in);
        
          System.out.println("Enter 1st number:");
    double n1=sc.nextInt();
    System.out.println("Enter 2nd number:");
    double n2=sc.nextInt();
    double  d=n1/n2;
    System.out.println("Division of numbers is:"+d);
    }
}

class Subtraction{
    void Subtraction()
    {
         Scanner sc=new Scanner(System.in);
        
          System.out.println("Enter 1st number:");
    double n1=sc.nextInt();
    System.out.println("Enter 2nd number:");
    double n2=sc.nextInt();
    double  s=n1-n2;
    System.out.println("Subtraction of numbers is:"+s);
    }
}
