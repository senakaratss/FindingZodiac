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
				zodiac+="oðlak";
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
				zodiac+="balýk";
			}
		}
		else if(month==3) {
			if(day<21) {
				zodiac+="balýk";
			}
			else {
				zodiac+="koç";
			}
		}
		else if(month==4) {
			if(day<21) {
				zodiac+="koç";
			}
			else {
				zodiac+="boða";
			}
		}
		else if(month==5) {
			if(day<22) {
				zodiac+="boða";
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
				zodiac+="yengeç";
			}
		}
		else if(month==7) {
			if(day<23) {
				zodiac+="yengeç";
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
				zodiac+="baþak";
			}
		}
		else if(month==9) {
			if(day<23) {
				zodiac+="baþak";
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
				zodiac+="oðlak";
			}
		}
		System.out.println(zodiac);
		
}
}