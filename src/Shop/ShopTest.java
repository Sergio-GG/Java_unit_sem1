package Shop;

import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

public class ShopTest {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();

        Shop shop = new Shop();

        product1.setCost(50);
        product1.setTitle("Drink");

        product2.setCost(15);
        product2.setTitle("Bubble gum");

        product3.setCost(10);
        product3.setTitle("Apple");

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        shop.setProducts(productList);
        System.out.println(shop.sortProductsByPrice());
        System.out.println(shop.getMostExpensiveProduct());

        assertThat(productList).hasSize(3);
        assertThat(productList).contains(product1,product2,product3).isNotEmpty();
        assertThat(shop.sortProductsByPrice()).containsSequence(product3, product2, product1);
        assertThat(shop.getMostExpensiveProduct()).isEqualTo(product1);





    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */
    }
}