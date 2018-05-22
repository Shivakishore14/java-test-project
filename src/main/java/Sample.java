public class Sample {
    public int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("This is a sample class");
        Sample s = new Sample();
        System.out.println( s.add(2,3) );
    }
}
