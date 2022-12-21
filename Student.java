package day24statickeywordencapsulation;

/*Encapsulation: "Data Hiding"
      -->Datayı niçin gizlersiniz? Datayı dış etkenlerden korumak için.
      -->Datayı nasıl gizlersiniz? Access Modifier i "private" yaparak gizlerim
      -->Datayı gizledikten sonra başka class lardan okumak istersen ne yaparsın?
         "get method"lar(getter) oluşturarak gizlediğimiz dataları okunur hale getirebiliriz.
      -->Datayı gizledikten sonra başka class lardan değiştirmek istersen ne yaparsın.
         "set method"lar(setter) oluşturarak gizlediğimiz dataları değiştirebiliriz.
      -->Variable ın data type ile get() method un return type ı aynı olmalıdır.
      -->get()methodları isimlendirirken "get + <variable name>"
         ancak variable ın data type boolean ise "is + <variable name>"
      -->
    */

public class Student {

    public String stdName = "Tom Hanks";
    private String stdId = "TH202201";
    private double gpa = 3.8;
    private boolean retired = false;

    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return retired;
    }


    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }


}
