package service;
import org.springframework.stereotype.Service;
@Service
public class CalculatorService {

		public String operation(double first , String operation , double second) {
			double result =0;
			switch (operation){
			case "add":{
				result=first + second;
				break;}
			case "minus":{
				result=first - second;
				break;}
			case "multiply":
				result=first * second;
				break;
			case "divide":{
				if(second != 0) {
				result=first / second;}
				else {return "E";}
				break;}
			}
			return String.valueOf(result);
		}
		
		public String single(String operation , double number) {
			double result =0;
			switch (operation){
			case "root":{
				result = Math.sqrt(number);
				break;}
			case "square":{
				result = Math.pow(number, 2);
				break;}
			case "fraction":{
				result = 1 / number;
				break;}
			case "percent":{
				result = number / 100;
				break;}
			}
			return String.valueOf(result);
		}

}
