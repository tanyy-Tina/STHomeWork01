public class Student {
    
    private int  ID;//学号
    private String  name; //姓名
    private String gender;//性别
    private int BirDate;//年龄
    
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
 
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
 
    public int getBirDate() {
        return BirDate;
    }
    public void setBirDate(int BirDate) {
        this.BirDate = BirDate;
    }

    @Override
    public String toString() {
        return "学生{" +
                "学号=" + ID +
                ", 姓名='" + name + '\'' +
                ", 性别='" + gender + '\'' +
                ", 出生日期=" + BirDate +
                '}';
    }
}