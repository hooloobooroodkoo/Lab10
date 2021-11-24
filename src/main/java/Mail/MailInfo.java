package Mail;

import Mail.Client;
import Mail.MailCode;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter@Setter
public class MailInfo {
    private Client client;
    private MailCode mailCode;

    public MailInfo(Client c) {
        this.client = c;
    }

    public String getMailText() {
        String text = mailCode.generateText();
        HashMap<String, String> template = new HashMap<>();
        template.put("%NAME%", client.getName());
        for (String key: template.keySet()) {
            text.replace(key, template.get(key));
        }
        return text;
    }
    public void getClient(Client c) {
        this.client = client;
    }
}
