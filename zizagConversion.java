public class zizagConversion {
    public String convert(String s, int numRows) {
        if(s.length() == 1 || numRows == 1) return s;
        //Creamos un stringbuilder de stringbuilders para ir guardando por filas
        StringBuilder[] rows = new StringBuilder[Math.min(numRows, s.length())];
        for (int i = 0; i < rows.length; i++) {
            rows[i] = new StringBuilder();
        }
        int currentRow = 0;
        boolean goingDown = false;

        for(char x: s.toCharArray()){
            rows[currentRow].append(x);
            if(currentRow == 0 || currentRow == numRows -1){
                goingDown = !goingDown;
            }
            if(goingDown){
                currentRow += 1;
            }else{
                currentRow -= 1;
            }
        }
        StringBuilder result = new StringBuilder();
        for(StringBuilder x : rows){
            result.append(x);
        }
        return result.toString();
    }
}
