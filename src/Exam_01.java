public class Exam_01 {
    public static void main(String[] args) {
        
        
        int max = Integer.parseInt(args[0]);
        for (int i=1 ; i<args.length;i++) {
            if (max<Integer.parseInt(args[i])) {
                max = Integer.parseInt(args[i]);
            }
        }
        System.out.println(max);
    }
}
