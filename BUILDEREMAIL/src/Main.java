import builder.Email;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Email email = new Email.EmailBuilder()
                .setDestinatario("adortiz@gmail.com")
                .setAsunto("envio de documentos")
                .setCuerpo("Adjunto documentos importantes")
                .build();

        System.out.println(email);



    }
}