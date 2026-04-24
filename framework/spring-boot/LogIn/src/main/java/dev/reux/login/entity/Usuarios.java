package dev.reux.login.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//2.esta clase representa la entidad dentro de la base de datos que vamos a crear mas adelante
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Usuarios")
public class Usuarios {
    //asigna a la variable username como ID.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "name")
    private String name;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "age")
    private int age;
    @Column(name = "gender")
    private String gender;
}
