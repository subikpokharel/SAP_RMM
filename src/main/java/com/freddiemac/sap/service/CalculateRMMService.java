package com.freddiemac.sap.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freddiemac.sap.model.RMM;
import com.freddiemac.sap.model.RMMDataRequest;
import com.freddiemac.sap.model.RMMDataResponse;
import com.freddiemac.sap.repository.RmmRepository;

@Service
public class CalculateRMMService {
	private static int count = 0;

	@Autowired
	private RmmRepository repository;

	public RMMDataResponse saveData(RMMDataRequest request) {
		RMM data = new RMM(request);
		BigDecimal rmmValue = new BigDecimal("294");
		BigDecimal upvValue = new BigDecimal("512");
		data.setRmm(rmmValue);
		data.setUpv(upvValue);
		data.setId(++count);
		// System.out.println(data);

		repository.save(data);

		RMMDataResponse response = new RMMDataResponse(rmmValue, upvValue);

		return response;

	}

	public List<RMM> getAll() {
		List<RMM> rmmS = new ArrayList<>();
		repository.findAll().forEach(rmmS::add);
		return rmmS;
	}

}
