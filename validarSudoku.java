
import java.util.HashSet;

public class validarSudoku {
    
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> filas = new HashSet<>();
            HashSet<Character> columnas = new HashSet<>();
            for(int  j= 0; j < 9; j++){
                if(board[i][j] != '.'){
                    if (!filas.add(board[i][j])) {
                        return false;
                    }
                }
                if (board[j][i] != '.') {
                    if (!columnas.add(board[j][i])) {
                        return false;  // Duplicado encontrado
                    }
                }
            }
        }

        for(int i = 0; i < 9; i+=3){
            for (int j = 0; j < 9; j+=3) {
                HashSet<Character> cuad = new HashSet<>();
                for(int row = 0; row < 3; row ++){
                    for(int col = 0; col < 3; col ++){
                        char num = board[row + i][col + j];
                        if (num != '.') {
                            if (!cuad.add(num)) {
                                return false; 
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
