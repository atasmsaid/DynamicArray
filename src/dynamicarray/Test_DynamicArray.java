package dynamicarray;

public class Test_DynamicArray {

    public static void main(String[] args) {
        DynamicArray test=new DynamicArray();
        for (int i = 0; i < 30; i++) {
            test.add((int)(Math.random()*100));
            //0-1-2-3-4-5-6-7-8-9
            System.out.println(test.get(i));
        }
        System.out.println("------");
        //System.out.println(test.get(1));
        test.delete();
        for (int i = 0; i < test.length(); i++) {
            System.out.println(test.get(i));
        }
//        for (int j = 1; j < 11; j++) {
//            
//        }
        System.out.println("---");
        System.out.println(test.capacity());
        test.clear();
        
        System.out.println("----");
        System.out.println(test.capacity());
        System.out.println(test.length());
    }

}
