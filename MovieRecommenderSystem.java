import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MovieRecommenderSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        HashMap<String,String> hashMap1 = new HashMap<>();

//        while (true){
//            String nombre = "";
//            String contraseña = "";
//
//            if (sc.hasNextInt()) {
//                int user= sc.nextInt();
//                sc.nextLine();
//
//                switch (user) {
//                    case 1:
//                        System.out.println("pon tu email,contraseña");
//                        nombre = sc.nextLine();
//                        contraseña = sc.nextLine();
//                        hashMap1.put(nombre, contraseña);
//                        break;
//                    case 2:
//                        nombre = sc.nextLine();
//                        borrarUser(hashMap1, nombre);
//                        break;
//                    case 3:
//                        System.out.println("Searching The user by the user");
//                        nombre = sc.nextLine();
//                        buscarUsuarioporelnombre(hashMap1, nombre);
//                        break;
//                    case 4:
//                        mostrarTodosLosUsuarios(hashMap1);
//                        break;
//                }
//            }
//        }

    }
    // Borrar el usuari
    public static boolean borrarUser(HashMap<String,String> usuaris,String usuari){
         boolean isDeleted = false;
        if (usuaris== null){
            System.out.println("The hashmap can't be null");
            return false;
        }
        if (usuaris.containsKey(usuari)){
            usuaris.remove(usuari);
            isDeleted= true;
        }
        if (isDeleted){
            System.out.println("User deleted: "+usuari);
        }
        for (Map.Entry<String, String> each:usuaris.entrySet()){
            String nombredeusuarios = each.getKey();
            System.out.println("This are the users: \n"+ nombredeusuarios);
        }
        return isDeleted;


    }
    // buscar usuario por el nombre
    public static void buscarUsuarioporelnombre(HashMap<String,String> usuaris,String usuari){
        if (usuaris.containsKey(usuari)){
            String contaseña = usuaris.get(usuari);
            System.out.println("Here is the user : "+usuari +" Password "+ contaseña);
        }
    }
    // mostrar todos los usuarios
    public static void mostrarTodosLosUsuarios(HashMap<String,String> hashMap){
        if (hashMap==null){
            System.out.println("The hashmap can't be null");
            return;
        }
        for (Map.Entry<String, String> each:hashMap.entrySet()){
            String nombredeusuarios = each.getKey();
            System.out.println("This are the users: \n"+ nombredeusuarios);
        }
    }


}