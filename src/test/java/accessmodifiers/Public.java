package accessmodifiers;
public class Public {

    public int id;
    public void schoolName() {
        System.out.println(this.id);
    }


    public static void main(String[]args){

        Public pc=new Public();
        int idNum= pc.id=100;
        System.out.println(idNum);




    }
}
