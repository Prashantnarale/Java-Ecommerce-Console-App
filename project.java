import java.util.*;

class project {
    static String userName;
    static String email;
    static String contact;
    static String address;
    static String password;
    static ArrayList<String> cart = new ArrayList<>();
    static double totalBill;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        outerLoop:
        for (;;) {
            System.out.println();
            System.out.println("  *****WELCOME*****");
            System.out.println();
            System.out.println("1.NEW USER");
            System.out.println("2.LOGIN");
            System.out.println();
            System.out.print("Enter your option: ");
            int opt = sc.nextInt();
            System.out.println();
            switch (opt) {
                case 1 -> newUser();
                case 2 -> login();
                default -> System.out.println("Invalid option");
            }
        }
    }

    public static void newUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("   New User   ");
        System.out.println();

        System.out.print("Username: ");
        userName = sc.nextLine();

        System.out.print("Email: ");
        email = sc.next();

        System.out.print("Contact: ");
        contact = sc.next();

        System.out.print("Address: ");
        address = sc.next();

        System.out.print("Password: ");
        password = sc.next();
        System.out.println();
        System.out.println("Account created " + (char) 3);
    }

    public static void login() {
        if (userName == null) {
            System.out.println("Create your account first");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("** LOGIN **");
        for (int i = 1, attempt = 3; i <= 3; i++, attempt--) {
            System.out.print("Username/phone: ");
            String cred1 = sc.nextLine();
            System.out.print("Password: ");
            String cred2 = sc.next();
            if ((cred1.equals(userName) || cred1.equals(contact)) && cred2.equals(password)) {
                homepage();
                return;
            }
            System.out.println("Wrong credentials, Attempts left: " + (attempt - 1));
        }
        System.out.println("\n3 attempts done");
        System.out.println("You seem to be a different user");
        System.out.println("Thank you & never visit again");
        System.exit(0);
    }

    public static void homepage() {
        for (;;) {
            System.out.println();
            System.out.println("  *** HOME PAGE ***");
            System.out.println();
            System.out.println("Shop by category");
            System.out.println("1. Men");
            System.out.println("2. Women");
            System.out.println("3. View cart");
            System.out.println("4. Wishlist");
            System.out.println("5. Orders");
            System.out.println("6. Logout\n");
            System.out.print("Enter your option: ");
            int opt = new Scanner(System.in).nextInt();
            switch (opt) {
                case 1 -> shopMen();
                case 2 -> shopWomen();
                case 3 -> viewCart();
                case 4 -> wishList();
                case 5 -> order();
                case 6 -> {
                    System.out.println("Thank you & visit again");
                    System.exit(0);
                }
                default -> System.out.println("Invalid Option");
            }
        }
    }

    public static void shopMen() {
        for (;;) {
            System.out.println();
            System.out.println("    MEN SECTION    ");
            System.out.println("1. Clothes");
            System.out.println("2. Footwear");
            System.out.println("3. Accessories");
            System.out.println("4. Homepage \n");
            System.out.print("Enter your option: ");
            int opt = new Scanner(System.in).nextInt();
            switch (opt) {
                case 1 -> clothes();
                case 2 -> footWare();
                case 3 -> accessories();
                case 4 -> homepage();
                default -> System.out.println("Invalid Option");
            }
        }
    }

    public static void clothes() {
        for (;;) {
            System.out.println("\n CLOTHES  \n");
            System.out.println("101 : Shirt    -   799/-");
            System.out.println("102 : T-Shirt  -   699/-");
            System.out.println("103 : Jeans    -   999/-");
            System.out.println("100 : BACK");
            System.out.print("Enter a product ID: ");
            int proId = new Scanner(System.in).nextInt();
            switch (proId) {
                case 101 -> addCart("101 : Shirt    -   799/-", 799);
                case 102 -> addCart("102 : T-Shirt  -   699/-", 699);
                case 103 -> addCart("103 : Jeans    -   999/-", 999);
                case 100 -> shopMen();
                default -> System.out.println("Invalid product ID");
            }
        }
    }

    public static void footWare() {
        for (;;) {
            System.out.println("\n FOOTWEAR \n");
            System.out.println("104 : FlipFlop  -  799/-");
            System.out.println("105 : Slippers  - 1009/-");
            System.out.println("106 : Shoes     - 1019/-");
            System.out.println("100 : BACK");
            System.out.print("Enter Product ID: ");
            int proId = new Scanner(System.in).nextInt();
            switch (proId) {
                case 104 -> addCart("104 : FlipFlop  -  799/-", 799);
                case 105 -> addCart("105 : Slippers  - 1009/-", 1009);
                case 106 -> addCart("106 : Shoes     - 1019/-", 1019);
                case 100 -> shopMen();
                default -> System.out.println("Invalid product ID");
            }
        }
    }

    public static void accessories() {
    for (;;) {
        System.out.println("\n   ACCESSORIES   \n");
        System.out.println("201 : Belt       -  299/-");
        System.out.println("202 : Cap        -  199/-");
        System.out.println("203 : Wallet     -  499/-");
        System.out.println("100 : BACK");
        System.out.print("Enter a product ID: ");
        int proId = new Scanner(System.in).nextInt();
        switch (proId) {
            case 201 -> addCart("201 : Belt       -  299/-", 299);
            case 202 -> addCart("202 : Cap        -  199/-", 199);
            case 203 -> addCart("203 : Wallet     -  499/-", 499);
            case 100 -> shopMen();
            default -> System.out.println("Invalid product ID");
        }
    }
}


    public static void shopWomen() {
    for (;;) {
        System.out.println("\n    WOMEN SECTION  \n");
        System.out.println("1. Clothes");
        System.out.println("2. Footwear");
        System.out.println("3. Accessories");
        System.out.println("4. Homepage");
        System.out.print("Enter your option: ");
        int opt = new Scanner(System.in).nextInt();
        switch (opt) {
            case 1 -> {
                for (;;) {
                    System.out.println("\n WOMEN CLOTHES  \n");
                    System.out.println("301 : Dress     -  999/-");
                    System.out.println("302 : Saree     - 1499/-");
                    System.out.println("303 : Kurti     -  799/-");
                    System.out.println("100 : BACK");
                    System.out.print("Enter a product ID: ");
                    int proId = new Scanner(System.in).nextInt();
                    switch (proId) {
                        case 301 -> addCart("301 : Dress     -  999/-", 999);
                        case 302 -> addCart("302 : Saree     - 1499/-", 1499);
                        case 303 -> addCart("303 : Kurti     -  799/-", 799);
                        case 100 -> shopWomen();
                        default -> System.out.println("Invalid product ID");
                    }
                }
            }
            case 2 -> {
                for (;;) {
                    System.out.println("\n WOMEN FOOTWEAR  \n");
                    System.out.println("304 : Sandals   -  499/-");
                    System.out.println("305 : Heels     - 1199/-");
                    System.out.println("306 : Flats     -  699/-");
                    System.out.println("100 : BACK");
                    System.out.print("Enter a product ID: ");
                    int proId = new Scanner(System.in).nextInt();
                    switch (proId) {
                        case 304 -> addCart("304 : Sandals   -  499/-", 499);
                        case 305 -> addCart("305 : Heels     - 1199/-", 1199);
                        case 306 -> addCart("306 : Flats     -  699/-", 699);
                        case 100 -> shopWomen();
                        default -> System.out.println("Invalid product ID");
                    }
                }
            }
            case 3 -> {
                for (;;) {
                    System.out.println("\n WOMEN ACCESSORIES  \n");
                    System.out.println("307 : Handbag   - 1999/-");
                    System.out.println("308 : Earrings  -  299/-");
                    System.out.println("309 : Scarf     -  399/-");
                    System.out.println("100 : BACK");
                    System.out.print("Enter a product ID: ");
                    int proId = new Scanner(System.in).nextInt();
                    switch (proId) {
                        case 307 -> addCart("307 : Handbag   - 1999/-", 1999);
                        case 308 -> addCart("308 : Earrings  -  299/-", 299);
                        case 309 -> addCart("309 : Scarf     -  399/-", 399);
                        case 100 -> shopWomen();
                        default -> System.out.println("Invalid product ID");
                    }
                }
            }
            case 4 -> homepage();
            default -> System.out.println("Invalid Option");
        }
    }
}


    public static void addCart(String item, double price) {
        cart.add(item);
        totalBill += price;
        System.out.println("\nProduct added to cart successfully");
    }

    public static void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("\nCart is empty\n");
            return;
        }
        System.out.println("  ITEMS IN CART");
        for (String item : cart) {
            System.out.println(item);
        }
        System.out.println("  Total Bill: " + totalBill + " Rs");
        System.out.print("\nDo you want to remove any product (yes/no): ");
        String response = new Scanner(System.in).next();
        if (response.equalsIgnoreCase("yes")) {
            System.out.print("Enter product ID to remove: ");
            int proId = new Scanner(System.in).nextInt();
            if (removeProductFromCart(proId)) {
                System.out.println("Product removed");
            } else {
                System.out.println("Product not found");
            }
        }
    }

    public static boolean removeProductFromCart(int proId) {
        String idStr = String.valueOf(proId);
        for (Iterator<String> it = cart.iterator(); it.hasNext();) {
            String item = it.next();
            if (item.startsWith(idStr)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    static ArrayList<String> wishlist = new ArrayList<>();

public static void wishList() {
    if (wishlist.size() == 0) {
        System.out.println("\nWishlist is empty\n");
        return;
    }
    
    System.out.println("\n ITEMS IN WISHLIST:");
    for (String item : wishlist) {
        System.out.println(item);
    }

    System.out.println("\nDo you want to move an item to cart? (yes/no)");
    String response = new Scanner(System.in).next();

    if (response.equalsIgnoreCase("yes")) {
        System.out.println("Enter the exact product name to move:");
        String product = new Scanner(System.in).nextLine();

        if (wishlist.contains(product)) {
            System.out.println("Enter product price:");
            double price = new Scanner(System.in).nextDouble();
            addCart(product,  price);
            wishlist.remove(product);
            System.out.println("Product moved from wishlist to cart.");
        } else {
            System.out.println("Product not found in wishlist.");
        }
    }
}
public static void addToWishlist(String item) {
    wishlist.add(item);
    System.out.println("\nPRODUCT ADDED TO WISHLIST SUCCESSFULLY");
}


    static ArrayList<String> orders = new ArrayList<>();

public static void order() {
    if (cart.isEmpty()) {
        System.out.println("\nCart is empty, add products before ordering.\n");
        return;
    }
    System.out.println("\n *** ORDER CONFIRMATION ***");
    for (String item : cart) {
        orders.add(item);
    }
    cart.clear();
    System.out.println("Order placed successfully!");
    System.out.println("\nYour Orders: ");
    for (String order : orders) {
        System.out.println(order);
    }
}

}
