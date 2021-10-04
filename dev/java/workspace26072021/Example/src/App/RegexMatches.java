package App;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

   public static void main( String args[] ) {
      // Строка для сканирования, чтобы найти шаблон
      String str = "Крещение Руси произошло в 988 году! Не так ли?";
      String pattern = "(.*)(\\d+)(.*)";

      // Создание Pattern объекта
      Pattern r = Pattern.compile(pattern);

      // Создание matcher объекта
      Matcher m = r.matcher(str);
      System.out.println(m.groupCount()+"Count");
      while (m.find()) {
    	  System.out.println(m.group());
      }
      if (m.find( )) {
    	  
         System.out.println(m.group());
         System.out.println("Найдено значение: " + m.group(0));
         System.out.println("Найдено значение: " + m.group(1));
         System.out.println("Найдено значение: " + m.group(2));
      }else {
         System.out.println("НЕ СОВПАДАЕТ");
      }
   }
}