package com.management.Pharma;


import java.time.LocalDateTime;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.management.Pharma.Exception.AdminAlreadyExists;
import com.management.Pharma.Exception.ErrorInfo;

import jakarta.servlet.http.HttpServletRequest;


@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(AdminAlreadyExists.class)
	public @ResponseBody ErrorInfo checkAdminAlreadyExistsExceptionInfo(AdminAlreadyExists e,HttpServletRequest req) {
		 ErrorInfo erinfo = new ErrorInfo(LocalDateTime.now(),e.getMessage(),req.getRequestURI());
		 return erinfo;
	}
	
	
	
	
	
}
