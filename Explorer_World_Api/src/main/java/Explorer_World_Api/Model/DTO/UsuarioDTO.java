package Explorer_World_Api.Model.DTO;

import jakarta.validation.constraints.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class UsuarioDTO {

    private Long IdUsuario;

    @NotNull(message = "El rango no puede ser nulo")
    @Positive(message = "El ID del rango debe ser positivo")
    private Long IdRango;

    @NotBlank(message = "El estado no puede estar vacío")
    @Size(max = 20, message = "El estado no puede exceder los 20 caracteres")
    private String Estado;

    @NotBlank(message = "El usuario no puede estar vacío")
    @Size(max = 50, message = "El usuario no puede exceder los 50 caracteres")
    private String Usuario;

    @NotBlank(message = "La contraseña no puede estar vacía")
    @Size(min = 8, max = 50, message = "La contraseña debe tener entre 8 y 50 caracteres")
    private String Contrasena;

    @NotBlank(message = "El correo no puede estar vacío")
    @Email(message = "Debe ser un correo electrónico válido")
    @Size(max = 50, message = "El correo no puede exceder los 50 caracteres")
    private String Correo;
}
