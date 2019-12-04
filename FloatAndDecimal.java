public class FloatAndDecimal{
    public static void main(String[] args) {
        float a = 1.f/81;
        float b = 0;

        for (int i=0; i<729; i++){
            b+=a;

            System.out.println(b);
        } 
    }
}