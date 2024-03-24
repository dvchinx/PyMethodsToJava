public class PyDvc{

    public static void print(String str, String op){
        switch(op){
            case "NORMAL":
                System.out.println(str);
                break;
            case "DOWN":
                for (int i = 0; i < str.length(); i++) {
                    System.out.println(str.charAt(i));
                }
                break;
            case "INVERSE":
                for (int i = str.length() - 1; i>=0; i--) {
                    System.out.print(str.charAt(i));
                }
                System.out.println();
                break;
            case "INVERSE-DOWN":
                for (int i = str.length() - 1; i>=0; i--) {
                    System.out.println(str.charAt(i));
                }
                break;
        }
    }

    public static void print(int integer){
        System.out.println(integer);
    }

    public static void print(String[] arrStr){
        for (int i = 0; i < arrStr.length; i++) {
            System.out.print(arrStr[i]+" ");
        }
        System.out.println();
    }

    public static void print(int[] arrInt){
        for (int i = 0; i < arrInt.length; i++) {
            System.out.print(arrInt[i]+" ");
        }
        System.out.println();
    }

    public static void print(float[] arrFloat){
        for (int i = 0; i < arrFloat.length; i++) {
            System.out.print(arrFloat[i]+" ");
        }
        System.out.println();
    }

}