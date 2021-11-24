package Mail;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class MailSender {
    private MailInfo mailInfo;

    public String sendMail() {
        return mailInfo.getMailCode().generateText();
    }
}
