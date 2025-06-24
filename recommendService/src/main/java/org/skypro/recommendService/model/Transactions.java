package org.skypro.recommendService.model;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import org.jspecify.annotations.NonNull;

import java.util.Objects;
import java.util.UUID;

@Entity
public class Transactions {
    @Id
    @NonNull
    private UUID id;

    @NonNull
    @JoinColumn(table = "PRODUCTS", referencedColumnName = "ID")
    private UUID product_id;

    @NonNull
    @JoinColumn(table = "USERS", referencedColumnName = "ID")
    private UUID user_id;

    @NonNull
    private String type;
    @NonNull
    private int amount;

    public Transactions() {}

    public Transactions(@NonNull UUID id, @NonNull UUID product_id, @NonNull UUID user_id,
                        @NonNull String type, @NonNull int amount) {
        this.id = id;
        this.product_id = product_id;
        this.user_id = user_id;
        this.type = type;
        this.amount = amount;
    }

    public @NonNull UUID getId() {
        return id;
    }

    public void setId(@NonNull UUID id) {
        this.id = id;
    }

    public @NonNull UUID getProduct_id() {
        return product_id;
    }

    public void setProduct_id(@NonNull UUID product_id) {
        this.product_id = product_id;
    }

    public @NonNull UUID getUser_id() {
        return user_id;
    }

    public void setUser_id(@NonNull UUID user_id) {
        this.user_id = user_id;
    }

    public @NonNull String getType() {
        return type;
    }

    public void setType(@NonNull String type) {
        this.type = type;
    }

    @NonNull
    public int getAmount() {
        return amount;
    }

    public void setAmount(@NonNull int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transactions that = (Transactions) o;
        return amount == that.amount && Objects.equals(id, that.id) && Objects.equals(product_id, that.product_id) && Objects.equals(user_id, that.user_id) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, product_id, user_id, type, amount);
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "id=" + id +
                ", product_id=" + product_id +
                ", user_id=" + user_id +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                '}';
    }
}
