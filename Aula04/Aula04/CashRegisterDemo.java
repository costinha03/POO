    package Aula04;
        
    class Product {
        private String name;
        private double price;
        private int quantity;

        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public double getTotalValue() {
            return price * quantity;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int  getQuantity() {
            return quantity;
        }
    }


    class CashRegister {

        private Product[] products;
        private int code;

        public CashRegister() {
            this.products = new Product[10];
            this.code = 0;
        }

        public void addProduct(Product p) {
            
            products[code] = p;
            code++;
        }

        public double getTotalValue() {
            double total = 0;
            for (int i = 0; i < code; i++) {
                total += products[i].getTotalValue();
            }
            return total;
        }

        public String toString() {
            String result = "Product\tPrice\tQuantity\tTotal\n";
            for (int i = 0; i < code; i++) {
                result += products[i].getName() + "\t" + products[i].getPrice() + "\t" +
                    products[i].getQuantity() + "\t" + products[i].getTotalValue() + "\n";
            }
            result += "Total value:\t" + getTotalValue();
            return result;
        }
        

    }

    public class CashRegisterDemo {

        public static void main(String[] args) {

            // Cria e adiciona 5 produtos
            CashRegister cr = new CashRegister();
            cr.addProduct(new Product("Book", 9.99, 3));
            cr.addProduct(new Product("Pen", 1.99, 10));
            cr.addProduct(new Product("Headphones", 29.99, 2));
            cr.addProduct(new Product("Notebook", 19.99, 5));
            cr.addProduct(new Product("Phone case", 5.99, 1));
            

            System.out.println(cr);

        }
    }
