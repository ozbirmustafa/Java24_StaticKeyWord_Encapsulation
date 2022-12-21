package day24statickeywordencapsulation;

public class CarRunner {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();

        System.out.println(car1.counter); //Yanlış kullanım
        System.out.println(car1.price);   //static variable lara objeismi kullanarak "ulaşılMAMAlıdır."

        System.out.println(Car.counter); // static variable lara Class ismi kullanarak ulaşılmalıdır.
        System.out.println(car2.price);

        //*******INTERVIEW SORUSU**

        /*
            statıc keyword class'a bağlananmış class elamanlarıdır.
            statıc class elemanları butun Object'lerin ortak elemanıdır.
            statıcler uzerinde yapılan her değişiklik butun Object'ler tarafından gorulur.
            statıc class elemanlarına class uzerinden ulaşılır. Object'ler statıclere ulaşmak için kullanılmaz
        */

    }
}

