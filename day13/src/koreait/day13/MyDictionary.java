package koreait.day13;

import java.util.Scanner;
import java.util.TreeMap;

public class MyDictionary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeMap<String, String> mydic = new TreeMap<>();
		String sel, eng, kor;
		System.out.println("μ ν κΈ°λ₯ π   1. λ¨μ΄μ μ₯     2. λ¨μ΄κ²μ     3. λ¨μ΄μ₯λ³΄κΈ°    4.νλ‘κ·Έλ¨ λλ΄κΈ°");
		boolean run = true;
		while (run) {		//while λ°λ³΅μμ switch λ‘ μ’λ£μ‘°κ±΄μ λμμν¬λ break λ‘ λͺ»ν©λλ€.-> λ³μ μ¬μ©νμ΅λλ€.
			System.out.print("μ ν β->");
			sel = sc.nextLine();
			switch (sel) {
			case "1":
				System.out.print("English -> ");
				eng = sc.nextLine();
				System.out.print("Korean -> ");
				kor = sc.nextLine();
				if(mydic.containsKey(eng))
				{ //μ‘΄μ¬νλ keyκ°μ valueλ₯Ό ","λ‘ κ΅¬λΆνμ¬ μ°κ²°νμ¬ μ μ₯ν©λλ€.
					String temp=mydic.get(eng);		//Mapμ μ μ₯λμ΄μλ value κ°μ Έμ΅λλ€.
					temp +="/ " + kor;
					mydic.put(eng,temp);
				}
				else mydic.put(eng, kor);
				break;
			case "2":
				System.out.print("κ²μ λ¨μ΄ English -> ");
				eng = sc.nextLine();
				System.out.println("λ¨μ΄μ₯ κ²μνμ΅λλ€. κ²°κ³Ό =>" + mydic.get(eng));
				break;
			case "3":
				System.out.println("λ¨μ΄μ₯ μ μ²΄λ³΄κΈ° :" + mydic);
				break;
			case "4":
				run=false;	
				break;
			default:
				System.out.println("πβπ¨μλͺ» μλ ₯λ μ νμλλ€.1~4 μλ ₯μλλ€.");
				break;
			}
		}	//while end
		System.out.println("::::  λμ λ¨μ΄μ₯ μ’λ£ν©λλ€. ::::");

	}
	
	
	

}
