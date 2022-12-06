package com.xworkz.hogeakusko.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.hogeakusko.dto.ATMDTO;
import com.xworkz.hogeakusko.repository.ATMRepository;
@Component
public class ATMServiceImpl implements ATMService {
//	@Autowired
//	@Qualifier("atmRepository1")
//	private ATMRepository repo;.
	@Autowired
	@Qualifier("atmRepository1")
	private ATMRepository repo1;
	@Override
	public boolean validateAndSave(ATMDTO atmdto) {
		// TODO Auto-generated method stub
		System.out.println("hi eru bartini");
//		repo.save(atmdto);
		repo1.save(atmdto);
		return false;
	}

}
