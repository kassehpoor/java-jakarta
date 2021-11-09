package entities;

public class Student {

    private int id;
    private String name;
    private String family;
    private String major;

    public Student() {
    }

    public Student(String name, String family, String major) {
        this.name = name;
        this.family = family;
        this.major = major;
    }

    public Student(int id, String name, String family, String major) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.major = major;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
