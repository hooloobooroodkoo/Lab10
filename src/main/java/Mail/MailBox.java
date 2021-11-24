package Mail;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MailBox {
    private ArrayList<MailInfo> infos;
    private ArrayList<Client> clients;

    public void addMailInfo(MailInfo info) {
        infos.add(info);
    }

    public void sendAll() {
        for (MailInfo info: infos) {
            for (Client client: clients) {
                info.getClient(client);
            }
        }
    }
}
