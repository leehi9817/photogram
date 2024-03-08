package com.cos.photogramstart.web.dto.user;

import com.cos.photogramstart.domain.user.User;

import lombok.Data;

@Data
public class UserUpdateDto {
	private String name; // 필수
	private String password; // 필수
	private String website;
	private String bio;
	private String phone;
	private String gender;
	
	public User toEntity() {
		return User.builder()
				.name(name) // 기재 안할 때 문제가 생기므로 Validation 체크
				.password(password) // 기재 안할 때 문제가 생기므로 Validation 체크
				.website(website)
				.bio(bio)
				.phone(phone)
				.gender(gender)
				.build();
	}
}
