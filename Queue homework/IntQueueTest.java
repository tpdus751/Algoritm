package queue;

import java.util.Scanner;

public class IntQueueTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("capacity 입력 : ");
		int input_capa = input.nextInt();
		IntQueue Q = new IntQueue(input_capa);
		
		while (true) {
			System.out.println();
			System.out.println("현재 데이터 개수 : " + Q.getSize() + " / " + Q.getCapacity());
			System.out.print("(1) 인큐 (2) 디큐 (3) 피크 (4) 덤프 (0) 종료 : ");
			int menu = input.nextInt();
			if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			
			}
			int eq_data;
			
			switch (menu) {
				case 1 :
					if (Q.isFull() == true) {
						Q.isFull();
					}
					else {
						System.out.print("데이터 : ");
						eq_data = input.nextInt();
						Q.enqueue(eq_data);
					}
					break;
					
					
				case 2 :
					if (Q.isEmpty() == true) {
						Q.isEmpty();
						System.out.println("비어있는 queue 입니다.");
						
					}
					
					else {
						System.out.println("디큐한 데이터는 " + Q.dequeue() + " 입니다.");
					}
					break;
					
				case 3 :
					if (Q.isEmpty() == true) {
						System.out.println("비어있는 queue 입니다.");
					}
					else {
						System.out.println("피크한 데이터는 " + Q.getFront() + " 입니다.");
					}
					break;
					
				case 4 :
					System.out.print("모든 데이터 : ");
					Q.dump();
					break;
			}
		}
		
		
		
		

	}

}
