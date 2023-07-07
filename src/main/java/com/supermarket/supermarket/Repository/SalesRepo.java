package com.supermarket.supermarket.Repository;

import com.supermarket.supermarket.model.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesRepo extends JpaRepository<Sales,String>{

}
