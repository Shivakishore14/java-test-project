public class Sample {
    public void add(int a, int b){
        System.out.println("result = " + a+b);
    }
    public static void main(String[] args) {
        System.out.println("This is a sample class");
        Sample s = new Sample();
        s.add(2,3);
    }
}
