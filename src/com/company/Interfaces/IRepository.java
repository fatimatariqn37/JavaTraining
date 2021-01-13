package com.company.Interfaces;


import java.util.ArrayList;

public interface IRepository<TEntity> {

    public boolean Add(TEntity entity);
    public boolean Delete(TEntity entity);
    public boolean Clear(TEntity entity);
    public TEntity Find(int index);
    public ArrayList<TEntity> Retrieve();

}
