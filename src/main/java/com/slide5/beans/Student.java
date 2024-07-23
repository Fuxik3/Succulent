package com.slide5.beans;

import org.hibernate.validator.constraints.EAN;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Students")
public class Student {
	
	@NotBlank(message = "Tên bạn là gì?")
	String fullname;
	
	@Id
	@NotBlank(message = "Vui lòng nhập Email.")
	@Email(message = "Email không đúng định dạng.")
	String email;
	
	@NotNull(message = "Vui lòng nhập điểm.")
	@Max(value = 100,message = "Điểm không thể trên 100.")
	@PositiveOrZero(message = "Điểm không thể dưới 0.")
//	@Digits(message = "", fraction = 2, integer = 2)
	Double marks;
	
	@NotNull(message = "Vui lòng chọn giới tính.")
	Boolean gender;
	
	@NotBlank(message = "Vui lòng chọn quốc tích.")
	String country;
}
