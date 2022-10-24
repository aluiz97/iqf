package com.projeto.firstone.model.enums;

public enum Escopo {

    TIME_E_MATERIAL("Time & Material"),
    ESCOPO_FECHADO("Escopo Fechado");

    private String escopo;
    Escopo(String escopo) {
        this.escopo = escopo;
    }

    public String getEscopo() {
        return this.escopo;
    }
}
