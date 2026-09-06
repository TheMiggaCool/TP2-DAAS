package ar.edu.unju.fi.arquitecturas.tp2daas;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Cliente {
    private String nombre;
    private String cuil;
    private String email;
    private String telefono;
    private String direccion;
    private String titularidad;
}
