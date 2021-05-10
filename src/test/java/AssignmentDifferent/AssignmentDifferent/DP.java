package AssignmentDifferent.AssignmentDifferent;

import org.testng.annotations.DataProvider;


public class DP {
	@DataProvider
	  public Object[][] dp() {
		  ReadExcelClass excel = new ReadExcelClass();
		  String filename = "C:\\Users\\CHATHURI\\eclipse-workspace\\AssignmentDifferent\\TestData.xlsx";
		  return excel.Get_Excel_Data(filename, "Add Item", 1);
		  
	  }
}
