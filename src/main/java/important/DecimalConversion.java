package important;

public class DecimalConversion {

		TNStack st = new TNStack(30);

		/**
		 * converts a number to given base
		 * @param number
		 * @param base
		 */
		public void decimalToXXXConversion(int number, int base) {
			System.out.println("Number "+number+" in base "+base+" is: ");
			while(number>0) {
				st.push(number%base);
				number = number/base;
			}

			while(!st.isEmpty()) {
				System.out.print(st.pop());
			}
			System.out.println();
		}

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			DecimalConversion dc = new DecimalConversion();

			// decimal to binary conversion
			dc.decimalToXXXConversion(100, 2);

			// decimal to octal conversion
			dc.decimalToXXXConversion(100, 8);

			// decimal to hexadecimal conversion
			dc.decimalToXXXConversion(100, 16);
		}
	}

