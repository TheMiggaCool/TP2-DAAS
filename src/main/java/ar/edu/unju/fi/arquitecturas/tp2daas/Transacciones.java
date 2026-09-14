package ar.edu.unju.fi.arquitecturas.tp2daas;
import lombok.*;
import jakarta.persistence.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
public class Transacciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fecha;
    private double monto;
    private String tipo;
    private String estado;

    // Relación transacciones n-1 cuenta
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cuenta_financiera_id")
    private CuentasFinancieras cuentaFinanciera;
}
