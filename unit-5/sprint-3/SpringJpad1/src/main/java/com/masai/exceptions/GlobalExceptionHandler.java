package com.masai.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(BookNotFoundException.class)
	public ResponseEntity<MyErrorDetails> handlingBookNotFound(BookNotFoundException ie, WebRequest req){
		MyErrorDetails mr=new MyErrorDetails(LocalDateTime.now(), ie.getMessage(), req.getDescription(true));
		ResponseEntity<MyErrorDetails> res=new ResponseEntity<MyErrorDetails>(mr, HttpStatus.BAD_REQUEST);
		return res;
	}
	
	@ExceptionHandler(NoDataFoundException.class)
	public ResponseEntity<MyErrorDetails> handlingNoDataFound(NoDataFoundException ie, WebRequest req){
		MyErrorDetails mr=new MyErrorDetails(LocalDateTime.now(), ie.getMessage(), req.getDescription(true));
		ResponseEntity<MyErrorDetails> res=new ResponseEntity<MyErrorDetails>(mr, HttpStatus.BAD_REQUEST);
		return res;
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyErrorDetails> handlingNoDataHandler(NoHandlerFoundException ie, WebRequest req){
		MyErrorDetails mr=new MyErrorDetails(LocalDateTime.now(), ie.getMessage(), req.getDescription(false));
		ResponseEntity<MyErrorDetails> res=new ResponseEntity<MyErrorDetails>(mr, HttpStatus.BAD_REQUEST);
		return res;
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> myExceptionHandler(WebRequest req,Exception ie) {
		MyErrorDetails mr=new MyErrorDetails(LocalDateTime.now(), ie.getMessage(), req.getDescription(false));
		ResponseEntity<MyErrorDetails> res=new ResponseEntity<MyErrorDetails>(mr, HttpStatus.BAD_REQUEST);
		return res;
	}
	
	

}
