//создаем новый класс
public class Main {
    //создаем метод
    public static void main(String[] args) {
        //тут пишется код - метод
        System.out.println("Start program");
        if (Integer.parseInt(args[0]) > 100){
            //используем метод(delaemMetod1),как его выполнять опишем ниже
            delaemMetod1();
    }else{
            //используем метод(delaemMetod2),как его выполнять опишем ниже
            delaemMetod2();
        }
        System.out.println("End program");
}
//теперь описываем, как выполняется delaemMetod1
    //т.е. создаем метод (delaemMetod1)
static void delaemMetod1(){
        System.out.println("Sovpadaet");
}
    //теперь описываем, как выполняется delaemMetod2
    //т.е. создаем метод (delaemMetod2)
static void delaemMetod2(){
        System.out.println("Nekorrektnyj vvod");
}
}