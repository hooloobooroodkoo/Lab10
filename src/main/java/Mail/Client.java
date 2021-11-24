package Mail;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Client {
    private int id;
    private String name;
    private int age;
    private Gender sex;

    public Client() {
        id = ClientIDGenerator.generatorID();
    }
    public static class ClientIDGenerator {
        private static int counter = 0;

        public static int generatorID() {
            counter++;
            return counter;
        }
    }
}
