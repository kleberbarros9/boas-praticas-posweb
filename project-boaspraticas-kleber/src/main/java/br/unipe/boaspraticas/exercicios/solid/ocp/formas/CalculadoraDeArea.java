package br.unipe.boaspraticas.exercicios.solid.ocp.formas;


// Neste exemplo, temos uma classe CalculadoraDeArea que calcula a área total de um conjunto de
// formas geométricas. Porém, para adicionar uma nova forma geométrica, é necessário modificar a classe CalculadoraDeArea para lidar com o novo tipo, o que também viola o OCP.
// Classe que calcula a área total de um conjunto de formas geométricas
public class CalculadoraDeArea {
    public double calcularAreaTotal(FormaGeometrica[] formas) {
        double areaTotal = 0;
        for (FormaGeometrica forma : formas) {
            areaTotal += forma.calcularArea();
        }
        return areaTotal;
    }
}
