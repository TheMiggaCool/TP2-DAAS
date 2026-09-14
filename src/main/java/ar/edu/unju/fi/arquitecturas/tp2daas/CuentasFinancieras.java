package ar.edu.unju.fi.arquitecturas.tp2daas;

import lombok.*;
import jakarta.persistence.*;
import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Inheritance(strategy = InheritanceType.JOINED) // Definimos la estrategia de herencia
public abstract class CuentasFinancieras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    protected String CBU;
    protected String alias;
    protected double saldo;
    protected String estado;

    // Relación cuentas n-1 cliente
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_cuil")
    private Cliente cliente;

    // Relación cuenta 1-n transacciones
    @OneToMany(
            mappedBy = "cuentaFinanciera",
            fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.MERGE,
                    CascadeType.PERSIST
            }
    )
    private List<Transacciones> transacciones = new ArrayList<>();;
}
