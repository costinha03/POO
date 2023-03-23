package Aula05;

public class calendario {
    private int year;
    private int weekStart;
    private String[] months= {"January","February","March","April","May","June","July","August","September","October","November","December"};

    public calendario(int year, int weekStart) {
        this.year = year;
        this.weekStart = weekStart;
    }

    public int getYear(int year) {
        return year;
    }

    public int getFirstWeekdayOfMonth(int mes) {
        return weekStart;
    }

    public void printMonth(int mes) {
        System.out.printf("%12s %-10s\n", months[mes-1], year);
        System.out.printf("%3s%3s%3s%3s%3s%3s%3s\n", "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa");
                
        for(int l=0; l<6; l++) {		
            for(int c=1; c<8; c++) {		
                if((l==0 && c<weekStart) || ((l*7 + (c-weekStart + 1)) > dateGen.monthDays(mes, year))) {	
                     System.out.printf("%3s", " ");							
                } else {
                    System.out.printf("%3d", (l*7 + (c-weekStart + 1)));		
                }
            }
            System.out.println();	
        }	
    }
public boolean validWeekDay(int weekStart) throws Exception{
    if (weekStart < 1 || weekStart > 7) {
        return true;
    }
    else {throw new Exception("Insert a valid day of the week");}
}
    public void printCalendario() {
        for(int i = 1; i <= 11; i++) {
            System.out.printf("%12s %-10s\n", months[i-1], year);
            System.out.printf("%3s%3s%3s%3s%3s%3s%3s\n", "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa");
            
            for(int l=0; l<6; l++) {		
                for(int c=1; c<8; c++) {		
                    if((l==0 && c<weekStart) || ((l*7 + (c-weekStart + 1)) > dateGen.monthDays(i, year))) {	
                        System.out.printf("%3s", " ");							
                    } else {
                        System.out.printf("%3d", (l*7 + (c-weekStart + 1)));		
                    }
                }
                System.out.println();		
            }	
        }
    }
}

    