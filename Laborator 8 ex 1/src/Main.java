import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        XSSFWorkbook workbook = null;
        try {
            FileInputStream file = new FileInputStream(new
                    File("laborator8_input.xlsx"));
            workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                for (Cell cell: row){
                    switch (cell.getCellType()) {
                        case CellType.NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;
                        case CellType.STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                    }
                }
                System.out.println();
            }
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        XSSFWorkbook workbook2 = new XSSFWorkbook();
        XSSFSheet sheet2 = workbook2.createSheet("Employee Data");
        Map<String, Object[]> data = new TreeMap<String, Object[]>();
        data.put("1", new Object[] {"ID", "NAME", "LASTNAME","Grade 1","Grade 2", "Grade 3", "Grade 4","MAX"});
        data.put("2", new Object[] {1,"Amit", "Shukla", 9,8,7,5,});
        data.put("3", new Object[] {2,"Lokesh", "Gupta", 8,9,6,7});
        data.put("4", new Object[] {3,"John", "Adwards", 8,8,7,6 });
        data.put("5", new Object[] {4,"Brian", "Schultz", 7,6,8,9});
        Set<String> keyset = data.keySet();
        int rownum = 0;
        for (String key : keyset) {

            Row row = sheet2.createRow(rownum++);
            Object [] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr)
            {
                String formula="MAX(A2:A5)";
                Cell cell = row.createCell(cellnum++);
                if(obj instanceof String)
                    cell.setCellValue((String)obj);
                cell.setCellFormula((String)formula);
                else if(obj instanceof Double)
                    cell.setCellValue((Double)obj);
                else if(obj instanceof Integer)
                    cell.setCellValue((Integer)obj);
            }
        }
        try {
            FileOutputStream out = new FileOutputStream(new File("workbook.xlsx"));
            workbook2.write(out);
            out.close();
            System.out.println(" ");
            System.out.println("workbook.xlsx written successfully on disk.");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}