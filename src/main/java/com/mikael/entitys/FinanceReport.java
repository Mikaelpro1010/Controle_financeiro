package com.mikael.entitys;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class FinanceReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "valor_arrecadado", nullable = false)
    private Double valorArrecadado;

    @Column(name = "total_de_gastos", nullable = false)
    private Double totalDeGastos;

    @Column(name = "valor_final", nullable = false)
    private Double valorFinal;

    // Construtores
    public FinanceReport() {}

    public FinanceReport(Double valorArrecadado, Double totalDeGastos, Double valorFinal) {
        this.valorArrecadado = valorArrecadado;
        this.totalDeGastos = totalDeGastos;
        this.valorFinal = valorFinal;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValorArrecadado() {
        return valorArrecadado;
    }

    public void setValorArrecadado(Double valorArrecadado) {
        this.valorArrecadado = valorArrecadado;
    }

    public Double getTotalDeGastos() {
        return totalDeGastos;
    }

    public void setTotalDeGastos(Double totalDeGastos) {
        this.totalDeGastos = totalDeGastos;
    }

    public Double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(Double valorFinal) {
        this.valorFinal = valorFinal;
    }
}

