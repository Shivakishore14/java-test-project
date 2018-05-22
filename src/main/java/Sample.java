public class Sample {
    public void sample_fun(){
        // TODO : complete this
    }
    public void newFeature() {
        System.out.println("New feature implemented");
    }
    public int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("This is a sample class");
        Sample s = new Sample();
        s.newFeature();
        System.out.println( s.add(2,3) );
    }
}
