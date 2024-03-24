public class App {
    public static void main(String[] args) throws Exception {
        String[] ArrStr = {"A", "B", "C"};
        int[] ArrInt = {1, 2, 3};
        float[] ArrFloat = {2.9f, 5.2f, 3.5f};
        
        PyDvc.print("Hello World", "INVERSE-DOWN");
        // str, op - op -> "NORMAL", "DOWN", "INVERSE", "INVERSE-DOWN"
        
        PyDvc.print(123);

        PyDvc.print(ArrStr);

        PyDvc.print(ArrInt);

        PyDvc.print(ArrFloat);
    }
}
