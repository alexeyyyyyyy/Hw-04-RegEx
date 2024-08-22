package telran.validator.tools;

		public class Validator {
			
		public static boolean checkCreditCard(String str) {
				
				String pattern = "\\d{8,16}";
				return str.matches(pattern);
			}
			
		public static boolean checkDateFormatEU(String str) {
	
				String pattern = "(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[012])\\.(19[0-9]{2}|20[0-2][0-4])";
				return str.matches(pattern);				
			
				
			}

			
		public static boolean checkDateFormatUS(String str) {
				String pattern = "(19[0-9]{2}|20[0-2][0-4])\\-(0[1-9]|1[012])\\-(0[1-9]|[12][0-9]|3[01])";
				return str.matches(pattern);
			}

		public static boolean checkFormatPhoneNumber(String str) {
			
			String pattern = "\\+([0-9][0-9])\\(([0-9][0-9])\\)\\d{4}\\-\\d{4}";
			return str.matches(pattern);
		}

		public static boolean checkFormatCVV(String str) {
			String pattern = "\\d{3}";
			return str.matches(pattern);
		}

		public static boolean checkFormat255(String str) {
			String pattern = "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-5][0-5])";
			return str.matches(pattern);
		}
		 public static void main(String[] args) {
			 
			 System.out.println("-------Credit Card-------");
			 String CreditCard = "123124436665";
			 System.out.println("Format of CreditCard is :" + checkCreditCard(CreditCard));
			 
			 
			 System.out.println("-------Date EU-------");
			 String DateEU = "01.12.1999";
			 System.out.println("Date of Eu is: " + checkDateFormatEU(DateEU));
			 
			 
			 
			 System.out.println("-------Date US-------");
			 String DateUS = "1999-11-31";
			 System.out.println("Date of US is: " + checkDateFormatUS(DateUS));
			 
			 System.out.println("-------Format Number-------");
			 String NumberFormat = "+99(99)9999-9999";
			 System.out.println("Format of Number is: " + checkFormatPhoneNumber(NumberFormat));
			 
			 
			 
			 System.out.println("-------Format CVV-------");
			 String CVVFormat = "444";
			 System.out.println("Format CVV is:" + checkFormatCVV(CVVFormat));
			 
			 
			 
			 System.out.println("-------Format 255-------");
			 String Format0255 = "255";
			 System.out.println("Format 0-255 is: " + checkFormat255(Format0255));
			 
		 }
		}





