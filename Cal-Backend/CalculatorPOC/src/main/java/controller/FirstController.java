package controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import service.CalculatorService;

	@CrossOrigin(origins = "http://localhost:8080/")
	@RestController
	public class FirstController{
		  private final CalculatorService cal;
		  @Autowired
		  public FirstController(CalculatorService cal) {
			this.cal=cal;
		  }  
		  @GetMapping("/path/{first}/{operation}/{second}")
		  public String operation (@PathVariable("first") double first,@PathVariable("operation") String operation,@PathVariable("second") double second ) {
			System.out.println(first+" "+ operation +" "+second);
			  return cal.operation(first, operation, second);  
		  }
		  @GetMapping("{operation}/{number}")
		  public String single (@PathVariable("operation") String operation,@PathVariable("number") double number ) {
			return cal.single(operation, number);
			  
		  }
	  
	  
	}
