package com.workintech.burger.dao;

import com.workintech.burger.entity.BreadType;
import com.workintech.burger.entity.Burger;

import java.util.List;

public interface BurgerDao {
    Burger save(Burger burger);
    Burger findById(int id);
    List<Burger> findAll();
    List<Burger> findByPrice(double price);
    List<Burger> findByBreadType(BreadType breadType);
    List<Burger> findByContent(String content);
    Burger update(Burger burger);
    Burger remove(int id);
}
