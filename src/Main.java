public class Main {
    public static void main(String[] args) {
        Employee kemal = new Employee("Kemal Yıldız",5000,45,2015);
        Employee mehmet = new Employee("Mehmet Gündüz",9000, 40, 2000);
        Employee yusuf = new Employee("Yusuf Tan", 10000, 50, 2020);
        System.out.println(kemal.toString());
        System.out.println(mehmet.toString());
        System.out.println(yusuf.toString());
    }
}