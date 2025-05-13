package quiz2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
public class Order {
    private int orderId;
    private String customerName;
    private List<Product> products;
    private LocalDate orderDate;

    public double getTotalAmount(){
        return products.stream().mapToDouble(Product::getPrice).sum();
    }
}
