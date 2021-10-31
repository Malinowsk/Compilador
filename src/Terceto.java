public class Terceto {

    //terminos del terceto
    private ParserVal t1 ;
    private ParserVal t2 ;
    private ParserVal t3 ;


    public Terceto (ParserVal t1 , ParserVal t2 , ParserVal t3){

        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }

    public ParserVal getT1(){
        return this.t1;
    }

    public ParserVal getT2(){
        return this.t2;
    }

    public ParserVal getT3(){
        return this.t3;
    }

    public void setT1(ParserVal t1) {
        this.t1 = t1;
    }

    public void setT2(ParserVal t2) {
        this.t2 = t2;
    }

    public void setT3(ParserVal t3) {
        this.t3 = t3;
    }

    public String getTerceto(TablaSimbolo ts){
        String stringT1= ts.obtenerValor(this.t1.ival);
        String stringT2= ts.obtenerValor(this.t2.ival);
        String stringT3= ts.obtenerValor(this.t3.ival);

        if(t1.ival==-1)
            stringT1= "BF";
        if(t1.ival==-2)
            stringT1="BI";
        if(t1.ival==-3)
            stringT1="BT";

        if(t2.ival==0) {
            stringT2 = String.valueOf(this.t2.dval);
            stringT2 = '['+stringT2.substring(0, stringT2.length()-2)+']';
        }

        if(t3.ival==0) {
            stringT3 = String.valueOf(this.t3.dval);
            stringT3 = '['+stringT3.substring(0, stringT3.length()-2)+']';
        }
        return "( "+ stringT1 + ", " + stringT2 + ", " + stringT3 + ")";
    }
}