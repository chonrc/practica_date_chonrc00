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
  if ((year<1) || month<1 || month>12 || day<1 || day>Monthdays(this.month) )
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

public String Monthname(int mes){
    
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

public int Monthdays(int mes){
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
    int Monthsleft = 12 - this.month;
    return Monthsleft; 
}

public String DateString(){
    String dia = Integer.toString(this.day);
    String año = Integer.toString(this.year);
    String resultado = (dia +"-"+ Monthname(this.month) + "-"+ año);
    return resultado;
}

public void Datesleft(){
    for (int i =this.day;i<=Monthdays(this.month);i++){
        System.out.println(i + "-" + this.month + "-"+ this.year );
    }}

public void sameMonthdays(){
    if (Monthdays(this.month)==28|| Monthdays(this.month)==29){
        System.out.println("Febrero");}
    if (Monthdays(this.month)==4||Monthdays(this.month)==6||Monthdays(this.month)==9||Monthdays(this.month)==11){
        System.out.println(Monthname(4)+" "+Monthname(6)+" "+Monthname(9)+" "+Monthname(11));
    }else{
        System.out.println(Monthname(1)+" "+Monthname(3)+" "+Monthname(5)+" "+Monthname(7)+" "+Monthname(8)+" "+Monthname(10)+" "+Monthname(12));}
        
}

public int dayspassed(){
    int suma= 0;
    for (int x=1;x<this.month;x++){
    for(int i =1;i<=Monthdays(x);i++){
        suma = suma+1;
    }}

    for (int i=1;i<=this.day;i++){
        suma = suma +1;
    }
    return suma;
}

// public int AttempstoDate(){
//     int day = 0;
//     int months = 0;
//     int attemps= 0;
// while (day !=this.day && months!= this.month){
   // months = (int)(Math.random()*(12+1)); 
//     day = (int)(Math.random()*(Monthdays(months)+1));  
//      
//     attemps = attemps+1;
// }
// return attemps;
// }


public int AttempstoDate(){
    int day = 0;
    int months = 0;
    int attemps= 0;
do {
   
    months = (int)(Math.random()*(12+1));  
    day = (int)(Math.random()*(Monthdays(months)+1));  
    
    attemps = attemps+1;
}while(day !=this.day && months!= this.month);
return attemps;
}

public void today(){
    int[] meses = {0,3,2,5,0,3,5,1,4,6,2,4};
    if (this.month<3){
        year = year -1;}
       int  primero = (this.year+(this.year/4)-(this.year/100)+(this.year/400)+meses[this.month-1]+this.day)%7;    
    System.out.println(primero);
}

public String toString(){
    return this.day + " " + this.month + " " + this.year;
}
}