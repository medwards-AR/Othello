import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean running = true;
		int size = 8;
		char p1 = '*';
		char np1 = '+';
		Board b = new Board(size);
		b.createBoard(size);
		for(int i = 0; i < 2; i++) {
			System.out.println("input x cord");
			int x = sc.nextInt();
			System.out.println("input y cord");
			int y = sc.nextInt();
			b.inputBoard(x, y, p1);
		}
		for(int i = 0; i < 2; i++) {
			System.out.println("input x cord");
			int x = sc.nextInt();
			System.out.println("input y cord");
			int y = sc.nextInt();
			b.inputBoard(x, y, np1);
		}
		b.printBoard();
		while(running) {
			
		}
	}
}