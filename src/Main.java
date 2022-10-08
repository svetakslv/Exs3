public class Main {
    public static void main(String[] args) {
        ///Напишите программу, которая разделяет любую строку на две части ровно пополам по количеству символов.
        String s = "Программирование - навык и его можно развить";
        int m = s.length() / 2;
        System.out.println(s.substring(0, m)); ///0 - это начальный индекс.
        System.out.println(s.substring(m));///m - конечный индекс.
    }
}
