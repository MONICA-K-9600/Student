class SuperClass{
    public void move(String a){
        System.out.println("Some are fail");
    }
}
class Staff extends SuperClass{
    public void move(){
        System.out.println("All are pass");
    }
}
class TestStudent{
    public static void main(String args[]){
        Staff st=new Staff();
        st.move();
        st.move("12");
    }
}