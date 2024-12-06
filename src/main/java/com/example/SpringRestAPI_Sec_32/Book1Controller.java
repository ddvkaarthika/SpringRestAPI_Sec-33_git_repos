package com.example.SpringRestAPI_Sec_32;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Book1Controller {
	 
	@Autowired
	BookRepository br;
	
	
	@PostMapping("/add")
	public void addbook(@RequestBody Book1 ob) {
		
		br.save(ob);
		
		
		
	}
	
	@GetMapping("/viewall")
	public List<Book1> showall(){
		return br.findAll();
	}
	
	@GetMapping("/viewone/{bid}")
	public Book1 getOneBook(@PathVariable("bid")
	int bno) {
		Optional<Book1> book = br.findById(bno);
		
		return book.get();
	}
	
	@PutMapping("/update/{id}")
	 public void updateBook(@PathVariable("id") int bno, @RequestBody Book1 b)
	 {
	 Optional<Book1> book=br.findById(bno); book.get().setBno(b.getBno()); book.get().setBname(b.getBname()); book.get().setBprice(b.getBprice()); book.get().setBpages(b.getBpages()); br.save(book.get());
	 }
	
	@DeleteMapping("/del/{id}")
	public void deleteBook(@PathVariable("id")int bno)
	{
		br.deleteById(bno);
		System.out.println("deleted");
	}
}
