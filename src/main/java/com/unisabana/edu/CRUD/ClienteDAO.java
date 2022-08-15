package com.unisabana.edu.CRUD;

import java.util.List;

public interface ClienteDAO {

    public boolean registrar(Cliente cliente);
    public List<Cliente> obtener();
    public boolean actualizar(Cliente cliente);
    public boolean eliminar(Cliente cliente);
}

