public class F7 {
    public static void main(String[] args){

        Isample obj = new Csample();
        Isample obj2 = new Csample();

        obj.func();
        obj2.func();
        System.out.println(obj.a+" "+obj.b);
        //obj.a++; datamembers in the interface are final so cant modify
        System.out.println(obj.a+" "+obj.b);

    

    }
    static interface Isample{
        int a=1;
        int b=2;
        void func();
    }
    static class Csample implements Isample{
        @Override
        public void func() {
            System.out.println("hello interface func");
        }

    }
    
}
/**
 * F7
 */


    
