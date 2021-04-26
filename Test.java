import java.util.Scanner;
 
public class Test {
	StudentManager stm=new StudentManager();
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        Test test=new Test();
        test.a();
    }
    public void a(){
        while (true){
            print();
            switch (scanner.nextInt()){
                case 1:
                	stm.add();
                    break;
                case 2:
                	stm.inquiry();
                    break;
                case 3:
                	stm.delete();
                    break;
                case 4:
                	stm.revisesp();
                    break;
                case 5:
                	stm.print();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("ÊäÈë´íÎó");
            }
 
        }
    }
 
    public void print(){
        System.out.println("1. ²åÈë");
        System.out.println("2. ²éÕÒ");
        System.out.println("3. É¾³ı");
        System.out.println("4. ĞŞ¸Ä");
        System.out.println("5. Êä³ö");
        System.out.println("6. ÍË³ö");
    }
}