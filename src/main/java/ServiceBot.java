import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class ServiceBot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived (Update update) {

        SendMessage msg = new SendMessage().enableHtml(true);
        msg.setText (update.getMessage().getText());
        msg.setChatId(update.getMessage().getChatId());

        try {
            execute(msg);
        } catch(TelegramApiException e) {
            System.out.println ( "telegram received exception>>" + e.toString() );
        }

    }

    @Override
    public String getBotUsername() {

        return "YuantaTestBot";

    }

    @Override
    public String getBotToken() {
        return "1567661233:AAFTECHHzW2EUOmdZObs7Rz4Ab7SZ4q_0RI";
    }






}
