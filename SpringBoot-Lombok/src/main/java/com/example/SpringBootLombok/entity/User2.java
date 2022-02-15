package com.example.SpringBootLombok.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor
@Setter
@Getter
@ToString
@NoArgsConstructor
public class User2 {
	@NonNull
	private String fname;
	@NonNull
	private String lname;

}
