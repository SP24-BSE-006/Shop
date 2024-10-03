import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Shop shop= new Shop(new Person("John", "email"),"Lahore");
        Scanner sc = new Scanner(System.in);
        while(true) {
            int choice= sc.nextInt();
            switch (choice) {
                case 1:
                    shop.addProduct();
                    break;
                case 2:
                    shop.sale();
                    break;
                case 3:
                    shop.displayProducts();
                    break;
                case 4:
                    shop.modifyProduct();
                    break;
                case 5:
                    shop.removeProduct();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
            }
        }
    }
}