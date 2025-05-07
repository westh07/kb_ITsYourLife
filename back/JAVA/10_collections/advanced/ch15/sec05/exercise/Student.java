package advanced.ch15.sec05.exercise;

public class Student {
    public int num;
    public String name;
    public String email;
    public String github;

    public Student(int num, String name, String email, String github) {
        this.num = num;
        this.name = name;
        this.email = email;
        this.github = github;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGithub() {
        return github;
    }

    @Override
    public String toString() {
        return "num=" + num +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", github='" + github + '\'' +
                '}';
    }
}
