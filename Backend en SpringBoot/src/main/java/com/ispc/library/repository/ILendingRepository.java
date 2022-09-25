

package com.ispc.library.repository;

import com.ispc.library.model.Book;
import com.ispc.library.model.Lending;
import java.util.List;

/**
 *
 * @author Caro
 */
public interface ILendingRepository {
    public List<Lending> buscarLibrosXUsuario(String nombreusuario);
    public void crearReserva(String nombreusuario, Book libro);
    
}
