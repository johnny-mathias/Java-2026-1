package br.com.fiap.Dragons.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dragon {
    private Integer id;
    private String nome;
    private String cor;
    private int poderDeFogo;
    private double peso;
    private double altura;
    private boolean possuiMontador;
}
