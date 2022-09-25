
package com.ispc.library.repository;

import com.ispc.library.model.Book;
import java.util.List;

/**
 *
 * @author Caro
 */
public interface IBooksRepository {
    public List<Book> traerTodosLibros();
    public List<Book> traerLibrosDisponibles();
    
}
