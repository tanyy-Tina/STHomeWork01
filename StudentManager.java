import java.util.ArrayList;
import java.util.Scanner;
 
 // ��ʦ���˺�����̶�Ϊ123
public class StudentManager {
    static int i=1;
    ArrayList<Student> list=new ArrayList<Student>();
    Scanner scanner=new Scanner(System.in);
    
    //��ʦ����
    public void enter(){
        System.out.print("�������û�����");
        if (scanner.next().equals("123")){
            System.out.print("���������룺");
            if (scanner.next().equals("123")){
                System.out.println("��¼�ɹ�");
            }else{
                System.out.println("�������");
                enter();
            }
        }else {
            System.out.println("�û�������");
            enter();
        }
    }
    //1.����
    public void add(){
        //����ѧ������
        Student student=new Student();
        student.setSid(i);
        System.out.print("ѧ��");
        student.setID(scanner.next());
        System.out.print("����:");
        student.setName(scanner.next());
        System.out.print("�Ա�:");
        student.setGender(scanner.next());
        System.out.print("����:");
        student.setBirDate(scanner.nextInt());
        list.add(student);
        i++;
    }
    //5.���
    public void print(){
        if (list.size()==0){
            System.out.println("û��ѧ��");
        }else {
            for (Student student:list){
                System.out.println(student.toString());
            }
        }
    }
 
	//2.����
    public void inquiry(){
        if (list.size()==0){
            System.out.println("û��ѧ��");
        }else {
            System.out.print("��������Ҫ���ҵ�ѧ����ѧ�ţ�");
            for (Student student:list){
                if (student.getSid()==scanner.nextInt()){
                    System.out.println(student.toString());
                }
            }
        }
    }
    //3.ɾ��
    public void delete(){
        if (list.size()==0){
            System.out.println("û��ѧ��");
        }else {
            System.out.print("��������Ҫɾ����ѧ����ѧ�ţ�");
            for (int i=0;i<=list.size();i++){
                if (list.get(i).getSid()==scanner.nextInt()){
                    list.remove(i);
                    System.out.println("ɾ���ɹ�");
                }
            }
        }
    }
    //4.�޸�
    public void revisesp(){
        if (list.size()==0){
            System.out.println("û��ѧ��");
        }else {
            System.out.print("��������Ҫ�޸ĵ�ѧ����ѧ�ţ�");
            for (Student student:list){
                if (student.getSid()==scanner.nextInt()){
                    revisesp01(student);
                    System.out.println("�޸ĳɹ�");
                }
            }
        }
    }
    public void revisesp01(Student student) {
        System.out.println("1.�޸�����");
        System.out.println("2.�޸��Ա�");
        System.out.println("2.�޸�����");
        switch (scanner.nextInt()){
            case 1:
                student.setName(scanner.next());
                break;
            case 2:
                student.setGender(scanner.next());
                break;
            case 3:
                student.setBirDate(scanner.nextInt());
                break;
        }
    }
}