package es.unileon.prg1.date;

public class MainDate{

    public static void main(String[] args){
        try{
        Date cumpleaños= new Date(31, 12,2003);
        Date otro= new Date(3, 1,2003);
        //System.out.println(cumpleaños.Monthname(3));
        //System.out.println(cumpleaños.DateString());
        //cumpleaños.Datesleft();
        System.out.println(cumpleaños.dayspassed());
        //cumpleaños.sameMonthdays();
         } catch(DateException e){System.out.println(e.getMessage());}
    }
}