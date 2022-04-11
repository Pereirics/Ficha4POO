import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAula {

    public static void main(String[] args){

        String[] fruits = new String[3];
        fruits[0] = "Mango";
        fruits[1] = "Apple";
        fruits[2] = "Strawberry";
        //fruits[3] = "Watermelon"; Não dá para adicionar mais pois tenho que alterar o tamanho do array;
        System.out.println(fruits[1]);

        ArrayList<Object> fruitList = new ArrayList<>();
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        //fruitList.add("Watermelon"); Posso fazer pois posso alterar o tamanho do ArrayList à vontade;

        //fruitList.removeAll(); ou fruitList.clear(); Para remover todos os elementos do ArrayList
        //Boolean a = fruitList.contains("Raspberry");
        fruitList.clear();
        System.out.println(fruitList);

        //Iteradores
        Iterator<Object> iterator = fruitList.iterator();
        while (iterator.hasNext()) {
            System.out.println("O próximo elemento é: " + iterator.next());
        }
    }
}
