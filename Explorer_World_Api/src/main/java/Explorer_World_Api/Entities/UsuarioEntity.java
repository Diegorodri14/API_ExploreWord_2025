package Explorer_World_Api.Entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Usuarios")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class UsuarioEntity {

    @Id
    @Column(name = "IDUSUARIO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_Usuarios")
    @SequenceGenerator(name = "sq_Usuarios", sequenceName = "sq_Usuarios", allocationSize = 1)
    private Long IdUsuario;

    @Column(name = "IDRANGO")
    private Long IdRango;

    @Column(name = "ESTADO")
    private String Estado;

    @Column(name = "USUARIO")
    private String Usuario;

    @Column(name = "CONTRASENA")
    private String Contrasena;

    @Column(name = "CORREO")
    private String Correo;
}
