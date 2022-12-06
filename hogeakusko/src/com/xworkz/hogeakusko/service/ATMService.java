package com.xworkz.hogeakusko.service;

import org.springframework.stereotype.Component;

import com.xworkz.hogeakusko.dto.ATMDTO;
@Component
public interface ATMService {
	public boolean validateAndSave(ATMDTO atmdto);

}
