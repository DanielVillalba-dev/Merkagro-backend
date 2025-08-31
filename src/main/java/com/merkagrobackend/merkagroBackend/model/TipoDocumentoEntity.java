package com.merkagrobackend.merkagroBackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tipos_documento")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class TipoDocumentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_documento")
    private long tipoDocumentoId;

    @Column(nullable = false, length = 50)
    private String nombreTipoDocumento;

    @OneToMany(mappedBy = "tipoDocumentoUsuario")
    private List<UsuarioEntity> usuarios;

}
