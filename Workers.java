package lesson5;

public class Workers {
    private String FIO;
    private int age;
    private String mail;

    public int getAge() {
        return age;
    }
    public Workers(String fio, String mail, int age) {
        this.FIO = fio;
        this.age = age;
        this.mail = mail;
    }
    public void printInfo(){
        System.out.println("FIO "+FIO+"mail"+mail+"age "+age);
    }
}
