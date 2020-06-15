package com.freddiemac.sap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freddiemac.sap.model.RMM;
import com.freddiemac.sap.model.RMMDataRequest;
import com.freddiemac.sap.model.RMMDataResponse;
import com.freddiemac.sap.service.CalculateRMMService;

@RestController
@RequestMapping("/sap")
public class SapRmmController {

	@Autowired
	private CalculateRMMService rmmService;

	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(value = "/rmmValue", consumes = "application/json", produces = "application/json")
	public RMMDataResponse calulateRMMValue(@RequestBody RMMDataRequest request) {
		System.out.println("Request From UI: " + request.toString());
		RMMDataResponse response = rmmService.saveData(request);
		return response;
	}

	@GetMapping("/getAll")
	public List<RMM> getAllData() {
		return rmmService.getAll();
	}

}
