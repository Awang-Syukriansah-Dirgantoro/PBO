
public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("awang");
        encap.setAge(35);
        
        System.out.println("Name : " + encap.getName());
        System.out.println("Age  : " + encap.getAge());
        
        encap.setName("syukri");
        encap.setAge(15);
        
        System.out.println("Name : " + encap.getName());
        System.out.println("Age  : " + encap.getAge());
        
        encap.setName("dirgan");
        encap.setAge(20);
        
        System.out.println("Name : " + encap.getName());
        System.out.println("Age  : " + encap.getAge());
    }
}
