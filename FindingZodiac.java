import java.util.Scanner;
public class FindingZodiac {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		String zodiac="";
		System.out.println("What month were you born: ");
		int month=kb.nextInt();
		System.out.println("What day were you born: ");
		int day=kb.nextInt();
		if(month==1) {
			if(day<22) {
				zodiac+="o�lak";
			}
			else {
				zodiac+="kova";
			}
		}
		else if(month==2) {
			if(day<20) {
				zodiac+="kova";
			}
			else {
				zodiac+="bal�k";
			}
		}
		else if(month==3) {
			if(day<21) {
				zodiac+="bal�k";
			}
			else {
				zodiac+="ko�";
			}
		}
		else if(month==4) {
			if(day<21) {
				zodiac+="ko�";
			}
			else {
				zodiac+="bo�a";
			}
		}
		else if(month==5) {
			if(day<22) {
				zodiac+="bo�a";
			}
			else {
				zodiac+="ikizler";
			}
		}
		else if(month==6) {
			if(day<23) {
				zodiac+="ikizler";
			}
			else {
				zodiac+="yenge�";
			}
		}
		else if(month==7) {
			if(day<23) {
				zodiac+="yenge�";
			}
			else {
				zodiac+="aslan";
			}
		}
		else if(month==8) {
			if(day<23) {
				zodiac+="aslan";
			}
			else {
				zodiac+="ba�ak";
			}
		}
		else if(month==9) {
			if(day<23) {
				zodiac+="ba�ak";
			}
			else {
				zodiac+="terazi";
			}
		}
		else if(month==10) {
			if(day<23) {
				zodiac+="terazi";
			}
			else {
				zodiac+="akrep";
			}
		}
		else if(month==11) {
			if(day<22) {
				zodiac+="akrep";
			}
			else {
				zodiac+="yay";
			}
		}
		else if(month==12) {
			if(day<22) {
				zodiac+="yay";
			}
			else {
				zodiac+="o�lak";
			}
		}
		System.out.println(zodiac);
		
}
}