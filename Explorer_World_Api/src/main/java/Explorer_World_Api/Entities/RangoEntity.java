package Explorer_World_Api.Entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "RANGOS")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class RangoEntity {
    @Id
    @Column(name = "IDRANGO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_RANGOS")
    @SequenceGenerator(name = "SQ_RANGOS", sequenceName = "SQ_RANGOS", allocationSize = 1)
    private Long idRango;

    @Column(name = "NOMBRERANGO")
    private String NombreRango;

    @Column(name = "RANGOUSUARIO")
    private String RangoUsuario;

}
