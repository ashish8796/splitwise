package dev.ashish.splitwise.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Currency;
import java.util.List;

@Entity
@Getter
@Setter
public class Expense extends BaseModel{
    private String description;
    private LocalDateTime expenseTime;
    private Currency currency;
    private double amount;
    @ManyToOne
    private User spender;
    @OneToMany
    private List<UserExpense> userExpenses;
}
