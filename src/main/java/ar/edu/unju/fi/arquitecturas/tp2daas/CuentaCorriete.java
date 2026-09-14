package ar.edu.unju.fi.arquitecturas.tp2daas;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class CuentaCorriete extends CuentasFinancieras{
    private double margenAutorizado;
    private double costoMantenimiento;
}
