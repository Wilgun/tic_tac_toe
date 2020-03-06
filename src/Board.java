
public class Board {
	public  void firstBoard(char board[][]){
		board[0][0] = BlackPieces.getRook();
		board[0][1] = BlackPieces.getKnight();
		board[0][2] = BlackPieces.getBishop();
		board[0][3] = BlackPieces.getQueen();
		board[0][4] = BlackPieces.getKing();
		board[0][5] = BlackPieces.getBishop();
		board[0][6] = BlackPieces.getKnight();
		board[0][7] = BlackPieces.getRook();
		board[7][0] = WhitePieces.getRook();
		board[7][1] = WhitePieces.getKnight();
		board[7][2] = WhitePieces.getBishop();
		board[7][3] = WhitePieces.getQueen();
		board[7][4] = WhitePieces.getKing();
		board[7][5] = WhitePieces.getBishop();
		board[7][6] = WhitePieces.getKnight();
		board[7][7] = WhitePieces.getRook();
		for(int i =0 ;i < 8; i++){
			board[1][i]=BlackPieces.getPawn();
		}
		for(int i =0 ;i < 8; i++){
			board[6][i]=WhitePieces.getPawn();
		}
		
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				if(board[i][j] != '-' && board[i][j] != '+' && board[i][j]!=0){
					continue;
				}
				if(i % 2 == 0){
					if(j % 2 == 0){
						board[i][j]='-';
					}
					else{
						board[i][j]='+';
					}
				}
				else{
					if(j % 2 == 0){
						board[i][j] = '+';
					}
					else board[i][j] = '-';
				}
			}
		}
	}
	public void printBoard(char board[][]){
		System.out.println("  A B C D E F G H");
		for(int i = 0; i < 8; i++){
			System.out.print((i+1) + " ");
			for(int j = 0; j < 8; j++){
				if(board[i][j] == ' '){
					if(i % 2 == 0){
						if(j % 2 == 0){
							board[i][j]='-';
						}
						else{
							board[i][j]='+';
						}
					}
					else{
						if(j % 2 == 0){
							board[i][j] = '+';
						}
						else board[i][j] = '-';
					}
				}
				System.out.print(board[i][j] +" ");
			}
			System.out.println();
		}
	}
}
