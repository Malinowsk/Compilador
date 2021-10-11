public class Terceto {

    private int t1 ;
    private int t2 ;
    private int t3 ;

    public Terceto (int t1 , int t2 , int t3){

        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }

    public int getT1(){
        return this.t1;
    }

    public int getT2(){
        return this.t2;
    }

    public int getT3(){
        return this.t3;
    }

    public String getTerceto(){
        return "( "+ this.t1 + ", " + this.t2 + ", " + this.t3 + ")";
    }
}