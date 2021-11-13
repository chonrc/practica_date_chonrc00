package es.unileon.prg1.date;

public class Date{
    private int day;
    private int month;
    private int year;

public Date(int day , int month, int year)
throws DateException {
  this.day = day;
  this.month = month;
  this.year= year;
  if ((year<1) || month<1 || month>12 || day<1 || day>Monthdays() )
  {throw new DateException("Invalid parameter");}
}

public boolean isSameDay(int dia){
    boolean isSameday = this.day==dia;
    return isSameday;
}

public boolean isSameMonth(int mes){
    boolean isSameMonth = mes==this.month;
    return isSameMonth;
}

public boolean isSameyear(int año){
    boolean isSameyear = this.year==año;
    return isSameyear;
}

public boolean isSame(Date fecha){
    boolean isSame = (fecha.isSameDay(this.day)&& fecha.isSameMonth(this.month)&&fecha.isSameyear(this.year));
    return isSame;
    
}

public String Monthname(){
    int mes = this.month;
    switch(mes){
        case 1: return "Enero";
        case 2: return "Febrero";
        case 3: return "Marzo";
        case 4: return "Abril";
        case 5: return "Mayo";
        case 6: return "Junio";
        case 7: return "Julio";
        case 8: return "Agosto";
        case 9: return "Septiembre";
        case 10: return "Octubre";
        case 11: return "Noviembre";
        case 12: return "Diciembre";
        default: return "Mes no válido";
    }
}

public int Monthdays(){
    int mes = this.month;
    switch(mes){
        case 1:
        case 3:
        case 5: 
        case 7:
        case 8:
        case 10:
        case 12 : return 31;
        case 4:
        case 6:
        case 9:
        case 11: return 30;
        case 2: 
        if ((this.year%4) == 0 ||( this.year%400) == 0)
            {return 29;}
        else{return 28;}
        default:{return 0;}
    }
}
public String Monthseason(){
    int mes = this.month;
    switch(mes){
        case 12:
        case 1:
        case 2: return "Invierno";
        case 3:
        case 4:
        case 5: return "Primavera";
        case 6 : 
        case 7:
        case 8: return "Verano";
        case 9:
        case 10: 
        case 11: return "Otoño";
        default: return "Mes invalido";
}
}

public int Monthsleft(){
    int days = 12 - this.month;
    return days; 
}

public String DateString(){
    String dia = Integer.toString(this.day);
    String año = Integer.toString(this.year);
    String resultado = (dia +"-"+ Monthname() + "-"+ año);
    return resultado;
}

public String Datesleft(int dia){
    dia = this.day;
    for(i=dia; i<=Monthdays();i++){
        Date x = new Date (x++,this.month,this.year){
            return Date

        }

    }


}


public String toString(){
    return this.day + " " + this.month + " " + this.year;
}
}
