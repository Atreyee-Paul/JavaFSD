public class Main {

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shirt", "Fashion"),
            new Product(103, "Phone", "Electronics"),
            new Product(104, "Shoes", "Fashion"),
            new Product(105, "Camera", "Electronics")
        };

        // Linear Search
        Product result1 = linearSearch(products, "Phone");
        if (result1 != null) {
            System.out.println("Linear Search: Found - " + result1.productName);
        } else {
            System.out.println("Linear Search: Not found");
        }

        sortProductsByName(products);

        // Binary Search
        Product result2 = binarySearch(products, "Phone");
        if (result2 != null) {
            System.out.println("Binary Search: Found - " + result2.productName);
        } else {
            System.out.println("Binary Search: Not found");
        }
    }

    public static Product linearSearch(Product[] products, String targetName) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String targetName) {
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compare = products[mid].productName.compareToIgnoreCase(targetName);

            if (compare == 0) {
                return products[mid];
            } else if (compare < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void sortProductsByName(Product[] products) {
        int n = products.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (products[j].productName.compareToIgnoreCase(products[j + 1].productName) > 0) {
                    Product temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                }
            }
        }
    }
}
