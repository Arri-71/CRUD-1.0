package com.unisabana.edu.CRUD;
import java.util.List;

public class VerCliente {
    public void verCliente(Cliente cliente) {
        System.out.println("Datos del Cliente: "+cliente);
    }

    public void verClientes(List<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            System.out.println("Datos del Cliente: "+cliente);
        }
    }

}
