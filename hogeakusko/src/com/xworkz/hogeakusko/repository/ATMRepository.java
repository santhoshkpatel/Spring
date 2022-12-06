package com.xworkz.hogeakusko.repository;

import org.springframework.stereotype.Component;

import com.xworkz.hogeakusko.dto.ATMDTO;
@Component
public interface ATMRepository {
public boolean save(ATMDTO atmdto); 
}
