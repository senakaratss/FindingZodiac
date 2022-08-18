import java.util.Scanner;
public class ClassPassing {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int count=5,sum=0;
		System.out.println("Math Grade: ");
		int mth=kb.nextInt();
		if(mth>=0 && mth<=100) {
			sum+=mth;
		}
		else {
			count--;
		}
		System.out.println("Turkish Grade: ");
		int trksh=kb.nextInt();
		if(trksh>=0 && trksh<=100) {
			sum+=trksh;
		}
		else {
			count--;
		}
		System.out.println("Physics Grade: ");
		int phy=kb.nextInt();
		if(phy>=0 && phy<=100) {
			sum+=phy;
		}
		else {
			count--;
		}
		System.out.println("Chemistry Grade: ");
		int chem=kb.nextInt();
		if(chem>=0 && chem<=100) {
			sum+=chem;
		}
		else {
			count--;
		}
		System.out.println("Music Grade: ");
		int msc=kb.nextInt();
		if(msc>=0 && msc<=100) {
			sum+=msc;
		}
		else {
			count--;
		}
		double average=sum/count;
		if(average>=55) {
			System.out.println("Your average grade is "+average+" Passed the class");
		}
		else {
			System.out.println("Your average grade is "+average+" Failed the class");
		}
	}

}
