public class SampleTest {
    int a,b;

    public SampleTest(int c,int d){
        a=c;
        b=d;
    }

    public int getA(){
        return a;
    }


    public static void main(String[] args) {
        SampleTest st=new SampleTest(2,3);
        System.out.println(st.getA());
    }
}
