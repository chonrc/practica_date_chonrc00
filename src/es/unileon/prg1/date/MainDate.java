package es.unileon.prg1.date;

public class MainDate{

    public static void main(String[] args){
        try{
        Date cumpleaños= new Date(2, 12,2003);
        System.out.println(cumpleaños.DateString());
        System.out.println(cumpleaños.Monthsleft());
         } catch(DateException e){System.out.println(e.getMessage());}
    }
}