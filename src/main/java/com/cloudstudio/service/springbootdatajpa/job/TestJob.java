package com.cloudstudio.service.springbootdatajpa.job;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.cloudstudio.service.springbootdatajpa.entity.AccountInfoEntity;
import com.cloudstudio.service.springbootdatajpa.repository.AccountInfoRepository;


@Component
@EnableScheduling
public class TestJob {
	
	@Autowired
	private AccountInfoRepository accountInfoRepository;
	
	@Scheduled(initialDelay = 6000,fixedDelay = 60000)
	public void run() {
		
		Optional<AccountInfoEntity> accountInfoEntity=accountInfoRepository.findById(100);
		
		if(accountInfoEntity.isPresent()) {
			AccountInfoEntity ac=accountInfoEntity.get();
			
			System.out.println(ac.getAccName()+ac.getAmount());
		}
		
	}

}
