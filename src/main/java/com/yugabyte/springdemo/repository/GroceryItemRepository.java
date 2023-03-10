package com.yugabyte.springdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import com.yugabyte.springdemo.model.GroceryItem;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface GroceryItemRepository extends JpaRepository<GroceryItem, String> {
    @Modifying(clearAutomatically = true)
    @Transactional
    @Query(value = "UPDATE mygrocerylist set quantity = ?2  WHERE name = ?1",
            nativeQuery = true)
    public Integer updateItemQuantity(String name, int quantity);

    @Query(value = "SELECT g.* FROM mygrocerylist g WHERE g.name = ?1",
            nativeQuery = true)
    public GroceryItem findItemByName(String name);

    @Query(value = "SELECT g.* FROM mygrocerylist g WHERE g.category  = ?1",
            nativeQuery = true)
    public List<GroceryItem> findItemsByCategory(String category);

}