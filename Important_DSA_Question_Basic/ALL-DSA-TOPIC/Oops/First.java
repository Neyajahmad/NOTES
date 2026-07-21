public class First {
    public static class Student 
    {
       String name;
       int rno;
       double percentage;
    } 

    public static void fun(Student x){   // class are pass by reference.
        System.out.println(x.rno);
        return;
    }
    public static void main(String[] args) {
        Student sc=new Student();
        sc.name="Neyaj";
        sc.rno=23;
        sc.percentage=87.2;

        System.out.println(sc.name);
        fun(sc);
    }
}