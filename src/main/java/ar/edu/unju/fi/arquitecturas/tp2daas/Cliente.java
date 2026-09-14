package ar.edu.unju.fi.arquitecturas.tp2daas;
import lombok.*;
import jakarta.persistence.*;
import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
public class Cliente {
    @Id
    private String cuil;
    private String nombre;
    private String email;
    private String telefono;
    private String direccion;
    private String titularidad;

    // Relación cliente 1-n cuentas
    @OneToMany(
            mappedBy = "cliente",
            fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.MERGE,
                    CascadeType.PERSIST
            }
    )
    private List<CuentasFinancieras> cuentasFinancieras  = new ArrayList<>();
}
