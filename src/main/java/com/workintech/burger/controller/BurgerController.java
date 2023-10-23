package com.workintech.burger.controller;

import com.workintech.burger.dao.BurgerDao;
import com.workintech.burger.entity.BreadType;
import com.workintech.burger.entity.Burger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/burger")
public class BurgerController {
    private BurgerDao burgerDao;
    @Autowired
    public BurgerController(BurgerDao burgerDao) {
        this.burgerDao = burgerDao;
    }
    @GetMapping("/")
    public List<Burger> findAll(){
        return burgerDao.findAll();
    }
    @GetMapping("/{id}")
    public Burger findById(@PathVariable int id){
        return burgerDao.findById(id);
    }
    @PostMapping("/")
    public Burger save(@RequestBody Burger burger){
        return burgerDao.save(burger);
    }
    @PutMapping("/")
    public Burger update(@RequestBody Burger burger){
        Burger updatedBurger = burgerDao.update(burger);
        return updatedBurger;
    }
    @DeleteMapping("/{id}")
    public Burger remove(@PathVariable int id){
        return burgerDao.remove(id);
    }
    @GetMapping("/findByPrice/{price}")
    public List<Burger> findByPrice(@PathVariable int price){
        return burgerDao.findByPrice(price);
    }
    @GetMapping("/findByBreadType/{breadType}")
    public List<Burger> findByBreadType(@PathVariable String breadType){
        BreadType breadTypeString = BreadType.valueOf(breadType);
        return burgerDao.findByBreadType(breadTypeString);
    }
    @GetMapping("/findByContent/{content}")
    public List<Burger> findByContent(@PathVariable String content){
        return burgerDao.findByContent(content);
    }

}
