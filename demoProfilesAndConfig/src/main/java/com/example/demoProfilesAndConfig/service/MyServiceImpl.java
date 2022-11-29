package com.example.demoProfilesAndConfig.service;

import lombok.ToString;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@ToString
@Profile("!test")
public class MyServiceImpl implements MyService{
}
