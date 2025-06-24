package org.skypro.recommendService.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.jspecify.annotations.NonNull;

import java.util.Objects;
import java.util.UUID;

@Entity
public class Users {
    @Id
    @NonNull
    private UUID id;
    @NonNull
    private String username;
    @NonNull
    private String first_name;
    @NonNull
    private String last_name;

    public Users() {}

    public Users(@NonNull UUID id, @NonNull String username, @NonNull String first_name, @NonNull String last_name) {
        this.id = id;
        this.username = username;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public @NonNull UUID getId() {
        return id;
    }

    public void setId(@NonNull UUID id) {
        this.id = id;
    }

    public @NonNull String getUsername() {
        return username;
    }

    public void setUsername(@NonNull String username) {
        this.username = username;
    }

    public @NonNull String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(@NonNull String first_name) {
        this.first_name = first_name;
    }

    public @NonNull String getLast_name() {
        return last_name;
    }

    public void setLast_name(@NonNull String last_name) {
        this.last_name = last_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(id, users.id) && Objects.equals(username, users.username) && Objects.equals(first_name, users.first_name) && Objects.equals(last_name, users.last_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, first_name, last_name);
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                '}';
    }
}
