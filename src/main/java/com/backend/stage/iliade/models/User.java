package com.backend.stage.iliade.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "utilisateur")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "auth_user_id")
    private Long id;
   @NotNull(message = "nom est obligatoire")
    @Column(name = "nom")
    private String nom;
    @NotNull(message = "prenom est obligatoire")
    @Column(name = "prénom")
    private String prenom;
    @NotNull(message = "email est obligatoire")
    @Column(name = "email")
    private String email;
    @NotNull(message = "password est obligatoire")
    @Column(name = "password")
    private String password;
    @NotNull(message = "telephone est obligatoire")
    @Column(name = "num_telephone")
    private String num_telephone;
    @NotNull(message = "status est obligatoire")
    @Column(name = "status")
    private String status;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "auth_user_role", joinColumns = @JoinColumn(name = "auth_user_id"), inverseJoinColumns = @JoinColumn(name = "auth_role_id"))
    private Set<Role> roles;

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNum_telephone() {
        return num_telephone;
    }

    public void setNum_telephone(String num_telephone) {
        this.num_telephone = num_telephone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User(Long id, String nom, String prenom, String email, String password, String num_telephone, String status) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.num_telephone = num_telephone;
        this.status = status;
    }

    public User(Long id, String nom, String prenom, String email, String password, String num_telephone, String status, Set<Role> roles) {

        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.num_telephone = num_telephone;
        this.status = status;
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", num_telephone='" + num_telephone + '\'' +
                ", status='" + status + '\'' +
                ", roles=" + roles +
                '}';
    }
}
