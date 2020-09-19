//package Service;
//
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//
//import com.itextpdf.text.Document;
//import com.itextpdf.text.DocumentException;
//import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.pdf.PdfWriter;
//
//public class convertPdf {
//	     public void pdf(String str) {        
//	    	 Document document = new Document();
//	 		try {
////	 			PdfWriter write = new PdfWriter(document, new FileOutputStream("HelloWorld.pdf"));
//	 			PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("D:/CEW.pdf"));
//	 		    document.open();
//	 		    document.add(new Paragraph(str));
//	 		   // document.add(new Paragraph("This is my second line"));
//	 		    document.close();
//	 		    writer.close();
//	 		 } catch (DocumentException e)
//	 		 {
//	 		    e.printStackTrace();
//	 		 } catch (FileNotFoundException e)
//	 		 {
//	 		    e.printStackTrace();
//	 		 }
//	}     
//}
//	
//
//
