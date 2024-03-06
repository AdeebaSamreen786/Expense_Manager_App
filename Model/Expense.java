package Model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Builder
public class Expense {
    private  int id;
    private String title;
    private double amount;
    String payment_mode;
}
