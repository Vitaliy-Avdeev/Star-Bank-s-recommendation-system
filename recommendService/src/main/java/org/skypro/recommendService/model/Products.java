package org.skypro.recommendService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.jspecify.annotations.NonNull;

import java.util.Objects;
import java.util.UUID;

@Entity
public class Products {
    @Id
    @NonNull
    private UUID id;
    @NonNull
    private String type;
    @NonNull
    private String name;

    public Products(@NonNull UUID id, @NonNull String type, @NonNull String name) {
        this.id = id;
        this.type = type;
        this.name = name;
    }

    public Products() {}

    public @NonNull UUID getId() {
        return id;
    }

    public @NonNull String getType() {
        return type;
    }

    public @NonNull String getName() {
        return name;
    }

    public void setId(@NonNull UUID id) {
        this.id = id;
    }

    public void setType(@NonNull String type) {
        this.type = type;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return Objects.equals(id, products.id) && Objects.equals(type, products.type) && Objects.equals(name, products.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, name);
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
