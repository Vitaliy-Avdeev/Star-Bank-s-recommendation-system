package org.skypro.recommendService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.jspecify.annotations.NonNull;

import java.util.Objects;

@Entity
public class SpatialRefSys {
    @Id
    @NonNull
    private int srid;
    private String auth_name;
    private int auth_srid;
    private String srtext;
    private String pro4text;

    public SpatialRefSys(@NonNull int srid, String auth_name, int auth_srid, String srtext, String pro4text) {
        this.srid = srid;
        this.auth_name = auth_name;
        this.auth_srid = auth_srid;
        this.srtext = srtext;
        this.pro4text = pro4text;
    }

    public SpatialRefSys() {}

    @NonNull
    public int getSrid() {
        return srid;
    }

    public void setSrid(@NonNull int srid) {
        this.srid = srid;
    }

    public String getAuth_name() {
        return auth_name;
    }

    public void setAuth_name(String auth_name) {
        this.auth_name = auth_name;
    }

    public int getAuth_srid() {
        return auth_srid;
    }

    public void setAuth_srid(int auth_srid) {
        this.auth_srid = auth_srid;
    }

    public String getSrtext() {
        return srtext;
    }

    public void setSrtext(String srtext) {
        this.srtext = srtext;
    }

    public String getPro4text() {
        return pro4text;
    }

    public void setPro4text(String pro4text) {
        this.pro4text = pro4text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpatialRefSys that = (SpatialRefSys) o;
        return srid == that.srid && auth_srid == that.auth_srid && Objects.equals(auth_name, that.auth_name) && Objects.equals(srtext, that.srtext) && Objects.equals(pro4text, that.pro4text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(srid, auth_name, auth_srid, srtext, pro4text);
    }

    @Override
    public String toString() {
        return "SpatialRefSys{" +
                "srid=" + srid +
                ", auth_name='" + auth_name + '\'' +
                ", auth_srid=" + auth_srid +
                ", srtext='" + srtext + '\'' +
                ", pro4text='" + pro4text + '\'' +
                '}';
    }
}
