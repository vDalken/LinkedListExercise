public class Main{
    public static void main(String[] args){
        List<String> list = new List<>();

        list.add("ola");
        list.add("adeus");
        list.add("adeus 2");
        list.add("CARAGA",1);
        System.out.println(list.get(1));
        list.delete(1);

    }
}