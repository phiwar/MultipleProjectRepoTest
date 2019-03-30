public class Application {

    public static void main(String[] args){

        Counter model = new Counter(0);
        model.inc(2);
        System.out.println(model.getCount());
    }


}
