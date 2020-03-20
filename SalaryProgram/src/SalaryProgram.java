public class SalaryProgram {
    public static void main(String[] args) {
		int etype=0;
		double gIncome=0, hRate=0, hWorked=0;
		double rPay=0, otHours=0, otRate=0, otPay=0;
		int day=0, sTime=0, duration=0;
		String in;
		BufferedReader input = new BufferedReader(new
					InputStreamerReader(System.in));

		try {
			//input employee type
				System.out.print("Employee is [1]Part-time [2] Full-time");
				in=input.readLine();
				eType = Integer.parseInt(in);
		}catch(IOException e) {
			System.out.println("Error");
		}

		if(eType == 1) { // part-time
			try{
			// input hourly rate and hours worked
				System.out.print("Input hourly rate: ");
				in=input.readLine();
				hRate = Double.parseDouble(in);
				System.out.print("input number of hours worked: ");
				in=input.readLine();
				hWorked = Double.parseDouble(in);
			}catch(IOException e){
				System.out.println("Error");
			}
			gIncome = hRate * hWorked;
		}
		else { // employee_type == 2
			try {
				/* input regular pay and overtime
				 hours and overtime rate */
			System.out.print("Input regular pay: ");
			in=input.readLine();
			rPay = Double.parseDouble(in);
			System.out.print("Input number of overtime hours: ");
			in=input.readLine();
			otHours = Double.parseDouble(in);
			System.out.print("Input overtime rate");
			in=input.readLine();
			otRate = Double.parseDouble(in);

			}catch(IOException e){
				System.out.println("Error");
			}
			if(otHours > 0.0)
				otPay = otRate * otHours;
			else
				otPay = 0.0;

			gincome = rPay + otPay;

		}
			System.out.println("Gross income = " + gIncome);
		}

    }
}
