import java.util.Scanner;
import java.util.Date;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Locale;

class DimensionLang{
    public static void main(String[] args){
        Scanner objs = new Scanner(System.in);
        Date relogio = new Date();
        Locale geo = Locale.getDefault();
        Dimension tk = Toolkit.getDefaultToolkit().getScreenSize();
        int screenwidth = tk.width;
        int screenheight = tk.height;
        String lang = geo.getLanguage();
        String country = geo.getCountry();
        
        System.out.println("Enter your name: ");
        String name = objs.nextLine();
        System.out.println("Your name is: "+ name +"\nThe resolution of your screen is: " + screenwidth + " X "+ screenheight +"\nYour language is: " + lang+"\nYour country is: "+ country +"\nThe date is: " + relogio);
        objs.close();
    }
}