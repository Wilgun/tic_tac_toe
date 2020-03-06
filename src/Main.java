import java.util.*;
public class Main {
	
	Scanner scan = new Scanner(System.in);

	public Main() {
		char board[][] = new char[8][8];
		int i =1;
		Board b = new Board();
		b.firstBoard(board);
		do{
			b.printBoard(board);
			
		}while(i != 1);
		int x ,y,destX,destY;
		x = scan.nextInt();
		y = scan.nextInt();
		System.out.println("Ke: ");
		destX = scan.nextInt();
		destY = scan.nextInt();
		board[destX][destY] = board[x][y];
		board[x][y]=' ';
		System.out.println("After:");
		b.printBoard(board);
	}
	public static void main(String[] args) {
		new Main();
	}

}
