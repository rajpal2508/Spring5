package com.Example.Spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MangoDBDataservice implements DataService{

	@Override
	public int[] retrieveData() {
		return new int [] {11,22,33,44,55,66};
	}

}
