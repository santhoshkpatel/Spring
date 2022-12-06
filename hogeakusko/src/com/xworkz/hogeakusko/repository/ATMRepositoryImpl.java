package com.xworkz.hogeakusko.repository;

import org.springframework.stereotype.Component;

import com.xworkz.hogeakusko.dto.ATMDTO;
@Component
public class ATMRepositoryImpl implements ATMRepository {

	@Override
	public boolean save(ATMDTO atmdto) {
		// TODO Auto-generated method stub
		System.out.println("hi repo elle edini");
		return false;
	}

}
