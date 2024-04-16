public class Tic_C {
    public static void main(String[] args) {
        String S[] = new String[6];
        for (int i = 0; i < S.length; i++) {
           if(i%2==0)
            S[i]="O";
            else 
            S[i]="X";
        }
        for (String string : S) {
            System.out.println(string);
        }
        if (S[1]==S[3]) {
            System.out.println(true);
        }
        else System.out.println(false);
    }

}
