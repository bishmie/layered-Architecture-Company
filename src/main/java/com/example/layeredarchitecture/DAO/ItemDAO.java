package com.example.layeredarchitecture.DAO;

import com.example.layeredarchitecture.model.ItemDTO;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemDAO {

    public ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException;

    public void saveAll(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;
    public void updateItems(String description, BigDecimal unitPrice, int qtyOnHand, String code) throws SQLException, ClassNotFoundException;
    public boolean existItem(String code) throws Exception;
    public String generateId() throws SQLException, ClassNotFoundException;
    public void deleteItems(String code) throws SQLException, ClassNotFoundException;
    public ItemDTO findItems(String newItemCode) throws SQLException, ClassNotFoundException;
    public ArrayList<String> getAllItemCodes() throws SQLException, ClassNotFoundException;
}
