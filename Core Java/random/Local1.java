import java.util.*;
import java.io.*;
import java.text.NumberFormat;
import java.text.DateFormat;


class Local1
{
    PrintWriter pw = new PrintWriter(System.out, true);
    Locale usLocale=Locale.US;
	Locale frLocale=Locale.FRANCE;
	Locale currentLocale=Locale.getDefault();
	ResourceBundle messages=ResourceBundle.getBundle("MessagesBundle",currentLocale);
    DateFormat df;
    NumberFormat currency;
    Double money=new Double(1000000.00);
	Date today=new Date();
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String ar[]){	   
        //SampleApp ui=new SampleApp();
        Local1 ui = new Local1();
        ui.run();
	}	
    public void run(){
	
        String line="";
        while(!(line.equals("q"))){
            this.printMenu();
            try{
                line=this.br.readLine();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        switch(line){
            case "1": setEnglish();
            break;
            case"2": setFrench();
            break;
            case"3": showDate();
            break;
            case"4": showMoney();
            break;
        }
	}
}
    public void printMenu(){
        PrintWriter pw=new PrintWriter(System.out,true);
        pw.println("==========LOCALIZATION APP=========");
        pw.println("1."+messages.getString("menu1"));
        pw.println("2."+messages.getString("menu2"));
        pw.println("3."+messages.getString("menu3"));
        pw.println("4."+messages.getString("menu4"));
        pw.println("q."+messages.getString("menuq"));
        System.out.println(messages.getString("menucommand")+" ");
    }

    public void setFrench(){
        currentLocale=frLocale;
        messages=ResourceBundle.getBundle("MessagesBundle",currentLocale);
    }
    public void setEnglish(){
        currentLocale=usLocale;
        messages=ResourceBundle.getBundle("MessagesBundle",currentLocale);
    }
    public void showDate(){
        df=DateFormat.getDateInstance(DateFormat.DEFAULT,currentLocale);
        pw.println(df.format(today)+" "+currentLocale.toString());
    }
    public void showMoney(){
        currency=NumberFormat.getCurrencyInstance(currentLocale);
        pw.println(currency.format(money)+" "+currentLocale.toString());
    }
}
