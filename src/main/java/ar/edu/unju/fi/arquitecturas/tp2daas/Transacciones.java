package ar.edu.unju.fi.arquitecturas.tp2daas;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Transacciones {
    private Date Fecha;
    private double monto;
    private String tipo;
    private String estado;

}
