package it.marconi.reststudent.domains;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "studenti")
public class Student {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private UUID id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cognome")
    private String cognome;
}
