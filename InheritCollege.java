class InheritCollege {
    public long aicteid = 720722115038L; 
    public void display() {
        System.out.println("AICTE ID: " + this.aicteid);
    }
}
class Depts extends College {
    public int deptcode;
    public Depts() { 
        this.deptcode = 104;  
        System.out.println(this.deptcode);
    }
}
class Students extends Depts {
}
public class Main {
    public static void main(String[] args) {
        Students student = new Students();
        student.display();
    }
}