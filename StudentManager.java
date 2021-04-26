import java.util.ArrayList;
import java.util.Scanner;
 
 // 老师的账号密码固定为123
public class StudentManager {
    static int i=1;
    ArrayList<Student> list=new ArrayList<Student>();
    Scanner scanner=new Scanner(System.in);
    
    //教师进入
    public void enter(){
        System.out.print("请输入用户名：");
        if (scanner.next().equals("123")){
            System.out.print("请输入密码：");
            if (scanner.next().equals("123")){
                System.out.println("登录成功");
            }else{
                System.out.println("密码错误");
                enter();
            }
        }else {
            System.out.println("用户名错误");
            enter();
        }
    }
    //1.插入
    public void add(){
        //创建学生对象
        Student student=new Student();
        student.setSid(i);
        System.out.print("学号");
        student.setID(scanner.next());
        System.out.print("姓名:");
        student.setName(scanner.next());
        System.out.print("性别:");
        student.setGender(scanner.next());
        System.out.print("年龄:");
        student.setBirDate(scanner.nextInt());
        list.add(student);
        i++;
    }
    //5.输出
    public void print(){
        if (list.size()==0){
            System.out.println("没有学生");
        }else {
            for (Student student:list){
                System.out.println(student.toString());
            }
        }
    }
 
	//2.查找
    public void inquiry(){
        if (list.size()==0){
            System.out.println("没有学生");
        }else {
            System.out.print("请输入想要查找的学生的学号：");
            for (Student student:list){
                if (student.getSid()==scanner.nextInt()){
                    System.out.println(student.toString());
                }
            }
        }
    }
    //3.删除
    public void delete(){
        if (list.size()==0){
            System.out.println("没有学生");
        }else {
            System.out.print("请输入想要删除的学生的学号：");
            for (int i=0;i<=list.size();i++){
                if (list.get(i).getSid()==scanner.nextInt()){
                    list.remove(i);
                    System.out.println("删除成功");
                }
            }
        }
    }
    //4.修改
    public void revisesp(){
        if (list.size()==0){
            System.out.println("没有学生");
        }else {
            System.out.print("请输入想要修改的学生的学号：");
            for (Student student:list){
                if (student.getSid()==scanner.nextInt()){
                    revisesp01(student);
                    System.out.println("修改成功");
                }
            }
        }
    }
    public void revisesp01(Student student) {
        System.out.println("1.修改姓名");
        System.out.println("2.修改性别");
        System.out.println("2.修改年龄");
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