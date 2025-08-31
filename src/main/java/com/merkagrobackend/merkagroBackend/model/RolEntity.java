package com.merkagrobackend.merkagroBackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name = "rol_usuario")
@NoArgsConstructor
@AllArgsConstructor

public class RolEntity {

    @Id
    @Column(name = "id_ rol")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long rolId;

    @Column(nullable = false)
    private String nombreRol;

    @OneToMany(mappedBy = "rolUsuario")
    private List<UsuarioEntity> usuarios;

}
