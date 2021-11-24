package Mail;

import static org.junit.jupiter.api.Assertions.*;

class MailSenderTest {
private MailInfo mailInfo;
private Client client;
private MailSender sender;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        client = new Client();
        client.setName("Jack");
        client.setSex(Gender.MALE);
        client.setAge(18);
        mailInfo = new MailInfo(client);
        sender = new MailSender();
        sender.setMailInfo(mailInfo);

    }

    @org.junit.jupiter.api.Test
    void sendMail() {
        assertEquals("Client(id=1, name=Jack, age=18, sex=MALE)", sender.getMailInfo().getClient().toString());
    }
}