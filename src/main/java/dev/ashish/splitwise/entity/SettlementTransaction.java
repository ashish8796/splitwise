package dev.ashish.splitwise.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Currency;

@Entity
@Getter
@Setter
public class SettlementTransaction extends BaseModel{
    @ManyToOne
    private User debtor;
    @ManyToOne
    private User spender;
    private double amount;
    private Currency currency;
}
