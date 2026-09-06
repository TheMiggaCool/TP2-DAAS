package ar.edu.unju.fi.arquitecturas.tp2daas;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public abstract class CuentasFinancieras {
    protected String CBU;
    protected String alias;
    protected double saldo;
    protected String estado;

}
