package gm.zona_fit_jsf.repositorio;

import gm.zona_fit_jsf.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepositorio extends JpaRepository<Cliente,Integer> {
}

