package com.merkagrobackend.merkagroBackend.model;

import com.merkagrobackend.merkagroBackend.model.enums.EstadoUsuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private int usuarioId;

    @Column(nullable = false)
    private String nombreCompletoUsuario;

    @Column(nullable = false)
    private String emailUsuario;

    @ManyToOne
    @JoinColumn(name = "id_tipo_documento", nullable = false)
    private TipoDocumentoEntity tipoDocumentoUsuario;

    @Column(nullable = false, length = 15)
    private String numeroDocumentoUsuario;

    @ManyToOne
    @JoinColumn(name = "id_municipio", nullable = false)
    private MunicipioEntity municipioUsuario;

    @ManyToOne
    @JoinColumn(name = "id_rol")
    private RolEntity rolUsuario;

    @Column(nullable = false)
    private String telefonoUsuario;

    @Column(nullable = false)
    private String contrasenaHash;

    @Column(nullable = false)
    private String contrasenaSalt;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoUsuario estadoUsuario;

    @Column(nullable = false)
    private LocalDateTime creadoEn;

    @Column(nullable = false)
    private LocalDateTime actualizado;

}