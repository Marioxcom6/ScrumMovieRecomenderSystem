import java.util.*;

public class MovieRecommenderSystem {
    public static final String USER_NAME_ADMIN = "ADMIN";
    public static final String PASSWORD_ADMIN = "Admin-010101";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> users = new HashMap<>();
        TreeSet<String> movies = new TreeSet<>();


        users.put(USER_NAME_ADMIN, PASSWORD_ADMIN);

        while (true) {
            String currentUser = "";

            run1:
            while (true) {
                System.out.println("\n-------------- MENU --------------\n1. Register\n2. Login\n3. Exit");
                if(!sc.hasNextInt()) { sc.next(); continue; }
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("User: ");
                        String regUser = sc.nextLine();
                        System.out.print("Password: ");
                        String regPass = sc.nextLine();
                        System.out.println(registerUser(users, regUser, regPass));
                        break;
                    case 2:
                        System.out.print("User: ");
                        String logUser = sc.nextLine();
                        System.out.print("Password: ");
                        String logPass = sc.nextLine();

                        String result = loginUser(users, logUser, logPass);
                        if (users.containsKey(result)) {
                            currentUser = result; // Guardamos quién entró
                            break run1;
                        } else {
                            System.out.println(result);
                        }
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        return;
                }
            }


            if (currentUser.equals(USER_NAME_ADMIN)) {
                runAdmin:
                while (true) {
                    System.out.println("\n--- ADMIN MENU ---\n 1. Delete user\n2. Show all users\n3. Add movie\n4. Delete movie\n5. Show all movies\n6. Logout");
                    int choice = sc.nextInt();
                    sc.nextLine();

                    switch (choice) {
                        case 1:
                            System.out.print("User to delete: ");
                            System.out.println(deleteUser(users, sc.nextLine())); // Corregido sc.next
                            break;
                        case 2:
                            showAllUsers(users);
                            break;
                        case 3:
                            System.out.print("Movie name: ");
                            System.out.println(addMovie(movies, sc.nextLine()));
                            break;
                        case 4:
                            System.out.print("Movie to delete: ");
                            System.out.println(deleteMovie(movies, sc.nextLine()));
                            break;
                        case 5:
                            showAllMovies(movies);
                            break;
                        case 6:
                            break runAdmin;
                    }
                }
            }

            else {
                runUser:
                while (true) {
                    System.out.println("\n--- USER MENU ---\n1. Show all movies\n2. Find friends\n3. Logout");
                    int choice = sc.nextInt();
                    sc.nextLine();

                    switch (choice) {
                        case 1:
                            showAllMovies(movies);
                            break;
                        case 2:
                            System.out.print("Search user: ");
                            System.out.println(findUserByName(users, sc.nextLine()));
                            break;
                        case 3:
                            break runUser;
                    }
                }
            }
        }
    }


    public static String registerUser(HashMap<String, String> user, String username, String password) {
        if (user.containsKey(username)) return "User already exists!";
        if (!password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[\\W_]).{8,}$")) {
            return "Invalid Password! Needs: 1 Upper, 1 Lower, 1 Symbol and 1 Number (min 8 chars)";
        }
        user.put(username, password);
        return "User " + username + " created!";
    }

    public static String loginUser(HashMap<String, String> user, String userName, String password) {
        if (!user.containsKey(userName)) return "This Username doesn't exist";
        if (!user.get(userName).equals(password)) return "Password is incorrect";
        return userName;
    }

    public static String deleteUser(HashMap<String,String> listUsers, String userName){
        if (userName.equals(USER_NAME_ADMIN)) return "Cannot delete Admin!";
        return (listUsers.remove(userName) != null) ? "User deleted." : "User not found.";
    }

    public static String findUserByName(HashMap<String,String> listUsers, String userName){
        return listUsers.containsKey(userName) ? "User " + userName + " found! Added as friend." : "User not found.";
    }

    public static void showAllUsers(HashMap<String,String> listUsers){
        if (listUsers.isEmpty()) {
            System.out.println("No users.");
        } else {
            listUsers.forEach((k, v) -> System.out.println(k + " -> " + v));
        }
    }

    public static String addMovie(TreeSet<String> listMovies, String nameMovie) {
        return listMovies.add(nameMovie) ? "Movie added." : "Movie already exists.";
    }

    public static String deleteMovie(TreeSet<String> listMovies, String nameMovie) {
        return listMovies.remove(nameMovie) ? "Movie removed." : "Movie does not exist.";
    }

    public static void showAllMovies(TreeSet<String> listMovies){
        if (listMovies.isEmpty()) System.out.println("No movies available.");
        else listMovies.forEach(System.out::println);
    }
}