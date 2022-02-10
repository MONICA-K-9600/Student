public class hierarchy {

public static void main (String [] ags){
    dog C=new dog();
    C.setName("Puppy");
    C.setAge(10);
    System.out.println(C.getAge());
}


    //using constructor
//    dog C=new dog("Dog",10);
//System.out.println(C.getAge());

//    public hierarchy(String T, int A) {
//        name = T;
//        age = A;
//    }
//    public int getAge(){
//        return age;
//    }
}
class dog {
    private String name;
    private int age;

    public void setAge(int g){
        age=g;
    }
    public int getAge(){
        return age;
    }

    public void setName(String puppy) {
    }
}

