package Annotations;

@Service(name = "VerySimpleService")
public class SimpleService {
    @Init
    public void initService() {
        System.out.println("Init is Working");
    }
}
