package com.merkagrobackend.merkagroBackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name = "municipio")
@NoArgsConstructor
@AllArgsConstructor

public class MunicipioEntity {

    @Id
    @Column(name = "id_municipio")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long municipioId;

    @Column(nullable = false)
    private String nombreMunicipio;

    @OneToMany(mappedBy = "municipioUsuario")
    private List<UsuarioEntity> usuarios;

}
