package lesson5;

public class Main {
    public static void main(String[] args) {
        Workers[] worker = new Workers[5];
        worker[0] = new Workers("Джигурда","djiga@mail.ru",44);
        worker[1] = new Workers("Назаров","nazarov@mail.ru",29);
        worker[2] = new Workers("Иванов","ivanov@mail.ru",55);
        worker[3] = new Workers("Сидоров","sidorov@mail.ru",40);
        worker[4] = new Workers("Петров","petrov@mail.ru",39);
        for (int i = 0; i < worker.length; i++) {
            if(worker[i].getAge() > 40) {
                worker[i].printInfo();
            }
        }
    }
}
