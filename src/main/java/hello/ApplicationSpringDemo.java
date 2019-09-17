package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan
public class ApplicationSpringDemo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        //MessageService messageService = context.getBean(MessageService.class);
        MessagePrinter messagePrinter = context.getBean(MessagePrinter.class);
        //messagePrinter.setMessageService(messageService);
        //System.out.println(messageService+"messageService");
        System.out.println(messagePrinter+"messagePrinter");
        messagePrinter.printerMessage();
    }
}
