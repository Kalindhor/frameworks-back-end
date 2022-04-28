package br.ufac.sgcmapi.services;

import java.util.List;

public interface ICrudServices<T> {

    public List<T> getAll();

    public T getById(Long id);
    
    public List<T> getByAll(String termoBusca);

    public T save(T objeto);
    
    public void delete (Long id);

}
