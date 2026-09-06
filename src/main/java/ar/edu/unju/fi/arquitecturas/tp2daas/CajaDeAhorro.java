package ar.edu.unju.fi.arquitecturas.tp2daas;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.SQLOutput;

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
