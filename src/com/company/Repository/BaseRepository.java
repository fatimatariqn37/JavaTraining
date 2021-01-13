package com.company.Repository;

import com.company.Interfaces.IRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BaseRepository<TEntity> implements IRepository<TEntity>
{
    //  Map<Integer, String> map = new HashMap<Integer, String>;

    private ArrayList<TEntity> repo;

    public BaseRepository(){
        repo  = new ArrayList<TEntity>();
    }

    @Override
    public boolean Add (TEntity t)throws NullPointerException {
        repo.add(t);
        return true;
    }

    @Override
    public boolean Delete(TEntity t) throws NullPointerException{
        repo.remove(t);
        return false;
    }

    @Override
    public boolean Clear(TEntity t)throws NullPointerException {
        repo.clear();
        return true;
    }

    @Override
    public TEntity Find(int index) throws NullPointerException{
        return repo.get(index);
    }

    @Override
    public ArrayList<TEntity> Retrieve() throws NullPointerException{
        return repo;
    }

}
