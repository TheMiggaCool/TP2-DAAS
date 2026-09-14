package ar.edu.unju.fi.arquitecturas.tp2daas;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class CajaDeAhorro extends CuentasFinancieras{
    private double tasaInteres;
    private int extraccionesSinCosto;

    public void calcularInteres(){
        System.out.println("Implementar método");
    }
}
