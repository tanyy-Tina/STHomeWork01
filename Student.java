public class Student {
    
    private int  ID;//ѧ��
    private String  name; //����
    private String gender;//�Ա�
    private int BirDate;//����
    
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
        return "ѧ��{" +
                "ѧ��=" + ID +
                ", ����='" + name + '\'' +
                ", �Ա�='" + gender + '\'' +
                ", ��������=" + BirDate +
                '}';
    }
}