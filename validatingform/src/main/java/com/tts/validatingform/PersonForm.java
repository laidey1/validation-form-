package com.tts.validatingform;

import com.sun.istack.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Min;

public class PersonForm {
	@NotNull
	@Size(min=2, max=30)
	private String name;

	@NotNull
	@Min(18)
	private Integer age;


	public String toString() {
		return "PersonForm [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
