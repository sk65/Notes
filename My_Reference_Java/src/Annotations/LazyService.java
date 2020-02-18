package Annotations;

@Service(name = "VeryLazyService")
public class LazyService {
    @Init
    public void lazyService() throws Exception {
        System.out.println("Lazy is working");
    }
}
