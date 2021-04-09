import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MainController {

     public static void main(String[] args) {
         ApiContextInitializer.init();
         TelegramBotsApi api = new TelegramBotsApi();

         try {
             api.registerBot(new TestBot());
             System.out.println ( "Bot Server Started!!!" );
         } catch(TelegramApiException e) {
             System.out.println ( "Bot Server Exception>>" + e.toString() );
         }
     }

}
