import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MovieRecommenderSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        HashMap<String,Integer> hashMap1 = new HashMap<>();
        while (true){
            String identificador = sc.nextLine();
            buscarUsuarioporelnombre(hashMap1,identificador);
        }
    }
    // Borrar el usuario
    public static HashMap borrarUser(HashMap<String,Integer> hashMap,String usuario){
        if (hashMap.isEmpty()){
            System.out.println("The hashmap can't be null");
        }
        if (hashMap.containsKey(usuario)){
            System.out.println("User deleted: "+ usuario);
            hashMap.remove(usuario);
        }
        return hashMap;
    }
    // buscar usuario por el nombre
    public static void buscarUsuarioporelnombre(HashMap<String,Integer> hashMap,String usuario){
        if (hashMap.isEmpty()){
            System.out.println("The hashmap can't be null");
        }
        if (hashMap.containsKey(usuario)){
            String search = hashMap.get(usuario).toString();
            System.out.println("Here is the user : "+ search);
        }
    }
    // mostrar todos los usuarios
    public static void mostrarTodosLosUsuarios(HashMap<String,Integer> hashMap){
        if (hashMap.isEmpty()){
            System.out.println("The hashmap can't be null");
        }
        for (Map.Entry<String, Integer> each:hashMap.entrySet()){
            String nombredeusuarios = each.getKey();
            System.out.println("This are the users: \n"+ nombredeusuarios);
        }
    }


}