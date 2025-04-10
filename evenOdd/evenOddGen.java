public class evenOddGen {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("if (%d %% 2 == 0) {\n", i);
            System.out.printf("    System.out.println(\"%d is even\");\n", i);
            System.out.println("} else {");
            System.out.printf("    System.out.println(\"%d is odd\");\n", i);
            System.out.println("}\n");
        }
    }
}