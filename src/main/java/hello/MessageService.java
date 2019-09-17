package hello;

import org.springframework.stereotype.Component;

@Component
public class MessageService {
    public MessageService() {
        super();
        System.out.println("messageService。。。。");
    }
    public String service(){
        return "hello world!";
    }
}
