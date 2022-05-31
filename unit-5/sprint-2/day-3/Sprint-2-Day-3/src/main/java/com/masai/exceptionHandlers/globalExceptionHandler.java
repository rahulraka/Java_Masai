package com.masai.exceptionHandlers;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.masai.exception.ProductAlreadyExistException;
import com.masai.exception.ProductnotFoundException;

@ControllerAdvice
public class globalExceptionHandler {
	
	@ExceptionHandler(ProductAlreadyExistException.class)
	public ResponseEntity<MyErrorDetails> handleProductAlreadyExistException(ProductAlreadyExistException ie, WebRequest req){
		MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(), ie.getMessage(), req.getDescription(false));

		ResponseEntity<MyErrorDetails> re=new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
return re;
	}
	
	@ExceptionHandler(ProductnotFoundException.class)
	public ResponseEntity<MyErrorDetails> handleProductnotFoundException(ProductnotFoundException ie, WebRequest req){
		MyErrorDetails m1=new MyErrorDetails(LocalDateTime.now(), ie.getMessage(), req.getDescription(false));
		ResponseEntity<MyErrorDetails> re=new ResponseEntity<MyErrorDetails>(m1,HttpStatus.BAD_REQUEST);
		return re;
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyErrorDetails> handleNoHandlerFoundException(NoHandlerFoundException ie, WebRequest req){
		MyErrorDetails m1=new MyErrorDetails(LocalDateTime.now(), ie.getMessage(), req.getDescription(false));
		ResponseEntity<MyErrorDetails> re=new ResponseEntity<MyErrorDetails>(m1,HttpStatus.BAD_REQUEST);
		return re;
	}
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> myExceptionHandler(Exception ie, WebRequest req) {
		MyErrorDetails m1=new MyErrorDetails(LocalDateTime.now(), ie.getMessage(), req.getDescription(false));
		ResponseEntity<MyErrorDetails> re=new ResponseEntity<MyErrorDetails>(m1,HttpStatus.BAD_REQUEST);
		return re;
	}
	

}
