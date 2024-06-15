package com.example.layeredarchitecture.DAO;

import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerDAO {
    public ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException;

    public void saveCustomers(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;

    public void updateCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;

    public void deleteCustomers(String id) throws SQLException, ClassNotFoundException;

    public ArrayList<String> getAllCustomerIds() throws SQLException, ClassNotFoundException;

   public boolean existCustomer(String id) throws SQLException, Exception;
    public String generateId() throws SQLException, ClassNotFoundException;
    public CustomerDTO searchCustomer(String newValue) throws SQLException, ClassNotFoundException;
}
