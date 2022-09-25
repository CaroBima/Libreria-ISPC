
package com.ispc.library.repository;

import com.ispc.library.model.Book;
import com.ispc.library.model.Lending;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Caro
 */
@Repository
public class LendingRepository implements ILendingRepository {

  
    @Override
    public void crearReserva(String nombreusuario, Book libro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Lending> buscarLibrosXUsuario(String nombreusuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
