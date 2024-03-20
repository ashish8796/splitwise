package dev.ashish.splitwise.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "Splitwise_Group")
public class Group extends BaseModel {
    private String name;
    @ManyToOne
    private User createdBy;
    @ManyToMany
    private List<User> members;
    @OneToMany
    private List<Expense> expenses;
    private LocalDateTime createdDate;
    private int totalAmountSpent;
    @OneToMany
    private List<SettlementTransaction> settleUpTransactions;
}
