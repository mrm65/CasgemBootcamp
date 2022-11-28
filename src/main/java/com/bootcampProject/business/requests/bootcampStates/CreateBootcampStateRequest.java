package com.bootcampProject.business.requests.bootcampStates;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBootcampStateRequest {

	@NotEmpty(message = "Name cannot be empty")
	private String name;
}
